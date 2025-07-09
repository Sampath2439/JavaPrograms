package StarPatterens;

public class halfDimondPattern {
    public static void main(String[] args) {
        int row = 5;
        //half increasign pattern
        for (int i=1; i<=row; i++){
            for (int j =1; j<= i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        //half decreasing pattern (excluding the middle row to avoid duplicate)
        for (int i = row -1; i>=1;i--){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
