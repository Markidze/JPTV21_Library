/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21_library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
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
           System.out.print("Выберите номер задачи:");
           int task = scanner.nextInt();
           scanner.nextLine();
            System.out.println("_________________");
           switch(task) {
               case 0:
                   repeat = false;
                   break;
                case 1:
                   System.out.println("1.");
                default:
                   System.out.println("1.Добавить книгу");
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
                    break;
                 
           }  
            System.out.println("================-----------------===============");
        }while(repeat);
        System.out.println("До свидания!");
    }
}
