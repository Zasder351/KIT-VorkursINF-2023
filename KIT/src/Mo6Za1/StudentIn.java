package Mo6Za1;

public class StudentIn {

    private String name;
    private String vorname;
    private double teilnote1;
    private double teilnote2;
    private double teilnote3;
    static final String universitaet = "KIT";
    private double note;

    public void setName(String newName){

        name = newName;

    }

    String getName(){
        return name;
    }

    public void setVorName(String newVorname){

        vorname = newVorname;

    }

    String getVorname(){
        return vorname;
    }

    public void setTeilnote1(double newTeilnote){

        teilnote1 = newTeilnote;
        note = setNote();
    }

    double getTeilnote1(){
        return teilnote1;
    }

    public void setTeilnote2(double newTeilnote){

        teilnote2 = newTeilnote;
        note = setNote();
    }

    double getTeilnote2(){
        return teilnote2;
    }

    public void setTeilnote3(double newTeilnote){

        teilnote3 = newTeilnote;
        note = setNote();
    }

    double getTeilnote3(){
        return teilnote3;
    }

    private double setNote(){

        if (teilnote1 > 4 || teilnote2 > 4 || teilnote3 > 4){
            return  5.0;
        } else {
             return ((teilnote1 + teilnote2 + teilnote3) / 3);
        }


    }



    double getNote (){

        return note;

    }

    public void printStudentIn(){

        System.out.printf("Der/Die Student/in %s %s, aus %s, hat die Noten:%n", vorname, name, universitaet);
        System.out.println(teilnote1);
        System.out.println(teilnote2);
        System.out.println(teilnote3);
        System.out.printf("Und die Gesamtnote: %.2f %n", note);



    }




}
