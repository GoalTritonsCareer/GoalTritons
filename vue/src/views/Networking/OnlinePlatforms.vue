<template>
  <div id="NetworkingTop">
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>Online Platforms</h1>
      </section>
      <img src="/networking/opBG.avif" alt="networking background" style="width: 100%" >
      <a id="why-networking"></a>
    </div>

    <div id="body">
      <img id="whyOnlinePlatformsImg" src="/networking/whyOnlinePlatform.svg" alt="Why Networking">
      <p class="online"><a class="intextLink" href="https://www.jobvite.com/wp-content/uploads/2020/05/FINAL-Jobvite-JobSeekerNation-Report1_5-11.pdf" target="_blank">
        2022 Job Seeker Nation</a> reported that 42% say they find out about job openings through social media platforms.
      </p>
      <el-tabs v-model="activeName" class="demo-tabs" stretch="true" @tab-click="handleClick">
        <el-tab-pane label="LinkedIn" name="first">
          <section class="onlinePlatformDiv">
            <div class="box">
              <a href="https://www.linkedin.com/" target="_blank">
                <img class="onlinePlatformImg" src="/networking/linkedIn.svg" alt="linkedIn" loading="lazy">
              </a>
            </div>

            <div class="onlinePlatformDescription">
              <p>LinkedIn is the world’s largest professional networking platform with over 300 million users and growing.
                Employers, professors, alumni, and job-seekers like you are all active on the platform. </p>
              <br>
              <p>On LinkedIn, you can:</p>
              <ul>
                <li>Build your professional presence.</li>
                <li>Form connections & expand your professional network.</li>
                <li>Search & apply to jobs.</li>
                <li>Gather industry information.</li>
              </ul>
            </div>
          </section>

          <section class="step1 headerWithLink">
            <div style="display: flex; flex-direction: row; text-align: left;">
              <p class="step step1Color">Step 1</p>
              <p class="stepTitle">Build a Professional & Attracting Profile</p>
            </div>
            <div style="text-align: right">
              <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank" style="text-decoration: none; color: #1E4460">
                <p class ="link" style="display: inline; ">Schedule LinkedIn Profile Review Appointment</p>
                &nbsp;
                <img src="/ocArrow.svg" alt="arrow" loading="lazy" style="vertical-align: middle; width: 22px">
              </a>
            </div>
          </section>

          <section>
            <p class="middleP">A professional profile not only attracts your peers for easier network expansion, but it also draws the
              attention of industry insiders, particularly recruiters. They will stay longer on your profile, to be more
              impressed with you, and learn more about your professional side, thus providing job opportunities for you.
              Goal Tritons will walk you through each part in building an
              attracting LinkedIn Profile.</p>

            <div style="position: relative; display: inline-block; border: 3px solid #D9EAEF; border-radius: 20px; width:65%; padding:12px 24px">
              <p style="font-size: 16px">
                <span style="font-weight: 600; color:#1E4460"> Reminder</span>: don’t overwhelm people with a ton of
                information—focus on <span style="font-weight: 500">what makes you stand out</span> from a huge
                pool of competitors.
              </p>
            </div>
          </section>

          <section class="wrapper">
            <div class="one1">
              <p class="profileHeader" style="width:240px">Part 2: Customize Your Profile</p>
              <div style="width: 260px; line-height: 141%">
                <ul>
                  <li><span class="medium">Open to work:</span> edit your job preferences for recruiters to see here.</li>
                </ul>
              </div>
            </div>
            <div class="one2">
              <img src="/networking/profileInfo.svg" alt="profile_info" loading="lazy" style="padding-left: 50px">
              <img src="/networking/profileStatus.svg" alt="profile_status" loading="lazy">
            </div>
            <div class="one3">
              <p class="profileHeader" style="width:240px">
                Part 1: Provide Your Basic Info
              </p>
              <div style="width: 308px; line-height: 141%">
                <ul>
                  <li><span class="medium">Profile Picture:</span> choose a clear front- facing profile picture,
                    preferably smiling.
                  </li>
                  <li><span class="medium">Professional Headline:</span> describe your current roles; specify your
                    <span class="medium">career goal</span> or focus using “|”.
                    <ul>
                      <li>e.g. “Student studying xxx @xxx | Seeking xxx internship”.</li>
                    </ul>
                  </li>
                  <li><span class="medium">Education & Location:</span> provide your desired location since recruiters may
                    limit their searches by location.
                  </li>
                </ul>
              </div>
            </div>

            <div class="two1">
              <p class="profileHeader" style="width:250px">Part 4: Polish Your Experiences</p>
              <div style="width: 260px; line-height: 141%">
                <ul>
                  <li>Use <span class="moreResLink" @click="$router.push('/resume#impactStatements')">
                Impact Statements</span> to describe what you did.
                  </li>
                  <li>Add <span class="medium">featured media</span> to showcase works you are proud of.</li>
                  <li>Choose relevant <span class="medium">skill tags</span> as recruiters will do searches based on skills.</li>
                </ul>
              </div>
            </div>
            <div class="two2">
              <img src="/networking/profileAbout.svg" alt="profile_about" loading="lazy" style="padding-left: 50px">
              <br> <img src="/networking/profileExperience.svg" alt="profile_experience" loading="lazy">
            </div>
            <div class="two3">
              <p class="profileHeader" style="width:260px">
                Part 3: Summarize Your highlights
              </p>
              <div style="width: 308px; line-height: 141%">
                <ul>
                  <li><span class="medium">About:</span> Share your background/<br>
                    mission/ motivation/attributes/key achievements <i>(you can
                      use bullet points)</i>.
                    <ul>
                      <li>include keywords or phrases related to your desired position to increase the likelihood of your
                        profile appearing in recruiters' search results.</li>
                    </ul>
                  </li>
                </ul>
                <div style="text-align: left; padding-left: 12px">
                  <i>See LinkedIn summary examples under </i>
                  <i class="moreResLink" @click="$router.push('/networking#more-resources')">More Resources</i>.
                </div>

              </div>
            </div>

            <div class="three2">
              <img src="/networking/profileEducation.svg" alt="profile_others" loading="lazy" style="padding-left: 50px">
            </div>
            <div class="three3">
              <p class="profileHeader" style="width:130px;">
                Part 5: Others
              </p>
              <div style="width: 308px; line-height: 141%">
                <ul>
                  <li><span class="medium">Education:</span> include
                    exceptional grades and awards <i>(e.g. Grade: 3.9,
                      President’s Award, Honors Roll)</i>.
                  </li>
                  <li><span class="medium">Licenses/Certifications:</span> include if relevant.</li>
                  <li><span class="medium">Skills/Languages:</span> you can click “Demonstrate skills” and take
                    <span class="medium">Skill Assessments</span> <i>(They earn
                      you skill badges!)</i>
                    <ul>
                      <li><a class="intextLink" href="https://www.linkedin.com/help/linkedin/answer/a566100/endorse-someone-s-skills?lang=en" target="_blank">
                        Endorsement</a>: people can endorse you for certain skills by hitting an “endorse” button.
                      </li>
                    </ul>
                  </li>
                  <li><span class="medium">Volunteer:</span> include if relevant.</li>
                  <li><span class="medium">Recommendation:</span> you can
                    <a class="intextLink" href="https://www.linkedin.com/help/linkedin/answer/a546682" target="_blank">
                      request Recommendation</a> from your connections
                    <i>(e.g. teammates, co-worker)</i> as they add validity to
                    your online personal brand.
                  </li>
                </ul>

              </div>
            </div>
          </section>

          <section class="profileFooter">
            <p class="semi">Learn from others:</p>
            <ul>
              <li>Browse <span class="medium">other people's profile pages</span> for inspiration, such as those who
                have worked in your favorite company and held similar employment as you.
              </li>
              <li>
                Use the <a class="intextLink" href="https://www.linkedin.com/school/ucsandiego/people/" target="_blank">
                LinkedIn Alumni tool</a> to check out the data of your alumni—where they work and live, especially people
                who are in the same industry as you.
              </li>
            </ul>
            <p class="semi">Be yourself:</p>
            <ul>
              <li>Avoid words like “specialized”, “passionate”, and “experienced” since they're overused on LinkedIn.
                Think about how you stand out and use words that <span class="medium">characterize you</span>.
              </li>
            </ul>
          </section>

          <section style="text-align: right; margin-bottom: 42px; margin-top: 42px">
            <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">Learn “Branding” Yourself on LinkedIn under</i> <i class="moreResLink" @click="$router.push('/networking#more-resources')">More Resources</i></p>
          </section>

          <section>
            <div style="display: flex; flex-direction: row; text-align: left; margin-bottom: 40px; ">
              <p class="step step2Color">Step 2</p>
              <p class="stepTitle">Expand Your Professional Network</p>
            </div>
            <div style="display: flex; flex-direction: row; margin: 0 auto 50px auto; width: fit-content; border: 3px solid #D9EAEF;
                        border-radius: 20px; padding: 24px 24px 0 24px">
              <p style="width: 22ch; text-align: left; padding-top: 2em">This number matters when hunting for jobs—having more connection gives you
                credibility and increases your exposure on the market.</p>
              <img class="step2Img" src="/networking/step2P1.svg" alt="expandNetwork" loading="lazy" style="margin-bottom: 30px">
            </div>

            <p class="middleP">
              However, since recruiters evaluate your connections based on their <span class="semi">quality & relevancy</span>,
              your focus when expanding your network should be on the people that can <span class="semi">add to your
          professional value</span>.
            </p>
            <img class="step2Img" alt="connectWith" src="/networking/connectWith.svg" loading="lazy" style=" margin-top: 20px">
          </section>

          <section style="text-align: right; margin-top: 40px; margin-bottom: 30px">
            <a href="https://www.linkedin.com/groups/42184/" target="_blank" style="text-decoration: none; color: #1E4460">
              <p class ="link" style="display: inline; ">Join LinkedIn UCSD Alumni Community</p>
              &nbsp;
              <img src="/ocArrow.svg" alt="arrow" loading="lazy" style="vertical-align: middle; width: 22px">
            </a>
          </section>

          <section style="padding-left: 10%;">
            <p style="font-weight: 600; margin-bottom: 20px; text-align: left">Tips:</p>
            <div class="s2Tips">
              <p class="DYp">Point 1</p>
              <span>Reach out with a <span class="semi">personal note</span>. </span>
              <ul>
                <li><em>e.g. “Hey (Name), I came across your profile and saw you work in xxx. I am really interested in
                  connecting with like-minded individuals. Would be happy to make your acquaintance!”</em></li>
              </ul>
            </div>

            <div class="s2Tips">
              <p class="DYp">Point 2</p>
              <span>Explore LinkedIn using <span class="semi">direct search</span>.</span>
              <ul>
                <li>Search for people by keywords and filters, <em>e.g. Human Resources in San Diego, PhD in UCSD</em></li>
              </ul>
              <img id="s2t2img" src="/networking/step2P3.jpg" alt="step 2 Point 3" oading="lazy">
            </div>

            <div class="s2Tips">
              <p class="DYp">Point 3</p>
              <span>Pay attention to people you should develop further relationships with, learn
            <span class="moreResLink" @click="$router.push('/Networking#maintainNetwork')">
              How to Maintain Networks</span>.
          </span>

            </div>

            <div style="text-align: right; margin-bottom: 50px; margin-top: 40px">
              <i>See More LinkedIn Connect Templates under</i> <i class="moreResLink" @click="$router.push('/networking#more-resources')">More Resources</i>
              <a id="tritonConnect"></a>
            </div>


          </section>
        </el-tab-pane>
        <el-tab-pane label="Tritons Connect" name="second" >
          <section class="onlinePlatformDiv">
            <div class="box">
              <a href="https://tritonsconnect.com/" target="_blank">
                <img class="onlinePlatformImg" src="/networking/tritonsConnect1.avif" alt="Tritons Connect Logo" loading="lazy"
                     style="border-radius: 15.5px; background-color: #D9EAEF">
              </a>
            </div>
            <div class="onlinePlatformDescription">
              <p>Tritons Connect is UCSD's equivalent of LinkedIn, but it offers a <span class="medium">smaller and more
              concentrated</span> network from which you could benefit directly as a UCSD student.  </p>
              <br>
              <p>On Tritons Connect, you can:</p>
              <ul>
                <li>Write a post on “Feed” to interact within the UCSD Network
                  <i>(e.g. ask for referrals)</i>.</li>
                <li>Connect with UCSD classmates, professors, staff, and <span class="medium">alumni</span>. </li>
                <li>Find mentors <i class="medium">(e.g. alumni, faculty)</i> in various job functions and industries. </li>
                <li>Check out events that might interest you. You can also post an event.</li>
              </ul>
            </div>
          </section>

          <section style="margin-top: 6%; padding: 0 4%">
            <p id="highlight">Highlight</p>
            <img src="/networking/tritonsConnect2.avif" alt="tritonsConnectHighlight" loading="lazy" style="width: 100%">
            <img src="/networking/mentoringOption.svg" alt="mentoringOptions" loading="lazy" style="margin-top: 50px">


            <div style="text-align: right; margin-top: 50px; margin-bottom: 50px">
              <a href="https://www.youtube.com/watch?v=5hbQZhav7Q4" target="_blank" style="text-decoration: none; color: #1E4460">
                <p class ="link" style="display: inline; ">See Tritons Connect Video Tour</p> &nbsp;
                <img src="/ocArrow.svg" alt="arrow" loading="lazy" style="vertical-align: middle; width: 22px">
              </a>
              <a id="otherSocialMedia"></a>
            </div>
          </section>
        </el-tab-pane>
        <el-tab-pane label="Other Platforms" name="third">
          <p class="middleP" style="margin-bottom: 6%; width: 82%">
            In addition to LinkedIn and Tritons Connect, Goal Triton Career
            recommends using some other social media
            platforms to network with people. There are a handful of useful ones, such as
            <span class="semi">WeChat, Discord, Facebook, and Reddit,</span> each with its ways to network.
          </p>
          <section class="onlinePlatformDiv">
            <div class="otherMediaIcon">
              <p class="otherMediaTitle">WeChat</p>

              <div class="box">
                <a href="https://www.wechat.com/" target="_blank">
                  <img class="onlinePlatformImg svgicon" src="/networking/wechatIcon.svg" alt="WeChat" loading="lazy">
                </a>
              </div>
            </div>

            <div class="onlinePlatformDescription">
              <p>WeChat is a free messaging App for both casual and business uses, which is widely used amongst
                <span class="medium">Chinese International Students</span>. </p>
              <br>
              <p>On WeChat, you could network by:</p>
              <ul>
                <li>Adding classmates and chatting with them.</li>
                <li>Joining classmate/major/social group chats. </li>
                <li>Following public official accounts of organizations to join groups & receive updates
                  <i>(e.g. UCSD CSSA, CU UCSD, UCSD
                    TritonTalk)</i>.
                </li>
              </ul>
            </div>
          </section>

          <section class="onlinePlatformDiv">
            <div class="otherMediaIcon">
              <p class="otherMediaTitle">Discord</p>
              <div class="box">
                <a href="https://discord.com/" target="_blank">
                  <img class="onlinePlatformImg" src="/networking/discordIcon.svg" alt="Discord" loading="lazy">
                </a>
              </div>
            </div>

            <div class="onlinePlatformDescription">
              <p>Discord is a social platform with servers & channels for larger communities to interact.  </p>
              <br>
              <p>On Discord, you could network by:</p>
              <ul>
                <li>Joining major-specific servers and accessing class channels <i>(e.g. UCSD Communication #comm-10)</i>.</li>
                <li>Joining organizations’ servers <i>(e.g. CSSA at UCSD, Design Co)</i>.</li>
                <li>Adding individuals and reaching out through Direct Message.</li>
                <li>Joining text, voice, and video channels to connect with group members.</li>
              </ul>
            </div>
          </section>

          <section class="onlinePlatformDiv">
            <div class="otherMediaIcon">
              <p class="otherMediaTitle">Facebook</p>
              <div class="box">
                <a href="https://www.facebook.com/" target="_blank">
                  <img class="onlinePlatformImg" src="/networking/facebookIcon.svg" alt="FaceBook" loading="lazy">
                </a>
              </div>
            </div>

            <div class="onlinePlatformDescription">
              <p>Facebook, with <a class="intextLink" href="https://investor.fb.com/investor-news/press-release-details/2020/Facebook-Reports-Second-Quarter-2020-Results/default.aspx" target="_blank">
                2.7 billion monthly active users</a>, hosts your peers, faculty/staffs, and organizations.</p>
              <br>
              <p>On Facebook, you could network by:</p>
              <ul>
                <li>Searching for and joining interested FB groups <i>(e.g.<a
                    class="intextLink" href="https://www.facebook.com/groups/461162515080141" target="_blank" style="font-style: italic">
                  UCSD Class of 2025</a>)</i>>.</li>
                <li>Finding your interested events under the“Events” section of the group you joined.</li>
                <li>Following people in the group and reaching out through “Messenger”.</li>
              </ul>
            </div>
          </section>

          <section class="onlinePlatformDiv">
            <div class="otherMediaIcon">
              <p class="otherMediaTitle">Reddit</p>
              <div class="box">
                <a href="https://www.reddit.com/" target="_blank">
                  <img class="onlinePlatformImg" src="/networking/redditIcon.svg" alt="Reddit" loading="lazy">
                </a>
              </div>
            </div>

            <div class="onlinePlatformDescription">
              <p>Reddit serves as a <span class="medium">forum</span> for a wide range of communities.</p>
              <br>
              <p>On Reddit, you could network by:</p>
              <ul>
                <li>Joining interested communities to ask questions, have discussions, see & send posts
                  <i>(e.g. <a class="intextLink" href="https://www.reddit.com/r/UCSD/" target="_blank">
                    r/UCSD</a>, <a class="intextLink" href="https://www.reddit.com/r/UCSD/" target="_blank">
                    r/humanresources</a>)
                  </i>.
                </li>
                <li>Following “hot” and “new” posts to receive most updated answers.</li>
                <li>Filtering by flair <i>(e.g. “Career development”)</i> to
                  receive more relevant posts. <a id="HowToNetworkOnline"></a></li>
                <li>Following individuals and messaging them.     </li>
              </ul>
            </div>
          </section>

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
.wrapper {
  margin-top: 50px;
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 0;
  height: fit-content;
  width: min-content;
  margin-left: -65px;
  /*margin-right: 3vw;*/
}
.one1 {
  grid-column: 1;
  grid-row: 1;
  text-align: right;
  align-self: flex-end;
  margin-right: -25px;
  padding-left: 60px;
}
.one2 {
  grid-column: 2;
  grid-row: 1;
}
.one3 {
  grid-column: 3;
  grid-row: 1;
  padding-left: 10px
  /*width: calc(77vw - 600px);*/
}
.two1 {
  grid-column: 1;
  grid-row: 2;
  text-align: right;
  align-self: flex-end;
  margin-right: -25px;
  padding-left: 60px;
}
.two2 {
  grid-column: 2;
  grid-row: 2;
}
.two3 {
  grid-column: 3;
  grid-row: 2;
  padding-left: 10px
  /*width: calc(77vw - 600px);*/
}
.three2 {
  grid-column: 2;
  grid-row: 3;
}
.three3 {
  grid-column: 3;
  grid-row: 3;
  padding-left: 10px
  /*width: calc(77vw - 600px);*/
}
</style>