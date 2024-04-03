//Java Class HashSet is used to check if an item exists.
import java.util.HashSet;
//Java Class scanner is used to get an input from the user.
import java.util.Scanner;

//public is an access modifier which allows any class or external package to access their code.
public class Application {

    //public static void main(String[] args) is a necessary function in order for the program to be executed.
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Here the input is taken for whether the user is a customer is a customer or a staff member.
        System.out.println("If Customer insert 1, if Staff insert 2");
        int c_s = scanner.nextInt();

        //Here an input is taken for the user ID
        System.out.println("ID");
        int ID = scanner.nextInt();

        //Here an input is taken for the user Password
        System.out.println("password");
        String password = scanner.next();
        //Here java class HashSet is used to check if the user access,ID and password as valid.
        HashSet<String> allowedPassword = new HashSet<>();
        allowedPassword.add("1:1:Password123");
        allowedPassword.add("1:2:T456Gfrt");
        allowedPassword.add("1:3:HTROng46");
        allowedPassword.add("2:4:TeddyB555");
        allowedPassword.add("2:5:HP2007sjb");
        //The variable combination is used to format the inputs to be verified by the HashSet class.
        String combination = c_s + ":" + ID + ":" + password;
        /*If function is used for selection. Here it is used to check the validity of user credentials.*/
        if (allowedPassword.contains(combination)) {
            System.out.println("Valid ID and Password");
            //If function is used for selection. Here it is used to differentiate between customer and staff
            if (c_s == 1) {
                //System.out.println() function is used to display a message/output
                System.out.println("   ");
                System.out.println("***************Customer Home Page**************");
                System.out.println("    ");
                /*scanner object is used to obtain and store the input of the user, whether the user chooses to view product
                list or order status. */
                System.out.println("To view Product list insert 1, To view Order Status insert 2");
                int Cus = scanner.nextInt();

                /*If function is used for selection. Here it is used to differentiate customer's choice
                between Product list (1) or order status (2)*/
                if (Cus == 1) {
                    System.out.println("     ");
                    System.out.println("//////////Product List//////////");
                    System.out.println("     ");
                    System.out.println("Apple - 1");
                    System.out.println("Fish - 2");
                    System.out.println("Maliben LemonPuff - 3");
                    System.out.println("Pencil - 4");
                    System.out.println("Eraser - 5");
                    System.out.println("   ");
                    /*scanner object is used to obtain and store the input of the user, what product the customer chooses
                    to view. */
                    System.out.println("To view product insert related number");
                    int Pr = scanner.nextInt();

                    double price;
                    String Pname;

                    /*If function is used for selection. Here it is used to differentiate customer's choice
                    between the various products*/
                    if (Pr == 1) {
                        Pname = "Apple";
                        price = 50.00;
                    } else if (Pr == 2) {
                        Pname = "Fish";
                        price = 200.00;
                    } else if (Pr == 3){
                        Pname = "Malliben LemonPuff";
                        price = 250.00;
                    } else if (Pr ==4) {
                        Pname = "Pencil";
                        price = 30.00;
                    } else if (Pr == 5) {
                        Pname = "Pencil";
                        price = 25.00;
                    }
                    //else function is used to denote actions that need to be taken if the "If" function is false
                    else
                    {price = 0.00;
                        Pname = "Error";
                        System.out.println("Sorry For now these are the only items available online. Please chose from them.");}

                    System.out.println("  ");
                    System.out.println(" Name of Product - " + Pname);
                    System.out.println("Price - "+ price);

                    /*scanner object is used to obtain and store the input of the user, whether the user decides
                    to view product list to buy or to view another product  */
                    System.out.println("To go back to product list to chose products to buy insert 1, To view another product insert 2");
                    int Back = scanner.nextInt();
                    
                    /*If function is used for selection. Here it is used to check whether the user decides
                    to view product list to buy or to view another product */
                    if (Back == 2){
                        System.out.println("     ");
                        System.out.println("//////////Product List//////////");
                        System.out.println("     ");
                        System.out.println("Apples - 1");
                        System.out.println("Fish - 2");
                        System.out.println("Maliben LemonPuff - 3");
                        System.out.println("Pencil - 4");
                        System.out.println("Eraser - 5");
                        System.out.println("   ");
                        System.out.println("To view product insert related number");

                        int Pr2 = scanner.nextInt();
                        String Pname2;

                        //If function is used for selection. Here it is used to select the product selected
                        if (Pr2 == 1) {
                            Pname2 = "Apple";
                            price = 50.00;
                        } else if (Pr2 == 2) {
                            Pname2 = "Fish";
                            price = 200.00;
                        } else if (Pr2 == 3){
                            Pname2 = "Malliben LemonPuff";
                            price = 250.00;
                        } else if (Pr2 ==4) {
                            Pname2 = "Pencil";
                            price = 30.00;
                        } else if (Pr2 == 5) {
                            Pname2 = "Pencil";
                            price = 25.00;
                        } else
                        {price = 0.00;
                            Pname2 = " ";
                            System.out.println("Sorry For now these are the only items available online. Please chose from them.");}

                        System.out.println("  ");
                        System.out.println(" Name of Product - " + Pname2);
                        System.out.println("Price - "+ price);

                    }else if (Back == 1) {
                        System.out.println("     ");
                        System.out.println("//////////Product List//////////");
                        System.out.println("     ");
                        System.out.println("Apples - 1");
                        System.out.println("Fish - 2");
                        System.out.println("Maliben LemonPuff - 3");
                        System.out.println("Pencil - 4");
                        System.out.println("Eraser - 5");
                        System.out.println("   ");
                        /*scanner object is used to obtain and store the input of the user, what products
                        the user chooses */
                        System.out.println("To select 2 items to Buy insert the numbers of the items");
                        int Buy = scanner.nextInt();
                        int Buy2 = scanner.nextInt();
                        String Name1;
                        double pri1;

                        //If function is used for selection. Here it is used to select the product selected.
                        if (Buy == 1) {
                            Name1 = "Apple";
                            pri1 = 50.00;
                        } else if (Buy == 2) {
                            Name1 = "Fish";
                            pri1 = 200.00;
                        } else if (Buy == 3){
                            Name1 = "Malliben LemonPuff";
                            pri1 = 250.00;
                        } else if (Buy ==4) {
                            Name1 = "Pencil";
                            pri1 = 30.00;
                        } else if (Buy == 5) {
                            Name1 = "Eraser";
                            pri1 = 25.00;
                        } else
                        {pri1 = 0.00;
                            Name1 = " ";
                            System.out.println("Sorry For now these are the only items available online. Please chose from them.");}

                        String Name2;
                        double pri2;

                        //If function is used for selection. Here it is used to select the product selected.
                        if (Buy2 == 1) {
                            Name2 = "Apple";
                            pri2 = 50.00;
                        } else if (Buy2 == 2) {
                            Name2 = "Fish";
                            pri2 = 200.00;
                        } else if (Buy2 == 3){
                            Name2 = "Malliben LemonPuff";
                            pri2 = 250.00;
                        } else if (Buy2 == 4) {
                            Name2 = "Pencil";
                            pri2 = 30.00;
                        } else if (Buy2 == 5) {
                            Name2 = "Eraser";
                            pri2 = 25.00;
                        } else
                        {pri2 = 0.00;
                            Name2 = " ";
                            System.out.println("Sorry For now these are the only items available online. Please chose from them.");}
                        double Total_price = pri1 + pri2;

                        System.out.println("Insert 1 to Proceed with buying");
                        int proceed = scanner.nextInt();
                        //If function is used for selection. Here it is used confirm order.
                        if (proceed == 1){
                            System.out.println("----------Check Out ----------");
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("Product 1 - "+Name1);
                            System.out.println("Price - "+pri1);
                            System.out.println(" ");
                            System.out.println("Product 2 - "+Name2);
                            System.out.println("Price - "+pri2);
                            System.out.println(" ");
                            System.out.println("Total Price = "+Total_price);
                        }

                    } else System.out.println(" ");
                }else if (Cus == 2) {
                    System.out.println("----------***Order Status***----------");
                    System.out.println(" ");
                    System.out.println("Order 1 - Apple - Delivered");
                    System.out.println("Order 2 - Eraser - Delivered");
                    System.out.println("Order 3 - Malliben LemonPuff - Processing Order");
                    /*scanner object is used to obtain and store the input of the user, Confirmation
                    to cancel order.*/
                    System.out.println("To Cancel order insert 1");
                    int cancel = scanner.nextInt();
                    //If function is used for selection. Here it is used to confirm to cancel order
                    if (cancel == 1){
                        System.out.println("Order 3 - Malliben LemonPuff - Cancelled");
                    }
                }
            } else if (c_s == 2) {
                System.out.println("   ");
                System.out.println("***************Staff Home Page**************");
                System.out.println("    ");
                System.out.println("To view Product list insert 1, To view Customer Orders insert 2");
                int Sta = scanner.nextInt();

                if (Sta == 1) {
                    System.out.println("     ");
                    System.out.println("//////////Product List//////////");
                    System.out.println("     ");
                    System.out.println("Apple - 1");
                    System.out.println("Fish - 2");
                    System.out.println("Maliben LemonPuff - 3");
                    System.out.println("Pencil - 4");
                    System.out.println("Eraser - 5");
                    System.out.println("   ");
                    /*scanner object is used to obtain and store the input of the user,
                    whether the user chooses to view product list or customer order. */
                    System.out.println("To view product insert related number else to add/delete product " +
                            "insert 10");
                    int Pr = scanner.nextInt();
                    double price;
                    String Pname;

                    //If function is used for selection. Here it is used to select the product selected.
                    if (Pr == 1) {
                        Pname = "Apple";
                        price = 50.00;
                    } else if (Pr == 2) {
                        Pname = "Fish";
                        price = 200.00;
                    } else if (Pr == 3){
                        Pname = "Malliben LemonPuff";
                        price = 250.00;
                    } else if (Pr ==4) {
                        Pname = "Pencil";
                        price = 30.00;
                    } else if (Pr == 5) {
                        Pname = "Pencil";
                        price = 25.00;
                    } else
                    {
                        /*scanner object is used to obtain and store the input of the user,
                        whether the user chooses to Add or Delete product. */
                        System.out.println("To add insert 1, To delete view product insert 2");
                        int add_delete = scanner.nextInt();
                        System.out.println(" ");
                        /*If function is used for selection. Here it is used to select the option selected,
                        Add or Delete */
                        if (add_delete == 1){
                            /*scanner object is used to obtain and store the input of the user,
                            Information on the new product */
                            System.out.println("Name");
                            String New = scanner.next();

                            System.out.println(" ");
                            System.out.println("Price");
                            double NP = scanner.nextDouble();

                            System.out.println("     ");

                            System.out.println("//////////Product List//////////");
                            System.out.println("     ");
                            System.out.println("Apple - 1");
                            System.out.println("Fish - 2");
                            System.out.println("Maliben LemonPuff - 3");
                            System.out.println("Pencil - 4");
                            System.out.println("Eraser - 5");
                            System.out.println(New+" - 6");
                            System.out.println("   ");

                        } else if (add_delete == 2) {
                            /*scanner object is used to obtain and store the input of the user,
                            what product the user chooses */
                            System.out.println("Select item to delete (Number)");
                            int delete = scanner.nextInt();
                            /*scanner object is used to obtain and store the input of the user, Confirmation
                            to Delete Product.*/
                            System.out.println("To Confirm delete insert 1");
                            int conf = scanner.nextInt();

                            //If function is used for selection. Here it is used to confirm to product deletion
                            if (conf == 1) {
                                /*If function is used for selection. Here it is used to determine the
                                product to be deleted */
                                if (delete == 1) {
                                    System.out.println("     ");
                                    System.out.println("//////////Product List//////////");
                                    System.out.println("     ");
                                    System.out.println("Fish - 1");
                                    System.out.println("Maliben LemonPuff - 2");
                                    System.out.println("Pencil - 3");
                                    System.out.println("Eraser - 4");
                                } else if (delete == 2) {
                                    System.out.println("     ");
                                    System.out.println("//////////Product List//////////");
                                    System.out.println("     ");
                                    System.out.println("Apple - 1");
                                    System.out.println("Maliben LemonPuff - 2");
                                    System.out.println("Pencil - 3");
                                    System.out.println("Eraser - 4");
                                } else if (delete == 3) {
                                    System.out.println("     ");
                                    System.out.println("//////////Product List//////////");
                                    System.out.println("     ");
                                    System.out.println("Apple - 1");
                                    System.out.println("Fish - 2");
                                    System.out.println("Pencil - 3");
                                    System.out.println("Eraser - 4");
                                } else if (delete == 4) {
                                    System.out.println("     ");
                                    System.out.println("//////////Product List//////////");
                                    System.out.println("     ");
                                    System.out.println("Apple - 1");
                                    System.out.println("Fish - 2");
                                    System.out.println("Maliben LemonPuff - 3");
                                    System.out.println("Eraser - 4");
                                } else if (delete == 5) {
                                    System.out.println("     ");
                                    System.out.println("//////////Product List//////////");
                                    System.out.println("     ");
                                    System.out.println("Apple - 1");
                                    System.out.println("Fish - 2");
                                    System.out.println("Maliben LemonPuff - 3");
                                    System.out.println("Pencil - 4");
                                } else System.out.println(" ");
                            }
                        }
                    }Pname = " ";
                    price = 0;
                    System.out.println(Pr +" - "+ Pname + " - "+price);

                    /*scanner object is used to obtain and store the input of the user, Confirmation
                    to Edit Product.*/
                    System.out.println("To Edit insert 1");
                    int edit = scanner.nextInt();

                    //If function is used for selection. Here it is used to confirm editing
                    if (edit == 1){
                        /*scanner object is used to obtain and store the input of the user, whether
                        the user chooses to Edit product name or price.*/
                        System.out.println("To edit Product name insert 1, to edit product price insert 2");
                        int edit2 = scanner.nextInt();

                        /*If function is used for selection. Here it is used to check if the user
                        wants to edit Name(1) or price(2). */
                        if (edit2 == 1){
                            System.out.println("Name");
                            String newName = scanner.next();
                            Pname = newName;
                        } else if (edit2 == 2){
                            System.out.println("Price");
                            double newPrice = scanner.nextDouble();
                            price = newPrice;
                        }

                        System.out.println(Pr +" - "+ Pname + " - "+price);
                    }


                } else if (Sta == 2) {
                    System.out.println("+++++++++++++++Customer Orders+++++++++++++++");
                    System.out.println(" ");
                    System.out.println("Customer ID - 1");
                    System.out.println("Order - 1");
                    System.out.println("Total Price - Rs. 250");
                    System.out.println(" ");
                    System.out.println("Customer ID - 4");
                    System.out.println("Order - 2");
                    System.out.println("Total Price - Rs. 500");
                    System.out.println(" ");
                    System.out.println("Customer ID - 2");
                    System.out.println("Order - 3");
                    System.out.println("Total Price - Rs. 320");
                }

            }
            System.out.println(" ");
        } else System.out.println("Invalid  ID or Password");
    }
}