<template>
  <div id="interviewSteps">
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
</template>


<script setup>

</script>

<script>
export default {
  name: "InterviewSteps"
}
</script>

<style scoped lang="less">
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

.intextLink {
  color: #0467B0;
  text-decoration: none;
  font-weight: 500;
}

.intextLink:hover {
  text-decoration: underline;
  font-weight: 600;
}
</style>