let courseList = [
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
]
function displayCourses() {
    const courseDropdown = document.getElementById('courseDropdown');
  
    courseList.forEach(course => {
      const option = document.createElement('option');
      option.value = course.courseName;
      option.text = course.courseName;
      courseDropdown.appendChild(option);
    });
  
    courseDropdown.disabled = false; 
  }
  
  function displayCourseDetails(courseName) {
    const courseDetails = document.getElementById('courseDetails');
    courseDetails.innerHTML = ''; 
    const selectedCourse = courseList.find(course => course.courseName === courseName);
  
    if (selectedCourse) {
      courseDetails.innerHTML = `
       <p> Course : ${selectedCourse.courseName}</p>
       <p>Description: ${selectedCourse.courseDesc}</p>
        <p>Duration: ${selectedCourse.duration}</p>
      `;
      courseDetails.style.display = 'block'; 
    } else {
      courseDetails.innerHTML = 'Course details not found.';
      courseDetails.style.display = 'block'; 
    }
  }
  
  const loginForm = document.getElementById('loginForm');
  const courseDropdown = document.getElementById('courseDropdown');
  const courseDetails = document.getElementById('courseDetails');
  
  loginForm.addEventListener('submit', function(event) {
    event.preventDefault();
  
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
  
    if (username != '' && password != '') {
      loginForm.style.display = 'none'; 
      displayCourses();
    } else {
      alert('Invalid username or password!');
    }
  });

  courseDropdown.addEventListener('change', function(event) {
    const selectedCourse = event.target.value;
    if (selectedCourse) {
      displayCourseDetails(selectedCourse);
    } else {
      courseDetails.innerHTML = ''; 
      courseDetails.style.display = 'none'; 
    }
  });