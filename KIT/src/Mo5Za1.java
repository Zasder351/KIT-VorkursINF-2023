public class Mo5Za1 {

    public static void main(String[] args) {

        Vektor v1 = new Vektor();

        v1.setVektorX(1);
        v1.setVektorY(2);
        v1.setVektorZ(3);

        Vektor v2 = new Vektor();

        v2.setVektorX(4);
        v2.setVektorY(5);
        v2.setVektorZ(6);

        System.out.println(v1.skalarprodukt(v1, v2));

        System.out.println(v1.kreuzprodukt(v1, v2).getVektorX());
        System.out.println(v1.kreuzprodukt(v1, v2).getVektorY());
        System.out.println(v1.kreuzprodukt(v1, v2).getVektorZ());

    }

}
