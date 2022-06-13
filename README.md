Technical Exercise - API Backend Exercise 
This API backend uses Java (Maven) and SQL(Postgres) using Spring Boot with the JDBC interface API.

Endpoints completed -
Retrieve a single transaction by ID and Retrieve all transactions by Account Number. 

Viewing Data (Postman) -
On postman, both of the endpoints are GET requests.
Single transaction by ID - http://localhost:8080/api/transactions/{ID}
After selecting send one id 
Retrieve all transactions by Account Number - http://localhost:8080/api/transactions/account/{accountNumber}

SQL - 
In the src -> main folder, there is a resource folder containing an (application. properties) file that holds the information to connect with a Postgres database, including the username and password. There is a script in the database folder that can be used to generate an appropriate "transactions" table and populate that table with the information from the provided JSON file. 

Unfinished areas and improvements -

I used a website to convert the JSON file to a CSV, and then in PG Admin, I used that CSV file to populate the table and then generated a script from PG Admin to make the table and populate the information. 
Rather than use a third party, I would have liked to create a custom program to intake the JSON file and then use a POST API endpoint to post each JSON object in the database. 
Making a custom program to load the JSON directly into a database could have been achieved by using Java GSON or Jackson libraries that allow you to map the JSON object to a Java object and place it into an array, and then you could loop through the array calling the API each time in the loop. The custom program would also allow you to "clean" the data before it goes into the database allowing for Date formatting so that you can make SQL queries to retrieve all transactions by DateRange and complete that endpoint. 
With additional time I would have also liked to make a simple CLI program that would call these endpoints. 
