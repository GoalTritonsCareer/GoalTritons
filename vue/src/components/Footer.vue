<template class="el-footer">
  <div style="background-color: #2D5878; color: white; height: 380px; width: 100%">
    <div style="padding-top: 3%; height: 320px; text-align: center">
      <h1 style="font-size: 26px">Your <span style="color: #F4CE71">bright</span> and <span style="color: #F4CE71">successful</span> professional future is what we strive for.</h1>
      <!--        <div class="one2">-->
      <!--          <img src="../assets/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
      <!--        </div>-->
      <div>
        <h1 style="padding-top: 30px; font-size: 20px">Stay updated on more career information</h1>
        <div class="flex">
          <el-form ref="form" :model="form" style="width: 300px; align-items: center">
            <el-form-item prop="email">
              <input type="text" id="input1" placeholder="Enter Your Email Address" v-model="form.email" style="color: #1E4460"/>
            </el-form-item>
          </el-form>
          <el-button class="subscribe" type="primary" @click="subscribe">Subscribe</el-button>
        </div>
        <p style="font-weight: 600; margin-top: 10px; font-size: 16px; line-height: 141%">We aim to provide UCSD
          students a smooth experience in developing their professional paths and approaching their career goal
        </p>
        <p style="font-weight: 700; margin-top: 20px; font-size: 16px; font-weight: 700; line-height: 141%">Copyright:
          2022 by Goal Tritons</p>
      </div>

    </div>
    <div style="height: 75px; background-color: #1E4460">
      <div style="display: flex">
        <div style="display: flex; flex: 2; flex-direction: row; text-align: left; padding-top: 24px; margin-left: 6%">
          <h2>About Us</h2>
          <h2 style="margin-left: 36px">Contact Us</h2>
        </div>
        <div style="display: flex; flex-direction: row; text-align: right; margin-right: 6%">
          <h1 style="margin-right: 15px; padding-top: 20px"> Go<span style="opacity: 50%">al</span> Tritons</h1><br>
          <img src="/logo.svg" width="40px" alt="logo" style="padding-top: 15px">
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import request from "../utils/request";
import subscribers from "./subscribers/subscribers.json";

export default {
  name: "Footer",
  data() {
    return {
      form: {},
      subscribersJson: subscribers
    }
  },
  methods: {
    check_subscribed(email){
      console.log("checking: ", email)
      console.log(this.subscribersJson.subscribers)

      const subscribed = this.subscribersJson.subscribers.some(subscriber => subscriber.email === email);
      console.log("if subscribed: ", subscribed)
      return subscribed
    },
    subscribe() {
      console.log("here33")
      if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.form.email))) {
        this.$message({
          type: "error",
          message: "Not a valid email address"
        })
        return
      }

      this.$refs['form'].validate((valid) => {
        if (valid) {
          var already_subscribed = this.check_subscribed(this.form.email);
          /*
          if (already_subscribed) {
            this.$message({
              type: "error",
              message: "There exist a subscribed account associsated with this email"
            })
            return
          } 
          else {

            let new_subscribers = [...this.subscribersJson.subscribers];

            console.log(typeof this.subscribersJson.subscribers, new_subscribers, Array.isArray(new_subscribers));

            let new_sub = {
              email: this.form.email
            };


            new_subscribers.push(new_sub);

            console.log(new_subscribers);

            var newJson = JSON.stringify({subscribers: new_subscribers});
            console.log(newJson);
            var fs = require('fs');
            console.log("here");
            fs.writeFile("./subscribers/subscribers.json", newJson, 'utf8', callback);  
            
          }*/



          request.post("/user/subscribe", this.form).then(res => {
            if (res.code === '0') {
              this.$message({
                type: "success",
                message: "success"
              })
            } else {
              this.$message({
                type: "error",
                message: res.msg
              })
            }
          })
        }
      })
    }
  }
}
</script>

<style scoped>
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
@font-face { font-family: work-sans-semi;
  src: url('../../public/WorkSans/WorkSans-Semibold.woff');
}
.flex {
  display: flex;
  flex-direction: row;
  margin-top: 15px;
  justify-content: center;
}
.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
  padding-left: 0px;
}
.subscribe {
  font-size: 16px;
  font-weight: 600;
  border-radius: 10px;
  background-color: #F4CE71;
  width: 150px;
  height:40px;
  margin-left: 15px;
  color:#1E4460;
  border: hidden;
  box-shadow: 0 4px 4px rgb(0 0 0 / 0.25);
}
.subscribe:hover {
  background-color: #1E4460;
  color: white;
  /*border: solid 2px;*/
  border-color: #F4CE71;
}
h1{
  font-family: work-sans;
  font-style: normal;
  font-size: 24px;
  font-weight: 700;
  color: white;
}

h2{
  font-family: work-sans-semi;
  font-style: normal;
  font-size: 20px;
  line-height: 141%;
  font-weight: 700;
}
#input1 {
  border-radius: 10px;
  border: none;
  padding: 20px;
  width: 300px;
  height: 35px;
}

</style>