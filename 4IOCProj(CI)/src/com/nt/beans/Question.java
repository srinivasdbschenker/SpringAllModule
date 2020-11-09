package com.nt.beans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private List answers;
	private Map mapanswers;
	
	public Question(){
		
	}

	public Question(int id, String name, List answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public Question(int id, String name, Map mapanswers) {
		super();
		this.id = id;
		this.name = name;
		this.mapanswers = mapanswers;
	}

	
public void displayInfo(){
	System.out.println("id:: "+id+" question:: "+name);
	
	System.out.println("answers are :: ");
	Iterator itr=answers.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}

public void displayMapInfo(){
	System.out.println("question id :"+id);
	System.out.println("question name:: "+name);
    System.out.println("answers ..");
    Set<Entry<String,String>> set=mapanswers.entrySet();
   // List<Entry<String,String>> list=(List) mapanswers.entrySet();
    Iterator itr=set.iterator();
    // Set<String, String> hm= mapanswers.entrySet();
     
    //Iterator itr=((List) hm).iterator();
    while(itr.hasNext()){
    	Entry entry=(Entry) itr.next();
    	
    	System.out.println("mapanswer:: "+entry.getKey()+" posted by "+entry.getValue());
    }
    
}

}
