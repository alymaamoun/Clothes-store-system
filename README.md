# Clothes-store-system
This is clothes store system
This system has two modes
First mode is admin and the second one is cashier
This modes are assigned in the login window


    In case of Cashier mode and username and password matches a row in cashier users database 
    A new window of main menu will appear having two options
    An option for new purchase and the other one if for logout

        In case of new purchase a new window will appear having the following fields:
        1- Text field for Product ID
        2- Text field for Product price
        3- Text field for Quantity of that product to be purchased 
        4- Table of the entities of the products loaded from the database 
        5- button for add to cart
            
            if pressed: stock in database with that id will be subtracted and added items will be updated
            
        6- button for reset
        
            if pressed: purchase will be reset and database will regain the subtracted number in stock
        
        7- Text area containing the added items in the form of reciept
        8- Text field for customer name
        9- Text field for customer phone number
        10- Button for procceed to checkout 
        
            if pressed: 
                        new window with reciept will appear having the following fields:
                        1- Text area containing the Reciept
                        2- Button for finish
                            if pressed: program will go to main menu again for new purchase or logout option
                            
