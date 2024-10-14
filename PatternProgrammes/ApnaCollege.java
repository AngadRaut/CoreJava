package PatternProgrammes;

public class ApnaCollege {
    public static void main(String[] args){
        /**   square star pattern  */
//       for (int i=1;i<=5;i++){
//           for (int j=1;j<=5;j++){
//               System.out.print("* ");
//           }
//           System.out.println("");
      // }

        /** left half pyramid star pattern     */
        //outer loop
//           for (int i=1;i<=5;i++){
//               // inner loop
//               for(int j=1;j<=i;j++){
//                   System.out.print("* ");
//               }
//               System.out.println("");
//           }

        /**  hollow rectangle */

//        int m=9;
//         short n=9;
//        // outer loop
//        for (int i=1;i<=m;i++){
//            // inner loop
//            for(int j=1;j<=n;j++){
//                if(i==1||j==1||i==m||j==n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
        /** Right half pyramid     */
         for (int i=5;i<=5;i--){
             for (int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println("");
         }

    }
}
