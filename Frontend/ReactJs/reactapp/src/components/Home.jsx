import React from "react";
import Card from "./Card";


export default function Home(props) {
    return (
        <div>
            <div className="row">
                {
                    props.courseList.map((course) => {
                        return (
                            <Card course={course} />
                        );
                    })
                }
            </div>
        </div>
    );
}