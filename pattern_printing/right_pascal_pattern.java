public class pattern{
    public static void main(String[] args){
        int col =5;
        for(int i = 1; i<=col; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int t = 1; t<=col-1; t++){
            for(int e  = 1; e <= col - t; e++){
                System.out.print("*");
            }
            for(int r = 1; r<=t; r++){
                System.out.print(" ");
            }
            System.out.println();
        }
        

    }
}
/*
*
**
***
****
*****
**** 
***  
**   
*    
*/