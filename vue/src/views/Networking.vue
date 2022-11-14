<template>
  <div id="NetworkingTop">

    <div>
      <h1>Networking</h1>

      <p class="normal">“New Survey Reveals 85% of All Jobs are Filled Via Networking”</p>
      <a id="whyNetworking"></a>
      <h2>Why Networking?</h2>

      <div>
        <img class="whyNetworkingImg" src="/networking/whyNetworking.svg" alt="Why Networking">

      </div>

    </div>
    <a id="onlinePlatform"></a>
    <div>
      <div>
        <h2 style="display: block">Route One: Networking through Online Platforms <a id="whyPlatform" style="display: inline"></a></h2>

      </div>

      <div>

        <h3>Why use online platforms?</h3><img src="/networking/whyOnlinePlatform.svg" alt="why Online Platform" width="800">
        <p class="online"><a class="intextLink" href="https://www.jobvite.com/wp-content/uploads/2020/05/FINAL-Jobvite-JobSeekerNation-Report1_5-11.pdf" target="_blank">
          2022 Job Seeker Nation</a> reported that 42% say they find out about job openings through social media platforms.
        </p>

      </div>

      <div>

        <h3>Common Online Platforms</h3>
        <div>

          <p id="questionType">Question Types</p>

          <div style="margin-bottom: 42px">
            <p id="QTspan1">LinkedIn</p>
            <p id="QTspan2">Tritons Connect</p>
            <p id="QTspan3">Other Social Media</p>
            <a id="linkedIn"></a>
          </div>

        </div>

      </div>

      <div >

        <h3>LinkedIn</h3>

        <div class="onlinePlatformDiv">
          <div class="box">
            <a href="https://www.linkedin.com/" target="_blank">
            <img class="onlinePlatformImg" src="/networking/linkedIn.svg" alt="linkedIn">
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

        </div>
      </div>

      <div class="headerWithLink">
        <div style="display: flex; flex-direction: row; text-align: left;">
          <p class="step step1Color" style="width:65px">Step 1</p>
          <p class="stepTitle">Build a Professional & Attracting Profile</p>
        </div>
        <div style="text-align: right">
          <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank" style="text-decoration: none; color: #1E4460">
            <p class ="link" style="display: inline; opacity: 80%">Schedule LinkedIn Profile Review Appointment</p>
            &nbsp;
            <img src="/arrow.png" alt="arrow" width=22px style="vertical-align: middle">
          </a>
        </div>
      </div>

      <div>

        <p class="middleP">A professional profile not only attracts your peers for easier network expansion, but it also draws the
          attention of industry insiders, particularly recruiters. They will stay longer on your profile, to be more
          impressed with you, and learn more about your professional side, thus providing job opportunities for you.
          Goal Tritons will walk you through each part in building an
          attracting LinkedIn Profile.</p>

        <div style="position: relative; display: inline-block">
          <div style="border: 3px solid #D9EAEF; border-radius: 20px; width:554px; padding:10px 18px">
            <p style="padding-top: 10px; font-size: 16px">
              <span style="font-weight: 600; color:#1E4460"> Reminder</span>: don’t overwhelm people with a ton of
              information—focus on <span style="font-weight: 500">what makes you stand out</span> from a huge
              pool of competitors.
            </p>

          </div>
        </div>

        <div class="wrapper">
          <div class="one1">
            <p class="profileHeader" style="width:240px">Part 2: Customize Your Profile</p>
            <div style="width: 260px; line-height: 141%">
              <ul>
                <li><span class="medium">Open to work:</span> edit your job preferences for recruiters to see here.</li>
              </ul>
            </div>
          </div>
          <div class="one2">
            <img src="/networking/profileInfo.svg" alt="profile_info" style="padding-left: 50px">
            <br> <img src="/networking/profileStatus.svg" alt="profile_status">
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
            <img src="/networking/profileAbout.svg" alt="profile_about" style="padding-left: 50px">
            <br> <img src="/networking/profileExperience.svg" alt="profile_experience">
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
                <i class="moreResLink" @click="$router.push('/Networking#moreResources')">More Resources</i>.
              </div>

            </div>
          </div>

          <div class="three2">
            <img src="/networking/profileEducation.svg" alt="profile_others" style="padding-left: 50px">
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
        </div>

        <div class="profileFooter">
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
        </div>

        <div style="text-align: right; margin-bottom: 42px; margin-top: 42px">
          <p style="display: inline; opacity: 80%"><i style="color: #1E4460; font-weight: 500">Learn “Branding” Yourself on LinkedIn under</i> <i class="moreResLink" @click="$router.push('/Networking#moreResources')">More Resources</i></p>
        </div>

      </div>

      <div>
        <div style="display: flex; flex-direction: row; text-align: left; margin-bottom: 40px">
          <p class="step step2Color" style="width:65px">Step 2</p>
          <p class="stepTitle">Expand Your Professional Network</p>
        </div>
        <img class="step2Img" src="/networking/step2P1.png" alt="expandNetwork" style="margin-bottom: 30px">

        <p class="middleP">
          However, since recruiters evaluate your connections based on their <span class="semi">quality & relevancy</span>,
          your focus when expanding your network should be on the people that can <span class="semi">add to your
          professional value</span>.
        </p>
        <img class="step2Img" alt="connectWith" src="/networking/connectWith.svg" style="margin-top: 10px">
      </div>


      <div style="text-align: right; margin-top: 40px; margin-bottom: 30px">
        <a href="https://www.linkedin.com/groups/42184/" target="_blank" style="text-decoration: none; color: #1E4460">
          <p class ="link" style="display: inline; opacity: 80%">Join LinkedIn UCSD Alumni Community</p>
          &nbsp;
          <img src="/arrow.png" width=22px style="vertical-align: middle">
        </a>
      </div>

      <div>
        <h3 style="margin-left: 10rem; margin-bottom: 20px">Tips:</h3>
        <div class="s2Tips">
          <p class="DYp">Point 1</p>
          <span>Reach out with a <span class="semi">personal note</span>. </span>
          <ul style="padding-left: 55px; margin-right: 10vw; font-size: 15px">
            <li><em>e.g. “Hey (Name), I came across your profile and saw you work in xxx. I am really interested in
              connecting with like-minded individuals. Would be happy to make your acquaintance!”</em></li>
          </ul>
        </div>

        <div class="s2Tips">
          <p class="DYp">Point 2</p>
          <span>Explore LinkedIn using <span class="semi">direct search</span>.</span>
          <ul style="padding-left: 55px; margin-right: 10vw; font-size: 15px">
            <li>Search for people by keywords and filters, <em>e.g. Human Resources in San Diego, PhD in UCSD</em></li>
          </ul>
          <img id="s2t2img" src="/networking/step2P3.jpg">
        </div>

        <div class="s2Tips">
          <p class="DYp">Point 3</p>
          <span>Pay attention to people you should develop further relationships with, learn
            <span class="moreResLink" @click="$router.push('/Networking#maintainNetwork')">
              How to Maintain Networks</span>.
          </span>

        </div>

        <div style="text-align: right; margin-bottom: 50px; margin-top: 40px">
          <i>See More LinkedIn Connect Templates under</i> <i class="moreResLink" @click="$router.push('/Networking#moreResources')">More Resources</i>
          <a id="tritonConnect"></a>
        </div>


      </div>

      <div>


        <h3>Tritons Connect</h3>

        <div class="onlinePlatformDiv">
          <div class="box">
            <a href="https://tritonsconnect.com/" target="_blank">
              <img class="onlinePlatformImg" src="/networking/tritonConnect1.svg" alt="TritonConnect">
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

        </div>
        <p id="highlight">Highlight</p>
        <img src="/networking/tritonsConnect2.svg" alt="tritonsConnectHighlight" width="900" style="padding-left: 5%">
        <img src="/networking/mentoringOption.svg" alt="mentoringOptions" style="margin-top: 50px">


        <div style="text-align: right; margin-top: 50px; margin-bottom: 50px">
          <a href="https://www.youtube.com/watch?v=5hbQZhav7Q4" target="_blank" style="text-decoration: none; color: #1E4460">
            <p class ="link" style="display: inline; opacity: 80%">See Tritons Connect Video Tour</p>
            &nbsp;
            <img src="/arrow.png" width=22px style="vertical-align: middle">
          </a>
          <a id="otherSocialMedia"></a>
        </div>

      </div>

      <div>

        <h3>Other Social Media</h3>
        <p class="middleP">
          In addition to LinkedIn and Tritons Connect, Goal Triton Career
          recommends using some other social media
          platforms to network with people. There are a handful of useful ones, such as
          <span class="semi">WeChat, Discord, Facebook, and Reddit,</span> each with its ways to network.
        </p>




        <div class="onlinePlatformDiv">
          <div class="otherMediaIcon">
            <p class="otherMediaTitle">WeChat</p>

            <div class="box">
              <a href="https://www.wechat.com/" target="_blank">
                <img class="onlinePlatformImg svgicon" src="/networking/wechatIcon.svg" alt="WeChat">
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

        </div>

        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <p class="otherMediaTitle">Discord</p>
            <div class="box">
              <a href="https://discord.com/" target="_blank">
                <img class="onlinePlatformImg" src="/networking/discordIcon.svg" alt="Discord">
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

        </div>

        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <p class="otherMediaTitle">Facebook</p>
            <div class="box">
              <a href="https://www.facebook.com/" target="_blank">
            <img class="onlinePlatformImg" src="/networking/facebookIcon.svg" alt="FaceBook">
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

        </div>


        <div class="onlinePlatformDiv">

          <div class="otherMediaIcon">
            <p class="otherMediaTitle">Reddit</p>
            <div class="box">
              <a href="https://www.reddit.com/" target="_blank">
            <img class="onlinePlatformImg" src="/networking/redditIcon.svg" alt="Reddit">
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

        </div>



      </div>


      <div>
        <h3>How to Network Online? </h3>

        <p>It can be frustrating to reach out. But don't worry. We’ve broken down every step of online networking for you.</p>
        <div>
          <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0px 40px 40px">
            <p class="NOstep step1Color" style="width:65px">Step 1</p>
            <p class="stepTitle">Send an Outreach Email</p>
          </div>
          <img src="/networking/howToNetworkOnlineS11.svg" alt="outreachMain" width="960">
        </div>

        <div>
          <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0px 40px 40px">
            <p class="NOstep step2Color" style="width:65px">Step 2</p>
            <p class="stepTitle">Conduct Informational Interview</p>
          </div>
          <p class="middleP">Informational interview allows you to learn more deeply about career-related topics, such
            as career path, industry, or a specific firm, by <span class="medium">speaking directly</span> with an
            experienced individual who has <span class="medium">expertise and knowledge in your desired field</span>.
          </p>
          <img src="/networking/howToNetworkOnlineS21.svg" alt="sampleQs" width="830">

          <div style="text-align: right; margin-top: 40px">
            <i>See More Qs to Ask through Info Interview under</i> <i class="moreResLink" @click="$router.push('/Networking#moreResources')">More Resources</i>
          </div>
        </div>

        <div>
          <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0px 40px 40px">
            <p class="NOstep step3Color" style="width:65px">Step 3</p>
            <p class="stepTitle">Follow-up with a Thank-you Note</p>
          </div>
          <p class="middleP">You just had a terrific interview—the person was pleased to meet you, answered all your
            questions, and learned about you as a person. Now send a thank-you message to <span class="medium">
              appreciate them for meeting with you</span> and to <span class="medium">leave a strong & positive
              impression</span> so they'll consider you <span class="medium">when future opportunities arise</span>.
            You can also recap your abilities and expertise or share your highlighted work in this follow-up letter.</p>
          <img src="/networking/howToNetworkOnlineS31.svg" alt="thankYouLetter" width="577">
        </div>

        <div>
          <div style="display: flex; flex-direction: row; text-align: left; margin: 50px 0px 40px 40px">
            <p class="NOstep step4Color" style="width:65px">Step 4</p>
            <p class="stepTitle">Stay in Contact</p>
          </div>
          <p class="middleP">If you don't keep in touch with the person you asked for help online, you may lose this
            connection. Therefore, it is critical to maintain contact in order to forge a stable relationship that can
            <span class="medium">lead to more opportunities</span>.</p>
          <img src="/networking/howToNetworkOnlineS41.svg" alt="reminder" width="570">

          <div style="text-align: right; margin-top: 40px">
            <i>See</i> <i class="moreResLink" @click="$router.push('/Networking#maintainNetwork')">How to Maintain Networks</i>
            <a id="networkOnCampus"></a>
          </div>
        </div>

      </div>

    </div>


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

    <a id="everydayRoutine"></a>
    <div>
      <h2>Route Three: Networking in Everyday Routine <a id="whoToNetworkWith"></a></h2>
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
          <h4>Why Networking with the Faculty?</h4>
          <img src="/networking/whyNetworkWithFaculty.svg" alt="Why Networking with the Faculty">
        </div>

        <div>
          <h4>How to Network with the Faculty?</h4>


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
            <img src="/networking/HTNWTFs11.jpg" width="20%" style="margin-left: 14vw; margin-top: 0">
          </div>

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
      <img src="/networking/HTMN1.svg" alt="maintainNetworks" style="margin-top: 20px; margin-bottom: 60px">
      <br>
      <img src="/networking/HTMN2.svg">
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
    <a id="moreResources"></a>
    <div id="more-resources">
      <h2>More Resources</h2>

      <p class="moreResTitle">LinkedIn:</p >
      <ul>
        <li>Summary Examples: <a href="https://blog.hubspot.com/sales/linkedin-summary-examples" target="_blank">
          <p class="moreRes" style="display: inline">17 Best LinkedIn Summary & Bio Examples</p ></a>
        </li>
        <li>“Branding” yourself:
          <ul>
            <li><a href="https://www.linkedin.com/business/marketing/blog/content-marketing/5-free-ways-to-build-your-personal-brand-on-linkedin" target="_blank"><p class="moreRes">
              How to Build Your Personal Brand on LinkedIn</p ></a></li>
            <li><a href="https://www.forbes.com/sites/robinryan/2021/09/14/how-to-create-an-impressive-linkedin-personal-brand/?sh=545765ed73e5" target="_blank"><p class="moreRes">
              How To Create An Impressive LinkedIn Personal Brand</p ></a></li>
          </ul>
        </li>
        <li>Connect Template: <a href="https://www.themuse.com/advice/want-people-to-accept-your-linkedin-requests-use-these-10-templates" target="_blank">
          <p class="moreRes" style="display: inline">LinkedIn Connect Template</p ></a>
        </li>
      </ul>

      <p class="moreResTitle" style="margin-top: 20px">Networking Online:</p >
      <ul>
        <li>Info. Interview: <a href="https://career.berkeley.edu/Info/InfoQuestions" target="_blank">
          <p class="moreRes" style="display: inline">Qs to Ask through Info Interview</p ></a>
        </li>
      </ul>

      <p class="moreResTitle" style="margin-top: 20px">Maintain Networks:</p >
      <ul>
        <li><a href="https://www.themuse.com/advice/finally-5-email-templates-that-make-following-up-with-anyone-way-less-awkward" target="_blank">
          <p class="moreRes" style="display: inline">Networking Follow-Up Email Templates</p ></a>
        </li>
      </ul>

      <p class="moreResTitle" style="margin-top: 20px">More articles for successful networking:</p >
      <ul>
        <li><a href="https://hbr.org/2016/05/learn-to-love-networking" target="_blank">
          <p class="moreRes" style="display: inline">Learn to Love Networking </p ></a>
        </li>
      </ul>
    </div>





  </div>





</template>

<script>
import Calendar from "./Calendar.vue"
export default {
  name: "Networking",
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

.whyNetworkingImg{
  width: 60vw;
}
#opening{
  font-size: 16px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  margin-right: 12vw;
  margin-left: 12vw;
  padding: 40px 35px 0px 35px;
}
#Maintain{
  width:300px;
  border-radius: 20px;
  background-color: cadetblue;
  text-align: center;


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
p.online{
  background-color: #D9EAEF;
  border-radius: 2rem;
  padding: 20px;
  width: 80%;
  margin: auto;
  margin-top: 2rem;
  margin-bottom: 2rem;
  color: #1e4460;
  font-size: 15px;
  line-height: 141%;
}


#questionType{
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
  width: 12vw;
  margin-right: auto;
  margin-left: auto;
  margin-bottom: 5vh;
}

#QTspan1{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding: 2px 30px;
  width: 200px;
  margin-left: auto;
  margin-right: 50px;
}

#QTspan2{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding: 2px 30px;
  width: 200px;
  margin-left: 50px;
  margin-right: 50px;
}


#QTspan3{
  display: inline-block;
  text-align: center;
  border-radius: 20px;
  color: #1E4460;
  border: 2px solid #1E4460;
  padding: 2px 30px;
  width: 200px;
  margin-left: 50px;
  margin-right: auto;
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


.onlinePlatformImg{
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
  margin-top: 5%;
  transition: all 0.3s cubic-bezier(.25,.8,.25,1);
  box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
  margin-right: 4vw;
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
  margin-bottom: 20px;
  line-height: 141%;
}

.profileFooter {
  margin-left: 12vw;
  margin-right:12vw;
  margin-top: 50px;
  padding: 10px 18px;
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

ul{
  text-align: left;
  margin-left: 2rem;
  font-size: 15px;
  font-weight: 400;
  font-style: normal;
  line-height: 141%;    /* list里的行间宽度为141%，其他为default */
}

.step2Img{
  width: 60%;
}
#s2t2img{
  width: 40%;
}

/*#andyp1, #andyp2, #andyp3{*/
/*  width: 80%;*/
/*}*/

/*#andyp3{*/
/*  padding-left: 20px;*/
/*}*/

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
  margin-left: 15px;
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
#highlight{
  background-color: #F4CE71;
  border-radius: 2rem;
  width: 95px;
  padding: 10px;
  font-weight: 600;
  margin-left: 10vw;
  margin-top: 7vh;
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
.headerWithLink{
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
  margin: 50px 0px 50px 20px;
}
.HTNWFdiv{
  display: flex;
  margin-left: 2vw;
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

#more-resources{
  text-align: left;
}
#more-resources > ul{
  text-align: left;
  margin-right: 12vw;
  margin-left: 11.5vw;
  font-size: 16px;
  font-weight: 400;
  font-style: normal;
  line-height: 141%;
}
#more-resources a{
  text-decoration: none;
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

.moreResLink {
  color: #B27224;
  font-weight: 500;
}
.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
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
.moreResTitle{
  font-size: 16px;
  font-weight: 500;
  font-style: normal;
  text-align: left;
  margin-left: 10vw;
  margin-bottom: 0;
}

.step {
  border-radius: 45px;
  font-size: 15px;
  font-weight: 600;
  text-align: center;
  height: 35px;
  margin-right: 5px;
  padding-top: 5px;
}
.stepTitle {
  padding-top: 5px;
  font-weight: 600;
  font-size: 15px;
}
.NOstep {
  background-color: #F8EFDA;
  border-radius: 45px;
  font-size: 15px;
  font-weight: 600;
  text-align: center;
  height: 35px;
  margin-right: 5px;
  padding-top: 5px;
}
.step1Color {
  background-color: #F8EFDA;
}

.step2Color {
  background-color: #FEECC0;
}

.step3Color {
  background-color: #FADC92;
}

.step4Color {
  background-color: #F4CE71;
}

.wrapper {
  margin-top: 50px;
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 0;
  height: fit-content;
  width: min-content;
  margin-left: -10px;
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