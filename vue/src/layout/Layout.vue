
<template>
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <div class="common-layout">
      <!--    头部     -->
      <el-container class="header">
        <Header />
      </el-container>
<!--  Bug: replace the container above with this line cause formatting issue  <Header class="header"/>-->
      <!--    主体-->
      <el-container class="wrapper">
        <!--      侧边栏-->
        <router-view name="nav" class="wrapper__aside"/>
        <!--      内容区域-->
        <el-container>
          <router-view name="con" class="wrapper__body"/>
          <el-footer class="wrapper__footer">
            <Footer/>
          </el-footer>
        </el-container>
      </el-container>
  </div>
</template>

<script>
import Footer from "../components/Footer.vue";
import Header from "../components/Header.vue";
export default {
  name: "Layout",
  components: {
    Header,
    Footer
  },
  data() {
    return {}
  }
}
</script>

<style scoped>
.header {
  position: fixed;
  z-index: 20;
}
.wrapper {
  position: relative;
  display: flex;
}
.wrapper__aside {
  position: fixed;
  width: 250px;
  margin-left: 10px;
  margin-top: 60px;
  overflow-y: auto;
  border-right: 1px solid #dcdfe6;
  height: calc(100vh - 60px);
  /*max-height: 100%;*/
  background-color: white;
  overflow-x: hidden;
}
.wrapper__body {
  flex: 1;
  margin-left: 260px;
  /*padding-left: 2%;*/
  width: auto;
  /*margin-left: 275px;*/
  /*padding-left: 26px;*/
  /*max-width: 77%;*/
  padding-top: 60px;
  margin-bottom: 12%;
}
.wrapper__footer {
  margin-left: 260px;
  border-top: 1px solid #ccc;
}
/* 大屏幕 ( > 13 in. ) */
@media (min-width: 1440px) {
  .header {
    width: 1440px;
  }
  .common-layout {
    width: 1440px;
    margin-left: calc((100vw - 1440px)/2);
  }
}
/* 多数电脑 ( 11 in. ≤ size ≤ 13 in. ) */
@media (min-width: 1280px) and (max-width: 1439px) {
  .header {
    width: 100vw;
  }
}
/* 小电脑及大Pad */
@media (min-width: 992px) and (max-width: 1279px) {
  .header {
    width: 100vw;
  }

  .wrapper__body{
    /*margin-left: calc(0.5vw + 250px) !important;*/
  }

  .wrapper__footer{
    /*margin-left: calc(0.5vw + 250px) !important;*/
  }
}
/* 多数Pad */
@media (min-width: 480px) and (max-width: 991px) {
  .header {
    width: 100%;
  }
}
/* 手机 */
@media (max-width: 479px) {
  .header {
    width: 100%;
  }
  .wrapper__aside {
    width: 25vw;
  }
  .wrapper__footer {
    margin-left: 25vw;
  }
  .wrapper__body {
    margin-left: 25vw;
  }
}
</style>
