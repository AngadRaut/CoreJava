package May5_2024.Polymorphism.OverloadingInterview;
class A {
    String m1(String x){
        System.out.println("One");
        return "ABC";
    }
    String m1(String y,String x){
        System.out.println("Two");
        return "PQR";
    }
}
public class Question8 {
        public void test(int i) {
            System.out.println("Int");
        }
        public void test(int... i) {
            System.out.println("Int");
        }
        public void test(char... c) {
            System.out.println("Char varargs");
        }
        public static void main(String[] args)
        {
            Question8 obj = new Question8();
            obj.test('a');
            obj.test(10); // Exact matched.
           //output => char varargs
            //            int

        }
}
