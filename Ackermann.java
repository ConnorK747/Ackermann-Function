//Ackermann Function
//Connor Kraintz
//COSC4603 Computer Theory  
//3/6/23
//Program implements the ackerman function
package ackermann;

/**
 *
 * @author conno
 */
public class Ackermann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("   ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-8s",i);
        }
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.print(i+": ");
            
            for (int j = 0; j < 6; j++) {
                try{
                    System.out.printf("%-8s",function(i,j));
                }catch(StackOverflowError e){
                    System.out.printf("%-8s","X");
                }
                
                
            }
            System.out.println("");
        }

        
    }
    
    
    static int function(int m, int n){
        if (m == 0){
            return n + 1;
        }
        else if((m > 0) && (n == 0)){
            return function(m - 1, 1);
        }
        else if((m > 0) && (n > 0)){
            return function(m - 1, function(m, n - 1));
        }else
        return n + 1;
    }
}
