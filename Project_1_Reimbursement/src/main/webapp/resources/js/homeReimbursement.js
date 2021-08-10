console.log("in js file");


window.onload = function(){
	//document.getElementById(".......stuff......").addEventListener("click", ajaxGetAllReimbs);

	ajaxGetAllReimbs()

}

function ajaxGetAllReimbs(){
	console.log("starting the ajax request")
	
	fetch('http://localhost:9002/Project_1_Reimbursement/json/updateReimbursement')
	.then(function(daResponse){
		const convertedResponse = daResponse.json();
		return convertedResponse;
	})
	.then(function(daSecondResponse){
		console.log(daSecondResponse);
		ourDOMManipulation(daSecondResponse);
	})
	
}


function ourDOMManipulation(ourJSON) {
	for(let i = 0; i < ourJSON.length; i++){
	
	///TIMESTAMP
	//sorry let d=new Date(your stuff);
	//then d.toLocaleDateString();
	
		/////////////////////CREATE ELEMENTS DYNAMICALLY//////////////////
		//step1:creating our new elements
		let newTR = document.createElement("tr");
		let newTH = document.createElement("th");
		
		let newTD1 = document.createElement("td");
		let newTD2 = document.createElement("td");
		let newTD3 = document.createElement("td");
		let newTD4 = document.createElement("td");
		let newTD5 = document.createElement("td");
		let newTD6 = document.createElement("td");
		let newTD7 = document.createElement("td");
		//let newTD8 = document.createElement("td");
		
		//step2: populate creations
		console.log(ourJSON[i]);
		newTH.setAttribute("scope", "row");
		let myTextH = document.createTextNode(ourJSON[i].reimb_Id);
		let myTextD1 = document.createTextNode(ourJSON[i].reimb_Amount);
		let myTextD2 = document.createTextNode(ourJSON[i].reimb_submittedTS);
		let myTextD3 = document.createTextNode(ourJSON[i].reimb_resolvedTS);
		let myTextD4 = document.createTextNode(ourJSON[i].reimb_type);
		let myTextD5 = document.createTextNode(ourJSON[i].reimb_description);
		let myTextD6 = document.createTextNode(ourJSON[i].userRole);
		let myTextD7 = document.createTextNode(ourJSON[i].reimb_status);
		
		//all appending
		newTH.appendChild(myTextH);
		newTD1.appendChild(myTextD1);
		newTD2.appendChild(myTextD2);
		newTD3.appendChild(myTextD3);
		newTD4.appendChild(myTextD4);
		newTD5.appendChild(myTextD5);
		newTD6.appendChild(myTextD6);
		newTD7.appendChild(myTextD7);
		
		newTR.appendChild(newTH);
		newTR.appendChild(newTD1);
		newTR.appendChild(newTD2);
		newTR.appendChild(newTD3);
		newTR.appendChild(newTD4);
		newTR.appendChild(newTD5);
		newTR.appendChild(newTD6);
		newTR.appendChild(newTD7);
		
		let newSelection = document.querySelector("#myReimbTable");
		newSelection.appendChild(newTR);
		
	}
}
