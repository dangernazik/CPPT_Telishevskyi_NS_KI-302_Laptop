package KI302.Telishevskyi.Lab6;
import java.util.*;
import java.io.*;
public class Lab6 {
    public static void main(String[] args)
    {
        Box <? super Data> hdd = new Box <Data>();
        hdd.AddData(new Work("Cleaning", 1));
        hdd.AddData(new Instrument("Hummer" , 20));
        hdd.AddData(new Instrument("Screwdriver" , 15));
        hdd.AddData(new Work("Building" , 72));
        Data resInstrument = hdd.findMinInstrument();
        Data resWork = hdd.findMinWork();
        System.out.print("The smallest instrument in Box is: \n");
        resInstrument.print();
        System.out.print("The smallest work is: \n");
        resWork.print();
    }
}

