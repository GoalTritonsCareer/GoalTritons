<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back">&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>HOW TO MAINTAIN NETWORK</h1>
      </section>
      <picture>
        <source srcset="/networking/htmnBG.avif" type="image/avif">
        <source srcset="/networking/htmnBG.png" type="image/png">
        <img src="/networking/htmnBG.png" alt="how to maintain network background" style="width: 100%">
      </picture>
    </div>

    <div id="body">
      <img src="/networking/HTMN-graph.svg" alt="maintainNetworks" style="margin: 3rem auto; width: 80%;">
      <img src="/networking/HTMN-example.svg" alt="examples of maintaining networks" style="margin: auto; width: 75%">
    </div>

  </div>
</template>

<script>
export default {
  name: "MaintainNetwork",
  mounted() {
    window.scrollTo(0, 0);
  },
}
</script>



<style scoped>
@import "../../assets/content.css";
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
</style>