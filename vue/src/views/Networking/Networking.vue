<template>
  <div id="home">
    <div id="heading" style="position: relative">
      <section class="title">
        <h1>NETWORKING</h1>
        <h2 class="quote">“New Survey Reveals 85% of All Jobs are Filled Via Networking - Lou Adler”</h2>
      </section>
      <img src="/networking/nwBG.png" alt="networking background" style="width: 100%">
      <a id="why-networking"></a>
    </div>

    <div id="body">
      <img id="whyNetworkingImg" src="/networking/whyNetworking.svg" alt="Why Networking">

      <a id="networking-routes"></a>
      <h2>NETWORKING ROUTES</h2>
      <section id="routes">
        <div class="container" @click="$router.push('/networking/OnlinePlatforms')">
          <div class="cover">
            <p>Online Platforms</p>
            <img src="/cover3.svg" alt="Cover" loading="lazy" style="opacity: 95%">
          </div>
          <!-- 注意：这行的brightness仅仅适用于此图片，因为图片本身较暗的原因-->
          <picture>
            <source srcset="/networking/OnlinePlatform.avif" type="image/avif">
            <source srcset="/networking/OnlinePlatform.png" type="image/png">
            <img class="bg" src="/networking/OnCampus.png" alt="Online Platforms Module" loading="lazy" style="filter: brightness(2)">
          </picture>
        </div>
        <div class="container" @click="$router.push('/networking/OnCampus')">
          <div class="cover">
            <p>On Campus</p>
            <img src="/cover3.svg" alt="Cover" loading="lazy">
          </div>
          <picture>
            <source srcset="/networking/OnCampus.avif" type="image/avif">
            <source srcset="/networking/OnCampus.png" type="image/png">
            <img class="bg" src="/networking/OnCampus.png" alt="On Campus Module" loading="lazy">
          </picture>
        </div>
        <div class="container" @click="$router.push('/networking/EverydayRoutine')">
          <div class="cover">
            <p>Everyday Routine</p>
            <img src="/cover3.svg" alt="Cover" loading="lazy">
          </div>
          <picture>
            <source srcset="/networking/EverydayRoutine.avif" type="image/avif">
            <source srcset="/networking/EverydayRoutine.png" type="image/png">
            <img class="bg" src="/networking/EverydayRoutine.png" alt="Everyday Routine Module" loading="lazy">
          </picture>
        </div>
        <p>Learn how to network through different online platforms.</p>
        <p>Learn how to network on campus.</p>
        <p>Learn how to network in everyday routine.</p>
      </section>

      <a id="networking-in-practice"></a>
      <h2>NETWORKING IN PRACTICE</h2>
      <section id="practice">
        <div class="container" @click="$router.push('/networking/NetworkOnline')">
          <div class="cover">
            <p>How to Network<br>Online</p>
            <img src="/cover2.svg" alt="Cover" loading="lazy">
          </div>
          <picture>
            <source srcset="/networking/HTNO.avif" type="image/avif">
            <source srcset="/networking/HTNO.png" type="image/png">
            <img class="bg" src="/networking/HTNO.png" alt="How to Network Online Module" loading="lazy">
          </picture>
        </div>
        <div class="container" @click="$router.push('/networking/MaintainNetwork')">
          <div class="cover">
            <p>How to Maintain<br>Network</p>
            <img src="/cover2.svg" alt="Cover" loading="lazy">
          </div>
          <img src="/networking/HTMN.png" class="bg" alt="How to Maintain Network Module" loading="lazy">
        </div>

        <p>Learn about how to network online step-by-step.</p>
        <p> Learn about steps to maintaining network.</p>
      </section>

      <a id="more-resources"></a>
      <h2>MORE RESOURCES</h2>
      <section class="resource">
        <p class="moreResTitle">LinkedIn:</p >
        <ul>
          <li>Summary Examples: <a href="https://blog.hubspot.com/sales/linkedin-summary-examples" target="_blank">
            <p class="moreRes" style="display: inline">17 Best LinkedIn Summary & Bio Examples</p></a>
          </li>
          <li>“Branding” yourself:
            <ul>
              <li><a href="https://www.linkedin.com/business/marketing/blog/content-marketing/5-free-ways-to-build-your-personal-brand-on-linkedin" target="_blank"><p class="moreRes">
                How to Build Your Personal Brand on LinkedIn</p></a></li>
              <li><a href="https://www.forbes.com/sites/robinryan/2021/09/14/how-to-create-an-impressive-linkedin-personal-brand/?sh=545765ed73e5" target="_blank"><p class="moreRes">
                How To Create An Impressive LinkedIn Personal Brand</p ></a></li>
            </ul>
          </li>
          <li>Connect Template: <a href="https://www.themuse.com/advice/want-people-to-accept-your-linkedin-requests-use-these-10-templates" target="_blank">
            <p class="moreRes" style="display: inline">LinkedIn Connect Template</p></a>
          </li>
        </ul>

        <p class="moreResTitle" style="margin-top: 20px">Networking Online:</p>
        <ul>
          <li>Info. Interview: <a href="https://career.berkeley.edu/Info/InfoQuestions" target="_blank">
            <p class="moreRes" style="display: inline">Qs to Ask through Info Interview</p ></a>
          </li>
        </ul>

        <p class="moreResTitle" style="margin-top: 20px">Maintain Networks:</p>
        <ul>
          <li>Info. Interview: <a href="https://www.themuse.com/advice/finally-5-email-templates-that-make-following-up-with-anyone-way-less-awkward" target="_blank">
            <p class="moreRes" style="display: inline">Networking Follow-Up Email Templates</p></a>
          </li>
        </ul>


        <p class="moreResTitle" style="margin-top: 20px">More articles for successful networking:</p >
        <ul>
          <li><a href="https://hbr.org/2016/05/learn-to-love-networking" target="_blank">
            <p class="moreRes" style="display: inline">Learn to Love Networking </p></a>
          </li>
        </ul>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: "Networking",
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
#whyNetworkingImg {
  margin-top: 9.5vh;
  width: 90%;
}
#routes {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  justify-content: space-between;
}
#routes p, #practice p {
  text-align: center;
  width: 85%;
  overflow: hidden;
}

#practice {
  display: grid;
  grid-template-columns: 1fr 1fr;
  justify-content: space-between;
}
/* 小电脑及大Pad */
@media (max-width: 1279px) {
  .quote {
    font-size: 17px;
  }
  h1 {
    font-size: 45px;
  }
}
</style>