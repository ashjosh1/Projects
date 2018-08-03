
function validateStudForm(){
	var firstname=studform.firstName.value;
	var lastName=studform.lastName.value;
	var address=studform.address.value;
	var city=studform.city.value;
	var state=studform.state.value;
	var gender=studform.gender.value;
	var course=studform.course.value;
	var mobilenum=studform.mobilenum.value;
	var validname=/^[A-Z][a-zA-Z]{2,}$/;
	var validmobileNo=/^\d{10}$/;
	var flag=false;
	if(firstname==""||firstname==null){
		alert("Please enter FirstName");
	}
	else if(validname.test(firstname) == false)
	{
alert("Please enter a vaild Firsttname");
	}
	else if(lastName=="" || lastName==null)
		{
		alert("Please enter LastName");
		}
	else if(validname.test(lastName) == false)
	{
alert("Please enter a vaild Lastname");
	}
	else if(address=="" || address==null)
	{
	alert("Please enter address");
	}
	else if(city=="" || city==null)
	{
	alert("Please enter city");
	}
	
	else if(state=="" || state==null)
	{
	alert("Please enter state");
	}
	else if(gender=="" || gender==null)
	{
	alert("Please enter gender");
	}
	else if(course=="" || course==null)
	{
	alert("Please enter course");
	}
	else if(mobilenum=="" || mobilenum==null)
	{
	alert("Please enter mobile number");
	}
	else if(validmobileNo.test(mobilenum) == false)
	{
alert("Please enter a vaild mobile number");
	}
	else{
		flag=true;
		alert("Your details are successfully saved");
	}
		return flag;
}
function validatePayForm(){
	var name=payform.name.value;
	var cardNo=payform.cardNo.value;
	var cvvNo=payform.cvvNo.value;
	var exDate=payform.exDate.value;
	var validname=/^[A-Z]{3,}$/;
	var validcardNo=/^\d{16}$/;
	var validcvvNo=/^\d{3}$/;
	var dateformat = /^(0?[1-9]|1[012])[\/]\d{2}$/;
		var flag=false;
	if(name==""||name==null){
		alert("Please enter Card holder name");
	}
	else if(validname.test(name) == false)
			{
		alert("Please enter a vaild Card holder name");
			}
	else if(cardNo=="" || cardNo==null)
		{
		alert("Please enter card number");
		}
	else if(validcardNo.test(cardNo) == false)
	{
alert("Please enter a vaild card number");
	}
	else if(cvvNo=="" || cvvNo==null)
	{
	alert("Please enter cvv number");
	}
	else if(validcvvNo.test(cvvNo) == false)
	{
alert("Please enter a vaild cvv number");
	}
	else if(exDate=="" || exDate==null)
	{
	alert("Please enter expiry date");
	}
	else if(dateformat.test(exDate) == false)
	{
alert("Please enter a vaild date mm/yy");
	}
	else{
		flag=true;
		alert("Your payment is successfully done");
	}
		return flag;
}

