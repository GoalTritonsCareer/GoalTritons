<template>

  <div>
    <div id="heading" style="position: relative;">
      <section class="title" style="z-index: 10">
        <h3 class="back" >&lt; <span @click="$router.push('/interview')" style="text-decoration: underline; cursor: pointer">Interview</span></h3>
        <h1>MASTER AN INTERVIEW</h1>
      </section>
      <picture>
        <source  srcset="/interview/MasterInterviewTop.avif" type="image/avif">
        <source srcset="/interview/MasterInterviewTop.png" type="image/png">
        <img  class="bg" src="/interview/MasterInterviewTop.png" alt="MasterInterviewTop" style="width: 100%">
      </picture>
    </div>

    <div style="text-align: right; margin-top: 82px; margin-bottom: 50px; margin-right: 8%">
      <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank" style="text-decoration: none; color: #1E4460">
        <p class ="link" style="display: inline;">Schedule an Interview Prep Appointment</p>
        &nbsp;
        <img src="/interview/arrow.svg" style="vertical-align: middle; width: 22px">

      </a>
    </div>

    <div id="body">

            <div id="HTMAIdiv">
        <div>
          <img src="/interview/beforeTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

          <div style="margin-right: 20px; padding-right: 4px">
            <div class="HTMAItitle">
              <img src="/interview/reportEmoji.svg" class="HTMAIemoji" >
              <p class="HTMAIsubtitle">Common Q&A</p>
            </div>
            <ul>
              <li>Have a list of common qs & answer them by yourself.</li>
              <li>Use the S.A.R. answer structure when needed.</li>
                <ul>
                  <li>Keep the answers short & relevant.</li>
                </ul>
              <li>Keep the answers short & relevant.</li>
              <li>MEMORIZE your stories/answers</li>
              <li>Click to see <a class="intextLink" href="/interview/commonInterviewQuestions.pdf" download="" style="color: #0467B0; ">common questions</a>.</li>
            </ul>

            <div class="HTMAItitle">
              <img src="/interview/speakerEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
              <p class="HTMAIsubtitle">Prepare a brief self-introduction</p>
            </div>
            <ul><li>Click to see <a class="intextLink" href="//leverageedu.com/blog/self-introduction-in-interview/#:~:text=First%2C%20greet%20the%20interviewer%20with,and%20nod%20at%20appropriate%20times"
                                    target="_blank" style="color: #0467B0; ">tips</a>.</li></ul>

            <div class="HTMAItitle">
              <img src="/interview/arrowEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
              <p class="HTMAIsubtitle">Practice, practice, and practice!</p>
            </div>

            <ul><li>Find peers to do mock interviews using the <a class="intextLink" href="//ucsd.biginterview.com/" target="_blank" style="color: #0467B0; ">Big Interview</a>.</li></ul>
          </div>
        </div>

        <div >
          <img src="/interview/atTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

          <div class="HTMAIsubdiv" style="margin-right: 20px; padding-right: 5px">
            <div class="HTMAItitle">
              <img src="/interview/smileEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
              <p class="HTMAIsubtitle">Be open, polite, and honest</p>
            </div>
            <ul>
              <li>Make a good first impression by providing big smile, handshake, and proper greetings, etc.</li>

            </ul>

            <div class="HTMAItitle">
              <img src="/interview/clothesEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
              <p class="HTMAIsubtitle">Dress appropriately</p>
            </div>
            <ul>
              <li>Dress by company culture</li>
              <li>Dress comfortably</li>
            </ul>

            <div class="HTMAItitle">
              <img src="/interview/eyeEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
              <p class="HTMAIsubtitle">Express confidence through body language.</p>
            </div>
            <ul>
              <li>Maintain eye-contacts with your interviewers.</li>
              <li>Nod at appropriate times to show that you are paying attention.</li>
            </ul>
          </div>


        </div>

        <div>
          <img src="/interview/afterTheInterview.svg" class="HTMAIimg" style="margin-bottom: 20px">

          <div class="HTMAItitle">
            <img src="/interview/questionEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p class="HTMAIsubtitle">Ask questions at the end</p>
          </div>
          <ul>
            <li>Click to see
              <a class="intextLink" id="longMoreRes"  href="//www.betterup.com/blog/questions-to-ask-hiring-manager" target="_blank">
                sample questions</a> to ask employers or hiring managers.
            </li>
          </ul>

          <div class="HTMAItitle">
            <img src="/interview/emailEmoji.svg" class="HTMAIemoji" style="margin-right: 0.5rem">
            <p class="HTMAIsubtitle">Send a thank you note/email within 24 hours.</p>
          </div>
          <ul>
            <li>Click to see <a class="intextLink" href="//www.themuse.com/advice/how-to-write-an-interview-thankyou-note-an-email-template"
                                target="_blank" style="color: #0467B0;">sample thank you emails</a>.</li>
          </ul>
        </div>
      </div>
      <div style="text-align: right; margin-bottom: 20px; margin-top: 50px">
        <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">See More Common Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#more-resources')">More Resources</i></p>
        <a id="moreResources"></a>
      </div>
    </div>
  </div>
<!--  <div id="body" style="border: 1px solid black;">-->
<!--  </div>-->
</template>

<script>
export default {
  name: "WhyInterview",
  mounted() {
    window.scrollTo(0, 0);
  }
}
</script>



<style scoped>
@import "../../assets/content.css";

@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
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

#HTMAIdiv{
  display: grid;
  grid-template-columns: repeat(3, 1fr);

}

.HTMAIimg{
  display: block;
  margin-bottom: 20px;
  max-width: 100%;
  height: auto;
}

.HTMAIemoji{
  vertical-align: middle;
  margin-left: 0.5rem;
  margin-right: 0.5rem;

}

.HTMAItitle{
  margin-top: 20px;
  display: flex;
  flex-direction: row;
  align-items: center;
}

.HTMAIsubtitle{
  color: #1E4460;
  font-weight: bold;
  text-align: left;
}

.moreResLink {
  color: #B27224;
  font-weight: 500;
}

.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
}

</style>