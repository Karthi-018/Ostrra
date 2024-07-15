import React from 'react';

const Child = (props)=>{
const ChildHandler = (data)=>{
    console.log(data);
    props.onclick("Event Handled");

    return(
        <div>
            <h1>Child Event</h1>
            <button onClick={ChildHandler}>Handle Event</button>
        </div>
    )
}
}

export default Child;