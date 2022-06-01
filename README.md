<h1 align="center">StoreManager</h1>

## Description
A program for a retail store. Staches and searches for items that are entered by the Store manager. 

This program has eight different methods: main, printMainMenu, printEntryMenu, getUserChoice, createProductList
enterProduct, searchProduct, clearProductList.
 - **_main:_** uses a do-while loop to create the program. Inside this loop, the menus and getUserChoice() methods are all
called. Uses a switch statement to execute one statement from multiple conditions. It takes the users choice of either adding 
or searching for a product and matches that with the correct statement. If the user choice is '9', then the program will end. 
 - **_printMainMenu, printEntryMenu:_** Both of these methods are used in the switch statement to be used to display the options
to the users.  
- **_getUserChoice:_** asks for and returns the user's choice. In a program where the user choices is asked for multiple times, 
it is good to create its own method to reduce redundancy in your code. This method is called in multiple different methods throughout
the program. 
- **_createProductList:_** calls the clearProductList() method to clear both product and price arrays before entering a 
new batch of inventory. Similar to the main method, this method uses a do-while loop with a switch case inside to see if the user would 
like to enter a product into their system. If they choose the option to enter a product, then the switch calls the enterProduct() method
- **_enterProduct:_** asks the user for the product's name and price, then stores them in their respective arrays. The globally declared 
variable count is increased before the method ends. This varaible is used as an index for both arrays. When ever this method is called 
the varaible increases so that when the next time the method is called, both arrays will go to the next spot in the array. 
- **_searchProduct:_** asks for the product that the user wants to search for. Uses that varaible in a for loop to search for the item. 
Uses the equals() method to search the array for the correct item. If the item is found in the array, the boolean found varaible is set
to true and the int foundIndex variable is set to that place in the array. It then uses those two varaibles to display wether or not
that product is in the system. If it is, it will print out the name and the price. 
- **_clearProductList:_** uses a for loop to clear both arrays. At every index, the productName array is set to NULL and the productPrice
array is set to 0. 

## Outcome
<p align="center">
  <img src="https://user-images.githubusercontent.com/80684500/170722786-77e239ad-7379-4145-ad9c-fc1ba2fde2cb.JPG" alt="Sublime's custom image"/>
  <img src="https://user-images.githubusercontent.com/80684500/170722789-f602ab60-bf14-4262-a377-4eca72c8f479.JPG" alt="Sublime's custom image"/>
</p>

## Projects
|  Num  | Project                                                                                                 | Author                                            |
| ----- | ------------------------------------------------------------------------------------------------------- | --------------------------------------------------|
|   1   | [Bookstore](https://github.com/JamesSmith232/BookStore)                                                 | [James Smith](https://github.com/JamesSmith232)   |
|   2   | [Lottery](https://github.com/JamesSmith232/Lottery)                                                     | [James Smith](https://github.com/JamesSmith232)   |
|   3   | [FizzBuzz](https://github.com/JamesSmith232/FizzBuzz)                                                   | [James Smith](https://github.com/JamesSmith232)   |
|   4   | [RockPaperScissors](https://github.com/JamesSmith232/RockPaperScissors)                                 | [James Smith](https://github.com/JamesSmith232)   |
|   5   | [Grader](https://github.com/JamesSmith232/Grader)                                                       | [James Smith](https://github.com/JamesSmith232)   |
|   6   | [StoreManager](https://github.com/JamesSmith232/StoreManager)                                           | [James Smith](https://github.com/JamesSmith232)   |
|   7   | [TicTacToe](https://github.com/JamesSmith232/TicTacToe)                                                 | [James Smith](https://github.com/JamesSmith232)   |
