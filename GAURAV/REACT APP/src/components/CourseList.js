import React from 'react';

function CourseList({ courses, onSelectCourse }) {
    return (
        <div className="mt-5">
            <h2>Courses</h2>
            <div className="list-group">
                {courses.map((course, index) => (
                    <button
                        key={index}
                        className="list-group-item list-group-item-action"
                        onClick={() => onSelectCourse(course)}
                    >
                        {course.name}
                    </button>
                ))}
            </div>
        </div>
    );
}

export default CourseList;
