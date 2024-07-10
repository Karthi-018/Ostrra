function validate(){
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if(username == "admin@gmail.com" && password == "password"){
        window.open("courses.html","_self")
        
    }else{
        alert("Invalid Credentials. Try again")
    }
}