const https = require('https');
const cheerio = require('cheerio');
const fs = require('fs');

https.get('https://career.ucsd.edu/employers-recruiters/career-fairs/',function(res){
    // 分段返回的 自己拼接
    let html = '';
    // 有数据产生的时候 拼接
    res.on('data',function(chunk){
        html += chunk;
    })
    // 拼接完成
    res.on('end',function() {
        // console.log(html);
        const $ = cheerio.load(html);
        const type = "Career";
        let allFairs = [];
        $('.row .panel-body').each(function () {
            // this循环时 指向当前这个career fair

            const title = $('h2', this).text();
            const info = $('p', this).text().split(" ");
            const year = info[1];
            let mon = new Date(Date.parse(info[4] + " 1, 2022")).getMonth()+1;
            if (mon < 10) {
                mon = "0" + mon;
            }
            let day = info[5].slice(0,-2);
            if (day < 10) {
                day = "0" + day;
            }
            const date = year + "-" + mon + "-" + day;
            const link = "https://career.ucsd.edu/employers-recruiters/career-fairs/"+$('a', this).attr("href");
            // 存成一个json文件 fs
            allFairs.push({
                type, title, date, link
            })
            // console.log(allFairs);
        })
        const path = './career-fairs.json';
        try {
            if (fs.existsSync(path)) {
                //file exists
                // TODO: bug: format error , i.e. 2 lists of dictionaries
                fs.appendFile(path, JSON.stringify(allFairs), function (err) {
                    if (!err) {
                        console.log('Saved!');
                    }
                });
            } else {
                fs.writeFile(path, JSON.stringify(allFairs),function(err) {
                    if(!err){
                        console.log('Output complete!');
                    }
                });
            }
        } catch(err) {
            console.error(err);
        }
    })
})