# Virtual Experience: Walmart Advanced Software Engineer
## Overview
The Virtual Experience for Walmart's Advanced Software Engineer position is designed to simulate real-world scenarios and challenges that we may encounter in your role at Walmart. Through these tasks, we will have the opportunity to showcase our technical skills and problem-solving abilities.
## Tasks
### Task 1: Advanced Data Structures
In this task, we will be given a scenario where we need to design a scalable system for handling high volumes of customer orders. we'll be expected to analyze the requirements, identify potential bottlenecks, and propose an efficient architecture that can handle the load effectively. In this Task I designed a Modified Heap where it generates 2<sup>x</sup> childs for every parent node.
The heap must satisfy the heap property.
<ul>
  <li>Every parent node in the heap must have 2^x children.</li>
  <li>The value of x must be a parameter of the heap’s constructor.</li>
  <li>The heap must implement an insert method.</li>
  <li>The heap must implement a pop max method.</li>
  <li>The heap must be implemented in Java.</li>
  <li>The heap must be performant.</li>
  <li>You must use a more descriptive variable name than x in your implementation.</li>
</ul>
<hr>

### Task 2: Software Architecture
Task 2 focuses on implementing UML Class diagram for data pipeline to extract, transform, and load data from various sources into a centralized data warehouse. You'll be provided with sample data and will be required to write code to automate the data integration process while ensuring data quality and reliability.
<ul>
  <li>The processor must implement a configure method that accepts a ModeIdentifier and a DatabaseIdentifier as parameters.
This method is called to change the operating mode of the processor, and/or select the current database.</li>
<li>The processor must be able to change between the following modes:
Dump mode: simply drops the data.
Passthrough mode: inserts the data into the currently configured database.
Validate mode: validates the data, then inserts it (both operations are carried out on the currently configured database).</li>
<li>The processor must be able to swap between the following databases. Each database will require a different implementation to insert and validate data</li>
Postgres.
Redis.
Elastic.
<li>The processor must implement a process method that accepts a DataPoint as a parameter.<li>
This method will have different behaviour depending on the currently configured mode and database.
</ul>
<hr>

### Task 3: Relational Database Design
Task 3 focuses on drafting an Entity Relation Diagram - ERD based on the given requirements for the data processors for the pipeline
ERD should include
Datapoint: this class represents both raw and processed data points. Any time data moves between methods you may use this class as an abstraction.

ModeIdentifier: an enum used to identify a processor mode.

DatabaseIdentifier: an enum used to identify a database connection.
### REQUIREMENTS
<ul>
  <li>The database should store information related to the following products.</li>
  <li>Pet food, which has a name, manufacturer, weight, flavor, and target health condition.</li>
  <li>Pet toys, which have an associated material, name, manufacturer, and durability.</li>
  <li>Pet apparel, which has a colour, manufacturer, size, name, and specific care instructions.</li>
  <li>Each product should be associated with one or more animals.</li>
  <li>Each product should be associated with a manufacturer.</li>
  <li>The database should track customers and their transactions.</li>
  <li>It should store customer names and email addresses.</li>
  <li>Customers can make transactions to purchase one or more products.</li>
  <li>Each transaction should store the date and the products involved.</li>
  <li>The database should track shipments to various Walmart locations.</li>
  <li>Each location should be represented by a name and a zip code.</li>
  <li>A shipment is recorded as an origin, a destination, and a collection of products, each with an associated quantity.</li>
</ul>
<hr>

### Task 4: Data Munging
Task 4 is based on formating the data from given data sheets.
<ul>
  <li>
Part A:
    </li>
First, fork and clone the repository at: https://github.com/theforage/forage-walmart-task-4
<li>
 Part B: 
 </li>
Task is to insert all of the data contained in the provided spreadsheets into the SQLite database. You will write a Python script which:
  </ul>
<ul>
  <li>Reads each row from the spreadsheets.</li>
  <li>Extracts the relevant data.</li>
  <li>Munges it into a format that fits the database schema.</li>
  <li>Inserts the data into the database.</li>
</ul>
<p>
Spreadsheet 0 is self-contained and can simply be inserted into the database, but spreadsheets 1 and 2 are dependent on one another. Spreadsheet 1 contains a single product per row, you will need to combine each row based on its shipping identifier, determine the quantity of goods in the shipment, and add a new row to the database for each product in the shipment. The origin and destination for each shipment in spreadsheet 1 are contained in spreadsheet 2. You may assume that all the given data is valid - product names are always spelt the same way, quantities are positive, etc. 
  </p>
