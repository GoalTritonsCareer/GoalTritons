import { createRouter, createWebHistory } from 'vue-router'
import Layout from "../layout/Layout.vue";

const routes = [
  {
    path: '/',
    name: 'Layout',
    component: Layout,
    redirect: "/home",
    children: [
      { path: 'home', name: 'Home', component: () => import("../views/Home.vue") },
      { path: 'interview', name: 'Interview', component: () => import("../views/Interview.vue") },
      { path: 'resume', name: 'Resume', component: () => import("../views/Resume.vue") }
    ],
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '/register',
    name: 'Register',
    component: () => import('../views/Register.vue')
  },
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
  scrollBehavior: function (to) {
    if (to.hash) {
      return {
        el: to.hash,
        // top: 60,
        behavior: 'smooth',
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
