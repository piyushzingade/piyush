public class Main {

    public static void hollow(int Rows, int Cols) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Cols; j++) {
                if (i == Rows|| j == Cols ||i == 1|| j == 1 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static void Pyramid(int n){
        for(int i=1 ; i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void Floyd_triangle(int n){
        int count = 1;
        for(int i=1;i<=n;i++){

            for (int j = 1;j<=i;j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void triangle(int n){
        for (int i =1 ; i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j) %2==0 ){
                    System.out.print("1");

                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow(4 , 4);
        Pyramid(4);
        Floyd_triangle(5);
        triangle(6);
        Butterfly(4 );

    }
}


