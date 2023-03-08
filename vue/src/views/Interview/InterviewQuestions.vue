<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/interview')" style="text-decoration: underline; cursor: pointer">Interview</span></h3>
        <h1>InterviewQuestions</h1>
      </section>
      <img src="/interview/InterviewQuestionTypes.svg" alt="networking background" style="width: 100%" >
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

            <div style="text-align: right; margin-bottom: 82px; margin-top: 2rem">
              <p style="display: inline;"><i style="color: #1E4460; font-weight: 500">See “Define Yourself” Sample Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#moreResources')">More Resources</i></p>
              <a id="BehavioralQuestions"></a>
            </div>

          </div>
        </el-tab-pane>
        <el-tab-pane label="Behavioral" name="second" >
          <div>
            <p id="BQp" style="text-align: left; margin-left: 5rem; margin-bottom: 50px;">Behavioral questions help the company to learn about how you would <strong>behave</strong> and <strong>deal with tough situations</strong> in
              the real workplace so that they can anticipate your performance. These are usually about <strong>soft skills</strong>
              (<em>e.g. leadership</em>) and <strong>personal attributes</strong> (<em>e.g. persistency</em>).</p>

            <img src="/interview/behaviorQuetion.svg" style="margin-top:3vw; margin-bottom: 50px; width: 50vw">

            <div style="text-align: right; margin-bottom: 82px">
              <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">See More Behavioral Sample Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#moreResources')">More Resources</i></p>
              <a id="TechnicalQuestions"></a>
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