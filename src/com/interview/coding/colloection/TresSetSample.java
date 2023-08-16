package com.interview.coding.colloection;

import java.util.Set;
import java.util.TreeSet;

public class TresSetSample {

	public static void main(String[] args) {
		
		Set<String> treeSet= new TreeSet<>();
		//treeSet.add(null);  RE : Comparable with Null
		treeSet.add("B");
		treeSet.add("Z");
		treeSet.add("A");
		treeSet.add("A");
		treeSet.add("C");
		System.err.println(treeSet);
		
		Set<Book> set=new TreeSet<Book>();  
		set.add(new Book(121,"Let us C","Yashwant Kanetkar","BPB",8));
		set.add(new Book(233,"Operating System","Galvin","Wiley",6));
		set.add(new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
		//set.add(new Book(null,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
		System.out.println(set);
		
	}
}



class Book implements Comparable<Book>{
	int id;  
    String name,author,publisher;  
	Integer quantity;
	
	public Book(Integer id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book o) {
		if(id>o.id){  
	        return 1;  
	    }else if(id<o.id){  
	      return -1;  
	    }else{  
	    return 0;  
	   }  
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}  

	
	
}