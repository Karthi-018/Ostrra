let uname = prompt("enter username");
let password = prompt("enter password");

if(uname == "admin" && password == "pswd"){
    document.getElementById("name").innerHTML = "Welcome " + uname;
}
else{
    document.getElementById("name").innerHTML = "Invalid";
    document.getElementById("name").style.color = "red";
}