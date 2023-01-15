<template>
  <div class="common-layout">
      <!--    头部-->
      <Header style="position: fixed; width: 100vw; z-index: 20"/>
      <!--    主体-->
      <el-container style="display: flex" class="wrapper">
        <!--      侧边栏-->
        <Aside class="wrapper__aside"/>
        <!--      内容区域-->
        <el-container>
          <router-view class="wrapper__body"/>
          <el-footer class="wrapper__footer" style="margin-left: 240px; border-top: 1px solid #ccc">
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
    return {}
  }
}
</script>

<style scoped>
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
    width: 1280px;
  /*  margin-left: calc((100vw - 1280px)/2);*/
  }
  .wrapper__body{
    margin-left: calc(1vw + 350px) !important;
  }
  .wrapper__footer{
    margin-left: calc(1vw + 350px) !important;
  }
}
/* 小电脑及大Pad */
@media (min-width: 992px) and (max-width: 1279px) {
  .header {
    width: 992px;
    margin-left: calc((100vw - 992px)/2);
  }
}
/* 多数Pad */
@media (min-width: 768px) and (max-width: 991px) {
  .header {
    width: 768px;
    margin-left: calc((100vw - 768px)/2);
  }
}
/* 手机 */
@media (min-width: 480px) and (max-width: 767px) {
  .header {
    width: 480px;
    margin-left: calc((100vw - 767px)/2);
  }
}
.header {
  position: fixed;
  z-index: 20;
}
.wrapper {
  position: relative;
}

.wrapper__aside {
  position: fixed;
  width: 250px;
  margin-left: 0.5%;
  margin-top: 4%;
  overflow-y: auto;
  height: auto;
  max-height: 92%;
  background-color: white;
  overflow-x: hidden;
}

.wrapper__body {
  flex: 1;
  margin-left: 19%;
  padding-left: 2%;
  width: auto;
  /*margin-left: 275px;*/
  /*padding-left: 26px;*/
  max-width: 77%;
  padding-top: 6.3%;
  margin-bottom: 12%;
}




</style>