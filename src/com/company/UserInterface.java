package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    CollectionOfBooks collectionOfBooks = new CollectionOfBooks();

    public void addBook(){
        String title;
        String isbn;
        String author;
        int edition;
        double price;
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        title = scanner.nextLine();
        System.out.print("Enter isbn: ");
        isbn = scanner.next();
        System.out.print("Enter author: ");
        author = scanner.next();
        System.out.print("Enter price: ");
        price = scanner.nextDouble();
        System.out.print("Enter edition: ");
        edition = scanner.nextInt();
        collectionOfBooks.addBook(new Book(title,isbn, edition,price, author));

        System.out.println("Do you wont add edition ?  true/false ");
        //int num = scanner.nextInt();
        while (scanner.nextBoolean()) {
            System.out.println("Enter author: ");
            collectionOfBooks.getBook(collectionOfBooks.size() - 1).addAuthor(scanner.next());
            System.out.println("Do you wont add edition ?  true/false ");
        }
        System.out.println(" author successfully");

    }
    public void listBooks(){
        System.out.println("The list oll the books ");
        for (int i = 0; i < collectionOfBooks.size(); i++) {
            System.out.println(i+" "+collectionOfBooks.getBook(i).toString());
        }
    }
    public void  removeBook() {
            listBooks();
            
            int number = scanner.nextInt();
            if (number < collectionOfBooks.size()) {
                System.out.println(collectionOfBooks.getBook(number).toString());
                System.out.println("Confirm your removing!");
                if (number == 1) {
                    collectionOfBooks.removeBook(number);
                    System.out.println("The book removed!");
                } else {
                    System.out.println("The operation not successfully !");
                }
            } else {
                System.out.println("The book not with number!");
            }
        }
   public void printSearch(ArrayList<Book> arrayList){
    for (int i = 0; i < arrayList.size(); i++) {
        System.out.println(arrayList.get(i).toString());
    }
}

public void getBookByTitle(String title){
        printSearch(collectionOfBooks.searchTitle(title));
}
public  void getBookByIsbn(String isbn){
        printSearch(collectionOfBooks.searchIsbn(isbn));
}
public void getBookByAuthor(String author){
        printSearch(collectionOfBooks.searchAuthor(author));
}

public void searchMenu(){
        while (true) {
            System.out.println(
                            " 1. Search By title\n" +
                            " 2. Search by author\n" +
                            " 3. Search by isbn\n" +
                            " 4. Exit\n");
            System.out.print("Enter search ---> ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    System.out.print("Enter title: ");
                    getBookByTitle(scanner.next());
                    break;
                case 2:
                    System.out.print("Enter author: ");
                    getBookByAuthor(scanner.next());
                    break;
                case 3:
                    System.out.print("Enter isbn: ");
                    getBookByIsbn(scanner.next());
                    break;
                case 4:
                    Menu();
            }
        }
}
public void Menu(){
        while (true){
    System.out.println(
                    "-----> MENU <-----\n"+
                    " 1. Китеп кошуу\n" +
                    " 2. Китепти очуруу\n" +
                    " 3. Китеп издоо \n" +
                    " 4. Бут китептерди алып алуу\n" +
                    " 5. Чыгып кетуу \n");
    int num = scanner.nextInt();
    switch (num) {
        case 1:
            addBook();break;
        case 2:
            removeBook();break;
        case 3:
            searchMenu();break;
        case 4:
            listBooks();break;
        case 5:
            System.out.println("Конулдуу кун!");
            System.exit(0);
      }
    }
  }
}

