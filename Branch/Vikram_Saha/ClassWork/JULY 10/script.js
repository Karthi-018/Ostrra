function listC() {
    let courseList=[{cName:'java',cDesc:'desc1',duration:'10 Days'},
    {cName:'c',cDesc:'desc2',duration:'20 Days'},
    {cName:'python',cDesc:'desc3',duration:'30 Days'}]

    let old=""
    // for (let index = 0; index < 5; index++) {
    //     document.getElementById("output").innerHTML=old+index
    //     old=document.getElementById("output").innerHTML
        
    // }
    currHtml=""
    courseList.forEach(element => {
        // currHtml="<div class='card text-center'><h3 class='card-text'>course name-"+element.cName+ "</h3>"+"<h3 class='card-text'>course desc-"+element.cDesc+ "</h3>"+"<h3 class='card-text'>course durtion-"+element.duration+ "</h3></div><br><br>"
        currHtml=getHtml(element.cName,element.cDesc,element.duration)
        document.getElementById("output").innerHTML=old+currHtml
        old=document.getElementById("output").innerHTML
        
    });
    
}

function getHtml(name,desc,dur) {

    cardHtm="<div class='card' style='width: 18rem;'>"+
    "<div class='card-body'>"+
      "<h5 class='card-title'>"+name+"</h5>"+
      "<p class='card-text'>DESC- "+desc+"</p>"+
      "<p class='card-text'>DURATION- "+dur+"</p>"+
    //   "<a href='#' class='btn btn-primary'>Go somewhere</a>"+
    "</div>"+
"</div>"
return cardHtm;
    
}