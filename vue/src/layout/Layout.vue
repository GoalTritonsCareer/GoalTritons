<template>
  <div>
      <!--    头部-->
      <Header :user="user" style="position: fixed; width: 100vw; z-index: 20; height: 7%; background-color: #1E4460"/>

      <!--    主体-->
      <el-container style="display: flex" class="wrapper">
        <!--      侧边栏-->
        <Aside class="wrapper__aside"/>
        <!--      内容区域-->
        <router-view class="wrapper__body"/>
      </el-container>
  </div>
</template>

<script>
import Header from "../components/Header.vue";
import request from "../utils/request";
import Aside from "../components/Aside.vue";

export default {
  name: "Layout",
  components: {
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
}

.wrapper__aside {
  position: fixed;
  width: 15%;
  margin-left: 0.5%;
  margin-right: 2%;
  margin-top: 5%
}

.wrapper__body {
  flex: 1;
  margin-left: 20%;
  max-width: 75%;
  margin-top: 5%
}
</style>