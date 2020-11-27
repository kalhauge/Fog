package api;

import domain.items.Carport;
import domain.items.Shed;

public class Utils {
    /**
     * @param src String to be stripped
     * @return String without HTML tags
     */
    public static String removeHtml(String src) {
        /*
         * Tak https://www.tutorialspoint.com/how-to-remove-the-html-tags-from-a-given-string-in-java
         */
        return src.replaceAll("\\<.*?\\>", "");
    }
    public static int antalStolper(Carport carport){
        // forudsætter at der må være 3m imellem stolerne i carportens længde
        //forudsætter at der må være 2m imellem stolperne i skuret
        //forusætter at forreste stolpe er 1m fra frontern
        //forudsætter at bageste stolpe er 20 cm fra bagkanten
        //forudsætter at stolper står 35 cm fra siden

        //tilføjer stolper i siderne maks 3m imellem dem
        int  antal=(carport.getLenght()-1201)/3000+1+1;//(stolper i den en side)
        antal=antal*2; // nu i begge sider

        // tilføjer stolper i eventuelt skur maks 2 m imellem dem
        Shed shed=carport.getShed();
        int shedAntal = 0;
        if (shed!=null) {
            //antal på den i længden
            int shedAntalLenght = ((shed.getLenght()-1) / 2000 + 1);
            if(shedAntalLenght<2)shedAntalLenght=2;
            //anatl i bredden
            int shedAntalwidth=((shed.getWidht()-1)/2000+1+1);
            if (shedAntalwidth<2)shedAntalwidth=2;
            // minus 4 fordi alle hjørnerne er taltbtom gange, +1 fordi der skal være en til døren
            shedAntal=2*shedAntalLenght+2*shedAntalwidth-4+1;
            //skal ikke bruge den stolpe der sidder i hjørnet
            shedAntal=shedAntal-1;

            //hvis shed er lige så bredt som carpoerten skal vi helle rikke bruge den i denanden side
            if(shed.getWidht()==carport.getWidth()){shedAntal=shedAntal-1;}
            }
        return antal+shedAntal;
    }
}
