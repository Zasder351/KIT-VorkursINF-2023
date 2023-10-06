package Mo6Za2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Mandelbrot {



    //private int resolution = 1024;
    private int resolution;
    private BufferedImage img;

    void setResolution(int newResolution){

        resolution = newResolution;
        img = new BufferedImage(resolution, resolution, BufferedImage.TYPE_INT_RGB);

    }



    private static int maxrekursionsTiefe = 51;
    //private BufferedImage img = new BufferedImage(resolution, resolution, BufferedImage.TYPE_INT_RGB);


    public void saveImage (){
        String pfadangabe = "X:/KIT/test/mandelbrotTEST4.png";

        File outputFile = new File(pfadangabe);

        try {

            ImageIO.write(img, "png", outputFile);

        } catch (Exception e){
            System.out.println("could not create image");
        }


    }

    private int r;

    private void berechnen (double z1, double z2, double c1, double c2, Integer tiefe){

        //int r = tiefe;

        double newz1 = Math.pow(z1, 2) - Math.pow(z2, 2) - c1;

        double newz2= 2 * z1 * z2 - c2;

        if (tiefe < maxrekursionsTiefe && Math.pow(newz1, 2) + Math.pow(newz2, 2) < 4) {

             berechnen(newz1, newz2, c1, c2, (tiefe + 1));

        } else {
            r = tiefe;
        }



    }

    public void mandelbrotBerechnen(){
        double p1;
        double p2;
        double pixel = 4.0 / (resolution * 1.0) ;

        for (int i = 0; i < resolution; i++) {
            for (int j = 0; j < resolution; j++) {

                if (i > 0){
                    p1 =  (- (resolution * 1.0)/2 + i) * pixel;
                } else {
                    p1 =  (- (resolution * 1.0)/2 + i) * pixel;
                }

                if (j > 0){
                    p2 =   (- (resolution * 1.0)/2 + j) * pixel;
                } else {
                    p2 =   (- (resolution * 1.0)/2 + j) * pixel;
                }

                berechnen(0, 0, p1,  p2, 0);

                Color col = new Color(5 * r, 5 * r, 5 * r );


                img.setRGB(i, j, col.getRGB());

            }
        }



    }

}
