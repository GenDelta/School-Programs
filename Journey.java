public class Journey extends Travel
{
    String fromcity,tocity;double fare;
    Journey(String pname, int page, long pfone, String city1, String city2, double f)
    {
        super(pname, page, pfone);
        fromcity=city1;
        tocity=city2;
        fare=f;
    }
    void fnOutput()
    {
        super.disp();
        System.out.println("Travelling from: "+fromcity);
        System.out.println("Travelling to: "+tocity);
        System.out.println("Fare: "+fndiscount());
    }
    double fndiscount()
    {
        if(page<12)
        fare=fare-((40/100)*fare);
        if(page>60)
        fare=fare-((60/100)*fare);
        return fare;
    }
}