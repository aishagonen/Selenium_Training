package o5_Maven;

public class MavenCommands {}
/*
		mvn --version : maven'in versionunu check et. 
		
	1. Once execute edecegin projenin path'ini properties'ten bulup copy'le ve terminal'de paste et & enter
	
	2. mvn clean install -Denv=qa 	: 
			clean install --> first all necessary files -plug in- will be installed then execute all test cases. 
			-D  --> all parameters, all environment in your framework.
	 		env --> 'env' in code. 
			qa  --> 'qa' in code.
	
	3. mvn test -Denv=qa : executes test directly - all classes and all test cases run -. 
	
	
	4. mvn clean install -Dtest=com.hubspot.tests.LoginPageTest -Denv=stg 	: execute to test only one class
		
		
	5. 	mvn -Dtest=LoginPageTest#loginTest test 	: execute to test only one method
		
		
		
		
		
		
		
		
		
		
		
		

*/