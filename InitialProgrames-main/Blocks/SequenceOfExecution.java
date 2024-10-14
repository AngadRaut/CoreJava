package Blocks;

/* 1) static blocks in parent class => without creating object of class
 *  2) static blocks in child class  => without creating object of class
 *   => After creating object of class
 * 3) non-static blocks in parent class
 * 4) Default constructor in parent class
 *  => If this() keyword is use constructor then
 *     other constructors in parent class get called before child class's non-static blocks get execute
 * 5) Non-static blocks in child class
 * 6) Default constructor in child class
 * => If this() keyword use then other constructors get called here before methods
 * 7) Methods get executed as their objects called */




class Sequence{
    {
        System.out.println("Non static Block-1 in Sequence class ");
    }
    Sequence(){
        this(2);
        System.out.println("Default Constructor");
    }
    Sequence(int a){
        this(6656.4653465);
        System.out.println("Parameterized constructor Integer argument");
    }
    static {
        System.out.println("Static block-2 in Sequence class");
    }
    Sequence(double v){
        System.out.println("Parameterized constructor Double argument");
    }
    public void addition(int a,int b){
        int add=a+b;
        System.out.println("addition in Sequence class "+add);
    }
    static{
        System.out.println("Static Block-3 in Sequence class");
    }
    {
        System.out.println("Non Static block-4 in Sequence class");
    }

}
public class SequenceOfExecution extends Sequence{
    static{
        System.out.println("Static block-1 in SequenceOfExecution");
    }
    public static void main(String [] args){
        SequenceOfExecution obj = new SequenceOfExecution();
        obj.addition(2,2);
        obj.substraction(3,3);

    }
    void substraction(int a,int b){
        int sub=a-b;
        System.out.println("substraction in SequenceOfExecution class"+sub);
    }
    SequenceOfExecution(){
        this(5);
        System.out.println("Default constructor in SequenceOfExecution class");
    }
    SequenceOfExecution(int v){
        this("wwe");
        System.out.println("Parameterized constructor in SequenceOfExecution class int argument");
    }
    {
        System.out.println("Non Static block-2 in SequenceOfExecution");
    }
    static {
        System.out.println("Static block-3 in SequenceOfExecution");
    }
    {
        System.out.println("Non Static block-4 in SequenceOfExecution");
    }
    SequenceOfExecution(String a){
        System.out.println("Parameterized constructor in SequenceOfExecution class String argument");
    }
}