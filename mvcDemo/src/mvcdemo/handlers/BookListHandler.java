package mvcdemo.handlers;

import java.util.ArrayList;
import java.util.List;

import mvcdemo.bean.Book;

public class BookListHandler {

	private List<Book> list=new ArrayList<Book>();
	
	public List<Book> getBookList(){
		
		list.add(new Book("Head Frist Java",300));
		list.add(new Book("Head Frist C++",350));
		list.add(new Book("Head Frist .NET",400));
		return list;
	}
}