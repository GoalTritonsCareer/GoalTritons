<template>
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <div style="height: 60px; line-height: 70px; border-bottom: 1px solid #ccc; display: flex; background-color: white">
    <div class="top-left">
      <a href="http://goaltritonscareer.com" style="margin-top: -8px">
        <img src="../../public/logo.svg" alt="logo" class="top-left-logo" style="vertical-align: middle;"/>
      </a>
      <a href="http://goaltritonscareer.com" style="text-decoration: none;">
        <h1 style="margin-left: 15px; align-self: center;text-decoration: none;">Go<span style="color: #7c97AB">al</span> Tritons</h1>
      </a>
    </div>
    <div class="top-mid">
      <el-menu
          class="el-menu-demo"
          mode="horizontal"
          @open="handleOpen"
          @close="handleClose"
      >
        <el-sub-menu index="1" popper-offset="13">
          <template #title>
            <span class="mod">Define your Career Goal</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="1-1" class="sub1" disabled>New to Career Planning</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="1-2" class="sub1" disabled>Learn about Your Career</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="1-3" class="sub1" disabled>Being F-1 Students</el-menu-item>
          </el-menu-item-group>
          <!--          <el-sub-menu index="1-3" style="margin-top: 0">-->
          <!--            <template #title style="margin-bottom: fill"><span class="sub1">Being F-1 Students</span></template>-->
          <!--            <el-menu-item index="1-3-1" class="sub2">CPT/OPT</el-menu-item>-->
          <!--          </el-sub-menu>-->
        </el-sub-menu>

        <el-sub-menu index="2" popper-offset="13">
          <template #title>
            <!--            <el-icon><location /></el-icon>-->
            <span class="mod" @click="$router.push('/Networking#fakeNetworkingTop')">Networking</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="2-1" class="sub1" @click="$router.push('/Networking#whyNetworking')">Why Networking</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="2-2" class="sub1" @click="$router.push('/Networking#onlinePlatform')">Online Platforms</el-menu-item>
          </el-menu-item-group>
          <!--          <el-sub-menu index="2-2" style="margin-top: 0">-->
          <!--            <template #title><span class="sub1" @click="$router.push('/fakeNetworking#onlinePlatform')">Online Platforms</span></template>-->
          <!--            <el-menu-item index="2-2-1" class="sub2" @click="$router.push('/fakeNetworking#whyPlatform')">Why & What</el-menu-item>-->
          <!--            <el-menu-item index="2-2-2" class="sub2" @click="$router.push('/fakeNetworking#linkedIn')">Linkedin</el-menu-item>-->
          <!--            <el-menu-item index="2-2-3" class="sub2" @click="$router.push('/fakeNetworking#tritonConnect')">Tritons Connect</el-menu-item>-->
          <!--            <el-menu-item index="2-2-4" class="sub2" @click="$router.push('/fakeNetworking#otherSocialMedia')">Other Social Media</el-menu-item>-->
          <!--            <el-menu-item index="2-2-5" class="sub2" @click="$router.push('/fakeNetworking#HowToNetworkOnline')">How to Network Online</el-menu-item>-->
          <!--          </el-sub-menu>-->
          <el-menu-item-group>
            <el-menu-item index="2-3" class="sub1" @click="$router.push('/Networking#networkOnCampus')">Networking on Campus</el-menu-item>
          </el-menu-item-group>
          <!--          <el-sub-menu index="2-3" style="margin-top: 0">-->
          <!--            <template #title><span class="sub1" @click="$router.push('/fakeNetworking#networkOnCampus')">Networking on Campus</span></template>-->
          <!--            <el-menu-item index="2-3-1" class="sub2" @click="$router.push('/fakeNetworking#whyNetworkOnCampus')">Why & Where</el-menu-item>-->
          <!--            <el-menu-item index="2-3-2" class="sub2" @click="$router.push('/fakeNetworking#studentOrganization')">Student Orgs</el-menu-item>-->
          <!--            <el-menu-item index="2-3-3" class="sub2" @click="$router.push('/fakeNetworking#mentorshipPrograms')">Mentoring Programs</el-menu-item>-->
          <!--            <el-menu-item index="2-3-4" class="sub2" @click="$router.push('/fakeNetworking#careerFair')">Career Fairs/Events</el-menu-item>-->
          <!--            <el-menu-item index="2-3-5" class="sub2" @click="$router.push('/fakeNetworking#labs')">Labs</el-menu-item>-->
          <!--          </el-sub-menu>-->
          <el-menu-item-group>
            <el-menu-item index="2-4" class="sub1" @click="$router.push('/Networking#everydayRoutine')">Everyday Routine</el-menu-item>
          </el-menu-item-group>
          <!--          <el-sub-menu index="2-4" style="margin-top: 0">-->
          <!--            <template #title><span class="sub1" @click="$router.push('/fakeNetworking#everydayRoutine')">Everyday Routine</span></template>-->
          <!--            <el-menu-item index="2-4-1" class="sub2" @click="$router.push('/fakeNetworking#whoToNetworkWith')">Who to Network with</el-menu-item>-->
          <!--            <el-menu-item index="2-4-2" class="sub2" @click="$router.push('/fakeNetworking#faculty')">Faculty</el-menu-item>-->
          <!--            <el-menu-item index="2-4-3" class="sub2" @click="$router.push('/fakeNetworking#peers')">Peers</el-menu-item>-->
          <!--          </el-sub-menu>-->
          <el-menu-item-group>
            <el-menu-item index="2-5" class="sub1" @click="$router.push('/Networking#maintainNetwork')">Maintain Networks</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="2-6" class="sub1" @click="$router.push('/Networking#networkingRouteSummary')">Networking Routes Summary</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="2-7" class="sub1" @click="$router.push('/Networking#moreResources')">More Resources</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>

        <el-sub-menu index="3" popper-offset="13">
          <template #title>
            <span class="mod menu-item-3">Internship & Jobs</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="3-1" class="sub1" disabled>In Progress</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>

        <el-sub-menu index="4" popper-offset="13">
          <template #title>
            <span class="mod menu-item-4" @click="$router.push('/resume')">Resume</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="4-1" class="sub1" @click="$router.push('/resume/resume-vs-cv')">Resume vs. CV</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="4-2" class="sub1" @click="$router.push('/resume#resume-breakdown')">Resume Breakdown</el-menu-item>
          </el-menu-item-group>
          <!--          <el-sub-menu index="4-2" style="margin-top: 0">-->
          <!--            <template #title ><span class="sub1" @click="$router.push('/resume#resume-breakdown')">Resume Breakdown</span></template>-->
          <!--            <el-menu-item index="4-2-1" class="sub2" @click="$router.push('/resume#resume-components')">Resume Components</el-menu-item>-->
          <!--            <el-menu-item index="4-2-2" class="sub2" @click="$router.push('/resume#resume-essentials')">Resume Essentials</el-menu-item>-->
          <!--            <el-menu-item index="4-2-3" class="sub2" @click="$router.push('/resume#sample-resumes-anchor')">Sample Resumes</el-menu-item>-->
          <!--            <el-menu-item index="4-2-4" class="sub2" @click="$router.push('/resume#polish-resume')">Polish Your Resume</el-menu-item>-->
          <!--          </el-sub-menu>-->
          <el-menu-item-group>
            <el-menu-item index="4-3" class="sub1" @click="$router.push('/resume#cv-breakdown')">CV Breakdown</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="4-4" class="sub1" @click="$router.push('/resume#cover-letter')">Cover Letter</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="4-5" class="sub1" @click="$router.push('/resume#more-resources')">More Resources</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>

        <el-sub-menu index="5" popper-offset="13">
          <template #title>
            <span class="mod" @click="$router.push('/interview/Opening')">Interview Prep</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="5-1" class="sub1" @click="$router.push('/interview/WhyInterview')">Why Interview</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="5-2" class="sub1" @click="$router.push('/interview/InterviewQuestions')">Interview Questions</el-menu-item>
          </el-menu-item-group>
          <!--          <el-sub-menu index="5-2" style="margin-top: 0">-->
          <!--            <template #title><span class="sub1" @click="$router.push('/interview#interviewQuestions')">Interview Questions</span></template>-->
          <!--            <el-menu-item index="5-2-1" class="sub2" @click="$router.push('/interview#defineYourself')">Define Yourself</el-menu-item>-->
          <!--            <el-menu-item index="5-2-2" class="sub2" @click="$router.push('/interview#BehavioralQuestions')">Behavioral</el-menu-item>-->
          <!--            <el-menu-item index="5-2-3" class="sub2" @click="$router.push('/interview#TechnicalQuestions')">Technical</el-menu-item>-->
          <!--          </el-sub-menu>-->
          <el-menu-item-group>
            <el-menu-item index="5-3" class="sub1" @click="$router.push('/interview/InterviewSteps')">Interview Steps</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="5-4" class="sub1" @click="$router.push('/interview/MasterInterview')">How to Master Interview</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
      </el-menu>
    </div>

    <div class="top-right">
      <div style="position: relative; display: inline-block;">
        <img src="/search-icon.svg" alt="icon" style="position: absolute; z-index: 2; display: inline; top: 29px; left: 10px">
        <el-autocomplete placeholder="Search info" style="margin-top: -5px; position: relative" v-model="state1"
                         :fetch-suggestions="querySearch" :trigger-on-focus="false" clearable class="inline-input w-50"
                         @select="handleSelect" />
      </div>
      <el-popover
          placement="bottom"
          trigger="hover"
          width="430px"
      >
        <template #reference>
          <div class="top-calendar">
            <p style="font-size: 16px; font-weight: 600; color: #1e4460; z-index: 2; position: relative; margin-left: 5.5px; padding-top: 5px">
              {{ getDay() }}
            </p>
            <!--            <el-avatar :size="30" style="position: absolute; top: 10px; left: 10px; z-index: 1; display: inline;-->
            <!--              background-color: transparent; margin-right: 17px" shape="square">-->
            <img class="top-calendar-logo" src="/calendar.svg" alt="calendar">
            <p style="font-size: 7px; font-weight: 600; color: #1e4460; z-index: 2; position: absolute; top: -10px; left: 9.2px">
              {{ getMonth() }}
            </p>
            <!--            </el-avatar>-->
          </div>
        </template>
        <template #default>
          <Calendar />
        </template>
      </el-popover>

      <div>
        <h2>About Us</h2>
      </div>


    </div>
  </div>
</template>

<script lang="ts">
import Calendar from "../views/Calendar.vue";
// import request from "../utils/request";
import routePathes from "./routePathes/routePathes.json";
import { onMounted, ref } from 'vue';

interface InsiteRoute {
  value: string
  link: string
  prompt: string
}

const state1 = ref('')

let siteRoutes = ref<InsiteRoute[]>([])



export default {
  name: "Header",
  components: {
    Calendar
  },
  // props: ['user'],
  data() {
    return {
      // user: {},
      // dialogFormVisible: false,
      // form: {}
      state1: '',
      siteRoutes: [] as InsiteRoute[],
      jsonData: routePathes,

    }
  },
  methods: {
    getDay() {
      const today = new Date();
      const output = today.getDate().toString();
      return output.length == 1 ? "0"+output : output;
    },
    getMonth() {
      const today = new Date();
      const output = today.toLocaleString('en-US', { month: 'short' })
      return output.toUpperCase();
    },
    loadAll() {
      console.log("loading");
      return this.jsonData.pathes;
    },
    querySearch(queryString: string, cb: any) {
      const noResultPrompt = `No results for \" ${queryString} \": Search from all UCSD sites`;
      const googleSearchPrompt = `Search ${queryString} from all UCSD sites`;

      const filter_results = this.siteRoutes.value.filter(this.createFilter(queryString));
      filter_results.push({ value: googleSearchPrompt, link: '', prompt: queryString });
      const results = filter_results.length !== 0 ? filter_results : [{ value: noResultPrompt, link: '', prompt: queryString }];

      // call callback function to return suggestions
      console.log("results: ", results);
      cb(results)
    },
    createFilter(queryString: string) {
      console.log("here: ", queryString);
      return (route: InsiteRoute) => {
        return (
          route.value.toLowerCase().indexOf(queryString.toLowerCase()) !== -1
        )
      }
    },
    handleSelect(item: InsiteRoute) {
      if (item.link === '') {
        window.open(`https://www.google.com/search?q=site%3Aucsd.edu+${item.prompt}`);
      } else {
        this.$router.push(item.link);
        console.log(item);
      }
    },
    handleOpen (key: string, keyPath: string[]) {
      console.log(key, keyPath)
    },
    handleClose (key: string, keyPath: string[]) {
      console.log(key, keyPath)
    },
  },
  mounted() {
    this.siteRoutes.value = this.loadAll();
    console.log("routes: ", this.siteRoutes.value);
    console.log(this.jsonData.pathes[0]);
  }
  // created() {
  //   let str = sessionStorage.getItem("user") || "{}"
  //   this.user = JSON.parse(str)
  // }


}
</script>

<style>
@font-face {
  font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
@font-face { font-family: work-sans-semi;
  src: url('../../public/WorkSans/WorkSans-Semibold.woff');
}
@media (min-width: 1440px) {
  .top-left {
    width: 250px;
  }
  .top-left-logo {
    width: 40px;
  }
  .top-mid {
    width: 800px;
  }
  .top-right {
    width: 390px;
  }
  .top-calendar {
    margin-right: 35px;
    margin-left: 35px;
  }
  .mod {
    font-size: 15px;
    color: #636363;
    font-weight: 500;
    /*height: 36px;*/
  }
  .sub1{
    font-size: 13px;
    color: #1e4460;
    text-align: center;
    /*height: 36px;*/
  }
  h1{
    color: black;
    font-weight: 700;
    font-size: 26px;
    font-family: work-sans;
    line-height: 141%;
  }
  h2 {
    color: #1e4460;
    font-weight: 600;
    font-size: 20px;
    font-family: work-sans;
    line-height: 141%;
  }
}
/* 多数电脑 ( 11 in. ≤ size < 13 in. ) */
@media (min-width: 1280px) and (max-width: 1439px) {
  .top-left {
    width: 16vw;
  }
  .top-left-logo {
    width: 36px;
  }
  .top-mid {
    width: 57vw;
  }
  .top-calendar {
    margin-right: 2.8vw;
    margin-left: 2.8vw;
  }
  .top-right {
    width: 27vw;
  }
  .mod {
    font-size: 14px;
    color: #636363;
    font-weight: 500;
    /*height: 36px;*/
  }
  .sub1{
    font-size: 12px;
    color: #1e4460;
    text-align: center;
    /*height: 36px;*/
  }
  h1{
    color: black;
    font-weight: 700;
    font-size: 22px;
    font-family: work-sans;
    line-height: 141%;
  }
  h2 {
    color: #1e4460;
    font-weight: 600;
    font-size: 18px;
    font-family: work-sans;
    line-height: 141%;
  }
  .el-sub-menu {
    padding: 0 0.5% !important;
  }

}
/* 小电脑及大Pad */
@media (min-width: 992px) and (max-width: 1279px) {
  .top-left {
    width: 16vw;
  }
  .top-left-logo {
    width: 32px;
  }
  .top-mid {
    width: 57vw;
  }
  .top-calendar {
    margin-right: 2vw;
    margin-left: 2vw;
  }
  /* TODO: reduce its width more, but have to change the month and day styling meanwhile*/
  .top-calendar-logo {
    width: 30px !important;
  }
  .top-right {
    width: 27vw;
  }
  .mod {
    font-size: 12px;
    color: #636363;
    font-weight: 500;
    line-height: 200%;
    /*height: 36px;*/
  }
  .sub1{
    font-size: 8px;
    color: #1e4460;
    text-align: center;
    /*height: 36px;*/
  }
  h1{
    color: black;
    font-weight: 700;
    font-size: 17px;
    font-family: work-sans;
    line-height: 200%;
  }
  h2 {
    color: #1e4460;
    font-weight: 600;
    font-size: 14px;
    font-family: work-sans;
    line-height: 141%;
  }

  /*TODO: reduce el-autocomplete width to 7vw*/

  .el-sub-menu {
    padding: 0 0 !important;
  }
}
/* 多数Pad */
/* TODO: 完善对iPad屏幕的styling */
@media (min-width: 480px) and (max-width: 991px) {
  .top-left {
    width: 16vw;
  }
  .top-left-logo {
    width: 31px;
  }
  .top-mid {
    width: 58vw;
  }
  .top-right {
    width: 25vw;
  }
  h1{
    color: black;
    font-weight: 700;
    font-size: 15px;
    font-family: work-sans;
    line-height: 200%;
  }
  h2 {
    color: #1e4460;
    font-weight: 600;
    font-size: 12px;
    font-family: work-sans;
    line-height: 141%;
  }

}
/* 手机 */
@media (max-width: 479px) {
  .top-left {
    width: 36vw;
  }
  .top-left-logo {
    width: 31px;
  }
  .top-mid {
    display: none;
  }
  .top-right {
    width: 64vw;
    padding-left: 2rem;
  }
  .top-calendar {
    margin-left: -2rem;
    margin-right: 0.8rem;
  }
  .inline-input {
    width: 75%;
  }
  h1{
    color: black;
    font-weight: 700;
    font-size: 15px;
    font-family: work-sans;
    line-height: 200%;
  }
  h2 {
    color: #1e4460;
    font-weight: 600;
    font-size: 12px;
    font-family: work-sans;
    line-height: 141%;
  }
}
/*.mod {*/
/*  font-size: 1vw;*/
/*  color: #636363;*/
/*  font-weight: 500;*/
/*  !*height: 36px;*!*/
/*}*/
.mod:hover {
  color: #1e4460;
}
/*.sub1{*/
/*  font-size: 0.8vw;*/
/*  color: #1e4460;*/
/*  text-align: center;*/
/*  !*height: 36px;*!*/
/*}*/
.sub1:hover{
  font-weight: 600;
  color: #182B49 !important;
  text-align: center;
}
/*h1{*/
/*  color: black;*/
/*  font-weight: 700;*/
/*  font-size: 1.8vw;*/
/*  font-family: work-sans;*/
/*  line-height: 141%;*/
/*  width: 11vw;*/
/*}*/

/*h2 {*/
/*  color: #1e4460;*/
/*  font-weight: 600;*/
/*  font-size: 1.4vw;*/
/*  font-family: work-sans;*/
/*  line-height: 141%;*/
/*}*/
.top-calendar {
  position: relative;
  display: inline-block;
}
.top-calendar-logo {
  position: absolute;
  top: 21px;
  left: 0px;
  z-index: 1;
  width: 32px;
  display: inline;
}
.top-left {
  /*width: 16vw;*/
  padding-left: 1%;
  display: flex;
  flex-direction: row;
  align-items: center;
}
.top-mid {
  /*width: 57vw;*/
  place-self: center;
}
.top-right {
  /*width: 27vw;*/
  display: flex;
  flex-direction: row;
  align-items: center;
}

.day {
  position: absolute;
}
.inline-input w-50 {
  width: 12vw;
}
.el-input--small {
  height: 35px;
  font-size: 12px;
}
.el-sub-menu {
  padding: 0 1%;
}
/*.el-menu-item {*/
/*  justify-content: center;  // 展开时会产生偏移*/
/*}*/
.el-menu-item.is-active {
  background-color: #FFC740 !important;
  font-weight: 500 !important;
}

/*.el-menu--horizontal>.el-sub-menu .el-sub-menu__title {*/
/*  height: 59px !important;*/
/*}*/
.el-input--small {
  height: 30px;
  font-size: 5px;
}
.el-input--small .el-input__inner {
  padding-left: 23px;
}
.el-input--small .el-input__wrapper {
  border-radius: 12px;
}
</style>