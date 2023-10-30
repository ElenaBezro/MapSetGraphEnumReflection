Morning session

Map

1. Basic HashMap:
   Create a HashMap named studentMap to store student information as key-value pairs.
   Define the key as the student ID (integer) and the value as the student's name (string).
   Add at least three students with their IDs and names to the map.
   Retrieve and print the name of a specific student by providing their ID using the get method.
   Confirm that the retrieval works as expected.

2.Iterating Over HashMap:
Iterate through the studentMap using a for-each loop or an iterator.
For each entry, print both the student ID (key) and the student name (value).
Emphasize that the order of the entries in a HashMap is not guaranteed to be in any specific order.

3.LinkedHashMap with Insertion Order:
Create a LinkedHashMap named capitalMap to store country-capital pairs.
Add entries for at least three countries and their respective capitals to the map.
Ensure that you add the entries in a specific order.
Demonstrate that the LinkedHashMap maintains insertion order by iterating through it and printing the country-capital pairs.

4.Removing Entries from HashMap:
Remove an entry from the studentMap by specifying the student's ID as the key to be removed.
Use the remove method to remove the entry.
Verify that the entry has been successfully removed by attempting to retrieve the student's name by their ID and checking if it returns null.

5.Using HashMap for Counting:
Create a HashMap named wordCountMap to count the frequency of words in a given text.
Split a sample text into words by using a space as the delimiter and store the words in an array.
Iterate through the array of words and update the counts in wordCountMap. Use the put method to add new words to the map or update the count if the word already exists.
Print the word frequencies stored in the map to verify that each word's count has been correctly calculated.

Set

1.Basic HashSet:
Create a HashSet named integerSet to store a collection of unique integers.
Use the add method to add at least four different integers to the set.
Attempt to add a duplicate integer to the set to demonstrate that the set ensures uniqueness.
Create a loop or iterator to iterate through integerSet and print its contents.

2.HashSet for String Deduplication:
Create a HashSet named uniqueStrings to store unique strings.
Define an array of strings with some duplicate values (e.g., "apple", "banana", "apple", "cherry").
Iterate through the array of strings and add each string to uniqueStrings to deduplicate the list.
Create a loop or iterator to iterate through uniqueStrings and print the unique strings.

3.TreeSet with Natural Ordering:
Create a TreeSet named sortedSet to store a collection of integers.
Add at least four integers to the set.
Demonstrate that the TreeSet automatically sorts the integers in natural (ascending) order.
Create a loop or iterator to iterate through sortedSet and print its sorted contents.

4.Custom Sorting with TreeSet:
Create a TreeSet named personSet to store custom objects (e.g., Person) that implement the Comparable interface.
Define a custom Person class with attributes such as name and age, and implement the compareTo method to define custom ordering.
Add instances of the custom Person objects to personSet.
Demonstrate that the TreeSet automatically sorts the Person objects based on the custom ordering.
Create a loop or iterator to iterate through personSet and print the sorted custom objects.

5.HashSet for Set Operations:
Create two HashSet instances named setA and setB to represent sets of integers.
Add several integers to both setA and setB.
Implement set operations to perform union, intersection, and difference between setA and setB.
Print the results of each set operation to demonstrate how to combine or extract elements from sets.


Evening session

Mini project

Project Title: Employee Management and Reporting System Project

Description: On the first day, we'll start with the Employee
Management System, emphasizing Java Map and Set to store and
manage employee data, while incorporating OOP and Collections.

Tasks:
Exercise 1

Create an Employee class with attributes like name, ID, department,
job title, and manager ID. Apply encapsulation and use getter and
setter methods.

Exercise 2

Implement a HashSet to store unique employees. Utilize proper data
structures and ensure efficient searching.

Exercise 3

Implement a HashMap to store employees with their IDs as keys.
Encapsulate access to the map and provide methods for CRUD operations.

Exercise 4

Implement methods to add, remove, and search for employees by ID, using
OOP principles to structure the code.

Exercise 5

Implement methods to filter and display employees by department, job title,
or manager, taking advantage of Java Collections for filtering.

Exercise 6

Implement methods to update employee information while maintaining data
integrity.

Exercise 7

Implement basic reporting functionality to display employee statistics (e.g.,
total employees, employees per department) using Java Map and Set.

Exercise 8

Add error handling with custom exceptions for scenarios like duplicate
employee IDs or invalid inputs.
