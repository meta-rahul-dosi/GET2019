const empID = "E19/1216";

function registerEmployee() {

    var fullName = document.getElementById("full_name").value;

    var isInvalid = false;

    // validating full name field
    if ((fullName.length < 2) || !(fullName.match(/[A-Za-z]+$/))) {
        alert("Length of name should be minimum 2 and should not be numeric");
        isInvalid = true;
    }

    // validating email field 
    var emailValue = document.getElementById("email").value;

    if (!(emailValue.match(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/))) {
        alert("invalid type of email entered");
        isInvalid = true;
    }

    // validating email field 
    var passwordValue = document.getElementById("password").value;

    if (!(passwordValue.match(/^\d{10}$/)) {
            alert("invalid type of password entered");
            isInvalid = true;
        }

        // check if user entered correct password or not
        var confirmPasswordValue = document.getElementById("confirm_password").value;

        if (!(passwordValue.localCompare(confirmPasswordValue) == 0)) {
            alert("password doesn't matched");
            isInvalid = true;
        }

        // check weather user entered correct contacat no or not
        var contactValue = document.getElementById("contact").value;

        if (!(contactValue.match(/^\d{10}$/))) {
            alert("contact no. doesn't matched");
            isInvalid = true;
            // if user entered valid details
        }

        if (isInvalid == false) {
            // document.getElementById("registerationForm").style.display = none;
            var successfulReg = document.getElementById("register_employee");
            successfulReg.innerHTML = "You are successfully registered. Your registration ID is" + empID;
            document.getElementById("vehicleFieldset").style.display = "block";
            document.getElementById("empFieldSet").style.display = "none";
        }
    }


    function openVehicleForm() {
        const vehicleName = document.getElementById("vehicle_name").value;
        const vehicle_name = document.getElementById("vehicle_name").value;
        const vehicle_description = document.getElementById("vehicle_name").value;
        var type = document.getElementById("vehicle_type");

        document.getElementById("addVehicleDiv").style.display = "none";

        document.getElementById("parkingPriceDiv").style.display = "block";

        document.getElementById("registerationForm").style.display = "none";

        const vehicle_type = type.options[type.selectedIndex].value;

        showPricing(vehicle_type);
    }

    function showPricing(vehicle_Type) {
        var passPrice = document.getElementById("parkingPrice");

        document.getElementById("addVehicleDiv").style.display = "none";

        document.getElementById("parkingPriceDiv").style.display = "block";

        document.getElementById("registerationForm").style.display = "none";
        if (vehicle_Type.localeCompare("cycle") == 0) {
            passPrice.rows[1].cells[1].innerHTML = 2;
            passPrice.rows[2].cells[1].innerHTML = 100;
            passPrice.rows[3].cells[1].innerHTML = 500;
        } else if (vehicle_Type.localeCompare("motorCycle") == 0) {
            passPrice.rows[1].cells[1].innerHTML = 10;
            passPrice.rows[2].cells[1].innerHTML = 200;
            passPrice.rows[3].cells[1].innerHTML = 1000;
        } else if (vehicle_Type.localeCompare("fourWheeler") == 0) {
            passPrice.rows[1].cells[1].innerHTML = 20;
            passPrice.rows[2].cells[1].innerHTML = 500;
            passPrice.rows[3].cells[1].innerHTML = 3500;
        }
    }