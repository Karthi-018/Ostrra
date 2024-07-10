
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