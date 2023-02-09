<template>
  <el-col :span="12">
    <h5 class="menu">Resume / CV &<br>Cover Letter</h5>
    <el-menu
        style="min-height: calc(100vh - 160px); --el-menu-active-color: #5E8090"
        class="el-menu-vertical-demo"
        default-active="0"
        @open="handleOpen"
        @close="handleClose"
    >
      <el-menu-item-group>
        <el-menu-item index="1" class="mod menu-item-1" @click="$router.push('/resume/resume-vs-cv')">Resume vs. CV</el-menu-item>
      </el-menu-item-group>

      <el-sub-menu index="2">
        <template #title>
          <span class="mod" @click="$router.push('/resume#resume-breakdown')">Resume Breakdown</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="2-1" class="sub1" @click="$router.push('/resume#resume-components')">Resume Components</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group>
          <el-menu-item index="2-2" class="sub1" @click="$router.push('/resume#resume-essentials')">Resume Essentials</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group>
          <el-menu-item index="2-3" class="sub1" @click="$router.push('/resume#sample-resumes-anchor')">Sample Resumes</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group>
          <el-menu-item index="2-4" class="sub1" @click="$router.push('/resume#polish-resume')">Polish Your Resume</el-menu-item>
        </el-menu-item-group>
      </el-sub-menu>

      <el-sub-menu index="3">
        <template #title>
          <span class="mod menu-item-3">CV Breakdown</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="3-1" class="sub1">CV Components</el-menu-item>
        </el-menu-item-group>
      </el-sub-menu>

      <el-menu-item-group>
        <el-menu-item index="4" class="mod menu-item-4" @click="$router.push('/resume#cover-letter')">Cover Letter</el-menu-item>
      </el-menu-item-group>

      <el-menu-item-group>
        <el-menu-item index="5" class="mod menu-item-5" @click="$router.push('/resume#more-resources')">More Resources</el-menu-item>
      </el-menu-item-group>

    </el-menu>
  </el-col>
</template>

<script lang="ts">

export default {
  name: "ResumeAside",
  data() {
    return {
      isCollapse: false,
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
  color: #182B49;
  font-weight: 400;
}
.sub1{
  font-size: 13px;
  color: #636363;
}
.sub2{
  font-size: 12px;
  color: #5E8090;
}
.el-sub-menu ul{
  height: 35px !important;
}
.el-sub-menu .el-menu-item {
  height: 35px !important;
}
.el-menu-item {
  height: 35px;
}

.el-col {
  max-width: 100%;
  flex: 0 0 50%;
}
.menu {
  font-size: 22px;
  margin-left: 3px;
  margin-bottom: 18px;
  text-align: center;
  color: #1E4460;
  line-height: 30px;
  margin-top: 13%;
}
.el-menu-item.is-active {
  background-color: #FFC740 !important;
  font-weight: 500 !important;
}
</style>

<style>
.el-sub-menu__title {
  height: 35px !important;
  text-size: 12px;
}
</style>