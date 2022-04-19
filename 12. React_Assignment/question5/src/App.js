import React,{useState} from 'react'
import './App.css';
import { BsFillAlarmFill} from "react-icons/bs";
import {BiCalendar} from "react-icons/bi"

function App() {

  let time=new Date().toLocaleTimeString()
  let date=''

  const [currentTime,setCurrentTime]=useState(time)
  const [currentDate,setCurrentDate]=useState(date)
  const [count,setCount]=useState(0)

  const updateTime=()=>{
    let time=new Date().toLocaleTimeString()
    setCurrentTime(time)
  }

  setInterval(updateTime,1000)

   const clickHandler=(date)=>{
      setCount(count+1)
      if(count%2===0){
        setCurrentDate(new Date().toDateString())
      }else{
        setCurrentDate('')
      }
   }

  return (
    <div className="App">
      <nav>
        <BsFillAlarmFill className='logo' size={40}/>
      <h1>Digital Clock</h1>
      </nav>
      <div className='middle'>
        <label class="switch">
            <input type="checkbox" onClick={clickHandler}/>
            <span class="slider round"> </span>
        </label>
        <BiCalendar className='logo' size={40}/>
      </div>
     <div className='lower'>   
    <h1>{currentTime}</h1> 
    <h3 >{currentDate}</h3>
    </div>
    </div>
  );
}

export default App;
