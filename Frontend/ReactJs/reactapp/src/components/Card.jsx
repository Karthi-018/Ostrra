import React from "react";

export default function Card(props) {
    return (
        <div class="col-3">
            <div class="card" style={{ margin: "1rem 1rem" }} >
                <div class="card-body">
                    <h5 class="card-title">{props.course.courseName}</h5>
                    <p class="card-text">{props.course.courseDesc}</p>
                    <p class="card-text">Duration: {props.course.courseDuration}</p>
                    <a href="#" class="btn btn-primary">Enroll</a>
                </div>
            </div>
        </div>
    );
}