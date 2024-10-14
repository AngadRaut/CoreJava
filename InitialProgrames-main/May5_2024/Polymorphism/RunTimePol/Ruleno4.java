package May5_2024.Polymorphism.RunTimePol;
/* Rule 4) The access level cannot be more restrictive than the overriden methods access level
 parent class                child class
     private             => not override
     public              => public
     default             => private,protected
     protected           => protected,public,
 */
class Parent{
    public void parent(){
        System.out.println("parent method in parent class");
    }
     int parent1(){
        System.out.println("parent1 method in parent class");
        return 0;
    }
     int parent2(){
        System.out.println("parent2 method in parent class");
        return 0;
    }
   protected void parent3(){
        System.out.println("parent3 method in parent class");
    }
}
class Child1 extends Parent{
    @Override
    public void parent(){
        System.out.println("overriden parent method in child1 class");
    }
    @Override
    int parent1(){
        System.out.println("overriden parent1 method in child1 class");
        return 0;
    }
    @Override
      int parent2 () {
        super.parent1();
        System.out.println("Child method");
        return 0;
    }

    @Override
   public void parent3(){

    }
}
public class Ruleno4 {
    public static void main(String[] args){
        Child1 obj = new Child1();
        obj.parent1();
        //obj.parent();

        //Parent obj2 = new Parent();
        //obj2.parent();
    }
}
