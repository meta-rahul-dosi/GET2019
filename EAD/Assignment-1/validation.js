/*
  It has methods to validate html form.
*/

//Method to validate full name.
function fullNameValidation() {

    var status = false;

    var name = document.getElementById("name").value;
    var pattern = /^[A-Za-z]+$/;

    if (pattern.test(name) == false) {
        alert(" name does not allow special charater or number.");
        document.getElementById("name").value = "";
        status = true;
    }
    if (name.length < 2) {
        alert("Name should contain at least 2 charater ");
        document.getElementById("name").value = "";
        status = true;
    }
    return status;
}

//Method to validate email.
function emailValidation() {
    var status = false;
    var pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var email = document.getElementById("email").value;

    if (pattern.test(email) == false) {
        alert("Please enter valid email address.");
        document.getElementById("email").value = "";
        status = true;
    }
    return status;
}

//Method to validate password.
function passwordValidation() {
    var status = false;
    var pattern = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$/;
    var password = document.getElementById("password").value;

    if (pattern.test(password) == false) {
        alert("Password should have contains Uppercase, Lowercase, Numeric, Alphanumeric, and length minimum 8");
        document.getElementById("password").value = "";
        status = true;
    }
    return status;
}

//Method to validate confirm password.
function confirmPasswordValidation() {
    var status = false;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    if (password != confirmPassword) {
        alert("Confirm password do not match!");
        document.getElementById("confirmPassword").value = "";
    }
    return status;
}

//Method to validate contact .
function contactValidation() {
    var status = false;
    var contact = document.getElementById("contact").value;
    if (isNaN(contact) || contact.length <= 8) {
        alert("Not a valid number");
        document.getElementById("contact").value = "";
    }
    return status;
}

//Methdo to submit register form of employee.
function submitData() {

    if (fullNameValidation() && emailValidation() && contactValidation() && passwordValidation() && confirmPasswordValidation()) {
        var empId = 'E19/1216';
        document.getElementById("employeeRegistration").innerHTML = "Congrats!! You are successfully registered. Your registration ID is" + " " + empId;
        document.getElementById("empId").value = empId;
    }
}

//Method to add vehicle of employee.
function registerVehicle() {
    document.getElementById("addVehicle").innerHTML = "Your Vehicle has been added!!"
}

//Method to show the parking price sheet.
function showPrice() {
    value = document.getElementById("type").value;
    document.getElementById("tableForPass").style.display = 'block';
    console.log(value);
    if (value == "cycle") {
        document.getElementById("dailyPrice").innerHTML = "5";
        document.getElementById("monthlyPrice").innerHTML = "100";
        document.getElementById("yearlyPrice").innerHTML = "500";
    }
    if (value == "motorCycle") {
        document.getElementById("dailyPrice").innerHTML = "10";
        document.getElementById("monthlyPrice").innerHTML = "200";
        document.getElementById("yearlyPrice").innerHTML = "1000";
    }

    if (value == "fourWheelers") {
        document.getElementById("dailyPrice").innerHTML = "20";
        document.getElementById("monthlyPrice").innerHTML = "500";
        document.getElementById("yearlyPrice").innerHTML = "3500";
    }
}

var passSelect;
function getPassOption(value) {
    passSelect = value;
}

//Method to generate pass of vehicle. 
function getPass() {
    if (passSelect == "daily") {
        console.log("1");
        document.getElementById("tableForPass").innerHTML = "Your pass price is " + document.getElementById("dailyPrice").innerHTML;
    }
    else if (passSelect == "monthly") {
        console.log("2");
        document.getElementById("tableForPass").innerHTML = "Your pass price is " + document.getElementById("monthlyPrice").innerHTML;
    }
    else if (passSelect == "yearly") {
        console.log("3");
        document.getElementById("tableForPass").innerHTML = "Your pass price is " + document.getElementById("yearlyPrice").innerHTML;
    }
}
