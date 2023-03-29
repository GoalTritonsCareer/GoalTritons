<template>
  <div id="howToMasterAnInterview">
    <h2>How to Master an Interview?</h2>

    <div style="text-align: right; margin-top: 82px; margin-bottom: 50px">
      <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank" style="text-decoration: none; color: #1E4460">
        <p class ="link" style="display: inline;">Schedule an Interview Prep Appointment</p>
        &nbsp;
        <img src="/arrow.png" width=22px style="vertical-align: middle">
      </a>
    </div>

    <div id="HTMAIdiv" style="width: 50vw; margin-left: 20px">
      <div>
        <img src="/interview/beforeTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

        <div class="HTMAIsubdiv" style="margin-right: 20px; padding-right: 4px">
          <img src="/interview/reportEmoji.svg" class="HTMAIemoji" >
          <p >Prepare for common Q&A</p>
          <ul>
            <li>Have a list of common qs & answer them by yourself.
              <ul>
                <li>Use the S.A.R. answer structure when needed.</li>
                <li>Keep the answers short & relevant.</li>
                <li>MEMORIZE your stories/answers</li>
              </ul>
            </li>
            <li>Click to see <a class="intextLink" href="/interview/commonInterviewQuestions.pdf" download="" style="color: #0467B0; ">common questions</a>.</li>
          </ul>


          <img src="/interview/speakerEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Prepare a brief self-introduction</p>
          <ul><li>Click to see <a class="intextLink" href="//leverageedu.com/blog/self-introduction-in-interview/#:~:text=First%2C%20greet%20the%20interviewer%20with,and%20nod%20at%20appropriate%20times"
                                  target="_blank" style="color: #0467B0; ">tips</a>.</li></ul>

          <img src="/interview/arrowEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Practice, practice, and practice!</p>
          <ul><li>Find peers to do mock interviews using the <a class="intextLink" href="//ucsd.biginterview.com/" target="_blank" style="color: #0467B0; ">Big Interview</a>.</li></ul>
        </div>
      </div>

      <div >
        <img src="/interview/atTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

        <div class="HTMAIsubdiv" style="margin-right: 20px; padding-right: 5px">
          <img src="/interview/smileEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Be open, polite, and honest</p>
          <ul>
            <li>Make a good first impression by providing big smile, handshake, and proper greetings, etc.</li>

          </ul>

          <img src="/interview/clothesEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Dress appropriately</p>
          <ul>
            <li>Dress by company culture</li>
            <li>Dress comfortably</li>
          </ul>

          <img src="/interview/eyeEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Express confidence through body language.</p>
          <ul>
            <li>Maintain eye-contacts with your interviewers.</li>
            <li>Nod at appropriate times to show that you are paying attention.</li>
          </ul>
        </div>


      </div>

      <div>
        <img src="/interview/afterTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

        <img src="/interview/questionEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
        <p>Ask questions at the end</p>
        <ul>
          <li>Click to see
            <a class="intextLink" id="longMoreRes"  href="//www.betterup.com/blog/questions-to-ask-hiring-manager" target="_blank">
              sample questions</a> to ask employers or hiring managers.
          </li>
        </ul>

        <img src="/interview/emailEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
        <p>Send a thank you note/email within 24 hours.</p>
        <ul>
          <li>Click to see <a class="intextLink" href="//www.themuse.com/advice/how-to-write-an-interview-thankyou-note-an-email-template"
                              target="_blank" style="color: #0467B0;">sample thank you emails</a>.</li>
        </ul>
      </div>
    </div>

    <div style="text-align: right; margin-bottom: 20px; margin-top: 50px">
      <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">See More Common Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#moreResources')">More Resources</i></p>
      <a id="moreResources"></a>
    </div>

    <div id="more-resources">
      <h2>More Resources</h2>


      <p><span style="font-weight: 600">“Define Yourself” Q&A:</span> <a class="moreRes"  href="//hbr.org/2021/11/10-common-job-interview-questions-and-how-to-answer-them"
                                                                         target="_blank">10 Common Job Interview Questions and How to Answer Them</a>
      </p>

      <br>

      <p><span style="font-weight: 600">Behavioral Q&A:</span></p>
      <ul>
        <li>Situational Q&A: <a class="moreRes" href="//zety.com/blog/situational-interview-questions" target="_blank">
          20+ Top Situational Interview Questions and Answers</a>
        </li>
        <li>Hypothetical Q&A:
          <a class="moreRes" href="//www.how2become.com/blog/7-hypothetical-interview-questions/#:~:text=Examples%20of%20hypothetical%20interview%20questions,see%20your%20point%20of%20view%3F"
             target="_blank">7 Hypothetical Interview Questions & Answers</a>
        </li>
      </ul>

      <br>



      <p><span style="font-weight: 600">Common Interview Q&A:</span></p>
      <ul>
        <li><a class="moreRes" href="//www.indeed.com/career-advice/interviewing/tough-interview-questions-and-answers?from=careeradvice-US" target="_blank">12 Tough Interview Questions and Answers</a></li>
        <li><a class="moreRes" href="//novoresume.com/career-blog/interview-questions-and-best-answers-guide" target="_blank">35+ Interview Questions and Answer</a></li>
      </ul>

      <br>

      <p><span style="font-weight: 600">Career Center Resources:</span></p>
      <ul>
        <li><a class="moreRes" href="//career.ucsd.edu/succeed-search/interview-tips/index.html" target="_blank">Interview Tips</a></li>
        <li><a class="moreRes" href="//career.ucsd.edu/undergraduates/find-a-job/interviewing/jobs-internships/interview%20questions.html" target="_blank">Sample Interview Questions</a></li>
        <li><a class="moreRes" href="//career.ucsd.edu/undergraduates/find-a-job/interviewing/jobs-internships/sample-questions-for-employers.html" target="_blank">Sample Questions to Ask Employers</a></li>
        <li><a class="moreRes" href="//ucsd.biginterview.com/" target="_blank">Mock Interview: Big Interview for hands-on interview practice</a></li>
      </ul>

      <br>

    </div>
  </div>
</template>

<script setup>

</script>

<script>
export default {
  name: "MasterInterview"
}
</script>

<style scoped lang="less">
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}

a{
  text-decoration: none;
}

.link {
  display: inline;
  text-decoration: none;
  color: #1E4460;
  font-weight: 500;
}
.link:hover {
  text-decoration: underline;
  font-weight: 600;
}



div{
  text-align: center;
}
#more-resources{
  text-align: left;
}
#more-resources p{
  margin-left: 13vw;

}
h1, h2, h3{
  font-family: work-sans;
  text-align: left;
}


.resumecomp > p{
  padding-top: 1rem;
}

.resumecomp > pre{
  padding-top: 1rem;
}

h3{
  margin-bottom: 50px;

  font-weight: 700;
  font-size: 16px;
  font-style: normal;
}
h1{
  margin-bottom: 100px;
  color: #1E4460;
  font-weight: 700;
  font-size: 26px;

}

h2{

  font-style: normal;
  font-size: 18px;
  font-weight: 700;
  color: #182B49;
  margin-bottom: 82px;
  margin-top: 95px;
  border-top: 1px solid black;
  border-bottom: 1px solid black;
  padding-top: 15px;
  padding-bottom: 15px;
}

#sample-resumes a{
  margin-right: 50px;
}


ul{
  text-align: left;
  margin-right: 12vw;
  margin-left: 15vw;
  font-size: 16px;
  font-weight: 400;
  font-style: normal;
  line-height: 141%;    /* list里的行间宽度为141%，其他为default */
}

#openingPara{
  font-size: 16px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  margin-right: 11vw;
  margin-left: 11vw;

}

#BQp, #TQp{
  font-size: 16px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  margin-right: 4vw;
  margin-left: 4vw;
}

#TQp{
  margin-bottom: 2rem;
}

#BQp{
  margin-bottom: 2rem;
}

#question-type{
  text-align: center;
}

#questionType{
  background-color: #1E4460;;

  text-align: center;
  color: #F4CE71;;
  padding-top: 13px;
  padding-bottom: 13px;

  font-family: work-sans;
  font-size: 20px;
  font-weight: 700;
  font-style: normal;
  border-radius: 30px;
  border: 1px solid black;
  width: 12vw;
  margin-right: auto;
  margin-left: auto;
}

#QTdiv{
  text-align: center;
  align-items: center;
  margin-left: auto;
  margin-right: auto;
}

#QTspan1{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding: 2px 30px;
  width: 200px;
  margin-left: auto;
  margin-right: 50px;
}

#QTspan2{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding: 2px 30px;
  width: 200px;
  margin-left: 50px;
  margin-right: 50px;
}


#QTspan3{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding: 2px 30px;
  width: 200px;
  margin-left: auto;
  margin-right: 50px;
}



.DYp{
  display: inline;
  border-radius: 30px;
  background-color: #F4CE71;
  color: black;
  margin-right: 10px;
  padding: 3px 10px;
  font-weight: 600;

}

.DYimg{
  width: 10vw;
  margin-right: 4rem;
  margin-left: 7rem;
}

.DYdiv{
  display: flex;
  margin: 20px 10vw;
}

.DYulTitle{

  text-align: left;
  font-style: italic;

}
.DYul{
  margin-right: auto;
  margin-left: 2rem;
}

#TQtipsTitle{
  margin-left: 8vw;
  margin-bottom: 20px;
}

#TQtips{
  text-align: left;

  margin-left: 10vw;

}

#TQtips ul{
  text-align: left;
  margin: 0;
  margin-left: 7rem;
}

.ITimg{
  width: 7vw;
}

#ITSimg{
  width: 70vw;
  margin-top: 3rem;
}

#ITdiv{
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-gap: 10px;
}

#ITdiv *{
  margin: 0;
}

#ITdiv ul{
  border: 4px dotted #1E4460;
  padding: 20px;
  border-radius: 10px;
  border-left: hidden;


}

#ITimg{
  width: auto;
  max-width: 70vw;
}

#ITstep1{
  background-color: #F8EFDA;
  border-radius: 10px;
  margin: auto;
  width: 5rem;
}


#ITstep2{
  background-color: #F6E0AA;
  border-radius: 10px;
  margin: auto;
  width: 5rem;
}

#ITstep3{
  background-color: #F4CE71;
  border-radius: 10px;
  margin: auto;
  width: 5rem;
}



#HTMAIdiv{
  display: grid;
  grid-template-columns: repeat(3, 1fr);
}



#HTMAIdiv *{
  margin: 0;

}

.HTMAIsubdiv{
  border-right: 1px solid rgba(30, 68, 96, .35);

  height: 90%;

}

.HTMAIimg{
  display: block;
  margin-bottom: 20px;
}

#HTMAIdiv div{
  text-align: left;

}

#HTMAIdiv ul{
  margin-left: 2rem;
  margin-top: 1rem;
  margin-bottom: 1rem;

  color: #1E4460;
  font-weight: 499;

}

#HTMAIdiv p{
  display: inline;
  color: #1E4460;
  font-weight: 500;


}

.HTMAIemoji{
  vertical-align: middle;
  margin-right: 3.5rem;
}


.moreResLink {
  color: #B27224;
  font-weight: 500;
}
.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
}
.moreRes{
  background-image: linear-gradient(
      to right,
      #0467B0,
      #0467B0
  );
  background-size: 200% 100%;
  background-position: -100%;
  display: inline-block;
  padding: 2px 0;
  position: relative;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  transition: all 0.3s ease-in-out;
  font-weight: 500;
}
.moreRes::before {
  content: '';
  background: #0467B0;
  display: block;
  position: absolute;
  bottom: -3px;
  left: 0;
  width: 0;
  height: 2px;
  transition: all 0.3s ease-in-out;
}
.moreRes:hover {
  background-position: 0;
  font-weight: 600;
}
.moreRes:hover::before {
  width: 100%;
}

#longMoreRes{
  display: inline;
}

.intextLink {
  color: #0467B0;
  text-decoration: none;
  font-weight: 500;
}

.intextLink:hover {
  text-decoration: underline;
  font-weight: 600;
}
</style>