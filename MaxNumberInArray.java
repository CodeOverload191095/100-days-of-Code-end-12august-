
package FactoryHelper;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MaxNumberInArray {
    
    public static void main(String args[]){
    
        int[] number={-20,-30,-10,-2,-32,90};
        
        System.out.println(maxNumber(number));
    }
    
    public static int maxNumber(int[]number){
    
        int max=number[0];
        for(int i=0;i<number.length;i++){
        if(number[i]>max){
        max=number[i];    
            
        }
        }
    return max;      
        
    }
}

