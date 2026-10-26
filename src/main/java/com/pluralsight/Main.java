package com.pluralsight;

public class Main {

    public static void main(String[] args){

        Book[] books = {
                new Book(1,  "9780743273565", "The Great Gatsby"),
                new Book(2,  "9780061120084", "To Kill a Mockingbird"),
                new Book(3,  "9780451524935", "1984"),
                new Book(4,  "9780141439518", "Pride and Prejudice"),
                new Book(5,  "9780316769488", "The Catcher in the Rye"),
                new Book(6,  "9780547928227", "The Hobbit"),
                new Book(7,  "9780590353427", "Harry Potter and the Sorcerer's Stone"),
                new Book(8,  "9780060850524", "Brave New World"),
                new Book(9,  "9780142437247", "Moby-Dick"),
                new Book(10, "9780439023528", "The Hunger Games"),
                new Book(11, "9780618640157", "The Lord of the Rings"),
                new Book(12, "9781451673319", "Fahrenheit 451"),
                new Book(13, "9780141441146", "Jane Eyre"),
                new Book(14, "9780062315007", "The Alchemist"),
                new Book(15, "9780140177398", "Of Mice and Men"),
                new Book(16, "9780451526342", "Animal Farm"),
                new Book(17, "9780441172719", "Dune"),
                new Book(18, "9780385490818", "The Handmaid's Tale"),
                new Book(19, "9780399501487", "Lord of the Flies"),
                new Book(20, "9781451626650", "Catch-22")
        };


        String mainMenuText = """
                
                
                === MAIN MENU ===
                
                What do you want to do?
                1 - Show Available Books
                2 - Show Checked Out Books
                0 - Quit
                Enter your command:""";

        int choice;
        do{
            choice = Console.promptForInt(mainMenuText);
            switch(choice){
                case 1 -> processShowAvailableBooks(books);
                case 2 -> processShowCheckoutOutBooks(books);
                default -> System.out.println("Invalid command, please try again...");
            }
        }  while (choice != 0);




    }

    private static void processShowAvailableBooks(Book[] books) {

    }

    private static void processShowCheckoutOutBooks(Book[] books) {

    }



}
