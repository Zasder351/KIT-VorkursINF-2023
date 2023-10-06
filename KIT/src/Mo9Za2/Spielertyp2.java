package Mo9Za2;

public class Spielertyp2 implements Schabernack{

    @Override
    public String modify(String toModify) {

        int firstPosition = randomPosition(toModify);
        char firstChar = toModify.charAt(firstPosition);
        int secondPosition = randomPosition(toModify);
        char secondChar = toModify.charAt(secondPosition);
        char[] givenString = toModify.toCharArray();
        String modifiedString = "";

        if (firstPosition == secondPosition){

            modifiedString = toModify;

        } else {

            for (int i = 0; i < givenString.length; i++) {

                if (i == firstPosition){

                    givenString[i] = secondChar;

                } else if (i == secondPosition){

                    givenString[i] = firstChar;

                }

                modifiedString += givenString[i];

            }

        }

        return modifiedString;
    }

    private int randomPosition(String givenString){
        int min = 0;
        int max = givenString.length() - 1;
        int randomChar = (int) (Math.random() * (max - min + 1)) + min;
        return randomChar;
    }

}
