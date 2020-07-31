package o2_Locators;

public class Locators_All {

	public static void main(String[] args) {
		

	}

}
/*
 	* Locators are String.
 	* 
 	* findElement/s --> returns WebElement/s
 	* By --> to locate element
 	* .id...etc --> locator type
 	 
	# findElement() : 
 					returns first WebElement. 
 					it gives Exception if element not found
 					it used for single element
 					 
  	# findElements() :
  					returns List<WebElement>.
  					it doesn't give Exception if element not found.
  					list has null values.
  					it used to get multiple elements, to collect list concept.  
  
  	# Element locator types :
		1. id 		: First look at. The best. Fastest. Only ID is unique. Web site dynamic'se unique olmayabilir. 
		2. name		: Second look at. Can be multiple names. 
		3. className : Exmpl: 
					By username = By.className("form-control private-form__control login-email");
							             (-grandparentClass-    -parentClass-       -subClass-   )
					Aralardaki spaces mean now new different class.
					This is full className. We use last className -->  login-email. 
					Also, we can use full className. But sometimes it doesn't work. You need to find out. 
		
		4. tagName	: use '.findElements()'. tagName defines links. Cuz, you'll get multiple elements. All links start with 'a ' tag --> '<a href=...'
		5. cssSelector : Fourth look at. it is cascading stylesheet path. CSS is faster than xPath. You can customize CSS too with '#'.
		6. linkText	: Take link's all text. 
		7. partialLinkText 	: Take link's partial text.Sometimes it doesn't work. 
		8. xPath	:  Third look at.Stands for 'XML path'. Use to find element using HTML structure. Extensible Markup Language
		 				xPath Types: 
				 				1. Absoulate xPath >> Abs xPath : 
				 						- starts with single '/'. 
				 						- starts from root element and all the way to the element.
				 						- It can change. So don't prefer to use it on your tests. 
				 	
				 				2. Relative xPath  >> Rel xPath : 
				 						- starts with double '//'. 
				 						- starts selection matching anywhere in the document. 
				 						- If you customized well it is unique. 
				 						* Customizing xPath --> 	//tagName[@attributeName='value']
				 									Example -->		//input[@id='username']
				 						
		* to open customize bar --> Command + F
				 									 									 						
	# Tools to find xPath or CSS locators in HTML
		1. FireBug
		2. FirePath
		3. ChroPath : is the best tool to generate xPath. (But I should use customized xPath to learn well.)
 
	
	    
 










*/