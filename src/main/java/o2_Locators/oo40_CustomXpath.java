package o2_Locators;

public class oo40_CustomXpath { }
/*
		
	Xpath : XML path. 
	
		// --> select current node.
		
		//htmlTag[@attributeName='value']
		
		- Absolute : Directly find element from root. Disadvantage: If anything change in the path of element so it is change. 
		- Relative := Flexible and professional. 
					= Shorter.   
					= 'and' consept doesn't work with xPath. But or works.  
	
		//input[@id='username']
		//input[@class='form-control input-text' and @placeholder='First Name']

	Dynamic Xpath : 
	
		Dynamic Elements : When you refresh the page, element can change. This is dynamic elements. 
			<input id=test_123>
			<input id=test_345>
		To find like these elements you can use one of them;
		
	- //*[...  --> * collect all tags. 	
		
		
			- contains()
			 	//*[contains(@id='message')]
				//input[contains(@id, 'test_')]
				//option[contains(text(), 'CRMPRO - $29.95 user/mo.')]
				//option[contains(text(), 'Free Edition')]
				//input[contains(@name, 'password') and @type='password']
				//input[@class='btn btn-small' and @value='Login'] 
						
			- text()
				//*[text()='UserID']
				//*[contains(text(), 'UserID')]
				//i18n-string[text()='Sign up']
				//i18n-string[text()= 'Privacy Policy']
				//i18n-string[contains(text(), 'Privacy Policy')]
				//i18n-string[@data-key='login.footer.privacy'] different
			
			- if there is one tag on the page.
				h2[text()]
				
			- parent to child (sibling) tags 
				//div[@class='private-alert__inner']//h5
				//div[@class='form-group has-feedback']/input[@name='first_name'] 	--> direct child
				//*[@id='java_technologies']//child::li
				//*[@id='java_technologies']//child::li[1]
				//*[@id='java_technologies']//child::li[2]
				
			- following:: 			--> it selects all elements in the document of the current node. 
				//*[@type='password']//following::input
				//*[@type='password']//following::input[1]
				//*[@type='password']//following::input[2]
				//div[@class='private-form__input-wrapper']/following::input[@id='password']
				//div[@class='private-form__label-wrapper']/following::input[@id='username']
				
			- preceding::			--> It select all nodes that come before the current node.
				//input[@id='password']/preceding::div[@class='private-form__input-wrapper']
				//input[@name='surname']/preceding::div[@class='form-group has-feedback']
				//input[@type='submit']//preceding::td
				//input[@type='submit']//preceding::input

			 - child to parent (reverse direction)
				//input[@id='password']/../../../../.. 		--> '/..' yaptikca bir ust parenta gider. 
			 	//input[@id='password']//parent::div
			 	//input[@id='password']//parent::div//parent::form
			
			- parent::
				=//input[@name='surname']//parent::div
				//input[@name='surname']//parent::div//parent::form
				 
				 
			- following-sibling	 
				//input[@type='submit']//following-sibling::input
				//input[@type='submit']//following-sibling::input[1]
			
			- self 						--> selects the current node or 'self' means it indicates the node itself.
				//input[@type='password']//self::input
				
			- ancestor::				--> The ancestor axis selects all ancestors (granparent, parent, ...) of the current node
				//*[text()='Testing']//ancestor::div[1]
				//*[text()='Testing']//ancestor::div[2]
				//input[@name='surname']//ancestor::body
			
			- start with
				//input[starts-with(@id,'username')]
				 
			- ends with 
				//input[ends-with(@id, '_test')]
			
			- position	--> means index number. 
				(//input[contains(@class, 'form-control')])[1] 		--> ayni isimde iki tane eleman oldugu icin position'ini aldik. 
				(//input[contains(@class, 'form-control')])[2]
				
			- direct position 
			 	(//input[contains(@class, 'form-control')])[position()=1]
				(//input[contains(@class, 'form-control')])[position()=2]
		
		
		
		
	Customizing xpath : 
 	
		- tagname[text()='textvalue']
		- tagname[starts-with(@attribute, 'textvalue')]
		- tagname[ends-with(@attribute, 'textvalue')]
		- tagname[contains(text(), 'textvalue']
		- tagname[starts-with(text(), 'textvalue']
	
		
*/