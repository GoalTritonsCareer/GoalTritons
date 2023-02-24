<template>
  <div>
    <div id="heading" style="position: relative;">
      <section class="title" style="z-index: 10">
        <h3 class="back" >&lt; <span @click="$router.push('/interview')" style="text-decoration: underline; cursor: pointer">Interview</span></h3>
        <h1>Interview Steps</h1>
      </section>
      <div class="cover">
        <img src="/interview/InterviewStepsCover.svg" alt="Cover" style="opacity: 75%; width: 100%;">
      </div>
      <img class="bg" src="/interview/InterviewStepsTop.svg" alt="interview background" style="width: 100%">
    </div>

    <div id="body" style="margin-top: 9.5vh;">
      <div id="ITdiv">
        <div>
          <p id="ITstep1" style="font-weight: 650">Step 1</p>
          <p style="font-weight: 650;margin-top: 5px; margin-bottom: 5px">Initial Screening</p>
          <img class="ITimg" src="/interview/initialScreening.png">



        </div>

        <div>
          <p id="ITstep2" style="font-weight: 650">Step 2</p>
          <p style="font-weight: 650;margin-top: 5px; margin-bottom: 5px">Official Interview</p>
          <img class="ITimg" src="/interview/officialInterview.png" alt="official Interview Process">


        </div>


        <div>
          <p id="ITstep3" style="font-weight: 650">Step 3</p>
          <p style="font-weight: 650;margin-top: 5px; margin-bottom: 5px">Final Decision</p>
          <img class="ITimg" src="/interview/finalDecision.png">

        </div>
      </div>
      <img id="ITSimg" style="margin-top:9.5vh;" src="/interview/interviewSteps.svg">


    </div>
  </div>
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

#ITstep1{
  background-color: #F8EFDA;
  border-radius: 10px;
  margin: auto;
  width: 5rem;
}

.ITimg{
  width: 7vw;
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

#ITSimg {
  max-width: 100%
}

</style>