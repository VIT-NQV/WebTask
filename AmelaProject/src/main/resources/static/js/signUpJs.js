function valiDate() {
    let name = document.getElementById("name").value;
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmpassword").value;

    if (name == "") {
        alert("Username connot be empty");
        return false;
    }

    if (name.length <= 3 || name.length >= 256) {
        alert("Name must enter 3-256 characters");
        return false;
    }

    if (username == "") {
        alert("Username connot be empty");
        return false;
    }

    if (username.length <= 3 || username.length >= 256){
        alert("Username must enter 3-256 characters");
        return false;
    }

    if (password == "") {
        alert("Password connot be empty");
        return false;
    }

    if (password.length <= 8 || password.length >= 256) {
        alert("Password must enter 8-256 characters");
        return false;
    }

    if (confirmPassword != password) {
        alert("Confirm password must be same as password");
        return false;
    }
}