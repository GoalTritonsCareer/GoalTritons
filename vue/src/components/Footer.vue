<template class="el-footer">
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <div style="color: #1e4460; height: 380px; display: flex; flex-direction: column">
    <span style="width: 100%; height: 8%; background: linear-gradient(360deg, rgba(217, 217, 217, 0.58) -74.29%, rgba(217, 217, 217, 0) 88.57%);"></span>
    <div style="padding: 3% 2% 0 2%; height: 320px; text-align: center">
      <h1 style="font-size: 24px">Your <span style="color: #E2983A">bright</span> and <span style="color: #E2983A">successful</span>
        professional future is what we strive for.</h1>
      <div style="display: flex; flex-direction: column">
        <h1 style="padding-top: 2%; font-size: 18px;">Stay updated on more career information</h1>
        <div class="flex">
          <el-form ref="form" :model="form" style="width: 300px; align-items: center">
            <el-form-item prop="email">
              <input type="text" id="input1" placeholder="Enter Your Email Address" v-model="form.email"/>
            </el-form-item>
          </el-form>
          <el-button class="subscribe" type="primary" @click="subscribe">Subscribe</el-button>
        </div>
        <p style="font-weight: 600; margin-top: 15px; font-size: 15px">We aim to provide UCSD
          students a smooth experience in developing their professional paths and approaching their career goal
        </p>
        <p style="font-weight: 700; margin-top: 20px; font-size: 15px">Copyright:
          2022 by Goal Tritons</p>
      </div>
    </div>

    <div id="bot2" style="display: flex">
      <div style="display: flex; flex: 2; flex-direction: row; text-align: left; padding-top: 24px; margin-left: 4%">
        <h2>About Us</h2>
        <h2 style="margin-left: 36px">Contact Us</h2>
      </div>
      <div style="display: flex; flex-direction: row; text-align: right; margin-right: 2%">
        <a href="http://goaltritonscareer.com" style="text-decoration: none">
          <h1 id="bot-right" style="margin-right: 15px; padding-top: 20px"> Go<span style="opacity: 50%">al</span> Tritons</h1>
        </a>
        <a href="http://goaltritonscareer.com" >
          <img src="/logo.svg" width="40px" alt="logo" style="padding-top: 15px">
        </a>
      </div>
    </div>
  </div>
</template>

<script>
import request from "../utils/request";

export default {
  name: "Footer",
  data() {
    return {
      form: {}
    }
  },
  methods: {
    subscribe() {
      if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.form.email))) {
        this.$message({
          type: "error",
          message: "Not a valid email address"
        })
        return
      }
      this.$message({
        type: "error",
        message: "Sorry, subscription function is still in progress :("
      })

      // this.$refs['form'].validate((valid) => {
      //   if (valid) {
      //     request.post("/user/subscribe", this.form).then(res => {
      //       if (res.code === '0') {
      //         this.$message({
      //           type: "success",
      //           message: "success"
      //         })
      //       } else {
      //         this.$message({
      //           type: "error",
      //           message: res.msg
      //         })
      //       }
      //     })
      //   }
      // })
    }
  }
}
</script>

<style scoped>
/* 大屏幕 ( > 13 in. ) */
@media (min-width: 1440px) {
  .header {
    width: 1440px;
    margin-left: calc((100vw - 1440px)/2);
  }
}
/* 多数电脑 ( 11 in. ≤ size ≤ 13 in. ) */
@media (min-width: 1280px) and (max-width: 1439px) {

}
/* 小电脑及大Pad */
@media (min-width: 992px) and (max-width: 1279px) {

}
/* 多数Pad */
@media (min-width: 768px) and (max-width: 991px) {
   /*TODO: 减小字体*/
}
/* 手机 */
@media (max-width: 479px) {
  #bot2 {
    margin-top: 3rem;
  }
  #bot2 img {
    padding-top: 10px !important;
  }
  #bot-right {
    padding-top: 12px !important;
  }

  h1 {
    font-size: 20px !important;
    line-height: 1.2;
    margin-bottom: 0.5rem;
  }
  h2 {
    font-size: 15px !important;
    line-height: 1.2;
  }
}
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
@font-face { font-family: work-sans-semi;
  src: url('../../public/WorkSans/WorkSans-Semibold.woff');
}
.flex {
  display: flex;
  flex-direction: row;
  margin-top: 10px;
  justify-content: center;
}
.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
  padding-left: 0px;
}
.subscribe {
  font-size: 15px;
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
  color: #1e4460;
}

h2{
  font-family: work-sans-semi;
  font-style: normal;
  font-size: 20px;
  line-height: 141%;
  font-weight: 700;
}
#input1 {
  padding: 20px;
  width: 300px;
  height: 35px;
  border: 1px solid #94989B;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 12px;
}

</style>