package code_f4.collection.library_manager;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addDocument(new Document(1, "Peter", 1));
        libraryManager.addDocument(new Document(2, "Jose", 3));
        libraryManager.addDocument(new Book(4, "New York Time", 5, "Michael", 10));
        libraryManager.addDocument(new Book(5, "Times out", 7, "Sarah", 25));
        libraryManager.addDocument(new Journal(8, "Tim", 2, 9, 5));
        libraryManager.addDocument(new Journal(7, "John", 5, 14, 6));
        libraryManager.addDocument(new Newspaper(9, "Jordan", 6, 17));
        libraryManager.addDocument(new Newspaper(10, "Tommy", 7, 18));

//        libraryManager.displayDocument();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Add new document");
            System.out.println("2. Display a document");
            System.out.println("3. Delete a document ");
            System.out.println("4. Search a document by type of document");
            System.out.println("5. Exit programming");
            int selection = sc.nextInt();
            //Case nen lam vong lap rieng, them chuc nang back to the function
            switch (selection) {
                case 1: {
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Journal");
//                    System.out.println("Enter d: exit add document");
                    String type = sc.next();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter idDocument: ");
                            int idDocument = sc.nextInt();
                            System.out.print("Enter publisher: ");
                            String publisher = sc.next();
                            System.out.print("Enter number Release: ");
                            int numberRelease = sc.nextInt();
                            System.out.print("Enter name author: ");
                            String nameAuthor = sc.next();
                            System.out.print("Enter the number of page");
                            int numberOfPage = sc.nextInt();
                            Document book = new Book(idDocument, publisher, numberRelease, nameAuthor, numberOfPage);
                            System.out.println(book.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.print("Enter idDocument: ");
                            int idDocument = sc.nextInt();
                            System.out.print("Enter publisher: ");
                            String publisher = sc.nextLine();
                            System.out.print("Enter the number of release: ");
                            int numberRelease = sc.nextInt();
                            System.out.print("Enter the date of release: ");
                            int dateOfRelease = sc.nextInt();
                            Document newspaper = new Newspaper(idDocument, publisher, numberRelease, dateOfRelease);
                            System.out.println(newspaper.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter id Document: ");
                            int idDocument = sc.nextInt();
                            System.out.print("Enter the publisher: ");
                            String publisher = sc.next();
                            System.out.print("Enter the number of Release: ");
                            int numberRelease = sc.nextInt();
                            System.out.print("Enter the issue number: ");
                            int issueNumber = sc.nextInt();
                            System.out.print("Enter the month of Release: ");
                            int monthOfRelease = sc.nextInt();
                            //int idDocument, String publisher, int numberRelease, int issueNumber, int monthOfRelease
                            Document jornal = new Journal(idDocument, publisher, numberRelease, issueNumber, monthOfRelease);
                            System.out.println(jornal.toString());
                            sc.nextLine();
                            break;
                        }
                        default:
                            break;

                    }
                    break;
                }

                case 2:
                    libraryManager.displayDocument();
                    break;
                case 3:
                    System.out.println("Input your id document, you want to delete: ");
                    libraryManager.deleteDocument(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Input a to search book");
                    System.out.println("Input b to search newspaper");
                    System.out.println("Input c to search journal");
                    String choice = sc.next();
                    switch (choice) {
                        case "a": {
                            libraryManager.searchByBook();
                            break;
                        }
                        case "b": {
                            libraryManager.searchByNewspaper();
                            break;
                        }
                        case "c": {
                            libraryManager.searchByJournal();
                            break;
                        }
                        default: {
                            System.out.println("Please check input");
                            break;
                        }
                    }
                    break;
                case 5: {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }

        }

    }

}
