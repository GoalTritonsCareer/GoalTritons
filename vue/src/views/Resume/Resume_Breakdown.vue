<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/resume')" style="text-decoration: underline; cursor: pointer">Resume/CV & Cover Letter</span></h3>
        <h1>Resume Breakdown</h1>
      </section>
      <img src="/interview/InterviewQuestionTypes.svg" alt="resume breakdown background" style="width: 100%" >
    </div>

    <div id="body">
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
            <a href="/resume/resumetemplate.docx" download=""><button class="downloadTemplate">Download Template</button></a>
          </section>

        </el-tab-pane>

        <el-tab-pane label="Essentials" name="second" >
        </el-tab-pane>

        <el-tab-pane label="Samples" name="third">
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
  width: 220px;
  height: 40px;
  border-radius: 0.5rem;
  padding: 0.5rem 1rem;
  background-color: #1E4460;
  border: hidden;
  margin-top: 50px;
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
}
#sample-resumes a{
  margin-right: 50px;
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
</style>