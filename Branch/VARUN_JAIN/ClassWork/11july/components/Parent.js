import React from "react";
import Child from "./Child";

const Parent = ()=>{
    const ParentHandler = (data)=>{
        console.log(data);
    }
    return(
        <Child onClick={ParentHandler}/>
    )
}

export default Parent;