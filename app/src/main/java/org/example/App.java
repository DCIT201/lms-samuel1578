
/*
 * This should be your main class where all your objects will be created
 */

 package org.example;

 public class  App {
 
     public static void main(String[] args) {
 
         // Creating a new book
         Book book1 = new Book("Deep In The Trenches", "J. K. Mansouer",1900);
         Book book2 = new Book("How To Make It", "J. K. Mansouer",1980);
         Book book3 = new Book("American Psycho ", "J. K. Mansouer",1945);
         Book book4 = new Book("Don't be a Sinner", "J. K. Mansouer",1908);
        System.out.println(book1.getTitle());
 
     }
 
 }
 