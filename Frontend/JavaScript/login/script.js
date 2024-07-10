function fun() {
    let uname = document.getElementById("uname").value;
    let pass = document.getElementById("password").value;

    if(uname=="root" && pass=="root") {
        document.getElementById("message").innerHTML="<h1 style='color:green'>Welcome '"+uname+"'</h1>"
    } else {
        document.getElementById("error").innerHTML="<h1 style='color:red'>Invalid Credentials</h1>";
    }
}
