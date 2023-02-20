<template>
  <div id="NetworkingTop">

      <h1>Networking</h1>

      <p class="normal">“New Survey Reveals 85% of All Jobs are Filled Via Networking”</p>


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

<script>
export default {
  name: "EverydayRoutine",
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
.intextLink {
  color: #0467B0;
  text-decoration: none;
  font-weight: 500;
}
.intextLink:hover {
  text-decoration: underline;
  font-weight: 600;
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


</style>