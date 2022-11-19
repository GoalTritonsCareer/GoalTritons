<template>
  <div style="height: 60px; line-height: 70px; border-bottom: 1px solid #ccc; display: flex; background-color: white">
    <div style="width: 18vw; padding-left: 1%; display: flex; flex-direction: row; align-items: center">
      <a href="http://goaltritonscareer.com" style="margin-top: -8px">
        <img src="../../public/logo.svg" alt="logo" style="width: 40px; vertical-align: middle;"/>
      </a>
      <a href="http://goaltritonscareer.com" style="text-decoration: none;">
        <h1 style="margin-left: 15px; align-self: center;text-decoration: none;">Go<span style="color: #7c97AB">al</span> Tritons</h1>
      </a>
    </div>
    <div style="width: 56vw; place-self: center">
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
            <span class="mod menu-item-4" @click="$router.push('/resume#resumeTop')">Resume</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="4-1" class="sub1" @click="$router.push('/resume#resume-vs-cv')">Resume vs. CV</el-menu-item>
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
            <span class="mod" @click="$router.push('/interview#opening')">Interview Prep</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="5-1" class="sub1" @click="$router.push('/interview#whyInterview')">Why Interview</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="5-2" class="sub1" @click="$router.push('/interview#interviewQuestions')">Interview Questions</el-menu-item>
          </el-menu-item-group>
<!--          <el-sub-menu index="5-2" style="margin-top: 0">-->
<!--            <template #title><span class="sub1" @click="$router.push('/interview#interviewQuestions')">Interview Questions</span></template>-->
<!--            <el-menu-item index="5-2-1" class="sub2" @click="$router.push('/interview#defineYourself')">Define Yourself</el-menu-item>-->
<!--            <el-menu-item index="5-2-2" class="sub2" @click="$router.push('/interview#BehavioralQuestions')">Behavioral</el-menu-item>-->
<!--            <el-menu-item index="5-2-3" class="sub2" @click="$router.push('/interview#TechnicalQuestions')">Technical</el-menu-item>-->
<!--          </el-sub-menu>-->
          <el-menu-item-group>
            <el-menu-item index="5-3" class="sub1" @click="$router.push('/interview#interviewSteps')">Interview Steps</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="5-4" class="sub1" @click="$router.push('/interview#howToMasterAnInterview')">How to Master Interview</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
      </el-menu>
    </div>

    <div style="width: 26vw; display: flex; flex-direction: row; align-items: center;">
      <div style="position: relative; display: inline-block;">
        <img src="/search-icon.svg" alt="icon" style="position: absolute; z-index: 2; display: inline; top: 29px; left: 10px">
        <el-autocomplete placeholder="Search info (e.g. resume)" style="margin-top: -5px;
        width: 12vw; position: relative" v-model="state1"
                         :fetch-suggestions="querySearch" :trigger-on-focus="false" clearable class="inline-input w-50"
                         @select="handleSelect" />
      </div>
      <el-popover
          placement="bottom"
          trigger="hover"
          width="430px"
      >
        <template #reference>
          <div style="position: relative; display: inline-block; margin-left: 30px;">
            <p style="font-size: 16px; font-weight: 600; color: #1e4460; z-index: 2; position: relative; margin-left: 8.5px; padding-top: 5px">
              {{ getDay() }}
            </p>
<!--            <el-avatar :size="30" style="position: absolute; top: 10px; left: 10px; z-index: 1; display: inline;-->
<!--              background-color: transparent; margin-right: 17px" shape="square">-->
            <img src="/calendar.svg" alt="calendar" style="position: absolute; top: 21px; left: 0px; z-index: 1; width: 32px; display: inline;">
            <p style="font-size: 7px; font-weight: 600; color: #1e4460; z-index: 2; position: absolute; top: -9.5px; left: 8.2px">
              {{ getMonth() }}
            </p>
<!--            </el-avatar>-->
          </div>
        </template>
        <template #default>
          <Calendar />
        </template>
      </el-popover>

      <div style="margin-left: 2vw; min-width: 100px; width: 11vw;">
        <h2>About Us</h2>
      </div>


    </div>
  </div>
</template>

<script lang="ts">
import Calendar from "../views/Calendar.vue";
import request from "../utils/request";
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
  name: "homeHeader",
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

<style scoped>
@font-face {
  font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
@font-face { font-family: work-sans-semi;
  src: url('../../public/WorkSans/WorkSans-Semibold.woff');
}
.mod {
  font-size: 1vw;
  color: #636363;
  font-weight: 500;
  /*height: 36px;*/
}
.mod:hover {
  color: #1e4460;
}
.sub1{
  font-size: 0.8vw;
  color: #1e4460;
  text-align: center;
  /*height: 36px;*/
}
.sub1:hover{
  font-weight: 600;
  color: #182B49 !important;
  text-align: center;
}
h1{
  color: black;
  font-weight: 700;
  font-size: 1.8vw;
  font-family: work-sans;
  line-height: 141%;
  width: 11vw;
}

h2 {
  color: #1e4460;
  font-weight: 600;
  font-size: 1.4vw;
  font-family: work-sans;
  line-height: 141%;
}

.day {
  position: absolute;
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

</style>