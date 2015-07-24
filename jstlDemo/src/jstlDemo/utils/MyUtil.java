package jstlDemo.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jstlDemo.beans.Person;

public class MyUtil {

	public List<Person> list(){
		
		List<Person>list=new ArrayList<Person>();
		list.add(new Person("sun",100,new Date(1998,2,21)));
		list.add(new Person("mon",1000,new Date(1998,2,14)));
		list.add(new Person("tue",2000,new Date(1998,8,14)));
		return list;
	}
}
