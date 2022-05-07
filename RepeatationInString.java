

//
package FactoryHelper;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class RepeatationInString {
    
    public static void main(String args[]){
    RepeatationInString rps= new RepeatationInString();
    rps.repeatationCount();
    }
    public  void  repeatationCount(){
    
           String str="have to keep family happy";
       
          str=str.replace(" ",""); //to remove space
        
       
          Map obj= new HashMap<Character,Integer>(); 
        
        
          for(char ch:str.toCharArray()){
          
                 if(obj.containsKey(ch)){ //if ch is already in the map
               
                    obj.put(ch,(Integer) obj.get(ch)+1) ;
                     }
           
                 else{
                    obj.put(ch,1);   //if ch was not in map
                     }   
                                      }  
                  System.out.println(obj);                }
//                                         
//     
}    
                    
      
//public class RepeatationInString {
//
//    public static void main(String args[]) {
//
//        repetionMethod("have to keep family happy");
//
//    }
//
//    public static void repetionMethod(String str) {
//
//        Map<Character, Integer> obj = new HashMap<>();
//        char[] arr = str.trim().toCharArray();
//
//        for (char ch : arr) {
//
//            if (obj.containsKey(ch)) {
//
//                obj.put(ch, (Integer) obj.get(ch) + 1);
//
//            } else {
//
//                obj.put(ch, 1);
//            }
//        }
//System.out.println(obj);
//    }
//}
