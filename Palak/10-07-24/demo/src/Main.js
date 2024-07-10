import React from "react";
import "./Main.css";


// export default function Main(){
//     return (
//         <div>
//             <div id="uname"></div>
//             <div id="form">
//                 <h1>
//                     Login
//                 </h1>
//                 <p><label>Enter your name</label>
//                     <input type="text" id="name"></input></p>
//                 <p><label>Enter you password</label>
//                     <input type="password" id="password"></input>
//                 </p>
//                 <button onclick="printname()">Submit</button>
//                 <button type="reset">Reset</button>

                

//             </div>
//             </div>
        
//     )
// }


// function printname(){
//     let name = document.getElementById("name").value;

//    let pwd= document.getElementById("password").value;

// if(name =="admin" && pwd=="root"){
// document.getElementById('uname').innerHTML="<h1 style ='color:green'>Welcome</h1>";
// document.getElementById("form").style.display="none";

// }else{
// document.getElementById('uname').innerHTML="<h1 style ='color:red'>Invalid input</h1>";

// }
// }

export default function Main(){
    var courseList=[{
        cName:"Java",
        cDesc:"complete Java course for beginners",
        duration:"10 days"
    },
    {
    cName:"React",
    cDesc:"complete React course for beginners",
    duration:"5 days"   
    },
    {   cName:"Python",
    cDesc:"complete python course for beginners",
    duration:"15 days"}]

    return(
        <div>
            <div class ="row">
                {
                    courseList.map((course)=>{
                        return(
                            <div class ="col">
                            <div class="card">
                            
                            <div class="card-body">
                              <h5 class="card-title">{course.cName}</h5>
                              <p class="card-text">{course.cDesc}</p>
                              <p class="card-text">{course.duration}</p>
                              <a href="#" class="btn btn-primary">Details</a>
                            </div>
                          </div>
                          </div>
                        )
                    }
                    )
                }

        </div></div>
        
    )
}




