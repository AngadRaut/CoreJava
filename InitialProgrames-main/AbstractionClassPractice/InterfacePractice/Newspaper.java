package AbstractionClassPractice.InterfacePractice;
interface IndianExpress
{
    void english();
}
interface Hindu
{
    void hindi();
}
interface Bharat
{
    float marathi();
}
interface MaharashtraTimes extends IndianExpress,Hindu,Bharat
{
    int marathiHindi();
}

public class Newspaper {
}
