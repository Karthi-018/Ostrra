function fun() {
    let uname = document.getElementById("uname").value;
    let pass = document.getElementById("password").value;
    let courseList = [
        {
            courseName: "Java",
            courseDesc: "This is a beginner level Java course",
            duration: "10 Days"
        },
        {
            courseName: "HTML",
            courseDesc: "This is a beginner level HTML course",
            duration: "13 Days"
        },
        {
            courseName: "JavaScript",
            courseDesc: "This is a beginner level JavaScript course",
            duration: "15 Days"
        }
    ];

    if(uname=="root" && pass=="root") {
        document.getElementById("listItem").hidden=false;
        document.getElementById("login").hidden=true;
    } else {
        document.getElementById("error").innerHTML="<h1 style='color:red'>Invalid Credentials</h1>";
    }

}
