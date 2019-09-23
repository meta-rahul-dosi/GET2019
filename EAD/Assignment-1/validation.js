/*
  It has methods to validate html form.
*/

//Method to validate full name.
function fullNameValidation() {

    var status = true;

    var name = document.getElementById("name").value;
    var pattern = /^[A-Za-z]+$/;

    console.log(name);
    if (name.match(pattern) == false) {
        alert(" name does not allow special charater or number.");
        document.getElementById("name").value = "";
        status = false;
    }
    if (name.length < 2) {
        alert("Name should contain at least 2 charater ");
        document.getElementById("name").value = "";
        status = false;
    }
    return status;
}

//Method to validate email.
function emailValidation() {
    var status = true;
    var pattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var email = document.getElementById("email").value;
    console.log(email)

    if (email.match(pattern) == false) {
        alert("Please enter valid email address.");
        document.getElementById("email").value = "";
        status = false;
    }
    return status;
}

//Method to validate password.
function passwordValidation() {
    var status = true;
    var pattern = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
    var password = document.getElementById("password").value;
    console.log(password)

    if (password.match(pattern) == false) {
        alert("Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters");
        document.getElementById("password").value = "";
        status = false;
    }
    return status;
}

//Method to validate confirm password.
function confirmPasswordValidation() {
    var status = true;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    console.log(confirmPassword)

    if (password != confirmPassword) {
        alert("Confirm password do not match!");
        console, log("hereeeeeeee")
        document.getElementById("confirmPassword").value = "";
        status = false;
    }
    return status;
}

//Method to validate contact .
function contactValidation() {
    var status = true;
    var contact = document.getElementById("contact").value;
    console.log(contact)
    if (contact.length <= 8) {
        alert("Not a valid contact number");
        document.getElementById("contact").value = "";
        status = false;
    }
    return status;
}


//Method to submit register form of employee.
function submitData() {
    if (fullNameValidation() && emailValidation() && contactValidation() && passwordValidation() && confirmPasswordValidation()) {
        var empId = 'E19/1216';
        document.getElementById("employeeRegistration").style.display = 'none';
        document.getElementById("addVehicle").style.display = 'block';
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
        document.getElementById("tableForPass").innerHTML = "Your pass price is " + document.getElementById("dailyPrice").innerHTML;
    }
    else if (passSelect == "monthly") {
        document.getElementById("tableForPass").innerHTML = "Your pass price is " + document.getElementById("monthlyPrice").innerHTML;
    }
    else if (passSelect == "yearly") {
        document.getElementById("tableForPass").innerHTML = "Your pass price is " + document.getElementById("yearlyPrice").innerHTML;
    }
}
