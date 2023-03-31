<template>
  <div id="NetworkingTop">
    <div id="heading" style="position: relative">
      <section class="title">
        <h3 class="back" >&lt; <span @click="$router.push('/networking#home')" style="text-decoration: underline; cursor: pointer">Networking</span></h3>
        <h1>How to Network Online?</h1>
      </section>
      <img src="/networking/htnoBG.avif" alt="networking background" style="width: 100%" >
    </div>

    <div id="body">
      <h4 style="margin-top: 5vh;">Send an Outreach Email</h4>
      <section id="outreach_mail">
            <p class="email" style="background-size: 100% 8%">
              <span id="c1" class="circle">1</span>
              <span id="a1" class="annotation al">1. Brief/unique self-intro</span>
              <span id="l1" class="line line_1s"></span>
              <span id="c2" class="circle">2</span>
              <span id="a2" class="annotation ar">2. How you found them</span>
              <span id="l2" class="line line_2s line_992_1s"></span>
              <span id="c3" class="circle">3</span>
              <span id="a3" class="annotation al">3. What about them impresses you</span>
              <span id="l3" class="line line_2s line_992_1s"></span>
              <span id="c4" class="circle">4</span>
              <span id="a4" class="annotation ar">4. Specify what you want</span>
              <span id="l4" class="line line_2s"></span>
              <span id="c5" class="circle">5</span>
              <span id="a5" class="annotation al">5. *Link to your bio</span>
              <span id="l5" class="line line_1s"></span>
              <span style="color: #1e4460; font-weight: 500">Nice to Meet You, Steven!</span><br><br>
              Hi Steven,<br><br>

              My name is Amy Chen, and I am a junior undergraduate student majoring in Management Science at UC San Diego
              who aspires to be an HR professional. I found your profile on LinkedIn and followed the link to your
              personal website. Your extensive knowledge in human resources truly inspires me; I am especially impressed
              by your published article on insights about customer service, recruitment, and training. Would you be
              interested in a 20-minute chat with me? I will be glad to learn more about your history, experience, and
              professional insights.<br>
              Attached is my personal website for more information about me.<br><br>

              Please let me know if you are open to a chat & your availability. Thank you!<br><br>

              Best wishes,<br>
              Amy Chen,<br>
              510-223-5555<br>
              ch9amy@ucsd.edu<br>
            </p>

      </section>

      <section>
        <h4>Conduct Informational Interview</h4>
        <p class="middleP">Informational interview allows you to learn more deeply about career-related topics, such
          as career path, industry, or a specific firm, by <span class="medium">speaking directly</span> with an
          experienced individual who has <span class="medium">expertise and knowledge in your desired field</span>.
        </p>
        <img src="/networking/howToNetworkOnlineS21.svg" alt="sampleQs" style="margin-bottom: 3%; width: 80%" loading="lazy"><br>
        <p style="text-align: right; padding-right: 8%; font-style: italic">See More Qs to Ask through Info Interview under
          <span class="moreResLink" @click="$router.push('/networking#more-resources')">More Resources</span></p>
      </section>

      <section>
        <h4>Follow-up with a Thank-you Note</h4>
        <p class="middleP">You just had a terrific interview—the person was pleased to meet you, answered all your
          questions, and learned about you as a person. Now send a thank-you message to <span class="medium">
            appreciate them for meeting with you</span> and to <span class="medium">leave a strong & positive
            impression</span> so they'll consider you <span class="medium">when future opportunities arise</span>.
          You can also recap your abilities and expertise or share your highlighted work in this follow-up letter.</p>
        <p class="email" style="background-size: 100% 10%">
          <span style="color: #1e4460; font-weight: 500">Pleasure chatting with you, Steven !</span><br><br>
          Hi Steven,<br><br>

          I'm writing this email to express my gratitude for taking the time to speak with me today. I appreciate your
          patience and eagerness to answer all of my questions and share insights on xxx. I particularly appreciate
          your advice on xxx.<br><br>

          I've attached some files as a summary of what I shared with you during the meeting. I will certainly follow
          your recommendations to xxx. I look forward to connecting with you again!<br><br>

          Best wishes,<br>
          Amy Chen,<br>
          510-223-5555<br>
          ch9amy@ucsd.edu<br>
        </p>
      </section>

      <section>
        <h4>Stay in Contact</h4>
        <p class="middleP">If you don't keep in touch with the person you asked for help online, you may lose this
          connection. Therefore, it is critical to maintain contact in order to forge a stable relationship that can
          <span class="medium">lead to more opportunities</span>.</p>
        <p id="reminder">
          <span class="medium" style="color: #1e4460">Reminder:</span> each time you follow up, think about how you
          can possibly help this person. <span>Try to avoid a one-sided relationship</span>.</p>
        <p style="text-align: right; padding: 3% 8% 0 0; font-style: italic">See
          <span class="moreResLink" @click="$router.push('/networking/MaintainNetwork')">How to Maintain Networks</span></p>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: "NetworkOnline",
  mounted() {
    window.scrollTo(0, 0);
  },
}
</script>



<style scoped>
@import "../../assets/content.css";

@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
h4 {
  font-family: work-sans, serif;
  text-align: left;
  font-weight: 700;
  line-height: 141%;
  font-size: 24px;
  padding: 3% 0;
}
.middleP{
  font-size: 15px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  width: 75%;
  margin: auto;
  padding-bottom: 4%;
  max-width: 900px;
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
.HTNWFsubdiv p{
  display: inline-block;
  margin-left: 0.5rem;
}
#outreach_mail {
  position: relative;
}
#reminder {
  padding: 10px 20px;
  border-radius: 20px;
  border: 3px solid #D9EAEF;
  width: 50%;
  margin: auto
}
.email {
  text-align: left;
  background-image: linear-gradient(#d9eaef, #d9eaef), linear-gradient(white, white);
  background-position: top left, bottom left;
  background-repeat: no-repeat;
  border-radius: 20px;
  width: 515.4px;
  margin: 0.5% auto 1% auto;
  padding: 10px 2rem 2rem 2rem;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  position: relative;
}

@keyframes shine {
  0% {
    transform: scale(1);
    opacity: 1;
    filter: brightness(120%);
  }
  50% {
    transform: scale(1.2);
    opacity: 0.75;
    filter: brightness(100%);
  }
  100% {
    transform: scale(1);
    opacity: 1;
    filter: brightness(120%);
  }
}
@keyframes draw {
  0% {
    width: 0;
  }
  100% {
    width: var(--line-length);
  }
}
.circle {
  position: absolute;
  transform: translate(-50%, -50%);
  width: 15px;
  height: 15px;
  border-radius: 50%;
  background-color: rgba(226, 152, 58, 0.27);
  color: #b27224;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 12px;
  animation: shine 1s ease-in-out infinite;
}
.circle:hover {
  animation-play-state: paused;
}
.circle:hover + .al {
  margin-left: 10px;
  filter: brightness(108%);
}
.circle:hover + .ar {
  margin-left: -10px;
  filter: brightness(108%);
}
.circle:hover + .annotation + .line_1s {
  animation: draw 1s infinite;
}
.circle:hover + .annotation + .line_2s {
  animation: draw 2s infinite;
}
.annotation {
  position: absolute;
  transform: translate(-100%, -50%);
  display: block;
  padding: 5px 12px;
  background: #F4CE71;
  border-radius: 20px;
  font-weight: 600;
  transition: ease-in-out 0.3s;
}
.line {
  position: absolute;
  height: 3px;
  width: 0;
  border-top: 3px dashed rgba(226, 152, 58, 0.27);
}
#a1, #a3, #a5 {
  text-align: right;
  transform-origin: right;
}
#c1 {
  top: 92px;
  left: 21px;
}
#a1 {
  top: 95px;
  left: -30px;
  width: 127px;
}
#l1 {
  top: 98px;
  right: 498px;
  --line-length: 38px
}
#c2 {
  top: 132px;
  left: 181px;
}
#a2 {
  top: 140px;
  left: 648px;
  width: 108px;
}
#l2 {
  top: 140px;
  left: 198px;
  --line-length: 330px;
}
#c3 {
  top: 152px;
  left: 310px;
}
#a3 {
  top: 160px;
  left: -30px;
  width: 166px;
}
#l3 {
  top: 158px;
  right: 208px;
  --line-length: 328px;
}
#c4 {
  top: 215px;
  left: 257px;
}
#a4 {
  top: 225px;
  left: 669px;
  width: 128px;
}
#l4 {
  top: 222px;
  left: 275px;
  --line-length: 255px;
}
#c5 {
  top: 280px;
  left: 21px;
}
#a5 {
  top: 286px;
  left: -30px;
}
#l5 {
  top: 287px;
  right: 498px;
  --line-length: 38px
}
@media (max-width: 1279px) {
  #outreach_mail {
    overflow: scroll;
    padding-left: calc(100vw - 460px - 280px - 100vw * 0.16) ;
  }
  #reminder {
    width: 65%;
  }
  .email {
    width: 460px;
  }
  #l1 {
    top: 98px;
    right: 442px;
  }
  #c2 {
    top: 132px;
    left: 326px;
  }
  #a2 {
    left: 610px;
  }
  #l2 {
    top: 140px;
    left: 345px;
    --line-length: 145px;
  }
  #c3 {
    top: 175px;
    left: 82px;
  }
  #a3 {
    top: 181px;
    left: -30px;
    width: 138px;
  }
  #l3 {
    top: 182px;
    right: 380px;
    --line-length: 100px;
  }
  #c4 {
    top: 238px;
    left: 200px;
  }
  #a4 {
    top: 245px;
    left: 603px;
    width: 100px;
  }
  #l4 {
    top: 244px;
    left: 218px;
    --line-length: 270px;
  }
  #c5 {
    top: 304px;
  }
  #a5 {
    top: 310px;
    left: -30px;
    width: 100px;
  }
  #l5 {
    top: 310px;
    right: 440px;
  }
  .circle:hover + .annotation + .line_992_1s {
    animation: draw 1s infinite;
  }
  #body {
    overflow: hidden;
  }
}
</style>