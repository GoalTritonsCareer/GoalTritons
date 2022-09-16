<template>
  <div>
<!--    <div style="width:400px; height: 420px">-->
<!--      <el-calendar>-->
<!--        <template #dateCell="{ data }">-->
<!--          <p :class="data.isSelected ? 'is-selected' : ''" :style="hasEvent(data.day)">-->
<!--            {{ data.day.split('-').slice(2).join('-') }}-->
<!--          </p>-->
<!--          <el-tooltip-->
<!--              class="box-item"-->
<!--              effect="dark"-->
<!--              :content="findTitle(data.day)"-->
<!--          >-->
<!--            <el-link :href="findUrl(data.day)" target="_blank" style="font-size: 12px">-->
<!--              {{ careerFieldMsg(data.day) }}-->
<!--            </el-link>-->
<!--          </el-tooltip>-->
<!--        </template>-->
<!--      </el-calendar>-->
<!--    </div>-->
    <h1>Home</h1>
  </div>
</template>

<script>
export default {
  name: "Home",
  components: {
  },
  data() {
    return {
    }
  }
}
</script>

<style>

</style>