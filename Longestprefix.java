
package FactoryHelper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Longestprefix {
    
    
    

    public static void main(String args[]){

        String[] str={"Flower","flow","flew"};
        
        // Longestprefix obj= new  Longestprefix();
         System.out.println(prefixFinder(str));
        // System.out.println(obj.prefixFinder(str));
        
    }
        
        public static String prefixFinder(String str[]){
        
       
        
        String temp= str[0];
        System.out.println(temp);
        if(str.length==0){
        
        return "add elements to array";}
        
        for(int i=1;i<str.length;i++)
            
            while(str[i].indexOf(temp)!=0){
            
           temp= temp.substring(0, temp.length()-1);}
        
           if(temp.isEmpty()){
      return "nothing common";}
           
          return temp;
            }
        
        
        
            
        
      
       
        
    }
