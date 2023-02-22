<template>
  <div>
    <h1>Networking</h1>

    <p class="normal">“New Survey Reveals 85% of All Jobs are Filled Via Networking”</p>

    <div>
      <h2>Route Two: Networking On Campus <a id="whyNetworkOnCampus"></a></h2>

      <div>
        <h3>Why networking on campus?</h3>
        <p class="middleP" style="margin-bottom: 60px">College is where you may make lifetime friends and shape your <span class="semi">
          early professional path</span>. As a UCSD student, you have access to a plethora of networking opportunities.
          Professional organizations, social sororities & fraternities, on-campus jobs, and career events and many other
          opportunities allow you to interact with not only your <span class="semi">peers</span>, but also
          <span class="semi">guest speakers, faculty advisers, and mentors</span>.</p>
      </div>

      <div>
        <h3 >Where to network on campus?</h3>

        <div>
          <p id="NetworkingOnCampus">Networking on Campus</p>

          <div style="margin-bottom: 82px">
            <p id="NCspan1">Student Organizations</p>
            <p id="NCspan2">Mentorship Programs</p>
            <p id="NCspan3">Career Fairs/Events</p>
            <p id="NCspan4">Labs</p>
            <a id="studentOrganization"></a>
          </div>

        </div>

      </div>

      <div>
        <h3>Student Organizations</h3>
        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <img class="NOCimg" src="/networking/studentOrg1.svg" alt="Student Organization">
          </div>

          <div class="networkingOnCampusDescription">
            <p>Student Organization provides the easiest access to campus’ communities. UCSD hosts a handful of student
              orgs where you can not meet peers who share your interests, but also <span class="medium">further your
                career path</span> by joining career-related organizations.</p>
            <br>
            <p>To join the orgs you are interested in, you can:</p>
            <ul>
              <li>Walk by the <span class="medium">Library Walk’s</span> Info tables at the start of the quarter.</li>
              <li>Pay close attention to <span class="medium">posters/pamplets</span> around the campus.</li>
            </ul>
          </div>



        </div>

        <div style="text-align: right; margin-top: 15px; margin-bottom: 20px">
          <a href="https://studentorg.ucsd.edu/" target="_blank" style="text-decoration: none; color: #1E4460">
            <p class ="link" style="display: inline; opacity: 80%">See Full List of Student Orgs</p>
            &nbsp;
            <img src="/arrow.png" width=22px style="vertical-align: middle">
          </a>
          <a id="mentorshipPrograms"></a>
        </div>
      </div>


      <div>
        <h3>Mentorship Programs</h3>
        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <img class="NOCimg" src="/networking/mentorshipProgram.svg" alt="Student Organization">
          </div>

          <div class="networkingOnCampusDescription">
            <p>UCSD offers a variety of mentorship programs to assist students with different needs, including
              development. Having a mentor is essential for your career development because they can help you clarify
              concerns you may have that they have already dealt with.</p>
            <br>
            <p>You can find your mentor here:</p>
            <ul>
              <li><a class="intextLink" href="https://app.mentorcollective.org/participant_dashboard/" target="_blank">
                Mentor Collective</a>: a professional mentorship organization that partners with UCSD.</li>
              <li><a class="intextLink" href="https://ispo.ucsd.edu/programs-workshops/programs-events/intl-peer-coaching.html" target="_blank">
                International Peer Coaching Program</a>: a 1-1 mentorship program that pairs international
                students with international peer coaches.</li>

              <li><a class="intextLink" href="https://ugresearch.ucsd.edu/research-programs/fmp/index.html" target="_blank">
                Faculty Mentor Program <i>(FMP)</i></a>: an <span
                  class="medium">
                open-to-all-majors</span> program that assists
                students in developing valuable relationships with <span class="medium">faculty mentors</span> while
                taking an independent study course <i>(99 or 199)</i> for
                building their research skills and post-graduate
                career paths.</li>
            </ul>

            <br>
            <p>You can also:</p>
            <ul>
              <li>Ask your course professors to be your mentor.</li>
            </ul>
          </div>

        </div>

        <div style="text-align: right; margin-top: 15px; margin-bottom: 50px">
          <a href="https://vcsa.ucsd.edu/_files/Mentorship-Programs-Guide-20211014.pdf" target="_blank" style="text-decoration: none; color: #1E4460">
            <p class ="link" style="display: inline; opacity: 80%">See All Mentorship Programs at UCSD</p>
            &nbsp;
            <img src="/arrow.png" width=22px style="vertical-align: middle">
          </a>
          <a id="careerFair"></a>
        </div>

      </div>

      <div>
        <h3>Career Fairs/Events</h3>
        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <img class="NOCimg" src="/networking/careerFair.svg" alt="Student Organization">
          </div>

          <div class="networkingOnCampusDescription">
            <p>UCSD offers a variety of networking events for career development, such as Career Fairs and virtual
              workshops. By interacting with industry professionals and upperclassmen in the same field, they allow
              students to broaden their <span class="medium">career expertise and industry knowledge</span>, practice
              <span class="medium">presentation and interpersonal skills</span>, and increase their chances of
              <span class="medium">being hired</span> by their desired company.</p>
            <br>
            <p>To attend events in your field, you can: </p>
            <ul>
              <li>View Events at <a class="intextLink" href="https://ucsd.joinhandshake.com/stu" target="_blank">
                Handshake</a></li>
              <li>Walk by the info tables on Library Walk</li>
              <li><span class="medium">*View our <el-popover
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
        </div>
      </div>


      <div>
        <h3>Labs</h3>
        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <img class="NOCimg" src="/networking/labs.svg" alt="Student Organization">
          </div>

          <div class="networkingOnCampusDescription">
            <p>Labs are great resources for in-depth exploration of your professional fields by interacting with
              professors, Ph.D. students, and peers in the same field. You can often find research assitant internship
              opportunities.</p>
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
        </div>
      </div>

      <img src="/networking/r2tips.svg" alt="tip" width="700" style="margin-top: 20px; margin-left: 15vw;margin-right: 10vw">

    </div>
  </div>
</template>

<script>
import Calendar from "../Calendar.vue"
export default {
  name: "OnCampus",
  components: {
    Calendar
  }
}
</script>



<style scoped>
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
a {
  text-decoration: none;
}
div{
  text-align: center;
}
.medium {
  font-weight: 500;
}
.semi {
  font-weight: 600;
}
h1, h2, h3, h4{
  text-align: left;
}

h3{
  margin-bottom: 50px;
  font-weight: 700;
  font-size: 16px;
  font-style: normal;
  padding-top: 30px;
}
h1{
  margin-bottom: 2rem;
  color: #1E4460;
  font-weight: 700;
  font-size: 26px;
  font-family: work-sans;
}
h2{
  font-family: work-sans;
  font-style: normal;
  font-size: 18px;
  font-weight: 700;
  color: #182B49;
  margin-bottom: 42px;
  margin-top: 95px;
  border-top: 1px solid black;
  border-bottom: 1px solid black;
  padding-top: 15px;
  padding-bottom: 15px;
}
h4{
  padding-left: 30px;
  margin-bottom: 20px;
}

p.normal{
  border-radius: 2rem;
  text-align: center;
  padding: 2rem;
  background-color: #D9EAEF;
  font-size: 1.5rem;
  font-weight: bold;
  color: #1E4460;
  width: 65%;
  margin: auto;

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


#NCspan3{
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

#NCspan4{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding-top: 3px;
  padding-bottom: 3px;
  width: 200px;
  margin-left: 20px;
  margin-right: auto;
}
.onlinePlatformDiv{
  display: flex;
  text-align: center;
  margin-left: 12vw;

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

.otherMediaIcon{
  height: 100%;
  text-align: center;
  margin: auto;
  margin-left: 0;
  margin-right: 0;

}

.column img {
  margin-top: 8px;
  vertical-align: middle;
}

.NOCimg{
  width: 168px;
  margin-right: 3vw;
}

.networkingOnCampusDescription{
  display: inline-block;
  border-radius: 2rem;
  border: 3.5px dashed #F4CE71;
  text-align: left;
  width: 65%;
  padding: 1rem;
  margin-bottom: 20px;
  line-height: 141%;
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
.link {
  display: inline;
  text-decoration: none;
  color: #1e4460;
  font-weight: 500;
}
.link:hover {
  text-decoration: underline;
  font-weight: 600;
}

.middleP{
  font-size: 15px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  margin-right: 12vw;
  margin-left: 12vw;
  margin-bottom: 30px;
  max-width: 900px;
}

</style>