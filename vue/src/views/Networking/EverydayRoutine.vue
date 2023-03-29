<template>
  <div id="NetworkingTop">

    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>Everyday Routine</h1>
      </section>
      <img src="/networking/ocBG.avif" alt="networking background" style="width: 100%" >
    </div>

    <div id="body">
      <h2 style="margin-bottom: 0">Who can you network with everyday?</h2>
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="Faculty" name="first">
          <section class="onlinePlatformDiv">
            <img src="/networking/studentOrg.svg">
          </section>

          <section>
            <h2>How to Network with the Faculty?</h2>
            <div style="text-align: left; margin-left: 50px">
              <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0px 20px 30px">
                <p class="step step1Color" style="width:65px">Step 1</p>
                <p class="stepTitle">Research & learn about your interested professors</p>
              </div>

              <p style="margin-left: 7vw; font-weight: 600; margin-bottom: 1vh">Methods:</p>
              <div class="HTNWFdiv">
                <div class="HTNWFsubdiv">
                  <img src="/networking/ptag1.svg" style="vertical-align: middle">
                  <p>Direct search on your <span class="medium">department’s website</span></p>
                  <ul style="margin-left: 7rem; padding-left: 2rem"><li>e.g. department >> Faculty >> interested professors </li></ul>
                </div>

                <div class="HTNWFsubdiv">
                  <img src="/networking/ptag2.svg" style="vertical-align: middle">
                  <p>Deep exploration through:</p>
                  <ul style="padding-left: 4rem">
                    <li><a class="intextLink" href="https://hwsph.ucsd.edu/people/faculty/faculty-directory.html#A-D" target="_blank">
                      UCSD’s faculty profile</a></li>
                    <li>professors’ personal website</li>
                  </ul>
                </div>

              </div>
              <img src="/networking/HTNWTFs11.jpg" alt="Where to find the faculty profile for different department" width="20%" style="margin-left: 14vw; margin-top: 0">
            </div>
          </section>

        </el-tab-pane>

        <el-tab-pane label="Mentorships" name="second" >
          <section class="onlinePlatformDiv">

          </section>

        </el-tab-pane>

        <el-tab-pane label="Career Fairs/Events" name="third">

        </el-tab-pane>
        <el-tab-pane label="Labs" name="fourth">

        </el-tab-pane>

      </el-tabs>
    </div>


    <div>
      <div>
        <h3>Who can you network with everyday?</h3>

        <div>

          <p id="NetworkingOnCampus">Everyday Networking</p>

          <div style="margin-bottom: 50px">
            <p id="NCspan1">Faculty</p>
            <p id="NCspan2">Peers</p>
            <a id="faculty"></a>
          </div>

        </div>

      </div>

      <div>
        <h3>Faculty</h3>
        <div>
          <img src="/networking/whyNetworkWithFaculty.svg" alt="Why Networking with the Faculty">
        </div>

        <div>

          <div style="text-align: left; margin-left: 50px">
            <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0px 20px 30px">
              <p class="step step2Color" style="width:65px">Step 2</p>
              <p class="stepTitle">Connect with them</p>
            </div>

            <p style="margin-left: 7vw; font-weight: 600; margin-bottom: 1vh">Methods:</p>
            <div class="HTNWFdiv">
              <div class="HTNWFsubdiv" style="margin-left: 6.5rem; margin-right: 11rem">
                <img src="/networking/ptag1.svg" style="vertical-align: middle">
                <p>Bring specific qestions to <span class="medium">office</span></p>
                <p style="display: block; text-align: left; margin-left: 1.8rem"><span class="medium">hour</span> or
                  afterclass</p>
              </div>

              <div class="HTNWFsubdiv">
                <img src="/networking/ptag2.svg" style="vertical-align: middle">
                <p>Send an email to introduce </p>
                <p style="display: block;text-align: left; margin-left: 4.3rem">yourself & ask for
                  <a class="intextLink" href="https://career.berkeley.edu/Info/InfoInterview" target="_blank">
                    info. interview</a></p>
              </div>

            </div>
            <img src="/networking/HTNWTFs21.svg" width="75%" style="margin-left: 9vw; margin-top: 40px">

            <img id="peers" src="/networking/HTNWTFs22.svg" width="55%"
                 style="display: block;margin-left: 15vw;margin-top:15px;margin-bottom: 50px">
          </div>

        </div>

      </div>

      <div>
        <h3>Peers</h3>
        <p class="middleP">Networking with peers might seem absurd to some. However, amongst all people, your peers are
          the <span class="semi">most accessible contacts</span>that can potentially become your academic & career
          buddies to <span class="semi">accompany your career development</span>.
        </p>

        <img src="/networking/peers.svg" alt="tip" width="50%">
      </div>

      <a id="maintainNetwork" style="display: inline"></a>
    </div>

    <div>

      <h2>How to Maintain Networks?</h2>
      <img src="/networking/HTMN-graph.svg" alt="maintainNetworks" style="margin-top: 20px; margin-bottom: 60px">
      <br>
      <img src="/networking/HTMN-example.svg">
    </div>

    <a id="networkingRouteSummary"></a>
    <div>
      <h2>Networking platforms Summary</h2>

      <div style="margin-bottom: 20px">
        <img src="/networking/NRS1.svg" alt="summary"  width="11%" style="margin-top: 20px; margin-bottom: 20px">
      </div>

      <div>
        <img src="/networking/NRS2.svg" alt="summary">
      </div>

      <a id="something"></a>
    </div>
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
#NetworkingOnCampus{
  background-color: #1E4460;;

  text-align: center;
  color: #F4CE71;;
  padding-top: 13px;
  padding-bottom: 13px;

  font-family: "Work Sans";
  font-size: 20px;
  font-weight: 700;
  font-style: normal;
  border-radius: 30px;
  border: 1px solid black;
  width: 18vw;
  margin-right: auto;
  margin-left: auto;
  margin-bottom: 5vh;
}
#NCspan1{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding-top: 3px;
  padding-bottom: 3px;
  width: 200px;
  margin-left: auto;
  margin-right: 20px;
}

#NCspan2{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding-top: 3px;
  padding-bottom: 3px;
  width: 200px;
  margin-left: 20px;
  margin-right: 20px;
}

ul{
  text-align: left;
  margin-left: 2rem;
  font-size: 15px;
  font-weight: 400;
  font-style: normal;
  line-height: 141%;    /* list里的行间宽度为141%，其他为default */
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

.HTNWFdiv{
  display: flex;
  margin-left: 2vw;
}
.HTNWFsubdiv p{
  display: inline-block;
  margin-left: 0.5rem;

}
</style>