import { createRouter, createWebHistory } from 'vue-router'
import Layout from "../layout/Layout.vue";

import InterviewAside from "../components/InterviewAside.vue"
import InterviewQuestions from "../views/Interview/InterviewQuestions.vue"
import InterviewSteps from "../views/Interview/InterviewSteps.vue"
import MasterInterview from "../views/Interview/MasterInterview.vue"
import Interview from "../views/Interview/Interview.vue"

import ResumeAside from "../components/ResumeAside.vue"
import Resume_vs_CV from "../views/Resume/Resume_vs_CV.vue"
import Resume_Breakdown from "../views/Resume/Resume_Breakdown.vue"
import CV_Breakdown from "../views/Resume/CV_Breakdown.vue"
import Cover_Letter_Breakdown from "../views/Resume/Cover_Letter_Breakdown.vue"

import NetworkingAside from "../components/NetworkingAside.vue"
import Networking from "../views/Networking/Networking.vue"
import EverydayRoutine from "../views/Networking/EverydayRoutine.vue"
import MaintainNetwork from "../views/Networking/MaintainNetwork.vue"
import NetworkingOnline from "../views/Networking/NetworkOnline.vue"
import OnCampus from "../views/Networking/OnCampus.vue"
import OnlinePlatforms from "../views/Networking/OnlinePlatforms.vue"
const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  },
  //  TODO: apply the layout above to the pages below
  // {
  //   path: '/',
  //   name: 'Other',
  //   component: Layout,
  //   children: [
  //     // { path: 'interview', name: 'Interview', component: () => import("../views/Interview/Interview.vue") },
  //     { path: 'networking', name: 'Networking', component: () => import("../views/Networking.vue") },
  //     { path: 'resume', name: 'Resume', component: () => import("../views/Resume.vue") }
  //   ],
  // },
  {
    path: '/interview',
    name: 'interview-page',
    component: Layout,
    children: [
      { path: '', name: 'interview', components: {nav: InterviewAside, con: Interview}},
      { path: 'InterviewQuestions', name: 'InterviewQuestions', components: {nav: InterviewAside, con: InterviewQuestions}},
      { path: 'InterviewSteps', name: 'InterviewSteps', components: {nav: InterviewAside, con: InterviewSteps}},
      { path: 'MasterInterview', name: 'MasterInterview', components: {nav: InterviewAside, con: MasterInterview}},
    ]
  },
  {
    path: '/resume',
    name: 'resume-page',
    component: Layout,
    children: [
      { path: '', name: 'ResumevsCV', components: {nav: ResumeAside, con: Resume_vs_CV}},
      { path: 'ResumeBreakdown', name: 'ResumeBreakdown', components: {nav: ResumeAside, con: Resume_Breakdown}},
      { path: 'CVBreakdown', name: 'CVBreakdown', components: {nav: ResumeAside, con: CV_Breakdown}},
      { path: 'CoverLetterBreakdown', name: 'CoverLetterBreakdown', components: {nav: ResumeAside, con: Cover_Letter_Breakdown}},
      //{ path: 'MasterInterview', name: 'MasterInterview', components: {nav: InterviewAside, con: MasterInterview}},
    ]
  },
  {
    path: '/networking',
    name: 'networking-page',
    component: Layout,
    children: [
      { path: '', name: 'networking', components: { nav: NetworkingAside, con: Networking}},
      { path: 'EverydayRoutine', name: 'EverydayRoutine', components: {nav: NetworkingAside, con: EverydayRoutine}},
      { path: 'MaintainNetwork', name: 'MaintainNetwork', components: {nav: NetworkingAside, con: MaintainNetwork}},
      { path: 'NetworkOnline', name: 'NetworkOnline', components: {nav: NetworkingAside, con: NetworkingOnline}},
      { path: 'OnCampus', name: 'OnCampus', components: {nav: NetworkingAside, con: OnCampus}},
      { path: 'OnlinePlatforms', name: 'OnlinePlatforms', components: {nav: NetworkingAside, con: OnlinePlatforms}},
    ]
  }
  // {
  //   path: '/login',
  //   name: 'Login',
  //   component: () => import('../views/Login.vue')
  // },
  // {
  //   path: '/register',
  //   name: 'Register',
  //   component: () => import('../views/Register.vue')
  // },
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
  scrollBehavior: function (to) {
    if (to.hash) {
      return {
        el: to.hash,
      }
    }
  },
})

// activeRouter()
//
// function activeRouter() {
//   const userStr = sessionStorage.getItem("user")
//   if (userStr) {
//     const user = JSON.parse(userStr)
//     let root = {
//       path: '/',
//       name: 'Layout',
//       component: Layout,
//       redirect: "/home",
//       children: []
//     }
//     user.permissions.forEach(p => {
//       let obj = {
//         path: p.path,
//         name: p.name,
//         component: () => import("../views/" + p.name)
//       };
//       root.children.push(obj)
//     })
//     if (router) {
//       router.addRoute(root)
//     }
//   }
// }
//
// router.beforeEach((to, from, next) => {
//   if (to.path === '/login' || to.path === '/register') {
//     next()
//     return
//   }
//   let user = sessionStorage.getItem("user") ? JSON.parse(sessionStorage.getItem("user")) : {}
//   if (!user.permissions || !user.permissions.length) {
//     next('/login')
//   } else if (!user.permissions.find(p => p.path === to.path)) {
//     next('/login')
//   } else {
//     next()
//   }
// })

export default router
