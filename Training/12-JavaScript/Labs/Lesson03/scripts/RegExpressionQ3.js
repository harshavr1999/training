function verifyEmail(str) {
    var regExp = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (regExp.test(str)) {
        console.log("Valid email address");
    }
    else {
        console.log("Not a Valid email address");
    }
}

verifyEmail('harsha@gmail.com');
verifyEmail('harsha@com');

