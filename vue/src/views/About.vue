<template>
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <div class="common-layout">
    <!--    头部-->
    <el-header class="header" style="padding: 0">
      <Header/>
    </el-header>

    <el-container style="display: flex" class="wrapper">
      <span class="dot192"></span><span class="dot193"></span><span class="dot195"></span><span class="dot196"></span>
      <span class="dot208"></span><span class="dot210"></span><span class="dot211"></span>
      <span class="dot213"></span><span class="dot214"></span><span class="dot215"></span><span class="dot216"></span>
      <span class="dot220"></span><span class="dot221"></span>
      <el-main class="wrapper__body" style="padding: 0">
        <div class="hero">
          <div id="group-div">
            <img src="/about/group_photo1.jpg" alt="group photo" style="width: 100%; height: 100%">
            <div style="position: absolute; top: 80%; left: 50%; transform: translate(-50%, -80%); text-align: center; z-index: 5">
              <h1 style="color: white;">About Goal Tritons</h1>
            </div>
            <span style="position: absolute; top: 0; left: 0; width: 100%; height: 100%; background-color: rgba(0, 0, 0, 0.5)"></span>
          </div>
        </div>

        <div class="header-intro">
          <h3> Welcome to Goal Tritons, a non-profit B2C product designed specifically for UCSD Undergraduates,
            including F-1 International Students, on their journey towards finding fulfilling careers. Our mission is
            to empower UCSD Tritons by offering a seamless platform to navigate their professional development and
            achieve their career aspirations with confidence. Join us as we help you unlock your potential and conquer
            your career goals.
          </h3>
        </div>

        <h2 style="text-align: center; font-size: 28px">Team Leaders</h2>
        <section class="team">
          <div class="team-member">
            <div class="member-photo">
              <img src="/about/will.png" alt="Will Wen Avatar" style="width: 100%">
            </div>
            <div class="member-info">
              <h2>Tech Lead</h2>
              <h3>Will Wen</h3>
              <p>Class of '23 - Computer Science and <br> Applied Math Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/about/esther.jpg" alt="Esther Jiang Avatar" style="width: 100%; transform: translate(0, -30px);">
            </div>
            <div class="member-info">
              <h2>Product Manager</h2>
              <h3>Esther Jiang</h3>
              <p>Class of '25 - CogSci Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/about/cindy.jpg" alt="Cindy Chang Avatar" style="width: 100%">
            </div>
            <div class="member-info">
              <h2>Design Lead</h2>
              <h3>Cindy Chang</h3>
              <p>Class of '23 - Communication and <br> CogSci Major</p>
            </div>
          </div>
        </section>

        <h2 style="text-align: center; font-size: 28px">Team Members</h2>
        <section class="team">
          <div class="team-member">
            <div class="member-photo">
              <img src="/about/garen.jpg" alt="Garen Liu Avatar" style="width: 100%">
            </div>
            <div class="member-info">
              <h3>Garen Liu</h3>
              <p>Frontend Developer</p>
              <p>Class of '23 - Computer Science Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/about/jules.png" alt="Jules Wang Avatar" style="width: 100%">
            </div>
            <div class="member-info">
              <h3>Jules Wang</h3>
              <p>Backend Developer</p>
              <p>Class of '23 - Computer Science Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Tyler Yu</h3>
              <p>Backend Developer</p>
              <p>Class of '23 - Computer Science and <br> Mathematics Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Buwei Wu</h3>
              <p>Frontend Developer</p>
              <p>Class of '24 - Computer Engineer Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Hantian Lin</h3>
              <p>Backend Developer</p>
              <p>Class of '25 - Computer Science Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Zhiyuan Chen</h3>
              <p>UX Researcher</p>
              <p>Class of '23 - CogSci and Psychology Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Marmot Bao</h3>
              <p>UI/UX Designer</p>
              <p>Class of '23 - CogSci Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Grace Rao</h3>
              <p>UI/UX Designer</p>
              <p>Class of '23 - CogSci Major</p>
            </div>
          </div>

          <div class="team-member">
            <div class="member-photo">
              <img src="/logo.svg" alt="Goal Tritons Avatar" style="width: 105%; transform: translate(0, -12px)">
            </div>
            <div class="member-info">
              <h3>Kida Huang</h3>
              <p>UI Developer</p>
              <p>Class of '23 - CogSci Major</p>
            </div>
          </div>

        </section>

        <section class="discussions">
          <h2 style="text-align: center; color: #1E4460; font-size: 24px; margin-bottom: 20px;">Group Discussions</h2>
          <el-carousel :interval="4000" type="card" height="360px" :direction="carousel_dir">
            <el-carousel-item style="display: flex; align-items: center; justify-content: center;">
              <picture>
                <source srcset="/about/di_photo1.avif" type="image/avif">
                <source srcset="/about/di_photo1.jpg" type="image/jpg">
                <img class="di_photo" src="/about/di_photo1.jpg" alt="Group Meeting Photo" loading="lazy">
              </picture>
            </el-carousel-item>
            <el-carousel-item style="display: flex; align-items: center; justify-content: center;">
              <picture>
                <source srcset="/about/di_photo2.avif" type="image/avif">
                <source srcset="/about/di_photo2.jpg" type="image/jpg">
                <img class="di_photo" src="/about/di_photo2.jpg" alt="Group Meeting Photo" loading="lazy">
              </picture>
            </el-carousel-item>
            <el-carousel-item style="display: flex; align-items: center; justify-content: center;">
              <picture>
                <source srcset="/about/di_photo3.avif" type="image/avif">
                <source srcset="/about/di_photo3.jpg" type="image/jpg">
                <img class="di_photo" src="/about/di_photo3.jpg" alt="Group Meeting Photo" loading="lazy">
              </picture>
            </el-carousel-item>
            <el-carousel-item style="display: flex; align-items: center; justify-content: center;">
              <picture>
                <source srcset="/about/di_photo4.avif" type="image/avif">
                <source srcset="/about/di_photo4.jpg" type="image/jpg">
                <img class="di_photo" src="/about/di_photo4.jpg" alt="Group Meeting Photo" loading="lazy">
              </picture>
            </el-carousel-item>
          </el-carousel>
        </section>
      </el-main>

      <el-footer class="footer home-footer">
        <Footer/>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";

export default {
  name: "About",
  components: {
    Footer,
    Header,
  },
  data() {
    return {
      carousel_dir: 'horizontal'
    }
  },
  mounted() {
    window.addEventListener('resize', this.handleResize);
    this.checkScreenSize();
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.handleResize);
  },
  methods: {
    handleResize() {
      this.checkScreenSize();
    },
    checkScreenSize() {
      const screenWidth = window.innerWidth;
      this.carousel_dir = screenWidth < 480 ? 'vertical' : 'horizontal';
    },
  },
}
</script>

<style scoped>
@import "../assets/main.css";
@font-face { font-family: work-sans-semi;
  src: url('/WorkSans/WorkSans-Semibold.woff');
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
.wrapper__body section {
  margin: 3rem 4rem
}
.footer {
  z-index: 2;
  border-top: 1px solid #ccc;
}
#group-div {
  width: 100%;
  height: 45vh;
  max-height: 375px;
  margin: auto;
  position: relative;
}
.hero h1 {
  font-size: 48px;
  text-shadow: 0px 10px 4px rgba(0, 0, 0, 0.25);
  margin-bottom: 20px;
}
.header-intro {
  margin: 40px auto;
  max-width: 75vw;
}
.header-intro h3 {
  font-weight: 500;
  line-height: 1.3;
  font-family: work-sans-semi, serif;
}

.team {
  margin-top: 50px;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
}
.team h2 {
  color: #FFC740;
  font-size: 24px;
  margin-bottom: 20px;
}

.team-member {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-bottom: 30px;
  width: 26%;
  text-align: center;
}

.member-photo {
  overflow: hidden;
  width: 120px;
  height: 120px;
  margin-bottom: 15px;
  background-color: #FFC740;
  border-radius: 50%;
}

.member-info h3 {
  font-size: 18px;
  margin-bottom: 10px;
}
.member-info h2 {
  margin-bottom: 5px;
}

.discussions {
  margin-top: 50px;
}

.el-carousel__item h3 {
  display: flex;
  color: #475669;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
}

.di_photo {
  width: 100%;
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
@media (min-width: 1440px) {
  .header {
    width: 1440px !important;
    margin-left: calc((100vw - 1440px)/2) !important;
  }
  .wrapper__body {
    width: 1440px;
    margin-left: calc((100vw - 1440px)/2);
  }
  .footer {
    width: 1440px !important;
    margin-left: calc((100vw - 1440px)/2) !important;
  }
}
@media (max-width: 480px) {
  #group-div {
    height: 28vh;
    max-height: 275px;
    overflow-x: hidden;
  }

  img[src="/about/group_photo1.jpg"] {
    width: 130% !important;
    transform: translate(-15%, 0);
  }

  .team {
    flex-direction: column;
    margin: 2rem;
  }
  .team-member {
    width: 100%;
    flex-direction: row;
  }
  .member-info {
    width: 60%;
    margin: auto;
  }
  .member-photo {
    width: 100px;
    height: 100px;
  }
  .el-carousel__item {
    width: 100%;
  }

  .footer {
    width: 95%;
    margin: auto;
  }

}
</style>