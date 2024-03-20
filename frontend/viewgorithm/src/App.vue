<template>
  <div class="flex flex-col min-h-[100dvh]">
    <div class=" bg-back-color text-white pb-14">
      <header class="px-4 lg:px-6 h-14 flex items-center">
        <button
          class="whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2 flex items-center justify-center">
          <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
            stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="h-6 w-6">
            <path d="m8 3 4 8 5-5 5 15H2L8 3z"></path>
          </svg>
          <span class="sr-only">Acme Inc</span>
        </button>
        <button
          class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2 ml-auto">
          Login
        </button>
        <button
          class="inline-flex items-center justify-center whitespace-nowrap text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2">
          Join
        </button>
      </header>
      <div class="flex-wrap mt-4">
        <h1 class="text-6xl font-bold">ViewGorithm</h1>
        <p class="text-lg mt-4">You Can Wath to Visualize ALGORITHMS.</p>
      </div>
    </div>
    <div class="flex flex-row mb-5 mt-14 bg-white pt-10 pb-10">
      <div class="header-under text-4xl font-bold">
        Welcome to ViewGorithm!
      </div>
      <div class="vertical-line mx-4"></div>
      <div class="header-under font-mono">
        If You Want to Watch to Visualize Algorithms, You Should Use This Web Service.
        We provide you with a better understanding.
        Please Push The Button that You want to Understand More.
      </div>
    </div>
    <main class="flex-1 flex flex-col items-center justify-center bg-section-color">
      <section class="flex flex-col flex-nowrap">
        <h1 class="list-title">Algorithm List</h1>
        <div>
          Push The Button that You want to Understand More.
        </div>
        <div class="list-wrap flex flex-row flex-wrap gap-4">
          <div class="lists" v-for="name in algorithms" :key="name">
            {{ name }}
          </div>
        </div>
      </section>
    </main>
    <footer class="flex flex-col gap-2 sm:flex-row py-2 w-full shrink-0 items-center px-4 md:px-6 border-t">
      <span class=" text-sm font-bold">SungKongHoe University Team ViewGorithm</span>
    </footer>
  </div>
</template>

<script>

export default {
  name: 'App',
  data() {
    return {
      algorithms: ['Bubble sort', 'Merge Sort', 'Quick Sort']
    }
  },
  components: {
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: black;
}

/* header 아래 태그 영역 */
.header-under {
  flex-flow: row wrap;
  flex-basis: 50%;
  align-items: center;
  justify-items: center;

}

/* main 태그 영역 */
.vertical-line {
  border-left: 2px dashed #333;
  height: auto;
}

.list-title {
  font-size: 2.2rem;
  font-weight: bold;
  margin-top: 2rem;
}

.list-wrap {
  margin-top: 2rem;
  margin-bottom: 2rem;
  justify-content: center;
  align-items: center;
}

.lists {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  font-size: 1.2rem;
  font-weight: bold;
  border: 3px solid #333;
  border-radius: 25px;
  cursor: pointer;
  transition: all 0.3s;
  width: 10rem;
  height: 12rem;
  margin: 1rem;
  padding-left: 1rem;
  padding-right: 1rem;
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
  justify-content: flex-end;
}
</style>
