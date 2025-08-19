//-------------------------------Delete---------------------------
//Delete removes all rows from a table and keeps the table structure intact.
//Removes rows from a table based on a condition using a WHERE clause.
//If WHERE is not used, it deletes all rows but keeps the table structure intact.
//Deletes rows one by one, so it can be slower for large tables.

//-------------------------------Truncate---------------------------
//TRUNCATE removes all rows from a table and keeps the table structure intact similar to delete
//We Cannot use a WHERE clause — removes all rows, and faster than DELETE because it deallocates data pages instead of deleting row by row.
//deallocating data pages means the database frees whole chunks of storage at once, effectively removing all rows at once, 
//rather than deleting them one by one. better explanation

//-------------------------------Drop---------------------------
//Removes the entire table structure and all data permanently.
//We Cannot use a WHERE clause- removes entire table from the database.


//---------------------------------------------Inner Join------------------------------------
//An INNER JOIN returns only the rows that have matching values in both tables based on the join condition. It retrieves the 
//common records between two tables.

//Suppose you have two tables: customers and orders

//Customers

//customer_id	 name
//1	         Alice
//2	          Bob
//3	         Charlie

//Orders
//order_id	customer_id	  amount
//101	          1	           500
//102	          2	           300
//103	          4	           200

//How it works:-
//The customer_id is the common column in both tables. INNER JOIN returns only the rows where the customer_id exists in both tables. 
//So, for customer_id 1 and 2, which are present in both tables, it returns the matching data (Alice and Bob with their order amounts). 
//It excludes customer_id 3 (which exists only in Customers) and customer_id 4 (which exists only in Orders) 
//because they don’t have matches in both tables.
