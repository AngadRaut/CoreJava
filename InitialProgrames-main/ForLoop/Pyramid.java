package ForLoop;

import java.util.Scanner;
class Dummy {
    static void halfPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void mirrorHalfPyramid() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void rightSideHalfPyramid() {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

//    }
//    static void print(){
//        for(int i=0;i<=5;i++){
//            for()
//        }
//    }
    }

    public class Pyramid {
        public static void main(String[] args) {
            //Dummy.halfPyramid();
            //  Dummy.mirrorHalfPyramid();
            Dummy.rightSideHalfPyramid();

        }
    }
}
