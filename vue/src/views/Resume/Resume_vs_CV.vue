<template>
  <div id="home">
    <div id="heading" style="position: relative">
      <section class="title">
        <h1>RESUME / CV & COVER LETTER</h1>

      </section>
      <img src="/resume/newBG.avif" alt="resume background" style="width: 100%" >
      <a id="resume-vs-cv"></a>
    </div>


    <div id="body">

      <h2>RESUME VS. CV</h2>
      <img src="/resume/resumeVScv.svg" alt="resume VS. CV">


      <a id="build-your-profile"></a>
      <h2>BUILD YOUR PROFILE</h2>
      <section id="routes">
        <div class="container">
          <div class="cover">
            <p>Resume</p>
            <img src="/cover3.svg" alt="Cover" loading="lazy" style="opacity: 75%">
          </div>
          <img class="bg" src="/resume/resumeImg.svg" alt="Online Platforms Module" loading="lazy">
        </div>
        <div class="container">
          <div class="cover">
            <p>CV</p>
            <img src="/cover3.svg" alt="Cover" loading="lazy">
          </div>
          <img class="bg" src="/resume/CVImg.svg" alt="On Campus Module" loading="lazy">
        </div>
        <div class="container">
          <div class="cover">
            <p>Cover Letter</p>
            <img src="/cover3.svg" alt="Cover" loading="lazy">
          </div>
          <img class="bg" src="/resume/coverLetterImg.svg" alt="Everyday Routine Module" loading="lazy">
        </div>
      </section>
      <a id="more-resources"></a>
      <h2>More Resources</h2>
      <section class="resource">
        <p class="moreResTitle">Resume:</p>
        <ul>
          <li> Free Online Resume Builder:
            <ul style="margin-left: 23px">
              <li><a href="//www.resume.com/" target="_blank"><p class="moreRes">
                Free Resume Builder | Resume.com</p></a></li>
              <li><a href="https://www.rezi.ai/" target="_blank"><p class="moreRes">
                The AI Resume Builder | Rezi</p></a></li>
            </ul>
          </li>
          <li>Resume Summary Examples: <a href="//zety.com/blog/resume-summary#:~:text=Here's%20how%20to%20write%20a,can%20deliver%20results%20when%20hired" target="_blank">
            <p class="moreRes" style="display: inline"> Professional Resume
              Summary Examples <i>(25+ Statements)</i></p></a>
          </li>
          <li>Resume Skills Examples: <a href="//resumegenius.com/blog/resume-help/skills-for-resume" target="_blank">
            <p class="moreRes" style="display: inline">Best Skills for Your
              Resume <i>(Examples + How to List)</i></p></a>
          </li>
          <li>Career Center: <a href="https://career.ucsd.edu/succeed-search/resume/index.html" target="_blank">
            <p class="moreRes" style="display: inline">Create a Resume</p></a>
          </li>
        </ul>

        <p class="moreResTitle" style="margin-top: 20px">CV:</p>
        <ul>
          <li>More examples for CV formatting: <a href="//resumegenius.com/blog/cv-help/cv-format#conferences" target="_blank">
            <p class="moreRes" style="display: inline">Curriculum Vitae <i>(CV)
            </i> Format: Samples & Formatting Tips</p></a>
          </li>
        </ul>

        <p class="moreResTitle" style="margin-top: 20px">Cover Letter:</p>
        <ul>
          <li>Paraphrasing Tool: <a href="//quillbot.com/" target="_blank">
            <p class="moreRes" style="display: inline">Paraphrasing Tool</p></a>
          </li>
        </ul>

        <p class="moreResTitle" style="margin-top: 20px">More Articles for tips:</p>
        <ul>
          <li><a href="//www.themuse.com/advice/how-to-quantify-your-resume-bullets-when-you-dont-work-with-numbers" target="_blank">
            <p class="moreRes" style="display: inline">Tips on quantifying your accomplishments</p></a>
          </li>
          <li><a href="//www.themuse.com/advice/4-ways-to-make-sure-your-resume-is-selling-you-as-the-one-for-the-job" target="_blank">
            <p class="moreRes">4 Ways to Make Sure Your Resume Is Selling You as the One for the Job</p></a>
          </li>
        </ul>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: "Networking",
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
</style>