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
    <main class="flex-1 flex flex-col items-center justify-center">

    </main>
    <footer class="flex flex-col gap-2 sm:flex-row py-6 w-full shrink-0 items-center px-4 md:px-6 border-t">

    </footer>
  </div>
</template>

<script>

export default {
  name: 'App',
  data() {
    return {
      algorithm: ['Bubble sort', 'Merge Sort', 'Quick Sort']
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
}

.al-menu {
  padding: 10px;
}

#main-title {
  width: auto;
  height: 50px;
  flex-wrap: wrap;
}
</style>
