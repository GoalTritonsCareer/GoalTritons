<template>
  <div id="NetworkingTop">
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/interview')" style="text-decoration: underline; cursor: pointer">Interview</span></h3>
        <h1>InterviewQuestions</h1>
      </section>
      <img src="/interview/InterviewQuestionTypes.svg" alt="networking background" style="width: 100%" >
      <a id="why-networking"></a>
    </div>

    <div id="body">
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="Define Yourself" name="first">
          <div>
            <p style="margin-bottom: 50px; text-align: left; margin-left: 5rem">“Define Yourself” type of questions helps the company to evaluate whether you are a <strong>good fit</strong> through learning about <strong>YOU</strong>.</p>

            <img src="/interview/sampleQ1.svg">

            <h3 style="margin-top: 3rem; margin-left: 0.5vw; margin-bottom: 2vh; font-size: 26px">Tips:</h3>
            <div>
              <div>
                <div style="text-align: left; margin-left: 2vw;">
                  <p class="DYp" >Point 1</p>
                  <span class="DYspan"><strong>Research about the company/position</strong></span>
                </div>

                <div class="DYdiv">
                  <div>
                    <img class="DYimg" src="/interview/researchEmoji.png">
                  </div>

                  <div >
                    <p class="DYulTitle">What to research?</p>
                    <ul class="DYul">
                      <li>The company’s missions, recent challenges, products, customers, and your intended position’s responsibilities, etc.</li>
                    </ul>

                    <br>

                    <p class="DYulTitle">How to research?</p>
                    <ul class="DYul">
                      <li>Navigate through the company’s website, LinkedIn page, other social media page, news, employers, etc.</li>
                    </ul>
                  </div>

                </div>
              </div>

              <div class="DYtips">
                <div style="text-align: left; margin-left: 2vw">
                  <p class="DYp">Point 2</p>
                  <span class="DYspan"><strong>Practice on pitching yourself</strong></span>
                </div>

                <div  class="DYdiv"  style="align-items: center">
                  <div>
                    <img class="DYimg" src="/interview/speechEmoji.svg" style="vertical-align: middle">
                  </div>

                  <div>
                    <p class="DYulTitle">What to pitch?</p>
                    <ul class="DYul">
                      <li>Your background/accomplishments/interests/passion
                         <i>(refer to your Resume)</i></li>
                    </ul>
                    <br>
                    <p class="DYulTitle">How to pitch? </p>
                    <ul class="DYul">
                      <li>Reflect on <span style="font-weight: 500">what</span> you are excel at and <span style="font-weight: 500">why</span> you want to apply for this position in this company.</li>
                      <li>Design a <span style="font-weight: 500">cohesive
                    story</span> of you in a past-present-future structure
                        <i>(your career trajectory & your career goal?)</i></li>
                      <li>Connect your <span style="font-weight: 500">past experiences</span> with what the company is looking for in the position.</li>
                    </ul>
                  </div>

                </div>

              </div>


            </div>

            <div style="text-align: right; margin-top: 82px; margin-bottom: 50px; padding: 0 5%">
                <p class ="link" style="display: inline; margin-right: 0.5rem;">See More Resources</p>
                <img src="/interview/arrow.svg" @click="$router.push('/interview#more-resources')" style="vertical-align: middle; width: 22px">
            </div>

          </div>
        </el-tab-pane>
        <el-tab-pane label="Behavioral" name="second" >
          <div>
            <p id="BQp" style="text-align: left; margin-left: 5rem; margin-bottom: 50px;">Behavioral questions help the company to learn about how you would <strong>behave</strong> and <strong>deal with tough situations</strong> in
              the real workplace so that they can anticipate your performance. These are usually about <strong>soft skills</strong>
              (<em>e.g. leadership</em>) and <strong>personal attributes</strong> (<em>e.g. persistency</em>).</p>

            <img src="/interview/behaviorQuetion.svg" style="margin-top:3vw; margin-bottom: 50px; width: 50vw">

            <div style="text-align: right; margin-top: 82px; margin-bottom: 50px; padding: 0 5%">
              <p class ="link" style="display: inline; margin-right: 0.5rem;">See More Resources</p>
              <img src="/interview/arrow.svg" @click="$router.push('/interview#more-resources')" style="vertical-align: middle; width: 22px">
            </div>
          </div>
        </el-tab-pane>

        <el-tab-pane label="Technical" name="third">
          <div >
            <p id="TQp" style="text-align: left; margin-left: 5rem; margin-bottom: 50px;">This part can vary a lot by different professions. Technical questions are usually <strong>specific to the topics
              in your fields</strong>. They help the company to evaluate your ability, skillset, professional level, and your
              potential to contribute to this specific position. </p>
            <img  src="/interview/sampleQ2.svg">
            <div>
              <h3 id="TQtipsTitle" style="margin-top: 3rem; margin-left: 0.5vw; margin-bottom: 2vh; font-size: 26px">Tips:</h3>
              <div id="TQtips" style="text-align: left; margin-left: 2vw">
                <p class="DYp">Point 1</p>

                <span>Search online or read some interview guides for your <span style="font-weight: 500">specific professions</span></span>

                <ul style="margin-left: 8vw;"><li><em>E.g. For software engineers, enter “software engineers interview cheat sheet”</em>.</li></ul>

                <br>
                <p class="DYp">Point 2</p>
                <span>Search for interview tips <span style="font-weight: 500">specific to the company</span> you have applied.</span>
              </div>
            </div>

            <div style="text-align: right; margin-top: 82px; margin-bottom: 50px; padding: 0 5%">
              <p class ="link" style="display: inline; margin-right: 0.5rem;">See More Resources</p>
              <img src="/interview/arrow.svg" @click="$router.push('/interview#more-resources')" style="vertical-align: middle; width: 22px">
            </div>

          </div>
        </el-tab-pane>
      </el-tabs>
    </div>
  </div>
</template>

<script lang="ts">
import type { TabsPaneContext } from 'element-plus'


export default {
  name: "OnlinePlatforms",
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
p.online{
  background-color: #D9EAEF;
  border-radius: 2rem;
  padding: 20px;
  width: fit-content;
  margin: 2rem auto;
  /*margin-top: 4rem;*/
  /*margin-bottom: 2rem;*/
  color: #1e4460;
  font-size: 15px;
  line-height: 141%;
}
#whyOnlinePlatformsImg {
  margin-top: 9.5vh;
  width: 90%;
}

.onlinePlatformDiv{
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  align-items: center;
  text-align: center;
  width: 95%;
  margin: 2% auto;

  /*margin-left: 12vw;*/
}
.onlinePlatformImg{
  max-height: 86px;
  max-width: 86px;
  width: 6vw;
  height: 6vw;
  background-color: #D9EAEF;
  margin-right: 4vw;
  border-radius: 10px;
}
.box {
  text-align: center;
  background-color: #D9EAEF;
  border-radius: 10px;
  border: none;
  height: 6vw;
  width: 6vw;
  max-height: 86px;
  max-width: 86px;
  transition: all 0.3s cubic-bezier(.25,.8,.25,1);
  box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
}
.box:hover {
  border-top-left-radius: 10px;
  border-bottom-left-radius: 10px;
  animation-name: example;
  animation-duration: 0.25s;
  border-left: 8px solid #5F99B6;
  box-shadow: 0 14px 28px rgba(0,0,0,0.25), 0 10px 10px rgba(0,0,0,0.22);
}
.onlinePlatformDescription{
  display: inline-block;
  border-radius: 2rem;
  border: 2px dashed #5F99B6;
  text-align: left;
  width: 66%;
  padding: 1rem;
  line-height: 141%;
}
.profileFooter {
  margin: 50px auto;
  padding: 10px 20px;
  text-align: left;
  width: 70%;
  max-width: 800px;
  background: rgba(244, 206, 113, 0.21);
  border: 3px dashed #F4CE71;
  color: #1e4460;
  border-radius: 20px;
  font-size: 15px;
}
.profileHeader {
  background-color: #D9EAEF;
  border-radius: 20px;
  font-size: 15px;
  font-weight: 600;
  text-align: center;
  height: 28px;
  padding-top: 2px;
}

#s2t2img {
  width: 60%;
  margin: 0 20% 20px 20%;
}

.DYp{
  display: inline;
  border-radius: 30px;
  background-color: #F6BE00;
  color: black;
  margin-right: 10px;
  padding: 3px 10px;
  font-weight: 600;
}

.DYdiv{
  margin-top: 3vw;
  margin-left: 6vw;
  margin-bottom: 4vw;
  width: 38vw;
  display: flex;
}

.DYulTitle{
  text-align: left;
  margin-left: 1vw;
}

.DYul{
  margin-left: 2.5vw;
}

.s2Tips ul{
  margin-left: 7em;
  margin-bottom: 20px;
}
.column img {
  margin-top: 8px;
  vertical-align: middle;
}
.HTNWFsubdiv p{
  display: inline-block;
  margin-left: 0.5rem;
}
.DYimg{
  width: 10vw;
  margin-right: 4rem;
  margin-left: 7rem;
}

</style>