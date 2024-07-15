import React from 'react';

function CourseDetails({ course, onBack }) {
    return (
        <div className="mt-5">
            <h3>{course.name}</h3>
            <p><strong>Description:</strong> {course.description}</p>
            <p><strong>Duration:</strong> {course.duration}</p>
            <button className="btn btn-primary" onClick={onBack}>Back to Courses</button>
        </div>
    );
}

export default CourseDetails;