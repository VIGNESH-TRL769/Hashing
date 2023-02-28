package org.example;
import java.util.logging.Logger;
import  java.util.Scanner;
public class Main
{
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        while(true)
        {
            Log.info("\n1.Hashset\n2.Hashmap\n3.Treeset\n4.Exit");
            int key=input.nextInt();
            if(key==1)
            {
                Hashset hash=new Hashset();
                hash.hashset();
            }
            else if(key==2)
            {
                Hashmap map=new Hashmap();
                map.hashmap();

            }
            else if(key==3)
            {
                Treeset treeset=new Treeset();
                treeset.tree();

            }
            else if(key==4)
            {
                Log.info("----Thank You----");
                return;

            }


        }

    }
}