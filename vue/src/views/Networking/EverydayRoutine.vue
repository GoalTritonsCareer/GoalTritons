<template>
  <div id="NetworkingTop">

    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>Everyday Routine</h1>
      </section>
      <img src="/networking/erBG.avif" alt="networking background" style="width: 100%" >
    </div>

    <div id="body">
      <h2 style="margin-bottom: 0">Who can you network with everyday?</h2>
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="Faculty" name="first">
          <section style="margin-top: 15px">
            <img src="/networking/whyNetworkWithFaculty.svg" alt="Why Networking with the Faculty" id="why_faculty_img">
          </section>

          <section>
            <h2>How to Network with the Faculty?</h2>
            <div style="margin-left: 6%; text-align: left">
              <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0 20px 0">
                <p class="step step1Color">Step 1</p>
                <p class="stepTitle">Research & learn about your interested professors</p>
              </div>

              <p style="margin-left: 10%; font-weight: 600; margin-bottom: 1.5rem">Methods:</p>
              <div style="display: flex; flex-direction: row">
                <div style="display: flex;flex-direction: column;align-items: flex-start;margin-left: 10%; width: 34%;">
                  <div style="margin-bottom: 2rem">
                    <div class="point_layout">
                      <span class="circle">1</span>
                      <p>Direct search on your <span class="medium">department’s website</span></p>
                    </div>

                    <ul style="padding-left: 2rem; font-style: italic"><li>e.g. department >> Faculty >> interested professors </li></ul>
                  </div>
                  <div style="text-align: left">
                    <div class="point_layout">
                      <span class="circle">2</span>
                      <p>Deep exploration through:</p>
                    </div>
                    <ul style="padding-left: 2rem">
                      <li><a class="intextLink" href="https://hwsph.ucsd.edu/people/faculty/faculty-directory.html#A-D" target="_blank">
                        UCSD’s faculty profile</a></li>
                      <li>professors’ personal website</li>
                    </ul>
                  </div>
                </div>
                <img src="/networking/HTNWTFs11.jpg" alt="Where to find the faculty profile for different department" id="cogSci_faculty_profile" loading="lazy">
              </div>
            </div>

            <div style="text-align: left; margin-left: 6%">
              <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0 20px 0">
                <p class="step step2Color">Step 2</p>
                <p class="stepTitle">Connect with them</p>
              </div>

              <p style="margin-left: 10%; font-weight: 600; margin-bottom: 1.5rem">Methods:</p>
              <div style="padding-right: 50px; display: grid; grid-template-columns: 35% 35%; margin-left: 10%; justify-content: space-between">
                <div style="margin-bottom: 2rem">
                  <div class="point_layout">
                    <span class="circle">1</span>
                    <p>Bring specific qestions to <span class="medium">office hour</span> or
                      afterclass</p>
                  </div>
                </div>

                <div>
                  <div class="point_layout">
                    <span class="circle">2</span>
                    <p>Send an email to introduce yourself & ask for
                      <a class="intextLink" href="https://career.berkeley.edu/Info/InfoInterview" target="_blank">
                        info. interview</a></p>
                  </div>
                </div>
              </div>
            </div>

            <img src="/networking/sampleQs.svg" alt="Sample Questions" loading="lazy" style="width: 75%; margin-bottom: 2rem">

            <div style="position: relative; display: inline-block">
              <div id="relationship_tip">
                <p style="padding: 10px 0 0 10px; color: #1E4460; text-align: left">To form a <span class="medium">deeper relationship</span>,</p>
                <ul style="margin-left: 4vw; margin-right: 0;padding-bottom: 10px; color: #1E4460">
                  <li>ask for feedback for the professors to reflect on you. </li>
                  <li>send a thank-you note after each meeting to provide your gratitude.</li>
                </ul>
              </div>
              <img id="light_bulb" src="/light-bulb.svg" alt="light-bulb" loading="lazy">
            </div>
          </section>

        </el-tab-pane>

        <el-tab-pane label="Peers/Alumni" name="second" >
          <section>
            <p class="middleP">Networking with peers might seem absurd to some. However, amongst all people, your peers are
              the <span class="semi">most accessible contacts</span>that can potentially become your academic & career
              buddies to <span class="semi">accompany your career development</span>.
            </p>
            <img src="/networking/peers.svg" alt="networking with peer tip" style="width: 60%; margin-bottom: 4rem">
            <img src="/networking/peersCan.svg" alt="what peers can do" loading="lazy" style="width: 80%; margin: auto">
          </section>
        </el-tab-pane>

      </el-tabs>
    </div>


<!--    <div>-->

<!--      <h2>How to Maintain Networks?</h2>-->
<!--      <img src="/networking/HTMN-graph.svg" alt="maintainNetworks" style="margin-top: 20px; margin-bottom: 60px">-->
<!--      <br>-->
<!--      <img src="/networking/HTMN-example.svg">-->
<!--    </div>-->

  </div>
</template>

<script lang="ts">
import {TabsPaneContext} from "element-plus";

export default {
  name: "EverydayRoutine",
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
.circle {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 20px;
  height: 20px;
  border-radius: 50%;
  background-color: rgba(226, 152, 58, 0.27);
  color: #b27224;
}
#cogSci_faculty_profile {
  width: 42%;
  aspect-ratio: 426/315;
  vertical-align: middle;
  transform: translate(30px, -50px);
  filter: drop-shadow(0px 4px 4px rgba(0, 0, 0, 0.25));
}
.s2Tips p{
  margin-left: 12vw;
}

.s2Tips ul{
  margin-left: 15vw;
  margin-bottom: 20px;
}

.s2Tips img{
  margin-left: 20vw;
  margin-bottom: 30px;
}

.column img {
  margin-top: 8px;
  vertical-align: middle;
}

.step {
  border-radius: 45px;
  font-size: 15px;
  font-weight: 600;
  text-align: center;
  margin-right: 5px;
  width: max-content;
  padding: 8px 15px;
}
.stepTitle {
  padding-top: 8px;
  font-weight: 600;
  font-size: 15px;
}
.step1Color {
  background-color: #F8EFDA;
}
.step2Color {
  background-color: #FEECC0;
}
.middleP{
  font-size: 15px;
  text-align: left;
  width: 75%;
  margin: 1rem auto;
}
.point_layout {
  display: grid;
  grid-template-columns: 10% 90%;
  text-align: left
}
#relationship_tip {
  background-color: rgba(244,206,113,0.21);
  border-radius: 1rem;
  border: 3px dashed #F4CE71;
  width: 550px;
  font-size: 16px;
  margin: auto;
}
#light_bulb {
  position: absolute;
  top: -28px;
  left: 520px;
  z-index: 2;
  display: inline
}
#why_faculty_img {
  width: 80%;
}
@media (max-width: 1279px) {
  #body {
    padding: 0 4%;
  }
  #relationship_tip {
    width: 435px
  }
  #light_bulb {
    left: 400px;
  }
  .point_layout {
    grid-template-columns: 15% 85%;
  }
  #cogSci_faculty_profile {
    height: auto;
    width: auto;
    max-width: 284px;
    max-height: 210px;
    transform: translate(30px, -10px);
  }
}
</style>