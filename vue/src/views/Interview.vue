<template>
  <div id="opening">
    <h1>Interview Prep</h1>
    <p id="openingPara">In this page, Goal Tritons will walk you through how
      to prepare for the interview—the most
      nerve-racking part of job application. You will learn various interview questions, answer structures, and the
      entire interview process. You will also receive a wealth of advices and materials on how to master an interview.
      Let’s get started!</p>




    <a id="whyInterview"></a>
    <div>
      <h2>Why Interview?</h2>



      <img src="/interview/whyInterview.svg" alt="Why Interview?">

      <a id="interviewQuestions"></a>

    </div>

    <div id="question-type">
      <h2>Interview Question Types</h2>

      <div id="QTdiv">

        <h3 id="questionType" >Question Types</h3>


        <div style="margin-bottom: 82px">
          <p id="QTspan1">Define Yourself</p>
          <p id="QTspan2">Behavioral</p>
          <p id="QTspan3">Technical</p>
          <a id="defineYourself"></a>
        </div>


      </div>



      <div>
        <h3>Define Yourself</h3>

        <p style="margin-bottom: 50px; text-align: left; margin-left: 5rem">“Define Yourself” type of questions helps the company to evaluate whether you are a <strong>good fit</strong> through learning about <strong>YOU</strong>.</p>

        <img src="/interview/sampleQ1.svg">

        <h3 style="margin-top: 3rem; margin-left: 8vw; margin-bottom: 1.5vh">Tips:</h3>
        <div>
          <div>
            <div style="text-align: left; margin-left: 10vw">
              <p class="DYp" >Point 1</p>
              <span class="DYspan"><strong>Research about the company/position</strong></span>
            </div>

            <div class="DYdiv">
              <div>
                <img class="DYimg" src="/interview/researchEmoji.svg">
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
            <div style="text-align: left; margin-left: 10vw">
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



      <div>
        <h3>Behavioral Questions</h3>
        <p id="BQp">Behavioral questions help the company to learn about how you would <strong>behave</strong> and <strong>deal with tough situations</strong> in
          the real workplace so that they can anticipate your performance. These are usually about <strong>soft skills</strong>
          (<em>e.g. leadership</em>) and <strong>personal attributes</strong> (<em>e.g. persistency</em>).</p>

        <img src="/interview/behaviorQuetion.svg" style="margin-bottom: 50px">

        <div style="text-align: right; margin-bottom: 82px">
            <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">See More Behavioral Sample Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#moreResources')">More Resources</i></p>
            <a id="TechnicalQuestions"></a>
        </div>
      </div>



      <div>
        <h3 style="margin-bottom: 3rem">Technical Questions:</h3>

        <p id="TQp">This part can vary a lot by different professions. Technical questions are usually <strong>specific to the topics
          in your fields</strong>. They help the company to evaluate your ability, skillset, professional level, and your
          potential to contribute to this specific position. </p>
        <img src="/interview/sampleQ2.svg">
        <div>
          <h3 id="TQtipsTitle">Tips:</h3>
          <div id="TQtips">
            <p class="DYp">Point 1</p>

            <span>Search online or read some interview guides for your <span style="font-weight: 500">specific professions</span>.</span>

            <ul><li><em>E.g. For software engineers, enter “software engineers interview cheat sheet”</em>.</li></ul>
            <br>
            <p class="DYp">Point 2</p>
            <span>Search for interview tips <span style="font-weight: 500">specific to the company</span> you have applied.</span>
          </div>

        </div>
      </div>
    </div>

    <a id="interviewSteps"></a>
    <div>
      <h2>Interview Steps</h2>

      <div id="ITdiv">
        <div>
          <p id="ITstep1" style="font-weight: 650">Step 1</p>
          <p style="font-weight: 650;margin-top: 5px; margin-bottom: 5px">Initial Screening</p>
          <img class="ITimg" src="/interview/initialScreening.png">

<!--          <ul>-->
<!--            <li>Purpose: to evaluate your qualifications/skills in order to narrow the pool of applicants</li>-->
<!--            <li>Form: typically over the phone </li>-->
<!--          </ul>-->


        </div>

        <div>
          <p id="ITstep2" style="font-weight: 650">Step 2</p>
          <p style="font-weight: 650;margin-top: 5px; margin-bottom: 5px">Official Interview</p>
          <img class="ITimg" src="/interview/officialInterview.png">
<!--          <ul>-->
<!--            <li>Purpose: an in-depth examination of your skills/experience/work history/availability</li>-->
<!--            <li>Form: typically 2-4 rounds; in-person or video conferencing; one-on-one or group interview</li>-->
<!--          </ul>-->
<!--          <div id="additionalTip">-->
<!--            <p>Additional: Casual Interview</p>-->
<!--            <ul>-->
<!--              <li>Purpose: for the company to get to know you & for you to get to know the potential working environment; team match usually happens here</li>-->
<!--              <li>Form: more chat-based; likely talks about company culture vs. your value</li>-->
<!--            </ul>-->
<!--          </div>-->

        </div>


        <div>
          <p id="ITstep3" style="font-weight: 650">Step 3</p>
          <p style="font-weight: 650;margin-top: 5px; margin-bottom: 5px">Final Decision</p>
          <img class="ITimg" src="/interview/finalDecision.png">
<!--          <ul>-->
<!--            <li>Form: hiring committee reviews all the feedback from the official interviews-->
<!--              <br>-->

<!--              &nbsp —> Decision made: if hired, you will receive an offer letter often by email</li>-->

<!--          </ul>-->
<!--          <p></p>-->
        </div>
      </div>
      <img id="ITSimg" src="/interview/interviewSteps.svg">
    </div>


    <a id="howToMasterAnInterview"></a>
    <div>
      <h2>How to Master an Interview?</h2>

      <div style="text-align: right; margin-top: 82px; margin-bottom: 50px">
        <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank" style="text-decoration: none; color: #1E4460">
          <p class ="link" style="display: inline;">Schedule an Interview Prep Appointment</p>
          &nbsp;
          <img src="/arrow.png" width=22px style="vertical-align: middle">
        </a>
      </div>

      <div id="HTMAIdiv">
        <div>
          <img src="/interview/beforeTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

          <div class="HTMAIsubdiv" style="margin-right: 20px; padding-right: 4px">
            <img src="/interview/reportEmoji.svg" class="HTMAIemoji" >
            <p >Prepare for common Q&A</p>
            <ul>
              <li>Have a list of common qs & answer them by yourself.
                <ul>
                  <li>Use the S.A.R. answer structure when needed.</li>
                  <li>Keep the answers short & relevant.</li>
                  <li>MEMORIZE your stories/answers</li>
                </ul>
              </li>
              <li>Click to see <a class="moreRes" href="/interview/commonInterviewQuestions.pdf" download="" style="color: #0467B0; ">common questions</a>.</li>
            </ul>

            <img src="/interview/speakerEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p>Prepare a brief self-introduction</p>
            <ul><li>Click to see <a class="moreRes" href="//leverageedu.com/blog/self-introduction-in-interview/#:~:text=First%2C%20greet%20the%20interviewer%20with,and%20nod%20at%20appropriate%20times"
                                    target="_blank" style="color: #0467B0; ">tips</a>.</li></ul>

            <img src="/interview/arrowEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p>Practice, practice, and practice!</p>
            <ul><li>Find peers to do mock interviews using the <a class="moreRes" href="//ucsd.biginterview.com/" target="_blank" style="color: #0467B0; ">Big Interview</a>.</li></ul>
          </div>


        </div>

        <div >
          <img src="/interview/atTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

          <div class="HTMAIsubdiv" style="margin-right: 20px; padding-right: 5px">
            <img src="/interview/smileEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p>Be open, polite, and honest</p>
            <ul>
              <li>Make a good first impression by providing big smile, handshake, and proper greetings, etc.</li>
              
            </ul>

            <img src="/interview/clothesEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p>Dress appropriately</p>
            <ul>
              <li>Dress by company culture</li>
              <li>Dress comfortably</li>
            </ul>

            <img src="/interview/eyeEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p>Express confidence through body language.</p>
            <ul>
              <li>Maintain eye-contacts with your interviewers.</li>
              <li>Nod at appropriate times to show that you are paying attention.</li>
            </ul>
          </div>


        </div>

        <div>
          <img src="/interview/afterTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

          <img src="/interview/questionEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Ask questions at the end</p>
          <ul>
            <li>Click to see
              <a class="moreRes" id="longMoreRes"  href="//www.betterup.com/blog/questions-to-ask-hiring-manager" target="_blank">
                sample questions</a> to ask employers or hiring managers.
            </li>
          </ul>

          <img src="/interview/emailEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
          <p>Send a thank you note/email within 24 hours.</p>
          <ul>
            <li>Click to see <a class="moreRes" href="//www.themuse.com/advice/how-to-write-an-interview-thankyou-note-an-email-template"
                                target="_blank" style="color: #0467B0;">sample thank you emails</a>.</li>
          </ul>
        </div>
      </div>





    </div>
    <div style="text-align: right; margin-bottom: 20px; margin-top: 50px">
      <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">See More Common Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#moreResources')">More Resources</i></p>
      <a id="moreResources"></a>
    </div>

    <div id="more-resources">
      <h2>More Resources</h2>


      <p><span style="font-weight: 600">“Define Yourself” Q&A:</span> <a class="moreRes"  href="//hbr.org/2021/11/10-common-job-interview-questions-and-how-to-answer-them"
                                   target="_blank">10 Common Job Interview Questions and How to Answer Them</a>
      </p>

      <br>

      <p><span style="font-weight: 600">Behavioral Q&A:</span></p>
      <ul>
        <li>Situational Q&A: <a class="moreRes" href="//zety.com/blog/situational-interview-questions" target="_blank">
          20+ Top Situational Interview Questions and Answers</a>
        </li>
        <li>Hypothetical Q&A:
          <a class="moreRes" href="//www.how2become.com/blog/7-hypothetical-interview-questions/#:~:text=Examples%20of%20hypothetical%20interview%20questions,see%20your%20point%20of%20view%3F"
                                 target="_blank">7 Hypothetical Interview Questions & Answers</a>
        </li>
      </ul>

      <br>



      <p><span style="font-weight: 600">Common Interview Q&A:</span></p>
      <ul>
        <li><a class="moreRes" href="//www.indeed.com/career-advice/interviewing/tough-interview-questions-and-answers?from=careeradvice-US" target="_blank">12 Tough Interview Questions and Answers</a></li>
        <li><a class="moreRes" href="//novoresume.com/career-blog/interview-questions-and-best-answers-guide" target="_blank">35+ Interview Questions and Answer</a></li>
      </ul>

      <br>

      <p><span style="font-weight: 600">Career Center Resources:</span></p>
      <ul>
        <li><a class="moreRes" href="//career.ucsd.edu/succeed-search/interview-tips/index.html" target="_blank">Interview Tips</a></li>
        <li><a class="moreRes" href="//career.ucsd.edu/undergraduates/find-a-job/interviewing/jobs-internships/interview%20questions.html" target="_blank">Sample Interview Questions</a></li>
        <li><a class="moreRes" href="//career.ucsd.edu/undergraduates/find-a-job/interviewing/jobs-internships/sample-questions-for-employers.html" target="_blank">Sample Questions to Ask Employers</a></li>
        <li><a class="moreRes" href="//ucsd.biginterview.com/" target="_blank">Mock Interview: Big Interview for hands-on interview practice</a></li>
      </ul>

      <br>


    </div>

  </div>
</template>

<script>
export default {
  name: "Interview"
}
</script>

<style scoped>

  @font-face { font-family: work-sans;
    src: url('/WorkSans/WorkSans-Bold.woff');
  }

  a{
    text-decoration: none;
  }

  .link {
    display: inline;
    text-decoration: none;
    color: #1E4460;
    font-weight: 500;
  }
  .link:hover {
    text-decoration: underline;
    font-weight: 600;
  }



  div{
    text-align: center;
  }
  #more-resources{
    text-align: left;
  }
  #more-resources p{
    margin-left: 13vw;

  }
  h1, h2, h3{
    font-family: work-sans;
    text-align: left;
  }


  .resumecomp > p{
    padding-top: 1rem;
  }

  .resumecomp > pre{
    padding-top: 1rem;
  }

  h3{
    margin-bottom: 50px;

    font-weight: 700;
    font-size: 16px;
    font-style: normal;
  }
  h1{
    margin-bottom: 100px;
    color: #1E4460;
    font-weight: 700;
    font-size: 26px;

  }

  h2{

    font-style: normal;
    font-size: 18px;
    font-weight: 700;
    color: #182B49;
    margin-bottom: 82px;
    margin-top: 95px;
    border-top: 1px solid black;
    border-bottom: 1px solid black;
    padding-top: 15px;
    padding-bottom: 15px;
  }

  #sample-resumes a{
    margin-right: 50px;
  }


  ul{
    text-align: left;
    margin-right: 12vw;
    margin-left: 15vw;
    font-size: 16px;
    font-weight: 400;
    font-style: normal;
    line-height: 141%;    /* list里的行间宽度为141%，其他为default */
  }

  #openingPara{
    font-size: 16px;
    font-style: normal;
    font-weight: 400;
    line-height: 141%;
    text-align: left;
    margin-right: 11vw;
    margin-left: 11vw;

  }

  #BQp, #TQp{
    font-size: 16px;
    font-style: normal;
    font-weight: 400;
    line-height: 141%;
    text-align: left;
    margin-right: 4vw;
    margin-left: 4vw;
  }

  #TQp{
    margin-bottom: 2rem;
  }

  #BQp{
    margin-bottom: 2rem;
  }

  #question-type{
    text-align: center;
  }

  #questionType{
    background-color: #1E4460;;

    text-align: center;
    color: #F4CE71;;
    padding-top: 13px;
    padding-bottom: 13px;

    font-family: work-sans;
    font-size: 20px;
    font-weight: 700;
    font-style: normal;
    border-radius: 30px;
    border: 1px solid black;
    width: 12vw;
    margin-right: auto;
    margin-left: auto;
  }

  #QTdiv{
    text-align: center;
    align-items: center;
    margin-left: auto;
    margin-right: auto;
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
    margin-left: auto;
    margin-right: 50px;
  }



  .DYp{
    display: inline;
    border-radius: 30px;
    background-color: #F4CE71;
    color: black;
    margin-right: 10px;
    padding: 3px 10px;
    font-weight: 600;

  }

  .DYimg{
    width: 10vw;
    margin-right: 4rem;
    margin-left: 7rem;
  }

  .DYdiv{
    display: flex;
    margin: 20px 10vw;
  }

  .DYulTitle{

    text-align: left;
    font-style: italic;

  }
  .DYul{
    margin-right: auto;
    margin-left: 2rem;
  }

  #TQtipsTitle{
    margin-left: 8vw;
    margin-bottom: 20px;
  }

  #TQtips{
    text-align: left;

    margin-left: 10vw;

  }

  #TQtips ul{
    text-align: left;
    margin: 0;
    margin-left: 7rem;
  }

  .ITimg{
    width: 7vw;
  }

  #ITSimg{
    width: 70vw;
    margin-top: 3rem;
  }

  #ITdiv{
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    grid-gap: 10px;
  }

  #ITdiv *{
    margin: 0;
  }

  #ITdiv ul{
    border: 4px dotted #1E4460;
    padding: 20px;
    border-radius: 10px;
    border-left: hidden;


  }

  #ITimg{
    width: auto;
    max-width: 70vw;
  }

  #ITstep1{
    background-color: #F8EFDA;
    border-radius: 10px;
    margin: auto;
    width: 5rem;
  }


  #ITstep2{
    background-color: #F6E0AA;
    border-radius: 10px;
    margin: auto;
    width: 5rem;
  }

  #ITstep3{
    background-color: #F4CE71;
    border-radius: 10px;
    margin: auto;
    width: 5rem;
  }



  #HTMAIdiv{
    display: grid;
    grid-template-columns: repeat(3, 1fr);
  }



  #HTMAIdiv *{
    margin: 0;

  }

  .HTMAIsubdiv{
    border-right: 1px solid rgba(30, 68, 96, .35);

    height: 90%;

  }

  .HTMAIimg{
    display: block;
    margin-bottom: 20px;
  }

  #HTMAIdiv div{
    text-align: left;

  }

  #HTMAIdiv ul{
    margin-left: 2rem;
    margin-top: 1rem;
    margin-bottom: 1rem;

    color: #1E4460;
    font-weight: 499;

  }

  #HTMAIdiv p{
    display: inline;
    color: #1E4460;
    font-weight: 500;


  }

  .HTMAIemoji{
    vertical-align: middle;
    margin-right: 3.5rem;
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

  #longMoreRes{
    display: inline;
  }
</style>
