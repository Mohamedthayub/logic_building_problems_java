public class number_decrease_triangle{
    public static void main(String[] args){
        int col = 5;
        for(int i = 0; i<col; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for(int s = 1; s<=col -i; s++){
                System.out.print(i+1+ " ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("\n"); 
        }
    }
}
/*
 1 1 1 1 1  
  2 2 2 2   
   3 3 3    
    4 4     
     5   


*/
