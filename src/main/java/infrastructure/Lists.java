package infrastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    int[] carportMeasure = {240, 270, 300, 330, 360, 390, 420, 450, 480, 510, 540, 570, 600, 630, 660, 690, 720, 750};
    String[] tag = {"Plasttrapezplader"};
    int[] shed = {150, 180, 210, 270, 300, 330, 360, 390, 420, 450, 480, 510, 540, 570, 600, 630, 660, 690, 720};

    public Lists() { }

    public ArrayList carportMeasure() {
        ArrayList carporOutput = new ArrayList<>();
        for (int i = 0; i < carportMeasure.length; i++) {
            carporOutput.add(carportMeasure[i]);
        }
        return carporOutput;
    }

    public ArrayList tag() {
        ArrayList tagOutput = new ArrayList<>();
        for (int i = 0; i < tag.length; i++) {
            tagOutput.add(tag[i]);
        }
        return tagOutput;
    }

    public ArrayList shed() {
        ArrayList shedOutput = new ArrayList<>();
        for (int i = 0; i < shed.length; i++) {
            shedOutput.add(shed[i]);
        }
        return shedOutput;
    }



    public int[] getBredde() {
        return carportMeasure;
    }

    public void setBredde(int[] measure) {
        this.carportMeasure = carportMeasure;
    }

}
