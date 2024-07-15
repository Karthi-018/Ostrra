import React from 'react';

function CourseList({ courses, onSelectCourse }) {
    return (
      <div className="mt-5">
        <h2>Courses</h2>
        <div className="row">
          {courses.map((course, index) => (
            <div className="col-md-4 mb-3" key={index}>
              <div className="card">
                <div className="card-body">
                  <h5 className="card-title">{course.name}</h5>
                  <p className="card-text">{course.description}</p>
                  <button
                    className="btn btn-primary btn-sm"
                    onClick={() => onSelectCourse(course)}
                  >
                    Details
                  </button>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    );
  }

export default CourseList;