<template>
  <div style="width: 100%; height: 100vh; overflow: hidden">
    <div style="width: 400px; margin: 100px auto">
      <div style="font-size: 30px; text-align: center; padding: 30px 0">Subscribe for Career Resource</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <p>Username</p>
          <el-input prefix-icon="el-icon-user-solid" v-model="form.username"></el-input>
        </el-form-item>
        <el-form-item prop="email">
          <p>email</p>
          <el-input prefix-icon="el-icon-user-solid" v-model="form.email"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="width: 100%" type="primary" @click="subscribe">Subscribe</el-button>
        </el-form-item>
        <el-form-item><el-button type="text" @click="$router.push('/login')">Back to Login</el-button></el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import request from "../utils/request";

export default {
  name: "Subscribe",
  data() {
    return {
      form: {},
      rules: {
        username: [
          {required: true, message: 'Username', trigger: 'blur'},
        ],
        email: [
          {required: true, message: 'Email', trigger: 'blur'},
        ],
      }
    }
  },
  methods: {
    register() {
      console.log("here1");
      if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.form.email)) {

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

</style>