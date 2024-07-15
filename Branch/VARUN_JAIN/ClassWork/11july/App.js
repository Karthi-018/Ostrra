import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import LoginForm from './components/Loginform';
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
        if (username !== '' && password !== '') {
            setIsLoggedIn(true);
        } else {
            alert('Invalid username or password');
        }
    };

    const handleCourseSelect = (course) => {
        setSelectedCourse(course);
    };

    const handleBackToCourseList = () => {
        setSelectedCourse(null);
    };

    return (
        <div className="container mt-5">
            {!isLoggedIn && <LoginForm onLogin={handleLogin} />}
            {isLoggedIn && !selectedCourse && <CourseList courses={courses} onSelectCourse={handleCourseSelect} />}
            {isLoggedIn && selectedCourse && <CourseDetails course={selectedCourse} onBack={handleBackToCourseList} />}
        </div>
    );
}

export default App;
