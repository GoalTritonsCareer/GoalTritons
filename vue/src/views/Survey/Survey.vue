<template>

  <div class="common-layout">

    <!--    头部     -->
    <el-container class="header">
      <Header />
    </el-container>

    <div style="position:relative">

      <div class="dashboard">

        <h2 style="color: black">Results</h2>

        <p class="dashboard-text" style="">
          We've created a dashboard for you with your current career finding stage!
        </p>

        <el-button style="margin-left: 6vw; margin-top: 1vw; font-size:large; font-weight: bold" color="gray" size="large">View your dashboard</el-button>

      </div>

      <div style="margin-left: 10vw;  margin-top: 5vh;">

        <h1 class="title">Survey Page</h1>

        <div style="margin-left: 5vw; margin-top: 5vh; font-size: large">
          <ul>
            <li>
              What is your major? [所有ucsd majors]
            </li>
            <li>
              What is your expected graduation date?
            </li>
            <li>
              Choose your field (多选):
              <ul class="sublist">
                <li>Architecture and Engineering</li>
                <li>Construction and Extraction</li>
                <li>Education, Training, and Forestry</li>
                <li>Food Preparation and Serving</li>
                <li>Healthcare</li>
                <li>Installation, Maintenance, and Repair</li>
                <li>Legal</li>
                <li>Life, Physical, and Soical Science</li>
                <li>Management</li>
                <li>Media and Communication</li>
                <li>Office and Administrative Support</li>
                <li>Personal Care and Service</li>
              </ul>
            </li>
            <li>Have you defined your career goal</li>
              <ul class="sublist">
                <li>Yes</li>
                <li>No</li>
              </ul>
            <li>If yes >> what is your career goal? (多选)</li>
              <ul class="sublist">
                <li>
                  User type occupations >> suggest possible occupations
                </li>
              </ul>
            <li>If no >> define your career goal page</li>
          </ul>
        </div>
    </div>

    </div>

  </div>
</template>

<script setup>

</script>

<script>
import Header from "../../components/Header.vue"

export default {
  name: "Survey",
  mounted() {
    window.scrollTo(0, 0);
  },
  components: {
    Header
  },
}
</script>

<style scoped lang="less">

.title {
  color: steelblue;
}

.sublist {
  margin-left: 5vw;
}

.dashboard {
  background-color:lightgray;
  width: 30vw;
  height: 15vw;
  padding-top: 1vw;
  padding-left:2vw;
  position: absolute;
  margin-left: 50vw;
  margin-top: 20vh;
}

.dashboard-text {
  color: black;
  font-weight: bold;
  font-size: large;
  margin-top: 1vw;
  margin-left: 1vw;
  margin-right: 2vw;
  text-align: center
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
}
</style>