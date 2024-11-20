import { BrowserRouter, Route, Router, Routes } from "react-router-dom"
import Main from "./pages/Main"
import Login from "./pages/Login"
import ArticleList from "./pages/ArticleList"
import Nav from "./components/Nav"
import ProfileHome from "./pages/ProfileHome"
import Toonlist from "./pages/toonlist"
import ProfileModify from "./pages/ProfileModify"
import BordList from "./pages/BordList"

function App() {
  return (
    <BrowserRouter>
      <Nav />
      <Routes>
        <Route index element={<Toonlist />}></Route>
        <Route path="/auth/login" element={<Login />}></Route>
        <Route path="/article/list" element={<ArticleList />}></Route>
        <Route path="/myprofile" element={<ProfileHome />}></Route>
        <Route path="/myprofile/modify" element={<ProfileModify />}></Route>
        <Route path="/bordlist" element={<BordList />}></Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
