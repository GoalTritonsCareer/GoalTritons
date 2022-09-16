<template>
  <el-row class="tac">
    <el-col :span="12">
      <h5 class="menu">Path to Approach</h5>
      <h5 class="menu">Your Career</h5>
      <el-menu
          style="width: 240px; min-height: calc(100vh - 50px)"
          class="el-menu-vertical-demo"
          default-active="0"
          @open="handleOpen"
          @close="handleClose"
      >

        <el-sub-menu index="1">
          <template #title>
            <span>Define your Career Goal</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="1-1" class="sub1">New to Career Planning</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="1-2" class="sub1">Learn about Your Career</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="1-3">
            <template #title style="margin-bottom: fill"><span class="sub1">Being F-1 Students</span></template>
            <el-menu-item index="1-3-1" class="sub2">CPT/OPT</el-menu-item>
          </el-sub-menu>
        </el-sub-menu>

        <el-sub-menu index="2">
          <template #title>
            <!--            <el-icon><location /></el-icon>-->
            <span class="mod" @click="$router.push('/fakeNetworking#fakeNetworkingTop')">Networking</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="2-1" class="sub1" @click="$router.push('/fakeNetworking#whyNetworking')">Why Networking</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="2-2">
            <template #title><span class="sub1" @click="$router.push('/fakeNetworking#onlinePlatform')">Online Platforms</span></template>
            <el-menu-item index="2-2-1" class="sub2" @click="$router.push('/fakeNetworking#whyPlatform')">Why & What</el-menu-item>
            <el-menu-item index="2-2-2" class="sub2" @click="$router.push('/fakeNetworking#linkedIn')">Linkedin</el-menu-item>
            <el-menu-item index="2-2-3" class="sub2" @click="$router.push('/fakeNetworking#tritonConnect')">Tritons Connect</el-menu-item>
            <el-menu-item index="2-2-4" class="sub2" @click="$router.push('/fakeNetworking#otherSocialMedia')">Other Social Media</el-menu-item>
            <el-menu-item index="2-2-5" class="sub2" @click="$router.push('/fakeNetworking#HowToNetworkOnline')">How to Network Online</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2-3">
            <template #title><span class="sub1" @click="$router.push('/fakeNetworking#networkOnCampus')">Networking on Campus</span></template>
            <el-menu-item index="2-3-1" class="sub2" @click="$router.push('/fakeNetworking#whyNetworkOnCampus')">Why & Where</el-menu-item>
            <el-menu-item index="2-3-2" class="sub2" @click="$router.push('/fakeNetworking#studentOrganization')">Student Orgs</el-menu-item>
            <el-menu-item index="2-3-3" class="sub2" @click="$router.push('/fakeNetworking#mentorshipPrograms')">Mentoring Programs</el-menu-item>
            <el-menu-item index="2-3-4" class="sub2" @click="$router.push('/fakeNetworking#careerFair')">Career Fairs/Events</el-menu-item>
            <el-menu-item index="2-3-5" class="sub2" @click="$router.push('/fakeNetworking#labs')">Labs</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2-4">
            <template #title><span class="sub1" @click="$router.push('/fakeNetworking#everydayRoutine')">Everyday Routine</span></template>
            <el-menu-item index="2-4-1" class="sub2" @click="$router.push('/fakeNetworking#whoToNetworkWith')">Who to Network with</el-menu-item>
            <el-menu-item index="2-4-2" class="sub2" @click="$router.push('/fakeNetworking#faculty')">Faculty</el-menu-item>
            <el-menu-item index="2-4-3" class="sub2" @click="$router.push('/fakeNetworking#peers')">Peers</el-menu-item>
          </el-sub-menu>
          <el-menu-item-group>
            <el-menu-item index="2-5" class="sub1" @click="$router.push('/fakeNetworking#maintainNetwork')">Maintain Networks</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="2-6" class="sub1" @click="$router.push('/fakeNetworking#networkingRouteSummary')">Networking Routes Summary</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="2-7" class="sub1" @click="$router.push('/fakeNetworking#moreResources')">More Resources</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>

        <el-menu-item index="3">
          <span class="mod">Internship & Jobs</span>
        </el-menu-item>

        <el-sub-menu index="4">
          <template #title>
            <span class="mod" @click="$router.push('/resume#resumeTop')">Resume/CV & Cover Letter</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="4-1" class="sub1" @click="$router.push('/resume#resume-vs-cv')">Resume vs. CV</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="4-2">
            <template #title ><span class="sub1" @click="$router.push('/resume#resume-breakdown')">Resume Breakdown</span></template>
            <el-menu-item index="4-2-1" class="sub2" @click="$router.push('/resume#resume-components')">Resume Components</el-menu-item>
            <el-menu-item index="4-2-2" class="sub2" @click="$router.push('/resume#resume-essentials')">Resume Essentials</el-menu-item>
            <el-menu-item index="4-2-3" class="sub2" @click="$router.push('/resume#sample-resumes-anchor')">Sample Resumes</el-menu-item>
            <el-menu-item index="4-2-4" class="sub2" @click="$router.push('/resume#polish-resume')">Polish Your Resume</el-menu-item>
          </el-sub-menu>
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
        <el-sub-menu index="5">
          <template #title>
            <span class="mod" @click="$router.push('/interview#opening')">Interview Prep</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="5-1" class="sub1" @click="$router.push('/interview#whyInterview')" >Why Interview</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="5-2">
            <template #title><span class="sub1" @click="$router.push('/interview#interviewQuestions')">Interview Questions</span></template>
            <el-menu-item index="5-2-1" class="sub2" @click="$router.push('/interview#defineYourself')">Define Yourself</el-menu-item>
            <el-menu-item index="5-2-2" class="sub2" @click="$router.push('/interview#BehavioralQuestions')">Behavioral</el-menu-item>
            <el-menu-item index="5-2-3" class="sub2" @click="$router.push('/interview#TechnicalQuestions')">Technical</el-menu-item>
          </el-sub-menu>
          <el-menu-item-group>
            <el-menu-item index="5-3" class="sub1" @click="$router.push('/interview#interviewSteps')">Interview Steps</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="5git push -u origin Interview-4" class="sub1" @click="$router.push('/interview#howToMasterAnInterview')">How to Master Interview</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script lang="ts">

export default {
  name: "Aside",
  data() {
    return {
    }
  },
  methods: {
    handleOpen (key: string, keyPath: string[]) {
      console.log(key, keyPath)
    },
    handleClose (key: string, keyPath: string[]) {
      console.log(key, keyPath)
    }
  },
}
</script>

<style scoped>
.mod {
  font-size: 15px;
  color: #1E4460;
}
.sub1{
  font-size: 13px;
  color: #1E4460;
}
.sub2{
  font-size: 12px;
  color: #1E4460;
}
/*.el-menu-item{*/
/*  text-align: left;*/
/*}*/
.el-sub-menu__title{
  text-size: 12px;
}
.el-col {
  max-width: 100%;
  flex: 0 0 50%;
}
.menu {
  font-size: 20px;
  margin-left: 3px;
  margin-bottom: 3px;
  text-align: center;
  color: #1E4460;
}
</style>