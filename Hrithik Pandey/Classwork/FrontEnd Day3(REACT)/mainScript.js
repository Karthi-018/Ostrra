
let courses = [
    { CourseName: 'Java', CourseDesc: "This is Java", Duration: '10 Days' },
    { CourseName: 'Spring', CourseDesc: "This is Spring", Duration: '15 Days' },
    { CourseName: 'C++', CourseDesc: "This is C++", Duration: '12 Days' }
];
function DisplayCourses(Name) {
    courses.forEach(element => {
        if (element.CourseName==Name) {
        document.getElementById("s").innerHTML =
            "<h1>This course is " + element.CourseName + "</h1>" +
            "<h2>Description is " + element.CourseDesc + "</h2>" +
            "<h3>Duration is " + element.Duration + "</h3>" }
    });
}
function Rel(){
    window.location.reload("cour.html");
}
function checkPass()
{
    let id= document.getElementById("uname").value
    let pas= document.getElementById("pass").value
    if(id=="admin" && pas==123)
        {
                document.getElementById("s").innerHTML="<h1 style='color: green'>Welcome " + id+"</h1>"
        }
    else
    {
        document.getElementById("wrong").innerHTML="<h1 style='color: red'>Invalid Cred </h1>"
    }
}
function checkPass() {
    let id = document.getElementById("uname").value;
    let pas = document.getElementById("pass").value;
    
    if (id === "admin" && pas === "123") {
        window.location="cour.html"
    } else {
        document.getElementById("wrong").innerHTML = "<h1 style='color: red'>Invalid Credentials</h1>";
    }
}
