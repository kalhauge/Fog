package web.svg;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SvgCarport extends Tag {

    private final int width;
    private final int height;
    private final String viewBox;


    public SvgCarport(int width, int height, String viewBox) {
        super("svg");
        this.width = width;
        this.height = height;
        this.viewBox = viewBox;
    }

    @Override
    protected String renderAttributes() {
        return String.format(
                "xmlns=\"http://www.w3.org/2000/svg\""
                        + " height=\"%d\" width=\"%d\" viewBox=\"%s\"",
                height,
                width,
                viewBox
        );
    }

    public static Tag carportTag() {
        Tag carport = new Carport(0.0, 0.0, 780.0, 600.0 );
        carport.withStyle("fill: none; stroke: black;");
        return carport;
    }
    public static Tag carportRem1() {
        Tag carport = new Carport(0.0, 35.0, 780.0, 4.5 );
        carport.withStyle("fill: none; stroke: black;");
        return carport;
    }
    public static Tag carportRem2() {
        Tag carport = new Carport(0.0, 565.0, 780.0, 4.5);
        carport.withStyle("fill: none; stroke: black;");
        return carport;
    }

    public static Tag carportSpaer1() {
        Tag carport = new Carport(0.0, 0.0, 4.5, 600);
        carport.withStyle("fill: none; stroke: black;");
        return carport;
    }

    public static Tag carportSpaer2() {
        Tag carport = new Carport(775.5, 0.0, 4.5, 600);
        carport.withStyle("fill: none; stroke: black;");
        return carport;
    }

    /*
    public static Tag carportKryds1() {
        Tag carport = new Carport(55.0, 35.0, 600, 569.5,  4.5, 600);
        carport.withStyle("fill: none; stroke: black; stroke-dasharray: 5 5;");
        return carport;
    }

    public static Tag carportKryds2() {
        Tag carport = new Carport(55.0, 569.5, 600, 35.0,  4.5, 600);
        carport.withStyle("fill: none; stroke: black; stroke-dasharray: 5 5;");
        return carport;
    }
     */



    public static Tag carport() {
        Svg x = new Svg(800, 600, "0 0 800 600");
        x.add(carportTag());
        x.add(carportRem1());
        x.add(carportRem2());
        x.add(carportSpaer1());
        x.add(carportSpaer2());
        return x;
    }

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("./src/main/java/web/svg/svgOutput/carport.svg"))
        {
            writer.write(carport().toString());
            String svg =  carport().toString();


        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
