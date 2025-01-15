public class pattern{
    public static void main(String[] args){
        int col = 4;
       for(int i = 1; i<=col; i++){
        for(int j = 1; j<=col - i; j++){
            System.out.print(" ");
        }
        for(int k = 1; k<=i; k++){
            System.out.print(i+ " ");
        }
        for(int t = 1; t<=col - i; t++){
            System.out.print(" ");
        }
        System.out.print("\n");
       }

    }
}
/*

   1    
  2 2   
 3 3 3  
4 4 4 4 
*/