// let name = prompt("Enter your name");

// document.getElementById("name").innerHTML = name;
// console.log(name);

//             function printName() {
//                 let uname = document.getElementById("uname").value;
//                 alert("Welcome "+uname);
//             }


let uname = prompt("Enter username");
let password = prompt("Enter password");

if(uname == "root" && password == "root") {
    document.getElementById("message").innerHTML = "<h1 style='color:green'>Welcome "+uname+"</h1>";
} else {
    document.getElementById("message").innerHTML = "<h1 style='color:red'>Invalid Credentials</h1>";
}