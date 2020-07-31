package o1_SeleniumMethods;

public class oo41_CustomCssSelector { }
/*
				
		Css   : Cascading Style Sheets. 
				- Css goes only forward. 
			
				- #username
				- //input[@id='username'][type='email']
				- input.form-control.private-form__control.login-email 	--> html'deki bosluklari nokta ile degistirdik.
				- button[id='loginBtn']
		   	 
		Dynamic Elements : When you refresh the page, element is changing. 
		
		Dynamic Css : 
		
		- forward 
			form-control private-form__control login-email
			input[class='form-control private-form__control login-email']	--> with attribute usage.
			input.login-email 	--> directly usage
		
		- contains()  *
			input[id*='username']
			input[name*='uid']
			
		- starts with  ^
			input[id^='username']
			label[id^='message']
			
		- ends with   $
			input[id$='username']
		
		- parent child relationship    >
			div>input[id='username']
			td > input[name='uid']
			td > label[id='message23']
		
		
		
	Xpath and Css : 
			- xpath is faster than Css in most of cases (2.4 version of xpath is very fast). Css is a little bit efficient. 
			- xpath allows very precise locators.
			- xpath relies on browser's xpath implementation which is not always complete.
			- Css allows for selection of elements by their surrounding context.
			- Css provides a good balance btw structure and attributes.
			- Css doesn't provide sibling, and, preceding, and ...etc. 
				
			xpath : //input[@id='username']
					//input[@id='username' and @type='email']
	
		
		
		
		

*/


















