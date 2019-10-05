function genderSection() {
    var fullName = document.getElementById("fullName").value;
    document.getElementById("empGender").style.display = "block";
    document.getElementById("empName").style.display = "none";
    document.getElementById("fullNameInGender").innerHTML = "Hi! " + fullName;
}

function emailSection() {
    document.getElementById("empGender").style.display = "none";
    document.getElementById("empEmail").style.display = "block";
}

function passwordSection() {
    document.getElementById("empEmail").style.display = "none";
    document.getElementById("empPassword").style.display = "block";
}

function contactSection() {
    document.getElementById("empPassword").style.display = "none";
    document.getElementById("empContact").style.display = "block";
}

function vehicleNameSection() {
    document.getElementById("empContact").style.display = "none";
    document.getElementById("empVehicleName").style.display = "block";
}

function vehicleTypeSection() {
    document.getElementById("empVehicleName").style.display = "none";
    document.getElementById("empVehicleType").style.display = "block";
}

function vehicleNumberSection() {
    document.getElementById("empVehicleType").style.display = "none";
    document.getElementById("empVehicleNumber").style.display = "block";
}

function empIdSection() {
    document.getElementById("empVehicleNumber").style.display = "none";
    document.getElementById("empId").style.display = "block";
}

function vehicleIdentificationSection() {
    document.getElementById("empId").style.display = "none";
    document.getElementById("empVehicleIdentification").style.display = "block";
}

//Method to show the parking price sheet.
function showPassPrice() {
    value = document.getElementById("vehicleType").value;
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
