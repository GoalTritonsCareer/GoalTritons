<template>
  <el-col :span="12">
    <h5 class="menu" @click="$router.push('/resume#home')">RESUME/CV/ COVER LETTER</h5>
    <el-menu
        class="el-menu-vertical-demo"
        default-active="0"
        @open="handleOpen"
        @close="handleClose"
    >
      <el-menu-item-group>
        <el-menu-item index="1" class="mod menu-item-1" @click="$router.push('/resume#resume-vs-cv')">Resume VS. CV</el-menu-item>
      </el-menu-item-group>

      <el-sub-menu index="2">
        <template #title>
          <span class="mod menu-item-2" @click="$router.push('/resume#build-your-profile')">Build Your Profile</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="2-1" class="sub1" @click="$router.push('/resume/ResumeBreakdown')">Resume Breakdown</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group>
          <el-menu-item index="2-2" class="sub1" @click="$router.push('/resume/CVBreakdown')">CV Breakdown</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group>
          <el-menu-item index="2-3" class="sub1" @click="$router.push('/resume/CoverLetterBreakdown')">Cover Letter</el-menu-item>
        </el-menu-item-group>
      </el-sub-menu>

      <el-menu-item-group>
        <el-menu-item index="3" class="mod menu-item-3" @click="$router.push('/resume#more-resources')">More Resource</el-menu-item>
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
  mounted() {
    window.scrollTo(0, 0);
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
.el-menu-vertical-demo {
  border: none !important;
  --el-menu-active-color: #5E8090;
  height: auto;
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
  font-size: 1.5rem;
  margin-bottom: 1.3rem;
  text-align: center;
  color: #1E4460;
  margin-top: 5rem;
  cursor: pointer;
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