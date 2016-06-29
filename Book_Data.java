/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bk_Lib_Model;

/**
 * @Version 1.0.0
 *      + Contains data about book:
 *          total number of pages
 *          
 * @author Vodka
 */
public class Book_Data {
    private String b_title;         //book's title
    private String b_author;        //book's author
    private String b_genre;         //book's genre
    private int b_PagesNum;         //book's number of pages
    private int b_ChapsNum;          //book's number of chapters
    private int b_ID;
    //   private String b_Summary;       //book's summary
       
    // **** Initialization ****
    public Book_Data()  
    {
        b_title     = "";
        b_author    = "";
        b_genre     = "";
        b_PagesNum  = 0;
        b_ChapsNum   = 0;
    //    b_Summary   = "";
    }
    
    //get and set Methods for private variables of the book
    
    public void setTitle(String Title)
    {
        b_title = Title;
    }
    
    public String getTitle()
    {
        return b_title;
    }
    
    public void setAuthorName(String Author_Name)
    {
        b_author = Author_Name;
    }
    
    public String getAuthorName()
    {
        return b_author;
    }

    public void setGenre(String Genre)
    {
        b_genre = Genre;
    }
    
    public String getGenre()
    {
        return b_genre;
    }
    
    public void setBookPage(int BookPages)
    {
        b_PagesNum = BookPages;
    }
    
    public int getBookPage()
    {
        return b_PagesNum;
    }
    
    public void setBookChap(int BookChaps)
    {
        b_ChapsNum = BookChaps;
    }
    
    public int getBookChap()
    {
        return b_ChapsNum;
    }
    
    public void setID(int ID)
    {
        b_ID = ID;
    }
    
    public int getID()
    {
        return b_ID;
    }
}
