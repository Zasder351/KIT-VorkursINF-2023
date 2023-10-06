public class Vektor {

    String name;
    double x;
    double y;
    double z;

    void setVektorX(double newX){
        x = newX;
    }

    void setVektorY(double newY){
        y = newY;
    }

    void setVektorZ(double newZ){
        z = newZ;
    }



    double getVektorX(){
        return x;
    }

    double getVektorY(){
        return y;
    }

    double getVektorZ(){
        return z;
    }

    double skalarprodukt(Vektor v1, Vektor v2){

        return v1.getVektorX() * v2.getVektorX() + v1.getVektorY() * v2.getVektorY() + v1.getVektorZ() * v2.getVektorZ();
    }

    Vektor kreuzprodukt(Vektor a, Vektor b){
        Vektor c = new Vektor();

        c.setVektorX(a.getVektorY() * b.getVektorZ() - a.getVektorZ() * b.getVektorY());
        c.setVektorY(a.getVektorZ() * b.getVektorX() - a.getVektorX() * b.getVektorZ());
        c.setVektorZ(a.getVektorX() * b.getVektorY() - a.getVektorY() * b.getVektorX());



        return c;
    }
}
