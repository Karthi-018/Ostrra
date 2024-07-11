import  './App.css';
// import Tr from './components/Tr';
// // import Tes from './components/Tes';


// function App() {
//   return (
//     <section>
//     <Tr/>
//     </section>
    
//   );
// }

// export default App;
import Courses from './Courses'; 

const courseData = [
  {
    courseName: 'Java',
    courseDesc: 'Java Java',
    duration: '10 Days'
  },
  {
    courseName: 'TypeScript',
    courseDesc: 'TypeScript TypeScript',
    duration: '14 Days'
  },
  {
    courseName: 'Swift',
    courseDesc: 'Swift Swift',
    duration: '15 Days'
  },
  {
    courseName: 'Python',
    courseDesc: 'Python Python',
    duration: '17 Days'
  },
  {
    courseName: 'Cpp',
    courseDesc: 'cpp cpp',
    duration: '20 Days'
  }
];

function App() {
  return (
    <div className="App">
      <h1>Our Courses</h1>
      <Courses courses={courseData} />
    </div>
  );
}

export default App;