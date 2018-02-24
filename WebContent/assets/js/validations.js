
//=================================================================================================================
function validateForm() {

	var errorMessage = '<br/>';
	var theFirstName = document.forms["rentalForm"]["firstName"].value;
	var theLastName = document.forms["rentalForm"]["lastName"].value;
	var thePostalCode = document.forms["rentalForm"]["postalCode"].value;
	var theDriversLicence = document.forms["rentalForm"]["driversLicense"].value;

	if (theFirstName == "") {
		//alert("Name must be filled out");
		errorMessage  = errorMessage + "First Name must be filled out <br/>";
	} else if(theFirstName.length < 3){
		errorMessage  = errorMessage + "First Name - at least 3 characters<br/>";
	}
	if (theLastName == "") {
		//alert("Name must be filled out");
		errorMessage  = errorMessage + "Last Name must be filled out <br/>";
	}else if(theLastName.length < 5){
		errorMessage  = errorMessage + "Last Name - at least 5 characters<br/>";
	}
	// H1H1H1, H1H 1H1
	var postalCodeRE = new RegExp(
	'[A-Za-z]{1}[0-9]{1}[A-Za-z]{1} ?[0-9]{1}[A-Za-z][0-9]{1}');
	var postalCodeOK = postalCodeRE.exec(thePostalCode);
	if (!postalCodeOK) {
		//alert("Name must be filled out");
		errorMessage += "Please use a valid format for the Postal Code <br/>";
	}

	// J-234-ABC, J-234-ABCD, J-234-ABCDE
	var driversLicenceRE = new RegExp('^J-[0-9]{3}-[A-Z]{3,5}$');
	var driversLicenceOK = driversLicenceRE.exec(theDriversLicence);
	if (!driversLicenceOK) {
		//alert("Name must be filled out");
		errorMessage += "Please use a valid format for the Driver's Licence <br/>";
	}
	 if(document.forms["rentalForm"]["tc"].checked != true)
	 {
		 errorMessage +=" You must agree with the Terms and Conditions </br>";
	 }
	if (errorMessage != '') {
		document.getElementById('ei').innerHTML = errorMessage;
		return false;
	}
	return true;
}
//=================================================================================================================

function changeManfacture() {
	var modelList = ""; 
	var volvo = ["select" ,"V40", "S60", "XC60", "S90", "XC90" ];
	var B = [ "select","A3", "Q3", "A4", "Q5" ];
	var C = ["select" , "GLA", "E-Class", "CLS", "C-Class", "S-Class" ];

	var model = document.getElementById('model');
	while (model.options.length > 0) {                
		model.remove(0);
	}  


	if (document.getElementById("manfacture").value == "volvo") {
		for (var i = 0; i < volvo.length; i++) {
			var newModelList = document.createElement('option');
			modelList = "<option value='" + volvo[i] + "'>" + volvo[i] + "</option>";
			newModelList.innerHTML = modelList;
			document.getElementById('model').add(newModelList);
		}

	}

	else if (document.getElementById("manfacture").value == "audi") {

		for (var i = 0; i < B.length; i++) {
			var newSelect = document.createElement('option');
			modelList = "<option value='" + B[i] + "'>" + B[i] + "</option>";
			newSelect.innerHTML = modelList;
			document.getElementById('model').add(newSelect);
		}
	}

	else if (document.getElementById("manfacture").value == "mercedes") {

		for (var i = 0; i < C.length; i++) {
			var newSelect = document.createElement('option');
			modelList = "<option value='" + C[i] + "'>" + C[i] + "</option>";
			newSelect.innerHTML = modelList;
			document.getElementById('model').add(newSelect);
		}
	} 
	loadVehicleImage();
}
//=================================================================================================================
function loadVehicleImage() {
	var imgUrl = "./images/";
	var ext = ".jpg";
	var model = document.getElementById("model").value;
	var manufacture = document.getElementById("manfacture").value;
	if (model != "select" && manufacture != "") {
		imgUrl = imgUrl + model + ext;
	} else {
		imgUrl = "./images/car.jpg";
	}
	document.getElementById("vehicleImage").src = imgUrl;
}
