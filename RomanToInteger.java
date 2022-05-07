
package FactoryHelper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class RomanToInteger {
    
    
    

    public static void main(String args[]){
    RomanToInteger rti= new RomanToInteger();
    System.out.print(rti.romanToDecimal("DXIV"));
    
    
       
       }
     
    
     public int romanToDecimal(String str) {
        
        Map<Character ,Integer> romanToInteger= new HashMap<>();
        
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
        
       char []arr= str.toCharArray();
       if(arr.length==1){
       
       return romanToInteger.get(arr[0]);
       }
       int sum=romanToInteger.get(arr[arr.length-1]);
       for(int i=arr.length-1;i>=1;i--){
      
        
       if( romanToInteger.get(arr[i]) <=   romanToInteger.get(arr[i-1]) ){
           
       sum+= romanToInteger.get(arr[i-1]);
       }
       else{
       sum-= romanToInteger.get(arr[i-1]); 
       }
        
           
       }
       return sum;
    }
}




///////////////
 /*public int romanToDecimal(String str) {
       // code here
       char arr[] = str.toCharArray();
       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000);
       
       int sum=0;
       for(int i=0;i<arr.length-1;i++){
           if(hm.get(arr[i])>=hm.get(arr[i+1])){
               sum+=hm.get(arr[i]);
           }
           else{
               sum-=hm.get(arr[i]);
           }
       }
       sum+=hm.get(arr[arr.length-1]);
           
       return sum;
   }*/