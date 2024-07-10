import logo from './logo.svg';
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";
import './App.css';
import Navbar from './components/Navbar';
import Home from './components/Home';

function App() {

  const courseList = [
    {
      courseName: "Java",
      courseDesc: "This is a beginner level Java course",
      courseDuration: "12hrs",
      courseLink: ""
    },
    {
      courseName: "MySQL",
      courseDesc: "This is a beginner level MySQL course",
      courseDuration: "9hrs",
      courseLink: ""
    },
    {
      courseName: "HTML",
      courseDesc: "This is a beginner level HTML course",
      courseDuration: "3hrs",
      courseLink: ""
    },
    {
      courseName: "JavaScript",
      courseDesc: "This is a beginner level JavaScript course",
      courseDuration: "15hrs",
      courseLink: ""
    }
  ];

  return (
    <div className="App">
      <Navbar courseList={courseList} />
      <Home courseList={courseList} />
    </div>
  );
}

export default App;
