
package FactoryHelper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReverseOfWordsInString {
    
    
    

    public static void main(String args[]){


     String str="i.like.this.code";
       List<String> list= new ArrayList<String>();
       
       
       
        String[] arr= str.split("\\.");        
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        for(String s:arr){
      
           list.add(s);
        }
         System.out.println("2"+list);
        Collections.reverse(list);
         System.out.println("3"+list);
        
       System.out.println(String.join(".", list));
    }
}
//        String str="i.like.this.program";
//      System.out.println(reverseWords(str));
//
//
//
//
//    }
//    
        
   
    
   
        
    


   