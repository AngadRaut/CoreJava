package Package02;       //Package name

import Package01.Package1Class;    //Import statememnt

public class Package2Class extends Package1Class {
    public static void main(String[] args) {
        Package2Class p = new Package2Class();
        p.protectedMethod();
        p.publicMethod();
       // p.defaultMethod();
      //  p.privateMethod();   Default and private methods are not accessible In Different Package Subclass
    }
}
