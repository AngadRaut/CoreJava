package Inheritance;
class GGParents
{
    void ggParents()
    {
        System.out.println("Method belongs to GGParents");
    }
}
class GParents extends GGParents
{
    void aabb()
    {
        System.out.println("Method belongs to GParents");
    }
}
class Parents extends GParents
{
    void dgs()
    {
        System.out.println("Method belongs to Parents");
    }
}
/*class Child1 extends Parents
{
    boolean dumy()
    {
        System.out.println("Method belongs to class Child1 is subclass of Parents");
      return true;
    }
}
class Child2 extends Parents
{
    float take()
    {
        System.out.println("Method belongs to class Child2 is subclass of Parents ");
        return 0;
    }
}  */
public class HierarchicalInheritance extends Parents {
    public static void main(String[] args) {
      /*  Child1 a = new Child1();
        a.ggParents();
        a.aabb();
        a.dgs();
        a.dumy();  */
        Parents b = new Parents();
        b.ggParents();
        b.aabb();
        b.dgs();

    }
}
