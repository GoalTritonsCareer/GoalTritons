<template>
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


    <a id="DefineYourself"></a>
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


    <a id="BehavioralQuestions"></a>
    <div>
      <h3>Behavioral Questions</h3>
      <p id="BQp">Behavioral questions help the company to learn about how you would <strong>behave</strong> and <strong>deal with tough situations</strong> in
        the real workplace so that they can anticipate your performance. These are usually about <strong>soft skills</strong>
        (<em>e.g. leadership</em>) and <strong>personal attributes</strong> (<em>e.g. persistency</em>).</p>

      <img src="/interview/behaviorQuetion.svg" style="margin-bottom: 50px; width: 50vw">

      <div style="text-align: right; margin-bottom: 82px">
        <p style="display: inline; "><i style="color: #1E4460; font-weight: 500">See More Behavioral Sample Q&A under</i> <i class="moreResLink" @click="$router.push('/interview#moreResources')">More Resources</i></p>
        <a id="TechnicalQuestions"></a>
      </div>
    </div>


    <a id="TechnicalQuestions"></a>
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
</template>

<script setup>

</script>

<script>
export default {
  name: "InterviewQuestions"
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