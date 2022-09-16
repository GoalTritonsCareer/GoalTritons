<template>
  <div class="common-layout">
      <!--    头部-->
      <Header :user="user" style="position: fixed; width: 100vw; z-index: 20; height: 7%; background-color: #1E4460"/>
      <!--    主体-->
      <el-container style="display: flex" class="wrapper">
        <!--      侧边栏-->
        <Aside class="wrapper__aside"/>
        <!--      内容区域-->
        <el-container>
          <router-view class="wrapper__body"/>
          <el-footer style="padding-left: 0px">
            <Footer/>
          </el-footer>
        </el-container>
      </el-container>
  </div>
</template>

<script>
import Header from "../components/Header.vue";
import Aside from "../components/Aside.vue";
import Footer from "../components/Footer.vue";

export default {
  name: "Layout",
  components: {
    Footer,
    Header,
    Aside
  },
  data() {
    return {
      user: {}
    }
  }
}
</script>

<style scoped>
.wrapper {
  position: relative;
  background-color: #F9F9F9;
}
.wrapper__aside {
  position: fixed;
  width: 240px;
  margin-left: 0.5%;
  padding-top: 6%;
  overflow-y: auto;
  height: auto;
  max-height: 100vh;
  background-color: white;
}

.wrapper__body {
  flex: 1;
  margin-left: 19%;
  padding-left: 1%;
  width: auto;
  /*margin-left: 275px;*/
  /*padding-left: 26px;*/
  max-width: 77%;
  padding-top: 6.3%;
  margin-bottom: 12%;
}


</style>