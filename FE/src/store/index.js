import { createStore } from "vuex";

import createdPersistedState from "vuex-persistedstate";

import aboutStore from "@/store/modules/aboutStore.js";
import chatStore from "@/store/modules/chatStore.js";
import navStore from "@/store/modules/navStore.js";
import menuStore from "@/store/modules/menuStore.js";
import memberStore from "@/store/modules/memberStore.js";
import mapStore from "@/store/modules/mapStore.js";
import noticeStore from "@/store/modules/noticeStore.js";

export default createStore({
  modules: {
    aboutStore,
    chatStore,
    navStore,
    menuStore,
    memberStore,
    mapStore,
    noticeStore,
  },
  plugins: [
    createdPersistedState({
      storage: sessionStorage,
    }),
  ],
});
