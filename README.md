# Virtual Experience: Walmart Advanced Software Engineer
## Overview
The Virtual Experience for Walmart's Advanced Software Engineer position is designed to simulate real-world scenarios and challenges that we may encounter in your role at Walmart. Through these tasks, we will have the opportunity to showcase our technical skills and problem-solving abilities.
## Tasks
### Task 1: Advanced Data Structures**\
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

### Task 2: Software Architecture
Task 2 focuses on implementing a data pipeline to extract, transform, and load data from various sources into a centralized data warehouse. You'll be provided with sample data and will be required to write code to automate the data integration process while ensuring data quality and reliability.
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
