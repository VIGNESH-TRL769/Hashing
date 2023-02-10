package org.example;
import java.util.HashSet;
import java.util.logging.Logger;
class IdCard
{
    int rollno;
    String name;
    String department;
    String year;
    long phonenumber;
    String bloodGroup;
    IdCard(int rollno,String name,String department,String year,long phonenumber,String bloodGroup)
    {
        this.rollno=rollno;
        this.name=name;
        this.department=department;
        this.year=year;
        this.phonenumber=phonenumber;
        this.bloodGroup=bloodGroup;
    }
    public String toString()
    {
        return this.rollno+" "+this.name+" "+this.year+" "+this.department+" "+this.phonenumber+" "+this.bloodGroup;
    }
}
public class Hashset
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args)
    {
        IdCard idCard=new IdCard(1915058,"Vignesh","B.Tech(IT)","4th-year",7871973447L,"O+");
        IdCard idCard1=new IdCard(1915059,"Vignesh Laxman","B.Tech(CSC)","3th-year",7871973447L,"A+");
        IdCard idCard2=new IdCard(1915060,"Vignesh Warn","B.Tech(ECE)","2th-year",7871973447L,"B+");
        IdCard idCard3=new IdCard(1915061,"laxman","B.E(Mech)","1th-year",7871973447L,"B-");
        HashSet<IdCard> hs=new HashSet<>();
        HashSet<IdCard> hs1=new HashSet<>();
        hs.add(idCard);
        hs.add(idCard1);
        hs.add(idCard2);
        hs.add(idCard3);
        hs.remove(idCard3);
        hs1.addAll(hs);
        for(IdCard b:hs1)
        {
            String k=b.toString();
            Log.info(k);
        }
        HashSet<String> hash=new HashSet<>();
        hash.add("vicky");
        hash.add("jeeva");
        hash.add("sanjai");
        hash.add("raja");
        if(hash.equals("vicky"))
            Log.info("It is Equal");
        else
            Log.info("It is not Equal");
        String p=""+hash.contains("sanjai");
        Log.info(p);
        String k=""+hash;
        Log.info(k);
        hash.remove("raja");
        hash.clear();
    }
}