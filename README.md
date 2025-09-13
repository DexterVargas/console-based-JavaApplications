# Exercise: Personal Library Management App

You will build a console-based Java application that allows users to manage their personal library of books. 

### This exercise will help you practice:

- Classes & objects
- Encapsulation (getters/setters)
- Lists and ArrayLists
- Loops and conditionals
- Basic input handling
- Simple searching and sorting

## Step 1: Define the problem

### We want a program that can:

1. Add a new book
2. View all books
3. Search books by title
4. Remove a book
5. Exit the program

### Each book should have:

- Title (String)
- Author (String)
- Year of Publication (int)
- ISBN (String)

### MAIN
```
________ Welcome to Book Management App ________
1. Add Book
2. Show All Books
3. Delete Book
4. Search Book by Title
5. Exit
Enter your choice: 
```

### Add
```
Enter your choice: 1
| ************ ADD NEW BOOK *************** |
Please enter the title: new book
Please enter the author: John Doe
Please enter the year published: 2025
Please enter ISBN: 12345-678
Book added successfully
```

### Show
```
Enter your choice: 2
************************** LIST OF BOOKS ************************** 
Title                          Author               Year  ISBN                
------------------------------ -------------------- ----- --------------------
Auto add book on startup       Test Constructor     2025  1236-4asd-23-09122025
new book                       John Doe             2025  12345-678 
```

### Remove
```
Enter your choice: 3
| ************ REMOVE a BOOK *************** |
Enter ISBN of book to remove from your library: 12345-6789
Book not found

Enter your choice: 3
| ************ REMOVE a BOOK *************** |
Enter ISBN of book to remove from your library: 12345-678
Book removed successfully
```

### Search 
(includes books that contains the search param)
```
Enter your choice: 4
Enter the title: book

 ************************** SEARCH RESULT ***************************
Title                          Author               Year  ISBN                
------------------------------ -------------------- ----- --------------------
2 book/s found successfully:
Auto add book on startup       Test Constructor     2025  1236-4asd-23-09122025
new book                       John Doe             2025  12345-678           
-------------------------------Search result end--------------------------------
```

### Exit
```
Enter your choice: 5
Exiting application...
```

### invalid choice
```
Enter your choice: asd
'asd' is not a valid. Please enter valid number. 
```