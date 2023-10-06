package Mo9Za2;

public class Spieler extends Person implements Schabernack{


    @Override
    public String modify(String toModify) {
        //int randomNumber = (int) (Math.random() * (3 - 1 + 1)) + 1;
        int randomNumber = 2;
        String modifiedString = "";

        switch (randomNumber){
            case 1:

                Spielertyp1 sp1 = new Spielertyp1();
                modifiedString += sp1.modify(toModify);
                sp1 = null;
                System.runFinalization();
                System.gc();

                break;
            case 2:

                Spielertyp2 sp2 = new Spielertyp2();
                modifiedString += sp2.modify(toModify);
                sp2 = null;
                System.runFinalization();
                System.gc();

                break;
            case 3:

                Spielertyp3 sp3 = new Spielertyp3();
                modifiedString += sp3.modify(toModify);
                sp3 = null;
                System.runFinalization();
                System.gc();

                break;
        }



        return modifiedString;
    }
}
