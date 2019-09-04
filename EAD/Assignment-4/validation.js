
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

//Method to validate confirm pass word.
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

//Method to validate contact
function contactValidation() {
    var status = false;
    var contact = document.getElementById("contact").value;
    if (isNaN(contact) || contact.length <= 8) {
        alert("Not a valid number");
        document.getElementById("contact").value = "";
    }
    return status;
}

function hideEmpDetail(){
	  if( fullNameValidation() && emailValidation() && passwordValidation() && confirmPasswordValidation() && contactValidation()){
	    document.getElementById("empDetail").style.display = "none";
	    document.getElementById("successfulRegister").innerHTML = "welcome, successfully registered by E19/1216"
	    document.getElementById("vehicleForm").style.display = "block";
	  }
	}