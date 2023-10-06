package Mo6Za2;

public class Main {

    public static void main(String[] args) {

        Mandelbrot test = new Mandelbrot();


        test.setResolution(1024);
        test.mandelbrotBerechnen();
        test.saveImage();

        //double n = 4.0/1024.0;
        //System.out.println(n * 15);
    }




}
