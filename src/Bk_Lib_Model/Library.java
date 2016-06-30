/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bk_Lib_Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Version 1.0.0
 *      +Library in the form of hash map
 *      +Store book with ID as key
 *      +Allow iteration for display
 *      +ID generated from book name and author name (thinking of
 *          an algorithm for encrypted this)
 *  <= Just need uniqueness =>
 * @author Vodka
 */
public final class Library {
    private static int book_count = 0;
    public static HashMap<Integer, Book> lib = new HashMap<>();
    public boolean isEmpty = true;
    
    // export all books currently in library to a temporary
    // location for manipulation: Display, Sort, Add, etc...
    public Book[] iterateBook()
    {
        Book[] temp_lib = new Book[book_count];
        int counter = 0;
        if(isEmpty=false)
        {
        Set set = lib.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) 
            {
                Map.Entry lib_entry = (Map.Entry)iterator.next();
                temp_lib[counter] = (Book) lib_entry.getValue();
                counter ++;
            }
        }
        else
        {
            System.err.print("There is no book to iterate!");
        }
        return temp_lib;
        
    }
    
    // get certain book out of the library by its ID
    public Book getBook(int book_ID)
    {
        Book cur_book = new Book();
        cur_book = lib.get(book_ID);
        return cur_book;
    }
    
    // add a new book 
    // increase book count by 1
    
    public void addBook(int book_ID, Book cur_book)
    {
        lib.put(book_ID,cur_book);
        book_count++;
    }
    
    // remove book based on book ID
    // decrease book count by 1, if there is no book (book_count = 0)
    // then return error message and exit the method
    
    public void removeBook(int book_ID)
    {   
        if (book_count>0)
        {
            lib.remove(book_ID);
            book_count--;
            return;
        }
        else 
        {
            isEmpty = true;
            System.err.print("The library is empty");
            return;
        }
    }
}
