<template class="el-footer">
  <div style="background-color: #2D5878; color: white; height: 380px; width: 84%; margin-left: 240px">
    <div style="margin-left: 10%; padding-top: 3%; height: 320px">
      <h1 style="font-size: 26px">Your <span style="color: #F4CE71">bright</span> and
        <span style="color: #F4CE71">successful</span> professional future is what we strive for.
      </h1>
      <div class="wrapper">
        <div class="one1">
          <div style="display: flex; flex-direction: row; padding-left: 20px">
            <img src="../assets/logo.svg" width="70px" alt="logo" style="vertical-align: middle">
            <h1 style="margin-top: 25px; margin-left: 15px"> Go<span style="opacity: 50%">al</span> Tritons</h1><br>
          </div>

          <p style="font-weight: 600; margin-top: 25px"> We aim to provide UCSD’s Undergraduate a
            <br>smooth experience in developing their
            <br>professional path and approaching their
            <br>career goal.</p>
        </div>
<!--        <div class="one2">-->
<!--          <img src="../assets/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
<!--        </div>-->
        <div class="two1">
          <h2 style="padding-top: 20px; padding-left: 20px">Keep updated on more career information</h2>
          <div class="flex">
            <el-form ref="form" :model="form" size="normal" style="width: 300px">
              <el-form-item prop="email">
                <input type="text" id="input1" placeholder="Your Email Address" v-model="form.email" style="color: #1E4460"/>
              </el-form-item>
            </el-form>
            <el-button type="primary" @click="subscribe" style="font-size: 16px; font-weight: 600; border-radius: 30px;
          background-color: #F4CE71; width: 150px; height:45px; margin-left: 15px; color:#1E4460">Subscribe</el-button>
          </div>
        </div>
        <div class="two2">
          <h2 style="text-align: right">About Us</h2>
        </div>
      </div>
    </div>
    <div class="container" style="height: 75px; background-color: #1E4460">
      <h2 style="text-align: left; margin-left: 20%; margin-top: 4%">Copyright: 2022 by Goal Tritons</h2>
<!--      <div style="text-align: right; margin-top: 5%; margin-right: 15%">-->
<!--        <h2>Contact Us</h2>-->
<!--      </div>-->
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
      this.$refs['form'].validate((valid) => {
        if (valid) {
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
  src: url('../assets/WorkSans/WorkSans-Bold.woff');
}
.flex {
  display: flex;
  flex-direction: row;
  margin-top: 30px;
}
.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
  padding-left: 0px;
}
h1{
  font-family: work-sans;
  font-style: normal;
  font-size: 24px;
  font-weight: 700;
  color: white;
}

h2{
  font-family: work-sans;
  font-style: normal;
  font-size: 20px;
  line-height: 23.46px;
  font-weight: 700;
}
#input1 {
  border-radius: 30px;
  border: none;
  padding: 20px;
  width: 300px;
  height: 45px;
}
.wrapper {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 0px;
  height: fit-content;
  width: fit-content;
  margin-top: 30px;
}
.one1 {
  grid-column: 1;
  grid-row: 1/3;
  width: 550px;
}

.two1 {
  grid-column: 2;
  grid-row: 1;
}
.two2 {
  grid-column: 2;
  grid-row: 2;
  width: 450px;
}
</style>