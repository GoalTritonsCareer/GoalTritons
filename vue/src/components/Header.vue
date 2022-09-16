<template>
  <div style="height: 60px; line-height: 60px; border-bottom: 1px solid #ccc; display: flex">
    <div style="flex: 2; padding-left: 21%; display: flex; flex-direction: row">
      <img src="../assets/logo.svg" alt="logo" style="width: 40px; margin-top: -4px" />
      <h1 style="margin-left: 15px; align-self: center;"> Go<span style="opacity: 50%">al</span> Tritons</h1><br>
    </div>
    <div style="width: 500px; display: flex; flex-direction: row; align-items: center;">
      <el-autocomplete placeholder="" style="margin-top: -5px; margin-right: 15px; width: 260px" v-model="state1"
        :fetch-suggestions="querySearch" :trigger-on-focus="false" clearable class="inline-input w-50"
        @select="handleSelect" />

      <h2 style="margin-right: 15px">About Us</h2>
      <el-popover placement="bottom" trigger="click" width="415px">
        <template #reference>
          <el-avatar :size="35" style="position: relative; background-color: transparent; margin-right: 17px"
            shape="square">
            <img src="../assets/calendar.svg" alt="calendar" />
          </el-avatar>
        </template>
        <template #default>
          <Calendar />
        </template>
      </el-popover>

      <!--      <el-button text @click="showDialogForm(true)" style="background-color: #F4CE71; font-family: work-sans; font-size: 14px">Subscribe</el-button>-->

      <!--      <el-dialog v-model="dialogFormVisible" title="Subscription" @closed="showDialogForm(false)">-->
      <!--        <div>Get notifications right after each update</div>-->
      <!--        <el-form ref="form" :model="form" size="normal" >-->
      <!--          <el-form-item prop="username">-->
      <!--            <p>Username</p>-->
      <!--            <el-input prefix-icon="el-icon-user-solid" v-model="form.username"></el-input>-->
      <!--          </el-form-item>-->
      <!--          <el-form-item prop="email">-->
      <!--            <p>Email</p>-->
      <!--            <el-input prefix-icon="el-icon-user-solid" v-model="form.email"></el-input>-->
      <!--          </el-form-item>-->
      <!--        </el-form>-->
      <!--        <template #footer>-->
      <!--          <span class="dialog-footer">-->
      <!--            <el-button @click="showDialogForm(false)" style="font-size: 15px; font-weight: 600">Cancel</el-button>-->
      <!--            <el-button type="primary" @click="subscribe" style="font-size: 15px; font-weight: 600">Subscribe</el-button>-->
      <!--          </span>-->
      <!--        </template>-->
      <!--      </el-dialog>-->
      <!--      <el-dropdown>-->
      <!--        <span class="el-dropdown-link">-->
      <!--          <el-avatar :size="30" style="position: relative; top: 10px">-->
      <!--            <img src="../assets/avatar.png" alt="err" />-->
      <!--          </el-avatar>-->
      <!--           {{ user.username }}-->
      <!--          <i class="el-icon-arrow-down el-icon&#45;&#45;right"></i>-->
      <!--        </span>-->
      <!--        <template #dropdown>-->
      <!--          <el-dropdown-menu>-->
      <!--            <el-dropdown-item>Your Profile</el-dropdown-item>-->
      <!--            <el-dropdown-item>Change Password</el-dropdown-item>-->
      <!--            <el-dropdown-item @click="$router.push('/login')"> {{ getStatus(user.username) }} </el-dropdown-item>-->
      <!--          </el-dropdown-menu>-->
      <!--        </template>-->
      <!--      </el-dropdown>-->
    </div>
  </div>
</template>

<script lang="ts">
import Calendar from "../views/Calendar.vue";
import request from "../utils/request";
import routePathes from "./routePathes/routePathes.json";
import { onMounted, ref } from 'vue'

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
  props: ['user'],
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

    }

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
  src: url('../assets/WorkSans/WorkSans-Bold.woff');
}

h1 {
  color: white;
  font-weight: 700;
  font-size: 26px;
  font-family: work-sans;
  line-height: 141%;
}

h2 {
  color: white;
  font-weight: 600;
  font-size: 20px;
  font-family: work-sans;
  line-height: 141%;
}

.el-input--small {
  height: 30px;
  font-size: 5px;
}
</style>