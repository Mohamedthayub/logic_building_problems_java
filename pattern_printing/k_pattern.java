public class k_pattern{
    public static void main(String[] args){
        int col = 4;
        for(int i = 0; i<col; i++){
            for(int j = 1; j<=col - i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i<=col; i++){
            for(int j =1; j<=i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
****
*** 
**  
*   
**
***
****
*****
*/