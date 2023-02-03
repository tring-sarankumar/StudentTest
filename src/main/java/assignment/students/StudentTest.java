package assignment.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Logger;


public class StudentTest 
{
    public static void main( String[] args )
    {
    	Logger log =  Logger.getLogger("points");
    	ArrayList <Student> arr = new ArrayList<Student>();
    	arr.add(new Student("sk",20,8.0));
    	arr.add(new Student("ak",21,9.0));
    	arr.add(new Student("jk",22,18.0));
    	
    	
    	for (int i=0; i<arr.size(); i++){
    	    log.info(arr.get(i).getName() +" " +arr.get(i).getAge() +" "+arr.get(i).getGpa());
    	    
    	}

    	 Collections.sort(arr,new Comparator<Student>(){
    		 public int compare(Student s1,Student s2) {
    			 return Double.compare(s2.getGpa(), s1.getGpa());
    		 }
    	 });
    	 log.info("-------------After Sorted--------------");
    	 
     	for (int i=0; i<arr.size(); i++){
    	    log.info(arr.get(i).getName() +" " +arr.get(i).getAge() +" "+arr.get(i).getGpa());
    	    
    	}
    	
        
    }
}
