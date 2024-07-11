import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import LoginForm from './components/LoginForm';
import CourseList from './components/CourseList';
import CourseDetails from './components/CourseDetails';

const courses = [
    { name: 'Java', description: 'Comprehensive course on Java programming', duration: '10 days' },
    { name: 'JavaScript', description: 'Learn JavaScript from scratch', duration: '8 days' },
    { name: 'Python', description: 'Introductory Python course', duration: '7 days' }
];

function App() {
    const [isLoggedIn, setIsLoggedIn] = useState(false);
    const [selectedCourse, setSelectedCourse] = useState(null);

    const handleLogin = (username, password) => {
        if (username === 'admin' && password === 'Rest@123') {
            setIsLoggedIn(true);
        } else {
            alert('Invalid username or password');
        }
    };

    const handleCourseSelect = (course) => {
        setSelectedCourse(course);
    };

    return (
        <div className="container">
            {!isLoggedIn && <LoginForm onLogin={handleLogin} />}
            {isLoggedIn && !selectedCourse && <CourseList courses={courses} onSelectCourse={handleCourseSelect} />}
            {isLoggedIn && selectedCourse && <CourseDetails course={selectedCourse} />}
        </div>
    );
}

export default App;
