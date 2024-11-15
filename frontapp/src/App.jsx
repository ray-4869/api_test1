import { BrowserRouter, Route, Router, Routes } from "react-router-dom"
import Main from "./pages/Main"
import Login from "./pages/Login"
import ArticleList from "./pages/ArticleList"
import Nav from "./components/Nav"
import Profils from "./pages/Profils"
import Toonlist from "./pages/toonlist"

function App() {
  return (
    <BrowserRouter>
      <Nav />
      <Routes>
        <Route index element={<Toonlist />}></Route>
        <Route path="/auth/login" element={<Login />}></Route>
        <Route path="/article/list" element={<ArticleList />}></Route>
        <Route path="/myprofil" element={<Profils />}></Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
