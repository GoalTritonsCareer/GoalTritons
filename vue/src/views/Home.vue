<template>
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <div class="common-layout">
    <!--    头部-->
    <el-header class="header" style="padding: 0">
      <Header/>
    </el-header>


    <!--    主体-->
    <el-container style="display: flex" class="wrapper">
      <span class="dot192"></span><span class="dot193"></span><span class="dot195"></span><span class="dot196"></span>
      <span class="dot208"></span><span class="dot210"></span><span class="dot211"></span><span class="dot212"></span>
      <span class="dot213"></span><span class="dot214"></span><span class="dot215"></span><span class="dot216"></span>
      <span class="dot220"></span><span class="dot221"></span>
      <!--      内容区域-->
      <el-main class="wrapper__body">
        <div v-if="isGoodBrowser === false" style="text-align: center; font-weight: 600; font-size: 16px; color: red; margin-top: 5vh; background-color: yellow">
          <b> For best user experience, please browse this website using a laptop or desktop! </b>
        </div>
        <div v-if="isSafari16" style="text-align: center; font-weight: 600; font-size: 16px; color: red;
        margin-top: 5vh; background-color: yellow">AVIF image format is not supported in Safari 16.1-16.3. Please use
          other browsers or update your Safari for better user expereince!</div>
        <div>

          <div>
            <h1 v-if="isGoodBrowser === true" >Your
              <span style="color: #CA8228">bright</span> and <span style="color: #CA8228">successful</span> <br>
              professional future is <br>what we strive for.
            </h1>
            <h1 v-if="isGoodBrowser === false" >Your
              <span style="color: #CA8228">bright</span> and <span style="color: #CA8228">successful</span>
              professional future is what we strive for.
            </h1>

            <div id="top">
              <p class="opening">It's the beginning of the quarter. You stop in front of Geisel, excited and eager to
                explore your future. But wait, as you look into the long, crowded Library Walk, you suddenly feel lost.
                Where should I go? Where can I find help to figure out my dream career? How should I be prepared for my
                next big challenge which hasn't been cemented? A hundred questions whirl in your head. <br>
                <br>
                But hey, we were once on the same page. As UCSD undergraduates, we have experienced the same struggles,
                asked the same questions. But, with professional help, we now found and built solutions to all your
                confusions.
              </p>
              <img id="bg" src="/home_bg.svg" alt="bg: sun, mountain, and a Triton">
<!--              <div style="position: relative; display: inline-block">-->
<!--                <span id="sun"></span>-->
<!--                <img id="mountain" src="/home/mountain.svg" alt="mountain">-->
<!--                <img id="student" src="/home/student.svg" alt="student">-->
<!--              </div>-->
            </div>
          </div>


          <div id="mid">
            <el-popover
                placement="right"
                offset="50"
                trigger="hover"
                width="432px"
            >
              <template #reference>
                <img id="calendar" src="/home/homeCalendar.svg" alt="calendar">
              </template>
              <template #default>
                <span style="font-weight: 600; color: #1e4460">UCSD Career and Networking Fairs</span>
                <Calendar />
              </template>
            </el-popover>
            <h2>Check out our calendar
              <i style="color: #5F99B6">(in the header)</i>
              to see updated career events.</h2>
          </div>

          <div id='bottom'>
            <h2>Enjoy this road map to your brand new future...</h2>

            <div class="timeline">
              <div class="one1">
                <section style="position: relative; display: inline-block">
                  <img src="/home/exploreCareer.svg" alt="frame">
                  <button style="position: absolute; top: 180px; left: 112px; z-index: 2; display: inline">
                    In Progress
                  </button>
                </section>
              </div>

              <div class="one3">
                <section style="position: relative; display: inline-block">
                  <img src="/home/startApplying.svg" alt="frame">
                  <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline">
                    In Progress
                  </button>
                </section>
              </div>

              <div class="one5">
                <section style="position: relative; display: inline-block">
                  <img src="/home/startPreparing.svg" alt="frame" >
                  <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline"
                          @click="$router.push('/interview#opening')">
                    Start Preparing
                  </button>
                </section>
              </div>

              <div class="two">
                <img src="/home/midline.svg" alt="line" style="height: 98%">
              </div>

              <div class="three2">
                <section style="position: relative; display: inline-block">
                  <img src="/home/startNetworking.svg" alt="frame">
                  <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline"
                          @click="$router.push('/Networking#NetworkingTop')">
                    Start Networking
                  </button>
                </section>

              </div>
              <div class="three4">
                <section style="position: relative; display: inline-block">
                  <img src="/home/startWriting.svg" alt="frame" >
                  <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline"
                          @click="$router.push('/resume#resumeTop')">
                    Start Writing
                  </button>
                </section>
              </div>
            </div>
          </div>
        </div>
      </el-main>
      <el-footer class="footer home-footer">
        <Footer/>
      </el-footer>
    </el-container>
  </div>
</template>

<script lang="ts">
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import Calendar from "../views/Calendar.vue";

export default {
  name: "Home",
  components: {
    Footer,
    Header,
    Calendar
  },
  computed: {
    isSafari16() {
      const ua = navigator.userAgent
      const isSafari = ua.indexOf('Safari') !== -1 && ua.indexOf('Chrome') === -1
      const versionMatch = ua.match(/Version\/(\d+\.\d+)/)
      const version = versionMatch ? parseFloat(versionMatch[1]) : 0
      if (isSafari && version >= 16.1 && version <= 16.3) {
        return true
      }
      return false
    }
  },
  data() {
    return {
      isGoodBrowser: false,
    }
  },
  methods: {
    handleOpen (key: string, keyPath: string[]) {
      console.log(key, keyPath)
    },
    handleClose (key: string, keyPath: string[]) {
      console.log(key, keyPath)
    },
    checkBrowser() {
      console.log(navigator.userAgent);
      if (/Android|webOS|iPhone|iPad|BlackBerry/i.test(navigator.userAgent)) {
        return false;
      } else return !/micromessenger/.test(navigator.userAgent.toLocaleLowerCase());
    }
  },
  mounted() {
    this.isGoodBrowser = this.checkBrowser();
    console.log("Using a desktop or laptop: ", this.isGoodBrowser);
  }
}
</script>

<style scoped>
/*@media (min-width: 992px) and (max-width: 1279px) {*/
/*  .wrapper__body {*/
/*    width: 70vw;*/
/*  }*/
/*  .footer {*/
/*    width: 100%;*/
/*  }*/
/*}*/
@font-face { font-family: work-sans-semi;
  src: url('/WorkSans/WorkSans-Semibold.woff');
}
.header {
  position: fixed;
  z-index: 20;
}
button {
  font-style: normal;
  font-weight: 600;
  font-size: 14px;
  width: 166px;
  height: 40px;
  border-radius: 0.5rem;
  padding: 0.5rem 1rem;
  background-color: #1E4460;
  border: hidden;
  margin-top: 50px;
  color: white;
  box-shadow: 0 4px 4px rgb(30 68 96 / 0.25);
}
button:hover {
  background-color: #F4CE71;
  color: darkblue;
  border: hidden;
}
.footer {
  z-index: 2;
  border-top: 1px solid #ccc;
}

h1{
  font-family: work-sans-semi;
  font-style: normal;
  font-weight: 700;

  font-size: 50px;
  color: #1E4460;
  margin-top: 18vh;
  line-height: 116%;

}
h2 {
  font-family: work-sans-semi;
  font-size: 34px;
  /*font-weight: 800;*/
  line-height: 141%;
  color: #1e4460;
}
#top {
  display: flex;
  flex-direction: row;
}
#mid {
  display: flex;
  flex-direction: row;
  margin-top: 180px;
  /*margin-left: 14rem;*/
  margin-left: calc((100vw - 976px) / 2);
  z-index: 3;
}
#mid h2 {
  margin-left: 9rem;
  width: 35%;
  margin-top: 5rem;
}
#bottom {
  margin-top: 12%;
}
#bottom h2 {
  /*margin-left: 14rem;*/
  margin-left: calc((100vw - 1000px) / 2);
}
#bg {
  margin: -45px 0 0 10px;
  width: 45%
}
#calendar {
  width: 35%;
}
.dot192 {
  position: absolute;
  width: 264px;
  height: 237px;
  left: 27px;
  top: 90px;
  z-index: -1;
  background: rgba(244, 206, 113, 0.45);
  filter: blur(150px);
}
.dot193 {
  position: absolute;
  width: 106px;
  height: 85px;
  left: 857px;
  top: 380px;
  z-index: -1;
  background: #F4CE71;
  filter: blur(150px);
}
.dot195 {
  position: absolute;
  width: 588px;
  height: 400px;
  left: 1290px;
  top: 1486px;
  z-index: -1;
  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot196 {
  position: absolute;
  width: 264px;
  height: 237px;
  left: -192px;
  top: 743px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.35);
  filter: blur(150px);
}
.dot208 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 58px;
  top: 1394px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.15);
  filter: blur(150px);
}
.dot210 {
  position: absolute;
  width: 412px;
  height: 281px;
  left: 900px;
  top: 923px;
  z-index: -1;
  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot211 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 1208px;
  top: 666px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.15);
  filter: blur(150px);
}
.dot212 {
  position: absolute;
  width: 438px;
  height: 369px;
  left: -165px;
  top: 3694px;
  z-index: -1;
  background: rgba(244, 206, 113, 0.4);
  filter: blur(150px);
}
.dot213 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 750px;
  top: 1805px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.2);
  filter: blur(150px);
}
.dot214 {
  position: absolute;
  width: 261px;
  height: 237px;
  left: 382px;
  top: 1138px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.35);
  filter: blur(150px);
}
.dot215 {
  position: absolute;
  width: 617px;
  height: 466px;
  left: 480px;
  top: 2117px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.1);
  filter: blur(150px);
}
.dot216 {
  position: absolute;
  width: 296px;
  height: 223px;
  left: 477px;
  top: 613px;
  z-index: -1;
  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot220 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 742px;
  top: 425px;
  z-index: -1;
  background: rgba(95, 153, 182, 0.2);
  filter: blur(150px);
}
.dot221 {
  position: absolute;
  width: 126px;
  height: 95px;
  left: 800px;
  top: 430px;
  z-index: -1;
  background: #F4CE71;
  filter: blur(150px);
}
/*#mountain {*/
/*  width: 95%;*/
/*  margin-top: -40px;*/
/*}*/
/*#sun {*/
/*  position: absolute;*/
/*  width: 60px;*/
/*  height: 60px;*/
/*  left: 100px;*/
/*  top: -32px;*/
/*  transition: 2s;*/
/*  background:*/
/*      radial-gradient(48.01% 48.01% at 49.46% 51.99%, #F4CE71 20%, rgba(244, 206, 113, 0) 100%, rgba(244, 206, 113, 0) 100%),*/
/*      radial-gradient(48.01% 48.01% at 49.46% 51.99%, #F8CE67 20%, rgba(244, 206, 113, 0) 100%, rgba(244, 206, 113, 0) 100%);*/
/*}*/
/*#sun:hover {*/
/*  filter: brightness(112%);*/
/*  left: 85px;*/
/*  top: -47px;*/
/*  width: 90px;*/
/*  height: 90px;*/
/*}*/
.opening {
  font-size: 16px;
  font-weight: 400;
  line-height: 141%;
  margin-top: 62px;
}
.wrapper {
  position: relative;
  overflow-x: hidden;
}
.wrapper__body {
  flex: 1;
  position: relative;
  overflow-y: clip;
  padding-top: 6.3%;
  padding-bottom: 15%;
  /*margin-bottom: 12%;*/
  z-index: 2;
}
/*#student {*/
/*  position: absolute;*/
/*  top: 100px;*/
/*  left: 280px;*/
/*  z-index: 1;*/
/*  border: 100px;*/
/*  display: inline;*/
/*  width: 200px;*/
/*  !*transition: 4s;*!*/
/*}*/
.timeline {
  margin-left: calc((100vw - 988px) / 2);
  margin-top: 7%;
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 0;
  height: min-content;
  width: min-content;
}
.one1 {
  grid-column: 1;
  grid-row: 1;
  text-align: right;
  height: min-content;
}
.one3 {
  grid-column: 1;
  grid-row: 3;
  text-align: right;
  margin-top: -60px;
  padding-top: 18px;
  height: min-content;
}
.one5 {
  grid-column: 1;
  grid-row: 5;
  height: min-content;
  margin-top: -52px;
}
.two {
  grid-column: 2;
  grid-row: 1/6;
  padding-top: 122px;
  margin-left: -2px;
  margin-right: -25px;
}
.three2 {
  grid-column: 3;
  grid-row: 2;
  margin-top: -60px;
  height: min-content;
  padding-top: 18px;
}
.three4 {
  grid-column: 3;
  grid-row: 4;
  height: min-content;
  margin-top: -60px;
}

/* 大屏幕 ( > 13 in. ) */
@media (min-width: 1440px) {
  .header {
    width: 1440px !important;
    margin-left: calc((100vw - 1440px)/2) !important;
  }
  .footer {
    width: 1440px !important;
    margin-left: calc((100vw - 1440px)/2) !important;
  }
  h1 {
    margin-left: calc((100vw - 988px) / 2);
  }
  #top {
    margin-left: calc((100vw - 988px) / 2);
  }
  .opening {
    width: 55ch;
  }
}
/* 多数电脑 ( 11 in. ≤ size ≤ 13 in. ) */
@media (min-width: 1280px) and (max-width: 1439px) {
  .footer {
    width: 100%;
  }
  h1 {
    margin-left: calc((100vw - 988px) / 2);
  }
  #top {
    margin-left: calc((100vw - 988px) / 2);
  }
  .opening {
    width: 55ch;
  }
}
/* 小电脑及大Pad */
@media (min-width: 992px) and (max-width: 1279px) {
  .footer {
    width: 100%;
  }
  .wrapper__body {
    width: 90vw;
    margin: auto;
    overflow-x: scroll;
  }
  .opening {
    width: 50ch;
  }
}
@media (min-width: 480px) and (max-width: 991px) {
  h1 {
    margin-left: 1rem;
    font-size: 40px !important;
  }
  .footer {
    width: 100%;
  }
  .opening {
    width: 70ch;
  }
  #top {
    flex-direction: column !important;
    margin: 0 1rem
  }
  #bg {
    margin-top: 2rem !important;
    width: 80% !important;
  }

}
@media (max-width: 479px) {
  h1 {
    font-size: 35px !important;
  }
  h2 {
    width: 95% !important;
    margin-left: 0 !important;
  }
  .opening {
    max-width: 80%;
  }
  #top, #mid{
    flex-direction: column;
    margin: 0 1rem !important;
  }
  #mid {
    margin-top: 180px;
  }
  template > img {
    width: 95%;
    margin-left: 10px;
  }
  #bg {
    margin-top: 5%;
    width: 90%;
  }
  #calendar {
    width: 95% !important;
    margin-top: 20%;
  }
  #bottom {
    margin-top: 25%;
  }
  .footer {
    width: 100%;
  }
  .timeline {
    grid-template-columns: 1fr !important;
    margin-left: 0;
  }
  .two {
    margin-left: -17.5rem;
    z-index: -1;
  }
  .one1 {
    grid-column: 1;
    grid-row: 1;
    text-align: right;
    height: min-content;
  }
  .one3 {
    grid-column: 1;
    grid-row: 3;
    text-align: right;
    margin-top: -60px;
    padding-top: 18px;
    height: min-content;
  }
  .one5 {
    grid-column: 1;
    grid-row: 5;
    height: min-content;
    margin-top: -52px;
  }
  /*.two {*/
  /*  grid-column: 2;*/
  /*  grid-row: 1/6;*/
  /*  padding-top: 122px;*/
  /*  margin-left: -2px;*/
  /*  margin-right: -25px;*/
  /*}*/
  .three2 {
    grid-column: 1;
    grid-row: 2;
    margin-top: -60px;
    height: min-content;
    padding-top: 18px;
  }
  .three4 {
    grid-column: 1;
    grid-row: 4;
    height: min-content;
    margin-top: -60px;
  }
}
</style>