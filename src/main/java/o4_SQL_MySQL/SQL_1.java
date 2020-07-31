package o4_SQL_MySQL;

public class SQL_1 {

}
/*
	Data: Facts related to object. 
	DataBase: Organize collection of the structure data. DB is a store where the data stored. 
	
	
	SQL : Structured Query Language	:
		- SQL is used to manage and manipulate database.
		- Standard language for dealing with relational databases(tables). 
		
	
	SQL Provides:
		- Querying data.
		- Inserting, updating, deleting, selecting data, rows table.	(data manipulation) 	(These are 'CRUD' in Postman) 
		- Creating, replacing, altering and dropping objects.	(data definition)
		- Controlling access to the database and its objects. 
	
	What are the categories of  SQL statements ? / What do you do with using SQL? 
	
		SQL divided into 4 type of categories language:
		- DML* : Data Manipulation Language : is used to manipulate data itself, effects record in a table. 
				There are basic operations we perform on data such as selecting data records on a table,
				inserting new records, deleting unnecessary records, updating/modifying records.  
				INSERT : is used to insert data into a table.
				UPDATE : is used to update existing data within a table.
				DELETE : is used to delete records from a database table.
				SELECT : is used to select something in database table. 
				
		- DDL* : Data Defination Language : is used to create, alter, drop, modify the database or table structure and schema.   
				DDL handles the design and storage of the database objects. 
				CREATE : is used to create the database or its objects (like table, index, function, views, store procedure and triggers).
				REPLACE : is used to replace, modify the data .
				DROP : is used to delete objects from the database.
				ALTER- : is used to alter the structure of the database. to change.  
				TRUNCATE : is used to remove all records from a table, including all spaces allocated for the records are removed.
				COMMENT : is used to add comments to the data dictionary.
				RENAME : is used to rename an object existing in the database.
	
		- DSL : Data Control Language : is used to grant and revoke which mainly deals with the rights, 
				permissions and other controls of the database system. Defines level of the access to database. (This is not our job)   
				GRANT : gives user’s access privileges to database.
				REVOKE: withdraw user’s access privileges given by using the 'GRANT' command.
				
		- TCL : Transaction Control Language : is used to integrate the data. 
				TCL allows you to control and manage transaction to maintain integrity of the data  
		   		with in SQL statements. TCL commands deals with the transaction within the database.
				COMMIT : commits a Transaction.
				ROLLBACK : rollbacks a transaction in case of any error occurs.
				SAVEPOINT : sets a savepoint within a transaction.
				SET TRANSACTION : specify characteristics for the transaction.
	 
	- SQL is related back-end testing. Many companies use SQL or MySQL as a server. 
	- SQL is paid version - original one 
	- MySQL is free version, open source - own by Oracle
	- NoSQL means Non-relational SQL / Not only SQL. NS is related to big data and in real time web applications . 
	
	
	create 							--> table, database
	use databaseName; 				--> select the database that we want to work with
	insert 							--> to add elements inside my table
	insert into tableName values(.....);
	show databases, tables; 		--> shows the amount of databases and tables
	describe tableName; 			--> shows all the features of your table
	where clause 					--> this clause is to add condition to your query
	like clause 					--> this is used in a where clause to search for a specified pattern in a fieldname
	distinct 						--> selects unique values from the table.
	
	select * from tableName;		--> select all the values from your table
	select concat(name, location) from Cars; 
	select names from salesmen with cities starting with p
	select salesmen_id + 10, name from salesmen;  		
	select fieldName(columnName) from tableName; 	-->select specific columns from the table
	select distinct columName from tableName;
	select * from TableName where fieldName = ‘value’;
	
	% 	 							--> this sign represents zero, one, two or multiple characters
	_ 								--> represents single character
	delete from Employee1 where EmployeeId = 3;		--> delete
	update							--> to update info
	inner join 						--> selects values that are matching in both tables. it returns data rows when rows matched.
	left join 						--> selecting all values from the left table and matching values. If there is no match from the right side it will return null.
	right join 						--> selecting all values from the right table and matching values.
	outer join						--> 
	left outer join 				--> returns all records from left table, and the matched records from right table. 
	right outer join 				--> returns all records from right table, and the matched records from left table.
	full join 						--> returns all records when there is match in either in either left or right table. 
	
	
	
	
	
	
	
	
	

*/