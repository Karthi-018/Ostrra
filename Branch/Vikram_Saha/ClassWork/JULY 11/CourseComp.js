import { useEffect, useState } from "react"

export function CourseComp(props){
    // console.log(props.cName)
    const logName=()=>{
        console.log(props.cName)
    }
    const showThisOnly=()=>{
        // console.log('sot')
        props.removeAll(props);
    }
    return(
        <div class="card" >
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <h6 class="card-subtitle mb-2 text-muted">{props.cName}</h6>
                <p class="card-text">DESC- {props.cDesc}</p>
                <p class="card-text">Duration- {props.duration}</p>
            </div>
            <button onClick={logName}>LOG NAMES</button>
            <button onClick={showThisOnly}>SHOW ONLY THIS</button>
        </div>

        // <>
        //     {props.cName}
        //     {props.duration}
        //     {props.cDesc}
        // </>
    )
}

export function ListC(){
    // let showOne=false;
    const [showOne,setShowOne]=useState(false);
    const [selectedCourse,setSelectedCourse]=useState();
    useEffect(()=>console.log("changed"),[showOne]);
    const removeAll=(arg)=>{
        // console.log("parent rma")
        setShowOne(true);
        setSelectedCourse(arg)
        // console.log(showOne)
    }
    let Comp=<></>;
    let courseList=[{cName:'java',cDesc:'desc1',duration:'10 Days'},
    {cName:'c',cDesc:'desc2',duration:'20 Days'},
    {cName:'python',cDesc:'desc3',duration:'30 Days'}]

    if(showOne==false)
    return (
        <>
        {
        courseList.map((obj)=>{
        return <CourseComp cName={obj.cName} cDesc={obj.cDesc} duration={obj.duration} removeAll={removeAll}/>
        })
        }
        </>
    )
    else{
        let obj=selectedCourse
        return <>
        <CourseComp cName={obj.cName} cDesc={obj.cDesc} duration={obj.duration} removeAll={removeAll}/>
        <button onClick={()=>setShowOne(false)}>SHOW ALL</button>
        </>
    }
    
}