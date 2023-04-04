<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/resume')" style="text-decoration: underline; cursor: pointer">Resume/CV/Cover Letter</span></h3>
        <h1>Resume Breakdown</h1>
      </section>
      <img src="/resume/resumeBG.avif" alt="resume breakdown background" style="width: 100%" >
    </div>

    <div id="body">
      <h2 style="margin-top: 80px;">RESUME BREAKDOWN</h2>
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="Components" name="first">
          <section class="wrapper">
            <img src="/resume/resumeHeader.svg" width="493" alt="header" draggable="false" class="comp">
            <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid">
            <p><span class="semi">Header:</span> <br>
              Contact Info <i>(e.g. email, phone ##, LinkedIn)</i></p>

            <img src="/resume/resumeSummary.svg" width="493" alt="summary" draggable="false" class="comp">
            <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid">
            <p><span class="semi">Summary</span><br>
              Summarize your greatest achievement/character traits.</p>

            <img src="/resume/resumeSkills.svg" width="493" alt="skills" draggable="false" class="comp">
            <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid">
            <p><span class="semi">Skills</span>
                Include any <span class="medium">position-related</span> soft/hard skills/languages that
                can add to your competencies. <br><i class="moreResLink" @click="$router.push('/resume#more-resources')">
                More Resources</i>.
            </p>

            <img src="/resume/resumeEducation.svg" width="493" alt="education" draggable="false" class="comp">
            <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid">
            <p><span class="semi">Education</span><br>
              Include school name/majors & minors/expected graduation date/awards or honors; include
              <strong class="medium"> GPA only if ≥ 3.5</strong>. </p>

            <img src="/resume/resumeExperience.svg" width="493" alt="experience" draggable="false" class="comp">
            <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid">
            <p style="line-height: 141%"><span class="semi">Professional Experience</span><br>
              Include any professional experience that can <span class="medium">prove your qualifications</span> for
              the position you are applying for. Start with the <span class="medium">most relevant</span> one. <br><br>
              You can also include some <span class="medium">relevant</span> experience that makes you stand out such as
              clubs and organizations.
            </p>

            <section>
              <img src="/resume/resumeProjects&Awards.svg" width="493" alt="projects & awards" draggable="false" class="comp">
            </section>
            <section>
              <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid">
              <img src="/needle.svg" width="66" height="20" alt="------>" class="w-mid" style="margin-top: 40px">
            </section>
            <section>
              <p><span class="semi">Projects</span><br>
                Include <span class="medium">position-related</span> projects you have done. Describe key
                responsibilities and contributions.</p>
              <p style="margin-top: 4px"><span class="semi">Awards & Certifications</span><br>
                Include awards or certifications that showcase your professional skills.</p>
            </section>
          </section>
          <section class="buttondiv">
            <a id="resume-essentials"></a>
            <a href="/resume/resumetemplate.docx" download=""><button class="downloadTemplate">Download Resume Template</button></a>
          </section>

        </el-tab-pane>


        <el-tab-pane label="Essentials" name="second" >
          <img src="/resume/resumeEssentials.svg"  alt="resume essentials" style=" height: 320px;margin-bottom: 50px">

          <div style="position: relative; display: inline-block; margin: auto">
            <div style="background-color: rgba(244,206,113,0.21); border-radius: 1rem;border: 3px dashed #F4CE71; width:625px;
                    font-size: 16px; margin-left: -3%">
              <p style="padding-top: 10px; color: #1E4460">Limit formatting of your resume to be
                <a class="link" href="https://www.topresume.com/career-advice/what-is-an-ats-resume" target="_blank" style="color: #0467B0">
                  ATS <i>(Applicant Tracking System)</i>
                </a>
                friendly.
              </p>
              <ul style="margin-left: 4vw; margin-right: 0;padding-bottom: 10px; color: #1E4460">
                <li>Fonts should be simple & readable</li>
                <li>Sections should be easily identified</li>
                <li>Titles and bodies should be distinguished with different weights</li>
              </ul>
            </div>
            <img style="position: absolute; top: -28px; left: 570px; z-index: 2; display: inline" src="/light-bulb.svg"
                 alt="light-bulb">
          </div>


        </el-tab-pane>

        <el-tab-pane label="Samples" name="third">
          <div id="sample-resumes">

            <div class="resumeTemplate">
              <p class="sampleResumeTitle">Econ/Business</p>
              <a class="card" href="//www.indeed.com/career-advice/resume-samples/business-resumes?from=careeradvice-US" target="_blank" style="margin-top: 5px">
                <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" style=" height: 255px;">
                <img src="/resume/hoverImage.png" class="img-top" alt="click to view" style=" height: 255px;">
              </a>
            </div>

            <div class="resumeTemplate">
              <p class="sampleResumeTitle">Info Tech <i>(IT)</i></p>
              <a class="card" href="//www.indeed.com/career-advice/resume-samples/information-technology-resumes?from=careeradvice-US" target="_blank" style="margin-top: 5px">
                <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" style=" height: 255px;">
                <img src="/resume/hoverImage.png" class="img-top" alt="click to view" style=" height: 255px;">
              </a>
            </div>
            <div class="resumeTemplate">
              <p class="sampleResumeTitle">Engineering</p>
              <a class="card" href="//www.indeed.com/career-advice/resume-samples/engineering-resumes?from=careeradvice-US" target="_blank" style="margin-top: 5px">
                <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" style=" height: 255px;">
                <img src="/resume/hoverImage.png" class="img-top" alt="click to view" style=" height: 255px;">
              </a>
            </div>
            <div class="resumeTemplate">
              <p class="sampleResumeTitle" >Art/Design</p>
              <a class="card" href="//www.indeed.com/career-advice/resume-samples/arts-resumes" target="_blank" style="margin-top: 5px" >
                <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" style=" height: 255px;">
                <img src="/resume/hoverImage.png" class="img-top" alt="click to view" style=" height: 255px;" >
                <p id="polish-resume" style="display:inline;"></p>
              </a>

            </div>

          </div>

          <div style="text-align: right; margin-top: 30px">
            <a href="//zety.com/resume-examples" target="_blank">
              <p  class ="link" >See Samples for More Fields</p>
              &nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle;width:22px" alt="arrow">
            </a>
          </div>
        </el-tab-pane>

        <el-tab-pane label="Polishing" name="fourth">
          <div>
            <h4 style="text-align: left">Use Strong Action Verbs</h4>
            <div class="strongActionVerbsDiv">
              <p class="strongActionVerbs">Management Skills</p>
              <p class="strongActionVerbs">Communication Skills</p>
              <p class="strongActionVerbs">Teaching Skills</p>
              <p class="strongActionVerbs">Creative Skills</p>
              <p class="strongActionVerbs">Administrative Skills</p>
            </div>
            <div class="strongActionVerbsDiv">
              <p class="strongActionVerbs">Research Skills</p>
              <p class="strongActionVerbs">Technical Skills</p>
              <p class="strongActionVerbs">Financial Skills</p>
              <p class="strongActionVerbs">Helping Skills</p>
              <p class="strongActionVerbs">Accomplishments</p>
            </div>
          </div>


          <div>
            <h4 style="text-align: left;margin-bottom: 50px;margin-top: 30px">Use Impact Statement</h4>
            <img src="/resume/impactStatement.svg" style="margin-left: 2vw">
            <p class="ulTitle" style="margin-top: 50px">Example:</p>
            <ul>
              <li> <i>Oversaw <strong class="semi" style="color: #1E4460">(verb in past tense)</strong> a team of 10
                volunteers in planning, preparing, and promoting a charity table quiz <strong class="semi" style="color: #1E4460">
                  (description of the work)</strong> which raised 15% <strong class="semi" style="color: #1E4460">
                  (quantified impact)</strong>of the total revenue.</i></li>
            </ul>
            <br>
            <p class="ulTitle">Sample Sentence Structures:</p>
            <ul>
              <li>Launched xxx in xxx, resulting in xxx.</li>
              <li>Developed xxx in xxx, helped/raised/changed xxx.</li>
              <li>Analyzed xxx and created xxx to present to xxx at weekly meetings.</li>
              <li>Launched xxx in xxx, resulting in xxx.</li>
              <li>Implemented a new xxx system that streamlined the xxx and allowed xxx to be more efficient.</li>
              <li>Coordinated with the xxx team to form a xxx group for xxx that resulted in xxx.</li>
            </ul>
          </div>


        </el-tab-pane>
      </el-tabs>
    </div>
  </div>

</template>
<style>
</style>
<script lang="ts">
import {TabsPaneContext} from "element-plus";

export default {
  name: "Resume",
  mounted() {
    window.scrollTo(0, 0);
  },
  data() {
    return {
      activeName: 'first'
    }
  },
  methods: {
    handleClick (tab: TabsPaneContext, event: Event) {
      console.log(tab, event)
    }
  }
}
</script>

<style scoped>
@import "../../assets/content.css";

@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
.downloadTemplate{
  font-style: normal;
  font-weight: 600;
  font-size: 16px;
  width: 270px;
  height: 40px;
  border-radius: 0.5rem;
  padding: 0.5rem 1rem;
  background-color: #1E4460;
  border: hidden;
  margin-top: 100px;
  color: white;
  box-shadow: 0 4px 4px rgb(30 68 96 / 0.25);
}
.downloadTemplate:hover{
  background-color: #F4CE71;
  color: darkblue;
  border: hidden;
}
a{
  color: #1E4460;
  text-decoration: none;
}
.buttondiv{
  text-align: right;
  margin-bottom: 82px;
  margin-top: 100px;
}

#polishVerbs{
  display: flex;
  text-align: center;
  margin: auto;
  width: 68vw;
}
#polishVerbs dl{
  border: 1px solid #e0ac79;
  margin-right: 10px;
  width: 100px;
  text-align: left;
}
#polishVerbs dt{
  text-align: center;
  font-size: 13px;
  border-bottom: 1px solid black;
  background-color: #F4CE71;
}
#polishVerbs dd{
  padding-left: 2px;
  font-size: 12px;
}

.wrapper {
  display: grid;
  grid-template-columns: auto 66px 44ch;
  gap: 0;
  height: fit-content;
  width: fit-content;
  margin: auto;
  margin-bottom: 50px;
  text-align: left;
}
.wrapper * {
  margin-top: -2px
}

.w-mid {
  margin-left: 15px;
  max-width: 45px;
  margin-top: 2px
}

.wrapper p {
  padding-left: 5px;
  line-height: 141%;
  margin-top: 2px
}

.comp {
  filter: drop-shadow(0px 4px 4px rgba(0, 0, 0, 0.25));
}

/* 多数电脑 ( 11 in. ≤ size ≤ 13 in. ) */
@media (min-width: 1280px) and (max-width: 1439px) {
  .wrapper {
    grid-template-columns: 50% 58px 36ch;
  }
  .wrapper p {
    font-size: 13px;
    word-spacing: 0.02rem;
  }
  .comp {
    max-width: 100%;
  }
  .w-mid {
    margin-left: 15px;
    max-width: 40px;

  }
}

/* 小电脑及大Pad */
@media (min-width: 992px) and (max-width: 1279px) {
  .wrapper {
    grid-template-columns: 50% 46px 32ch;
  }
  .wrapper p {
    overflow-x: scroll;
    padding-top: 4px;
    font-size: 10px;
    word-spacing: 0.001rem;
  }
  .comp {
    max-width: 100%;
  }
  .w-mid {
    max-width: 30px;
    margin-left: 12px;
  }
}

.resumeTemplate{
  grid-row: 2;
}
.sampleResumeTitle{
  font-size: 16px;
  font-weight: 550;
  font-style: normal;
  border-radius: 1rem;
  border: 1px solid black;
  margin: auto;
  margin-bottom: 10px;
  width: 185px;
  background-color: #1E4460;
  color: #F4CE71;
}
.strongActionVerbs{

  display: inline-block;
  font-size: 14px;
  font-weight: 350;
  font-style: normal;
  border-radius: 1rem;
  border: 1px solid black;

  margin-right: 10px;
  padding: 12px;
  width: 185px;
  background-color: #1E4460;
  color: #FFFFFF;
  white-space: nowrap;
}
.strongActionVerbsDiv{
  white-space: nowrap;
  margin-top: 20px;
  margin-bottom: 20px;
}
.card {
  position: relative;
  display: inline-block;

}
.card .img-top {
  display: none;
  position: absolute;
  top: 0;
  left: 0;
  z-index: 2;
}
.card:hover .img-top {
  display: inline;
}
.img-bot {
  box-shadow: 0 4px 4px rgb(0 0 0 / 0.25);
}

#sample-resumes{
  display: grid;
  grid-auto-rows: auto auto;
  grid-template-columns: repeat(4, 1fr);
}
.link {
  display: inline;
  text-decoration: none;
  color: #1E4460;
  font-weight: 500;
}
.link:hover {
  font-weight: 600;
}

a{
  color: #1E4460;
  text-decoration: none;
}

ul{
  text-align: left;
  margin-right: 6vw;
  margin-left: 6vw;
  font-size: 16px;
  font-weight: 400;
  font-style: normal;
  line-height: 141%;    /* list里的行间宽度为141%，其他为default */
}
.ulTitle{
  font-size: 16px;
  font-weight: 600;
  font-style: normal;
  text-align: left;
  margin-left: 4vw;
  margin-bottom: 0;
}

.semi {
  font-weight: 600;
}
</style>