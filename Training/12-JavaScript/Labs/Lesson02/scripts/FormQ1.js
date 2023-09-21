function formValidation() {
    var firstname = document.getElementById("firstName");
    var lastname = document.getElementById("lastName");
    var password = document.getElementById("password");
    var email = document.getElementById("email");
    var address = document.getElementById("address");

    if (nameValidation(firstname)) {
        if (nameValidation(lastname)) {
            if (passwordValidation(password, 6, 20)) {
                if (emailValidation(email)) {
                    if (addressValidation(address)) {
                    }
                }
            }
        }
    }
    return false;

}
function nameValidation(name) {
    var letters = /^[A-Za-z]+$/;
    if (name.value.match(letters)) {
        return true;
    }
    else {
        alert("Name can contain alphabet characters only");
        name.focus();
        return false;
    }
}

function passwordValidation(password, min, max) {
    var passwordLength = password.value.length;
    if (passwordLength == 0 || passwordLength >= max || passwordLength < min) {
        alert("Password must be between " + min + " to " + max);
        password.focus();
        return false;
    }
    return true;
}

function addressValidation(address) {
    var letters = /^[0-9a-zA-Z]+$/;
    if (address.value.match(letters)) {
        return true;
    }
    else {
        alert("Enter a valid address");
        address.focus();
        return false;
    }
}

function emailValidation(email) {
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (email.value.match(mailformat)) {
        return true;
    }
    else {
        alert("Please enter a valid email address!");
        email.focus();
        return false;
    }
}

