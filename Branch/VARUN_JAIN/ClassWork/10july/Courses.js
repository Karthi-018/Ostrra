import React from 'react';

const CourseCard = ({ course }) => {
  return (
    <div className="col-md-4 mb-4"> {/* Ensures margin between cards */}
      <div className="card">
        <div className="card-body">
          <h3 className="card-title">{course.courseName}</h3>
          <p className="card-text">{course.courseDesc}</p>
          <div className="card-text">
            <span>Duration: {course.duration}</span>
          </div>
        </div>
      </div>
    </div>
  );
};

const Courses = ({ courses }) => {
  return (
    <div className="row">
      {courses.map((course) => (
        <CourseCard key={course.courseName} course={course} />
      ))}
    </div>
  );
};

export default Courses;
