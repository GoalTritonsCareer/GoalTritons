<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/resume')" style="text-decoration: underline; cursor: pointer">Resume/CV/Cover Letter</span></h3>
        <h1>CV</h1>
      </section>
      <img src="/resume/CVBG.svg" alt="resume breakdown background" style="width: 100%" >
    </div>

    <div id="body">
      <h2 style="margin-top: 80px;">CV BREAKDOWN</h2>
      <div>
        <div class="headerWithLink">



        </div>
        <h3 class="resumecomp" style="margin-bottom: 20px">Appendix 1: Example Undergraduate <br>Curriculum Vitae</h3>

        <div class="resumecomp">
          <img src="/resume/cvHeader.png" width="483px" alt="cvHeader">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <b class="semi">Header</b>
            <p class="components">Besides your contact information, you can include your
              website or profile if you have one.</p>
          </div>
        </div>

        <div class="resumecomp" >
          <img src="/resume/cvEducation.png" width="483px" alt="cvEducation">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Education</span>
            <p class="components">Besides any general information, you can include the title
              and the names of your thesis advisers if you are writing a department thesis. </p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvResearchInterests.png" width="483px" alt="cvResearchInterests">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Research Interest</span><br>
            <p class="components">Briefly elaborate on your research interest/goal.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvResearchAppointments.png" width="483px" alt="cvResearchAppointments">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Research Appointments</span>
            <p class="components">Include the time, the position you held, the name of the lab/department/
              institution/director, and the location.</p>
          </div>
        </div>

        <div class="resumecomp">
          <img src="/resume/cvScholarships.png" width="483px" alt="cvScholarships">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Grants/Awards/Academic Honors/Scholarships</span>
            <p class="components">Include the award name, award-granting institution, and year of the award.</p>
          </div>
        </div>

        <div class="resumecomp" >
          <img src="/resume/cvPopularArticles.png" width="483px" alt="cvPopularArticles">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Popular Articles or Publications</span>
            <p class="components">Include scholarly publications such as journals, articles, and book chapters, as well
              as the status of their publication <i>(e.g. in preparation, under
                review, forthcoming)</i>.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvResearchSkills.png" width="483px" alt="cvResearchSkills">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Research Skills/Experience</span>
            <p class="components">
              Briefly describe your role, the primary methods used, and key findings.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvService.png" width="483px" alt="cvService">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Leadership/Activities/Service/Volunteer</span>
            <p class="components">
              Briefly describe your role and accomplishments. Include the organization, your position title, the location,
              and the timeline.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvImportantCoursesTaken.png" width="483px" alt="cvImportantCoursesTaken">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Courses Taken</span>
            <p class="components">
              Include relevant coursework and your GPA if ≥ 3.5.</p>
          </div>
        </div>

        <div class="resumecomp">
          <img src="/resume/cvReferences.png" width="483px" alt="cvReferences">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Reference</span>
            <p class="components">
              Include relevant references, their name, title, institution, and contact information.</p>
          </div>
        </div>

        <p class="ulTitle" style="margin-top: 50px">More Sections to Include
          <i>(if you have one & relevant to your
            respective field)</i></p>
        <br>
        <ul>
          <li><span class="medium">Presentations</span>: include the
            author<i>(s)</i> and the title of presentation, the
            conference/symposium name,
            the location and the date. </li>
          <li><span class="medium">Teaching Experience</span>: describe your role; include the name of the course and institution, the position
            you held <i>(e.g., Teaching Assistant, Instructor of Record)</i>,
            the location, and month-year range of the
            teaching engagement.</li>
          <li class="medium">Professional Memberships or Affiliations</li>
          <li class="medium">Certifications & Licensure</li>
          <li class="medium">Skills</li>
        </ul>

        <p class="ulTitle" style="margin-top: 20px; font-weight: 400"><i>See more CV formatting examples under </i>
          <i class="moreResLink" @click="$router.push('/resume#more-resources')">More Resources</i>
        </p>

        <div class="buttondiv" style="margin-top: 80px">
          <a href="/resume/cvTemplate.pdf" download=""><button class="downloadTemplate">Download CV Template</button></a>
          <a id="cover-letter"></a>
        </div>

      </div>
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

.headerWithLink{
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
}

.resumecomp{
  display: flex;
  text-align: left;
  margin-bottom: 7px;
}

#resumeComponentHeader{
  grid-column-start: 1;
  grid-column-end: span 4;
  margin-top: 82px;
}

.moreResLink {
  color: #B27224;
  font-weight: 500;
}
.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
}
</style>