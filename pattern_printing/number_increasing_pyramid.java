public class number_increasing_pyramid{
    public static void main(String[] args){
        int col = 5;
        for(int i = 0; i<=col; i++){
            for(int j = 1; j<=col - i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/