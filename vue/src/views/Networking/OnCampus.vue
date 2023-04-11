<template>
  <div>
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>ON CAMPUS</h1>
      </section>
      <picture>
        <source srcset="/networking/ocBG.avif" type="image/avif">
        <source srcset="/networking/ocBG.png" type="image/png">
        <img src="/networking/ocBG.png" alt="on campus background" style="width: 100%">
      </picture>
    </div>

    <div id="body">
      <img id="whyOnlinePlatformsImg" src="/networking/whyOnCampus.svg" alt="Why On Campus?">

      <h2 style="margin-bottom: 0">Where to Network on Campus?</h2>
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="Student Orgs" name="first">
          <section class="onlinePlatformDiv">
            <img src="/networking/studentOrg.svg" alt="student org picture" loading="lazy">

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
              <p class ="link" style="display: inline; ">See Full List of Student Orgs</p>&nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow">
            </a>
            <a id="mentorshipPrograms"></a>
          </div>
        </el-tab-pane>

        <el-tab-pane label="Mentorships" name="second">
          <section class="onlinePlatformDiv">
            <picture>
              <source srcset="/networking/mentorshipProgram.avif" type="image/avif">
              <source srcset="/networking/mentorshipProgram.png" type="image/png">
              <img src="/networking/mentorshipProgram.png" alt="mentorship program" id="mentorship_img" loading="lazy" width="300" height="200">
            </picture>

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
              <p class ="link" style="display: inline">See All Mentorship Programs at UCSD</p>&nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow">
            </a>
            <a id="careerFairs"></a>
          </div>

        </el-tab-pane>

        <el-tab-pane label="Career Fairs/Events" name="third">
          <section class="onlinePlatformDiv">
            <picture>
              <source srcset="/networking/careerFair.avif" type="image/avif">
              <source srcset="/networking/careerFair.png" type="image/png">
              <img src="/networking/careerFair.png" alt="career fair" loading="lazy" width="301" height="213">
            </picture>

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
              <p class ="link" style="display: inline; ">See Full List of Career Fairs/Events</p>&nbsp;
              <img src="/ocArrow.svg" style="vertical-align: middle; width: 22px" alt="arrow" loading="lazy">
            </a>
          </div>
        </el-tab-pane>

        <el-tab-pane label="Labs" name="fourth">
          <section class="onlinePlatformDiv">
            <picture>
              <source srcset="/networking/lab.avif" type="image/avif">
              <source srcset="/networking/lab.png" type="image/png">
              <img src="/networking/lab.png" alt="lab" loading="lazy" width="302" height="214" style="clip-path: inset(2px 2px 2px 2px)">
            </picture>

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
              <p class ="link" style="display: inline; ">See Full List of Labs</p>&nbsp;
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
import Calendar from "../Calendar.vue"

export default {
  name: "OnlinePlatforms",
  components: {
    Calendar
  },
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


.onlinePlatformDescription{
  display: inline-block;
  border-radius: 2rem;

  text-align: left;
  width: 66%;
  padding: 1rem;
  line-height: 141%;
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

.intextLink {
  color: #0467B0;
  text-decoration: none;
  font-weight: 500;
}
.intextLink:hover {
  text-decoration: underline;
  font-weight: 600;
}
@media (max-width: 1279px) {
  #body {
    padding: 0 4%;
  }
  #mentorship_img {
    width: 250px;
    height: 167px;
  }
  .onlinePlatformDescription {
    width: 76%;
    padding: 0;
    margin-left: 1rem;
  }
  .onlinePlatformDiv {
    width: 100%;
  }
}
</style>