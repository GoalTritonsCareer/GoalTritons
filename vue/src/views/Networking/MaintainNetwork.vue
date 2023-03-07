<template>
  <div id="NetworkingTop">

    <h1>Networking</h1>
    <p class="normal">“New Survey Reveals 85% of All Jobs are Filled Via Networking”</p>

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
  name: "MaintainNetwork",
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

</style>