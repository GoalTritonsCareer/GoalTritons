<template>
  <div style="height: 50px; line-height: 50px; border-bottom: 1px solid #ccc; display: flex">
    <div style="flex: 2"></div>
    <div style="width: 100px">
      <el-dropdown>
        <span class="el-dropdown-link">
          <el-avatar :size="30" style="position: relative; top: 10px">
            <img src="../assets/avatar.png" alt="err" />
          </el-avatar>
           {{ user.username }}
          <i class="el-icon-arrow-down el-icon--right"></i>
        </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>Your Profile</el-dropdown-item>
            <el-dropdown-item>Change Password</el-dropdown-item>
            <el-dropdown-item @click="$router.push('/login')"> {{ getStatus(user.username) }} </el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>

export default {
  name: "Header",
  props: ['user'],
  data() {
    return {
      user: {}
    }
  },
  methods: {
    getStatus(name) {
      if (name == null || "") {
        return "Login"
      } else {
        return "Logout"
      }
    }
  },
  created() {
    let str = sessionStorage.getItem("user") || "{}"
    this.user = JSON.parse(str)
  }

}
</script>

<style scoped>

</style>