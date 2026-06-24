import java.util.ArrayList;
import java.util.Scanner;

// Book Class
class Book
{
    private int bookId;
    private String bookName;
    private String authorName;
    private int quantity;

    // Constructor
    public Book(int bookId, String bookName, String authorName, int quantity)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    // Getters
    public int getBookId()
    {
        return bookId;
    }

    public String getBookName()
    {
        return bookName;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    // Setter
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Display Book Details
    @Override
    public String toString()
    {
        return "Book ID      : " + bookId +
               "\nBook Name    : " + bookName +
               "\nAuthor Name  : " + authorName +
               "\nQuantity     : " + quantity;
    }
}

// Main Class
public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // ArrayList stores all books
        ArrayList<Book> books = new ArrayList<>();

        while(true)
        {
            System.out.println("\n==============================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM ");
            System.out.println("==============================");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Quantity");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                // ADD BOOK
                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    books.add(new Book(id, name, author, qty));

                    System.out.println("✅ Book Added Successfully");
                    break;

                // VIEW BOOKS
                case 2:

                    if(books.isEmpty())
                    {
                        System.out.println("No Books Available");
                    }
                    else
                    {
                        System.out.println("\n----- BOOK LIST -----");

                        for(Book b : books)
                        {
                            System.out.println(b);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                // SEARCH BOOK
                case 3:

                    System.out.print("Enter Book ID To Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(Book b : books)
                    {
                        if(b.getBookId() == searchId)
                        {
                            System.out.println("\nBook Found");
                            System.out.println(b);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("❌ Book Not Found");
                    }

                    break;

                // UPDATE BOOK
                case 4:

                    System.out.print("Enter Book ID To Update: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for(Book b : books)
                    {
                        if(b.getBookId() == updateId)
                        {
                            System.out.print("Enter New Quantity: ");
                            int newQty = sc.nextInt();

                            b.setQuantity(newQty);

                            System.out.println("✅ Book Updated Successfully");

                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("❌ Book Not Found");
                    }

                    break;

                // DELETE BOOK
                case 5:

                    System.out.print("Enter Book ID To Delete: ");
                    int deleteId = sc.nextInt();

                    Book deleteBook = null;

                    for(Book b : books)
                    {
                        if(b.getBookId() == deleteId)
                        {
                            deleteBook = b;
                            break;
                        }
                    }

                    if(deleteBook != null)
                    {
                        books.remove(deleteBook);
                        System.out.println("✅ Book Deleted Successfully");
                    }
                    else
                    {
                        System.out.println("❌ Book Not Found");
                    }

                    break;

                // EXIT
                case 6:

                    System.out.println("Thank You For Using Library Management System");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("❌ Invalid Choice");
            }
        }
    }
}
