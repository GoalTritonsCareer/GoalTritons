<template>
  <div id="NetworkingTop">
    <h1>Networking</h1>

    <p class="normal">“New Survey Reveals 85% of All Jobs are Filled Via Networking”</p>

    <a id="onlinePlatform"></a>
    <h2>Why Networking?</h2>

    <div>
      <img class="whyNetworkingImg" src="/networking/whyNetworking.svg" alt="Why Networking">
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
          <i>See More Qs to Ask through Info Interview under</i> <i class="moreResLink" @click="$router.push('/networking#moreResources')">More Resources</i>
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
          <i>See</i> <i class="moreResLink" @click="$router.push('/networking/MaintainNetwork')">How to Maintain Networks</i>
          <a id="networkOnCampus"></a>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "NetworkingOnline",
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

</style>