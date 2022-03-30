/*4.Create an arraylist of user-defined data type Book. it should have:-
i)Name of the Book
ii)Author of the book
iii)year of publication of the book
iV)numer of copies sold.
sort the array list based on the year of publication.*/

package Assignment;

import java.util.*;  
class Book implements Comparable{  
int sold;
Integer year; 
String name,author;   
public Book( String name, String author, int year,int sold) {   
    this.name = name;  
    this.author = author;  
    this.year = year;
    this.sold=sold;
}  
public int getYear()
{
	return this.year;
}
@Override
public int compareTo(Object o) {
	Book b1=(Book) o;
	return (this.year.compareTo(b1.getYear()));
}

}  
public class Q4_ArrayList {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
    Book b1=new Book("Mein Kampf","Adolf Hitler",1925,100000);  
    Book b2=new Book("Geetanjali","Rabindra Nath Tagore",1910,6000000);  
    Book b3=new Book("Das Kapital","Karl Marx",1867,500000000);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
   Collections.sort(list,Collections.reverseOrder());
    for(Book b:list){  
        System.out.println(b.name+", "+b.author+", "+b.year+", "+b.sold);  
    }  
}  
}  