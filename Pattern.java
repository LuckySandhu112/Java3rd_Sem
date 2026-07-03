//  0123
// 0****
// 1 ***
// 2  **
// 3   *


// public class Pattern{
//     public static void main(String[] args) {
//         int n = 4;
//         int i, j;
//         for(i=0;i<n;i++){
//             for(j=0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// 5
// 54
// 543
// 5432
// 54321





// public class Pattern{
//     public static void main(String[] args){
//         int n=5;
//         int i,j;
//         for(i=0;i<=n;i++){
//             for(j=n;j>=n+1-i;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// 54321
// 5432
// 543
// 54
// 5




// public class Pattern {
//     public static void main(String[] args){
//         int n=5;
//         int i,j;
//         for(i=5;i>=1;i--){
//             for(j=5;j>=6-i;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//   *
//  * *
// * * *
//  * *
//   *


public class Pattern{
    public static void main(String[] args){
        int n=3;
        int i, j;
        for(i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=3;i>1;i--){
            for(j=1;j<n-1;j++){
                System.out.print(" ");
            }
            for(j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}