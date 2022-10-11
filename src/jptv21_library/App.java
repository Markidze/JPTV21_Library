/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21_library;

import entity.Author;
import entity.Book;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import managers.BookManager;

/**
 *
 * @author pupil
 */
public class App {
    private Book[] books;
    private final BookManager bookManager;

    public App() {
        testAddBook();
        bookManager = new BookManager();
    }
    
    public void run() {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
           System.out.println("Cписок задач: ");
           System.out.println("0.Закрыть приложение");
           System.out.println("1.Добавить книгу");
           System.out.println("2.Добавить читателя");
           System.out.println("3.Выдать книгу");
           System.out.println("4.Вернуть книгу");
           System.out.println("5.Список книг");
           System.out.println("6.Редактор книг");
           System.out.print("Выберите номер задачи:");
           int task = scanner.nextInt();
           scanner.nextLine();
           System.out.println("____________________________"
                 + "_____________________");
           switch(task) {
                case 0:
                   repeat = false;
                   System.out.println("2. Закрыть приложение");
                   break;
                case 1:
                   System.out.println("1.Добавить книгу");
                   this.books = Arrays.copyOf(this.books, this.books.length+1);
                   this.books[this.books.length-1] = bookManager.createBook();
                   break;
                case 2:
                   System.out.println("2.Добавить читателя");
                   break;
                case 3:
                    System.out.println("3.Выдать книгу");
                    break;
                case 4:
                    System.out.println("4.Вернуть книгу"); 
                    break;
                case 5:
                    System.out.println("5.Список книг");
                    bookManager.printListBooks(books);
                    break;
                case 6:
                    System.out.println("6.Редактор книг");
                    System.out.println("Список книг");
                    bookManager.printListBooks(books);
                    break;
                
                default:
                    System.out.println("Выберите задачу из списка");
             
           }
            System.out.println("================-----------------================");
        }while(repeat);
        System.out.println("До свидания!");
    }
     private void testAddBook(){ 
        this.books = new Book[0];
        Book book = new Book();
        book.setTitle("Book for editing");
        Author author = new Author();
        author.setFirstname("firstname");
        author.setLastname("lastname");
        Author[] bookAuthors = new Author[1];
        bookAuthors[0] = author;
        book.setAuthors(bookAuthors);
        this.books = Arrays.copyOf(this.books, this.books.length+1);
        this.books[this.books.length-1] = book;
        }
}
