import React,{useState,useEffect} from 'react'
import './EmpStyle.css'
import EmpTable from './EmpTable'

function EmpForm() {

    const getDatafromLS=()=>{
        const data=localStorage.getItem('employees')
        if(data){
            return JSON.parse(data)
        }else{
            return []
        }
    }
    
    const [employees,setEmployee]=useState(getDatafromLS())
    const [name,setName]=useState('')
    const [job,setJob]=useState('')

    const handleAddEmp=(e)=>{
        e.preventDefault()

        let employee={
            name,
            job
        }
        setEmployee([...employees,employee])
        setName('')
        setJob('')
    }

    useEffect(()=>{
            localStorage.setItem('employees',JSON.stringify(employees))
    },[employees])

    const deleteEmp=(name)=>{
        const filteredEmps=employees.filter((element,index)=>{
            return element.name !=name
        })
        setEmployee(filteredEmps)
    }

  return (
      <div className='wrapper'>

        <div className='view'>
          <p>Add an employee with a name and a job to the table</p>
            {employees.length>0&&<>
                <div className='EmployeeTable'>
                    
                    <table>
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Job</th>
                                <th>Remove</th>
                            </tr>
                        </thead>
                        <tbody>
                            <EmpTable employees={employees}  deleteEmp={deleteEmp}/>
                        </tbody>
                    </table>
                </div>
            
            </>}
            {employees.length<1 && <div> No employee are added</div>}
              
        </div>

        <div className='EmployeeForm'>
            <h2>Add New Employee</h2>
            <form  autoComplete='off' className='form-group' onSubmit={handleAddEmp}>
                <label>Name</label><br/>
                <input type="text" onChange={e=>setName(e.target.value)} value={name}></input><br/>
                <label>Job</label><br/>
                <input type="text" onChange={e=>setJob(e.target.value)} value={job}></input><br/><br/>
                <button type='submit'>Submit</button>
            </form>
        </div>
    </div>
  )
}

export default EmpForm
