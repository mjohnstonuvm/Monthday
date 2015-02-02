//Matt Johnston
//2/2/15
//Month day

package month;
import java.util.*;

public class Month {
    
    public static void getInput(){
        
        Scanner kb = new Scanner(System.in);
        int number = 0;
        
        //User Prompt
        System.out.print("Input a number: ");
        
        //Filter user input
        if (kb.hasNextInt()){
            
            isBetween(number);
            
        }else{
            
            System.out.println("Enter an Integer!"); 
            
            getInput();
        }
    }
    
    public static int isBetween(int num){
        
        if(num >= 1 && num <= 31){
            
        }
        return num;
        
    }
        
    public static void main(String[] args) {
        getInput();
        
        //Declare hashmap
        
    }
    
}
