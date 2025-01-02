public class number_triangle{
    public static void main (String[] args){
        int col = 5;
        for(int i = 1; i<=col; i++){
            for(int j = 1; j<=col - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=i; k++){
                System.out.print(k+ " ");
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
   1 2    
  1 2 3   
 1 2 3 4  
1 2 3 4 5 
*/