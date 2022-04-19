import React, { Component } from 'react';
import {Route,Routes,Link} from 'react-router-dom';
import Home from './Component/Home';
import Projects from './Component/Projects'
import Services from './Component/Services'
import Contact from './Component/Contact'
import './Navbar.css'

class Navbar extends Component {
  render() {
    return (
        <>
        <nav>
        <ul>
            
                    <li>
                       <Link to='/'>HOME</Link>
                    </li>
                    <li>
                        <Link to='/projects'>PROJECTS</Link>
                    </li>
                    <li>
                        <Link to='/services'>SERVICES</Link>
                    </li>
                    <li>
                        <Link to='/contact'>CONTACT</Link>
                    </li>
                </ul>
               
        </nav>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path='/projects' element={<Projects/>}/>
                <Route path='/services' element={<Services/>}/>
                <Route path='/contact' element={<Contact/>}/>
            </Routes>
        </>
           
    )
  }
}

export default Navbar
