import React, { useEffect, useState} from 'react';    
export default function Findcourse(){    
  const [st,setSt]= useState("");
  const courses = [
        { CourseName: 'Java', CourseDesc: "This is Java", Duration: '10 Days' },
        { CourseName: 'Spring', CourseDesc: "This is Spring", Duration: '15 Days' },
        { CourseName: 'C++', CourseDesc: "This is C++", Duration: '12 Days' }
    ]
    if(st==""){
    return (
    courses.map(element => {
      return(
      <div>
        <h2>Course Details for {element.CourseName}</h2>
        <div className="card">
          <div className="card-body">
            <h5 className="card-title">{element.CourseName}</h5>
            <p className="card-text">{element.CourseDesc}</p>
            <p className="card-text">{element.Duration}</p>
            <button onClick={()=>setSt(element.CourseName)}>Click Me</button>
          </div>
        </div>
      </div>
    )}))}
    else{
      return (
        courses.map(element => {
          if(element.CourseName==st)
          return(
          <div>
            <h2>Course Details for {element.CourseName}</h2>
            <div className="card">
              <div className="card-body">
                <h5 className="card-title">{element.CourseName}</h5>
                <p className="card-text">{element.CourseDesc}</p>
                <p className="card-text">{element.Duration}</p>
                <button onClick={()=>setSt(element.CourseName)}>Click Me</button>
              </div>
            </div>
          </div>
        )}))
    }
  
};
