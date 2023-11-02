Morning session

Enum

1.Days of the Week:
Create an enum named DayOfWeek to represent the days of the week.
Define constants for each day (e.g., SUNDAY, MONDAY, TUESDAY, etc.) within the enum.
Implement a method called getNextDay in the enum that calculates and returns the next day of the week for a given day.
Demonstrate the usage of the DayOfWeek enum by using it to find the next day for a specific day (e.g., next day after "TUESDAY").

2.Card Suits:
Create an enum named CardSuit to represent the four suits in a standard deck of cards (Hearts, Diamonds, Clubs, Spades).
Define constants for each suit within the enum.
Implement a method called getRandomSuit in the enum that selects and returns a random card suit.
Demonstrate the usage of the CardSuit enum by generating and printing a random card suit.

3.Months of the Year:
Create an enum named Month to represent the months of the year.
Define constants for each month (e.g., JANUARY, FEBRUARY, etc.) within the enum.
Implement a constructor in the enum that takes an integer representing the number of days in the month and stores it as an instance variable.
Implement a method called getDays that returns the number of days in a specific month.
Demonstrate the usage of the Month enum by finding and printing the number of days in a particular month (e.g., "FEBRUARY").

4.Directional Constants:
Create an enum named Direction to represent cardinal directions (NORTH, SOUTH, EAST, WEST).
Define constants for each direction within the enum.
Implement a constructor in the enum that takes two integers, deltaX and deltaY, representing changes in x and y coordinates when moving in that direction.
Implement methods in the enum to calculate new x and y coordinates based on the current position and direction.
Demonstrate the usage of the Direction enum by simulating movement in different directions from a given starting position.

5.Traffic Lights:
Create an enum named TrafficLight to represent the three colors of a traffic light (RED, YELLOW, GREEN).
Define constants for each color within the enum.
Implement a method called getNextColor that calculates and returns the next color in the traffic light sequence.
Demonstrate the usage of the TrafficLight enum by simulating a traffic light sequence, starting from a given color, and printing the sequence.

Reflection

1.Inspecting Class Information:
Create a Java class named Person with private fields for name, age, and city, and a public method to get the name.
Write a Java program that uses reflection to inspect the Person class information dynamically.
Implement the following tasks using reflection:
Get and print the class name of the Person class.
Retrieve and print the names and types of all fields in the Person class.
Retrieve and print the names of all methods in the Person class.
Invoke the public method to get the name of an instance of the Person class.
Ensure you handle exceptions properly when working with reflection

2.Dynamic Object Creation:
Define a Java class named Car with private fields for make, model, and year, and public methods to access these fields.
Write a Java program that uses reflection to dynamically create an instance of the Car class, set its field values, and invoke its methods.
Implement the following tasks using reflection:
Get the Constructor object for the Car class and create an instance of Car using reflection.
Set the values of the private fields make, model, and year using reflection.
Invoke the public methods to get the values of these fields and print them.
Ensure you handle exceptions properly when working with reflection
