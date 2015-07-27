package com.envestnet.doit.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.beans.TaskBean;

public class SortListUtil {

	public static List<Task> sort(List<Task> tasks){
		
		Collections.sort(tasks, new Comparator<Task>() {
    		/*public int compare(Object TaskOne, Object TaskTwo) {
    		//use instanceof to verify the references are indeed of the type in question
    		return ((Task)TaskOne).getTaskdate()
    		.compareTo(((Task)TaskTwo).getTaskdate());
    		}*/

			@Override
			public int compare(Task o1, Task o2) {
				// TODO Auto-generated method stub
				return (o1.getTaskdatetime()
			    		.compareTo(o2.getTaskdatetime()));
			}
    		});
		return tasks; 
	}
	
	void test(){}
	
	
	
}
