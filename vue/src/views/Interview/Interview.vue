<template>
  <div id="home">
    <div id="heading" style="position: relative">
      <section class="title">
        <h1>INTERVIEW PREP</h1>
      </section>
      <picture>
        <source srcset="/interview/interviewPrep.avif" type="image/avif">
        <source srcset="/interview/interviewPrep.png" type="image/png">
        <img src="/interview/interviewPrep.png" alt="Interview background" style="width:100%">
      </picture>
      <a id="why-interview"></a>
    </div>

    <div id="body">
      <img id="whyInterviewImg" src="/interview/whyInterview.svg" alt="Why Interview">

      <a id="interview-breakdown"></a>
      <h2>INTERVIEW BREAKDOWN</h2>
      <section id="routes">
        <div class="container" @click="$router.push('/interview/InterviewQuestions')">
          <div class="cover">
            <p>Interview Questions Types</p>
            <img src="/cover4.svg" alt="Cover" loading="lazy">
          </div>
          <img class="bg" src="/interview/HomeInterviewQT.svg" alt="Interview Questions Types Module" loading="lazy">
        </div>
        <div class="container" @click="$router.push('/interview/InterviewSteps')">
          <div class="cover">
            <p>Interview Steps</p>
            <img src="/cover4.svg" alt="Cover" loading="lazy">
          </div>
          <img class="bg" src="/interview/HomeInterviewSteps.svg" alt="Interview Steps Module" loading="lazy">
        </div>
        <div class="container" @click="$router.push('/interview/MasterInterview')">
          <div class="cover">
            <p>Master An Interview</p>
            <img src="/cover4.svg" alt="Cover" loading="lazy">
          </div>
          <img class="bg" src="/interview/HomeInterviewMaster.svg" alt="Master An Interview Module" loading="lazy">
        </div>
        <p>Learn common interview question types.</p>
        <p>Learn the flow of interviews.</p>
        <p>Learn how to network in everyday routine.</p>
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
  name: "Interview",
  mounted() {
    window.scrollTo(0, 0);
  }
}
</script>



<style scoped>
@import "../../assets/content.css";

@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
#whyInterviewImg {
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
</style>