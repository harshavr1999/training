function getFormvalue() {
    var data = document.getElementById("form1");
    for (var i = 0; i < data.length; i++) {
        var element = data[i];
        if(element.name=="fname"){
            var firstName = element.value;
            alert("FirstName is : "+firstName);
        }else if(element.name=="lname"){
            var lastName = element.value;
            alert("LastName is : "+lastName);
        }
    }
}
