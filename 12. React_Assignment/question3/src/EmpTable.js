import React,{useState,useEffect} from 'react'
import './EmpStyle.css'

const EmpTable=({employees,deleteEmp})=> {
  return employees.map(employee=>(
      <tr key={employee.name}>
          <td>{employee.name}</td>
          <td>{employee.job}</td>
          <td className='deleteButton'>
              <button onClick={()=>deleteEmp(employee.name)}>Delete</button>
          </td>
      </tr>
  ))
}

export default EmpTable
