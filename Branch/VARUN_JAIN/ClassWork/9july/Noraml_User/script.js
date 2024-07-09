function check() {
    let user=document.getElementById("user").value;
    let password=document.getElementById("password").value;

    if(user=="admin" && password=="1234") {
        document.getElementById("form-container").style.display="none";
        document.getElementById("welcome-msg").innerHTML="Welcome "+user;
    } else {
        document.getElementById("error-msg").style.display="block";
    }
}        
