public class diamond_pattern{
    public static void main(String[] args){
        int col = 4;
        for(int i = 1; i<=col; i++){
            for(int j = 1; j<=col - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            for(int t = 1; t<= col -i; t++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i<=col-1; i++){
            for(int r = 1; r <= i; r++){
                System.out.print(" ");
            }
            for(int e = 1; e<= col - i; e++){
                System.out.print("* ");
            }
            for(int r = 1; r <=i; r++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
   *    
  * *   
 * * *  
* * * * 
 * * *  
  * *   
   * 

*/