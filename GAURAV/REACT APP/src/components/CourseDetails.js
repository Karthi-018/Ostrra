import React from 'react';

function CourseDetails({ course }) {
    return (
        <div className="mt-5">
            <h3>{course.name}</h3>
            <p><strong>Description:</strong> {course.description}</p>
            <p><strong>Duration:</strong> {course.duration}</p>
        </div>
    );
}

export default CourseDetails;
