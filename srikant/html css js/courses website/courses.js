let courseList = [
    {
        courseName: 'java',
        courseDescription: 'complete java course',
        duration: '10 days'
    },
    {
        courseName: 'c++',
        courseDescription: 'complete c++ course',
        duration: '7 days'
    },
    {
        courseName: 'python',
        courseDescription: 'complete python course',
        duration: '5 days'
    },
    {
        courseName: 'javascript',
        courseDescription: 'complete javascript course',
        duration: '8 days'
    },
]

let string = "";
courseList.forEach(display);

function display(item) {
    string += `
    <div class='card' style='width: 18rem;'>
        <div class='card-body'>
            <h5 class='card-title' id='name'>${item.courseName}</h5>
            <p class='card-text' id='description'>${item.courseDescription}</p>
            <p class='card-text' id='duration'>${item.duration}</p>
            <a href='#' class='btn btn-primary'>Check Courses</a>
        </div>
    </div>
    `
}

document.getElementById("main").innerHTML = string;
