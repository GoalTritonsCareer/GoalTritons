<template xmlns="http://www.w3.org/1999/html">
  <div id="resumeTop">

    <a id="resume-vs-cv"></a>

    <div>
      <h2>RESUME BREAKDOWN</h2>

    </div>
    <div class="wrapper">
      <div class="one1">
        <img src="/resume/resumeCompHeader.png" width="493px" alt="header">
      </div>
      <div class="one2">
        <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
      </div>
      <div class="one3">
        <p><span class="semi">Header:</span> <br>
          Contact Information <i>(e.g. email, phone ##, LinkedIn)</i></p>
      </div>

      <div class="two1">
        <img src="/resume/resumeCompSummary.png" width="493px" alt="summary">
      </div>
      <div class="two2">
        <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
      </div>
      <div class="two3">
        <p><span class="semi">Summary</span><br>
          Summarize your greatest achievement/character traits.</p>
      </div>

      <div class="three1">
        <img src="/resume/resumeCompSkill.png" width="493px" alt="skill"> <br>
        <img src="/resume/resumeCompExperience.png" width="493px" alt="experience">
      </div>
      <div class="three2">
        <img src="/needle.svg" width="66px" height="20px" alt="------>"
             style="margin-left: 17px; margin-right: 16px; margin-top: 2px"> <br><br><br>
        <img src="/needle.svg" width="66px" height="20px" alt="------>"
             style="margin-left: 17px; margin-right: 16px; margin-top: 108px">
      </div>
      <div class="three3">
        <span class="semi">Skills</span>
        <p style="line-height: 141%">
          Include any <strong class="medium">position-related</strong> soft/hard skills/languages/certifications that
          can add to your competencies. <i>(e.g. front-end developer—“CSS, C++, Javascript, Problem Solving”.) </i><br>
          <i>See more examples under </i><i class="moreResLink" @click="$router.push('/resume#more-resources')">More Resources</i>.
        </p>
        <br><br><br>
        <span class="semi">Experience</span>
        <p style="line-height: 141%">
          Include any professional experience that can <strong class="medium">prove your qualifications</strong> for
          the position you are applying for. Start with the <strong class="medium">most relevant</strong> one. If
          you want to include projects, you can start another section by following the same template.
        </p>
      </div>

      <div class="four1">
        <img src="/resume/resumeCompEducation.png" width="493px" alt="education">
      </div>
      <div class="four2">
        <img src="/needle.svg" width="66px" height="20px" alt="------>"
             style="margin-left: 17px; margin-right: 16px; margin-top: 2px"> <br>
        <img src="/needle.svg" width="66px" height="20px" alt="------>"
             style="margin-left: 17px; margin-right: 16px; margin-top: 70px">
      </div>
      <div class="four3">
        <p><span class="semi">Education</span><br>
          Include school name/majors & minors/expected graduation date/awards or honors; include
          <strong class="medium"> GPA only if ≥ 3.5</strong>. </p>
        <p>
          <br> <span class="semi">Activities <i>(Optional)</i>:</span> only
          add if relevant to the position.
        </p>
      </div>
    </div>
    <div class="buttondiv">
      <a id="resume-essentials"></a>
      <a href="/resume/resumetemplate.docx" download=""><button class="downloadTemplate">Download Template</button></a>
    </div>

  </div>
</template>
<style>
</style>
<script>
export default {
  name: "Resume"
}
</script>

<style scoped>
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
.semi {
  font-weight: 600;
}
.medium {
  font-weight: 500;
}
/*.scrollbar-demo-item {*/
/*  display: flex;*/
/*  align-items: center;*/
/*  justify-content: center;*/
/*  height: 50px;*/
/*  margin: 10px;*/
/*  text-align: center;*/
/*  border-radius: 4px;*/
/*  background: var(--el-color-primary-light-9);*/
/*  color: var(--el-color-primary);*/
/*}*/
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
.link {
  display: inline;
  text-decoration: none;
  color: #1E4460;
  font-weight: 500;
}
.link:hover {
  text-decoration: underline;
  font-weight: 600;
}
.moreRes{
  background-image: linear-gradient(
      to right,
      #0467B0,
      #0467B0
  );
  background-size: 200% 100%;
  background-position: -100%;
  display: inline-block;
  padding: 2px 0;
  position: relative;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  transition: all 0.3s ease-in-out;
  font-weight: 500;
}
.moreRes::before {
  content: '';
  background: #0467B0;
  display: block;
  position: absolute;
  bottom: -3px;
  left: 0;
  width: 0;
  height: 2px;
  transition: all 0.3s ease-in-out;
}
.moreRes:hover {
  background-position: 0;
  font-weight: 600;
}
.moreRes:hover::before {
  width: 100%;
}
.moreResLink {
  color: #B27224;
  font-weight: 500;
}
.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
}
div{
  text-align: center;
}
h1,h2,h3{
  text-align: left;
}
.buttondiv{
  text-align: right;
  margin-bottom: 82px;
}
.resumecomp{
  display: flex;
  text-align: left;
  margin-bottom: 7px;
}
h1{
  margin-bottom: 100px;
  color: #1E4460;
  font-weight: 700;
  font-size: 28px;
  font-family: work-sans;
}
h2{
  font-family: work-sans;
  font-style: normal;
  font-size: 20px;
  font-weight: 700;
  color: #182B49;
  margin-bottom: 82px;
  margin-top: 95px;
  border-top: 1px solid black;
  border-bottom: 1px solid black;
  padding-top: 15px;
  padding-bottom: 15px;
}
h3{
  margin-bottom: 50px;
  font-weight: 700;
  font-size: 16px;
  font-style: normal;
}
#sample-resumes a{
  margin-right: 50px;
}
#opening{
  font-size: 16px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  margin-right: 11vw;
  margin-left: 11vw;
}
.inlinePara{
  margin-bottom: 20px;
  margin-top: 50px;
  padding-left: 3.6vw;
}
ul{
  text-align: left;
  margin-right: 12vw;
  margin-left: 12vw;
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
  margin-left: 10vw;
  margin-bottom: 0;
}
.moreResTitle{
  font-size: 16px;
  font-weight: 500;
  font-style: normal;
  text-align: left;
  margin-left: 10vw;
  margin-bottom: 0;
}
.headerWithLink{
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
}
.card {
  position: relative;
  display: inline-block;
  margin: 50px;
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
.resumeTemplate{
  grid-row: 2;
}
.components {
  line-height: 141%;
}
#resumeComponentHeader{
  grid-column-start: 1;
  grid-column-end: span 4;
  margin-top: 82px;
}
.sampleResumeTitle{
  font-size: 16px;
  font-weight: 550;
  font-style: normal;
  border-radius: 1rem;
  border: 1px solid black;
  margin: auto;
  width: 185px;
  background-color: #1E4460;
  color: #F4CE71;
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
  grid-template-columns: repeat(3, 1fr);
  gap: 0;
  height: fit-content;
  width: min-content;
}
.one1 {
  grid-column: 1;
  grid-row: 1;
}
.one2 {
  grid-column: 2;
  grid-row: 1;
  width: 100px;
}
.one3 {
  grid-column: 3;
  grid-row: 1;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}
.two1 {
  grid-column: 1;
  grid-row: 2;
}
.two2 {
  grid-column: 2;
  grid-row: 2;
  width: 100px;
}
.two3 {
  grid-column: 3;
  grid-row: 2;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}
.three1 {
  grid-column: 1;
  grid-row: 3;
}
.three2 {
  grid-column: 2;
  grid-row: 3;
  width: 100px;
}
.three3 {
  grid-column: 3;
  grid-row: 3;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}
.four1 {
  grid-column: 1;
  grid-row: 4;
}
.four2 {
  grid-column: 2;
  grid-row: 4;
  width: 100px;
}
.four3 {
  grid-column: 3;
  grid-row: 4;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}

</style>