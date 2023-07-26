public class Travel
{
    String pname; int page; long pfone;
    Travel(String name, int age, long fone)
    {
        pname=name;
        page=age;
        pfone=fone;
    }
    void disp()
    {
        System.out.println("Name "+pname);
        System.out.println("Age "+page);
        System.out.println("Phone no. "+pfone);
    }
}