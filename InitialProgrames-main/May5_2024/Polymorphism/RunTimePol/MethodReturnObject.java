package May5_2024.Polymorphism.RunTimePol;
/** Rule no 3 ) Covariant return type*/
/* => The return type should be same or a subtype of the return type declared in the
*     original overridden method in the super class   */


class Parents{
    Parents returnParentsObject(){
        System.out.println("Object return operation");
        //Parents pp=new Parents();
        // return pp;
        //return new Parents();
        return this;
    }
    Parents parentObjectReturn(){
        Parents p=new Parents();
        return p;
    }
    Parents parentsObject(){
        Parents obj = new Parents();
        return obj;
    }
    Parents object(){
        Parents obj = new Parents();
        return obj;
    }
}
class Childs extends Parents{
    @Override
    Parents returnParentsObject(){
        Childs obj2 = new Childs();
        return obj2;
    }
    @Override
    Parents parentObjectReturn(){
       // Parents obj3 = new Parents();
        Childs obj3 = new Childs();
        return obj3;
    }
    @Override
    Parents parentsObject(){
        //Childs obj4=new Childs();
        Parents obj4=new Parents();
        return obj4;
    }
    @Override
    Parents object(){
        //Parents obj5 = new Parents();
        Childs obj5=new Childs();
        return obj5;
    }

}
public class MethodReturnObject {
    public static void main(String[] args){
        Childs obj=new Childs();
    }
}
