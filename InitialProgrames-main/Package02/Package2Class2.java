package Package02;

import Package01.Package1Class;

//Different package non sub class

public class Package2Class2 {
    public static void main(String[] args) {
        Package1Class n = new Package1Class();
        n.publicMethod();
        // only public method is called

    }
}
