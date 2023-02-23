<template>
  <div id="NetworkingTop">
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>On Campus</h1>
      </section>
      <img src="/networking/ocBG.svg" alt="networking background" style="width: 100%" >
      <a id="why-networking"></a>
    </div>

    <div id="body">
      <img id="whyOnlinePlatformsImg" src="/networking/whyOnCampus.svg" alt="Why On Campus?">

      <h2 style="margin-bottom: 0px">Where to Network on Campus?</h2>
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="Student Orgs" name="first">
          <section class="onlinePlatformDiv">
            <img src="/networking/newStudentOrg.svg">

            <div class="onlinePlatformDescription">
              <p>UCSD hosts a handful of student orgs where you can not meet peers who share your interests, but also
                further your career path by joining career-related organizations.</p>
              <br>
              <p>To join the orgs you are interested in, you can: </p>
              <ul>
                <li>Walk by the Library Walk’s Info tables at the start of the quarter.</li>
                <li>Pay close attention to posters/pamplets around the campus.</li>
              </ul>
            </div>


          </section>

          <div style="text-align: right; margin-top: 15px; margin-bottom: 20px">
            <a href="https://studentorg.ucsd.edu/" target="_blank" style="text-decoration: none; color: #1E4460">
              <p class ="link" style="display: inline; ">See Full List of Student Orgs</p>
              &nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow">
            </a>
            <a id="mentorshipPrograms"></a>
          </div>

        </el-tab-pane>

        <el-tab-pane label="Mentorships" name="second" >
          <section class="onlinePlatformDiv">
            <img src="/networking/newMentorship.svg">

            <div class="onlinePlatformDescription">
              <p>Having a mentor is essential for your career development because they can help you clarify concerns
                you may have that they have already dealt with.</p>
              <br>
              <p>You can find your mentor here:</p>
              <ul>
                <li><a class="intextLink" href="https://app.mentorcollective.org/participant_dashboard/" target="_blank">
                  Mentor Collective</a>: a professional mentorship organization that partners with UCSD.</li>
                <li><a class="intextLink" href="https://ispo.ucsd.edu/programs-workshops/programs-events/intl-peer-coaching.html" target="_blank">
                  International Peer Coaching Program</a>: a 1-1 mentorship program that pairs international students
                  with international peer coaches.</li>
                <li><a class="intextLink" href="https://ugresearch.ucsd.edu/research-programs/fmp/index.html" target="_blank">
                  Faculty Mentor Program <i>(FMP)</i></a>: a program that assists students in developing relationships with
                  faculty mentors.</li>
                <li>Ask your course professors to be your mentor.</li>
              </ul>
            </div>
          </section>

          <div style="text-align: right; margin-top: 15px; margin-bottom: 20px">
            <a href="https://vcsa.ucsd.edu/_files/Mentorship-Programs-Guide-20211014.pdf" target="_blank" style="text-decoration: none; color: #1E4460">
              <p class ="link" style="display: inline">See All Mentorship Programs at UCSD</p>
              &nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow">
            </a>
            <a id="mentorshipPrograms"></a>
          </div>

        </el-tab-pane>

        <el-tab-pane label="Career Fairs/Events" name="third">
          <section class="onlinePlatformDiv">
            <img src="/networking/newCareerFair.svg">

            <div class="onlinePlatformDescription">
              <p>Interacting with industry professionals and upperclassmen in the same field allows students to broaden
                their career expertise and industry knowledge and increase their chances of being hired by their desired
                company.</p>
              <br>
              <p>To attend events in your field, you can: </p>
              <ul>
                <li>View Events at <a class="intextLink" href="https://ucsd.joinhandshake.com/stu" target="_blank">
                  Handshake</a></li>
                <li>Walk by the info tables on Library Walk</li>
                <li>
                  <span class="medium">*View our <el-popover
                      placement="bottom"
                      offset="50"
                      trigger="hover"
                      width="432px"
                  >
                    <template #reference>
                      <span style="color: #b27224">mini calendar</span>
                    </template>
                    <template #default>
                      <span style="font-weight: 600; color: #b27224">UCSD Career and Networking Fairs</span>
                      <Calendar />
                    </template>
                  </el-popover>
                  on the header for the most up-to-date information about UCSD career events!</span>
                  <a id="labs"></a>
                </li>
              </ul>
            </div>
          </section>

          <div style="text-align: right; margin-top: 15px; margin-bottom: 20px">
            <a href="https://studentorg.ucsd.edu/" target="_blank" style="text-decoration: none; color: #1E4460">
              <p class ="link" style="display: inline; ">See Full List of Career Fairs/Events</p>
              &nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow">
            </a>
            <a id="mentorshipPrograms"></a>
          </div>

        </el-tab-pane>
        <el-tab-pane label="Labs" name="fourth">
          <section class="onlinePlatformDiv">
            <img src="/networking/newLab.svg">

            <div class="onlinePlatformDescription">
              <p>Labs allow in-depth exploration of your professional fields by interacting with professors, Ph.D.
                students, and peers in the same field.</p>
              <br>
              <p>To join your interested labs, you can:</p>
              <ul>
                <li>Search for and join your interested research labs using the
                  <a class="intextLink" href="https://real.ucsd.edu/" target="_blank">REAL Portal</a>.</li>
                <li>View labs exclusive to your department, such as:
                  <ul>
                    <li><a class="intextLink" href="https://cogsci.ucsd.edu/research/research-labs.html" target="_blank">Cog Sci Research Labs</a></li>
                    <li><a class="intextLink" href="https://designlab.ucsd.edu/" target="_blank">The Design Lab UCSD</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </section>

          <div style="text-align: right; margin-top: 15px; margin-bottom: 20px">
            <a href="https://studentorg.ucsd.edu/" target="_blank" style="text-decoration: none; color: #1E4460">
              <p class ="link" style="display: inline; ">See Full List of Labs</p>
              &nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow">
            </a>
            <a id="mentorshipPrograms"></a>
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
  background-color: #D9EAEF;
  color: black;
  margin-right: 10px;
  padding: 3px 10px;
  font-weight: 600;
}
.s2Tips{
  text-align: left;
  padding: 0 2%;
}
.s2Tips ul{
  margin-left: 7em;
  margin-bottom: 20px;
}
#highlight{
  background-color: #F4CE71;
  border-radius: 2rem;
  width: 95px;
  padding: 10px;
  font-weight: 600;
  margin-bottom: 2vh;
}
.otherMediaIcon{
  height: 100%;
  text-align: center;
  margin: auto;
  margin-left: 0;
  margin-right: 0;
}
.otherMediaTitle{
  width: 6vw;
  color: #1E4460;
  font-weight: 640;
}
.column img {
  margin-top: 8px;
  vertical-align: middle;
}

.HTNWFsubdiv p{
  display: inline-block;
  margin-left: 0.5rem;
}

.middleP{
  font-size: 15px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  width: 78%;
  max-width: 773px;
  margin: 30px auto;
}
.moreResLink {
  color: #B27224;
  font-weight: 500;
}
.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
}

.step {
  border-radius: 45px;
  font-size: 15px;
  font-weight: 600;
  text-align: center;
  margin-right: 10px;
  margin-top: 2px;
  padding: 3px 10px 5px 10px;
}
.stepTitle {
  padding-top: 5px;
  font-weight: 600;
  font-size: 15px;
}

.step1Color {
  background-color: #F8EFDA;
}

.step2Color {
  background-color: #FEECC0;
}
.step2Img {
  width: 68%;
}
.stepTitle {
  padding-top: 5px;
  font-weight: 600;
  font-size: 15px;
}

.step1Color {
  background-color: #F8EFDA;
}
.step2Color {
  background-color: #FEECC0;
}
.intextLink {
  color: #0467B0;
  text-decoration: none;
  font-weight: 500;
}
.intextLink:hover {
  text-decoration: underline;
  font-weight: 600;
}
</style>