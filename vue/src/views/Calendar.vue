<template>
  <div>
    <div style="width:405px; height: 450px">
      <el-calendar>
        <template #dateCell="{ data }">
          <p :class="data.isSelected ? 'is-selected' : ''" :style="hasEvent(data.day)">
            {{ data.day.split('-').slice(2).join('-') }}
          </p>
          <el-tooltip
              class="box-item"
              effect="dark"
              :content="findTitle(data.day)"
          >
            <el-link :href="findUrl(data.day)" target="_blank" style="font-size: 10px">
              {{ careerFieldMsg(data.day) }}
            </el-link>
          </el-tooltip>
        </template>
      </el-calendar>
    </div>
  </div>
</template>

<script>
import json from '../../career-fairs.json'
import json2 from '../../Holidays.json'
export default {
  name: "Calendar",
  data() {
    return {
      info: json,json2
    }
  },
  methods: {
    // a computed getter
    hasEvent(day) {
      for (let i = 0; i < json.length; i++) {
        if (json[i]["date"] == day) {
          return "color: red"
        }
      }
      for (let i = 0; i < json2.length; i++) {

        if(json2[i]["date"]==day){
          return "color: red"
        }

      }
    },
    careerFieldMsg(day) {
      // `this` points to the component instance
      for (let i = 0; i < json.length; i++) {
        if (json[i]["date"] == day) {
          if (json[i]["type"] == "Career") {

            return "Career";
          } else if (json[i]["type"]  == "EDU") {
            return "Academic";
          }
        }
      }

      for (let i = 0; i < json2.length; i++) {

        if(json2[i]["date"]==day){
          return "Holiday";
        }

      }
      return ""
    },
    findUrl(day) {
      for (let i = 0; i < json.length; i++) {

    //    if(json[i]["type"]=="EDU"){
     //     return ""
     //   }

        if (json[i]["date"] == day) {
          if(json[i]["type"]=="Career"){
            return json[i]["link"]
          }
        }

      }
    },
    findTitle(day) {
      for (let i = 0; i < json.length; i++) {
        if (json[i]["date"] == day) {
          return json[i]["title"]
        }

      }
      for (let i = 0; i < json2.length; i++) {

        if(json2[i]["date"]==day){
          return json2[i]["title"]
        }

      }
    }
  }
}
</script>

<style scoped>
</style>
