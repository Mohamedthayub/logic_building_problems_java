public class mirror_right_anglen_triangle{
    public static void main(String[] args){
        int col = 5;
        for(int  i = 1; i<=col; i++){
            for(int f = 1; f<=i; f++){
                System.out.print("*");
            }
            for(int j = 1; j<=(col - i) * 2; j++){
                System.out.print(" ");
            }
            for(int t = 1; t<=i; t++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*
*        *
**      **
***    ***
****  ****
**********


*/