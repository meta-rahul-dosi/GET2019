//Method to validate class
function validationClass() {
	var status = false;
	var class = document.getElementById("class").value;
	if (class == 1 || class == 2 || class == 3 || class == 4 || class == 5
			|| class == 6 || class == 7 || class == 8 || class == 9
			|| class == 10 || class == 11 || class == 12) {
	} else {
		alert("Not a valid class");
	}
	document.getElementById("class").value = "";
return status;}