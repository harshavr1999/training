function verifyurl(url) {
    regExp = /^(http(s):\/\/.)[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,6}\b([-a-zA-Z0-9@:%_\+.~#?&//=]*)$/;
    if (regExp.test(url)) {
        console.log("Valid URL");
    }
    else {
        console.log("Not a valid URL");
    }
}

verifyurl("https://www.google.com");
verifyurl("wwgooglecom");


