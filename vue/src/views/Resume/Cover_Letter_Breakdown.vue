<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/resume')" style="text-decoration: underline; cursor: pointer">Resume/CV/Cover Letter</span></h3>
        <h1>COVER LETTER</h1>
      </section>
      <picture>
        <source srcset="/resume/CoverLetterBG.avif">
        <source srcset="/resume/CoverLetterBG.svg">
        <img src="/resume/CoverLetterBG.svg" alt="resume breakdown background" style="width: 100%" >
      </picture>

    </div>

    <div id="body">
      <h2 style="margin-top: 80px;">COVER LETTER BREAKDOWN</h2>
      <img src="/resume/cover_letter.svg">

      <div class="buttondiv" style="margin-top: 80px">
        <a href="/resume/cvTemplate.pdf" download=""><button class="downloadTemplate">Download Template</button></a>
        <a id="cover-letter"></a>
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