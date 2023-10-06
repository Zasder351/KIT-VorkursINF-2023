package Mo7Za1;

import javax.security.auth.callback.CallbackHandler;

public class UnsignedBigInt {

    private String zahl;
    public static int maxDigits;

    public UnsignedBigInt(String newNum){

        zahl = newNum;

        if (zahl.length() > maxDigits) {

            maxDigits = zahl.length();

        }


    }

    public String getValue(){

        return zahl;

    }

    public int getMaxDigits(){

        return maxDigits;

    }

    public int getDigit(int wantedDigit){
        int digit = 0;

        if (wantedDigit > zahl.length()){

            digit = 0;

        } else {

            char[] numCharArr = zahl.toCharArray();

            digit = Integer.parseInt(Character.toString(numCharArr[zahl.length() - wantedDigit]));

        }

        return digit;
    }

    public String add(String newNum){
        String longer;
        String original;

        UnsignedBigInt numToAdd = new UnsignedBigInt(newNum);

        if (zahl.length() > numToAdd.zahl.length()){

            longer = longerNum(numToAdd.zahl, zahl);
            original = zahl;

        } else {

            longer = longerNum(zahl, numToAdd.zahl);
            original = numToAdd.zahl;

        }


        char[] firstNum = original.toCharArray();
        char[] secondNum = longer.toCharArray();

        //reversed number
        String temporaryNum = "";
        //num greater than 9
        int goesOver = 0;

        for (int i = firstNum.length - 1; i >= 0; i--) {
            int first = Integer.parseInt(Character.toString(firstNum[i]));
            int second = Integer.parseInt(Character.toString(secondNum[i]));


            if (first + second + goesOver > 9){

              temporaryNum += (first + second + goesOver - 10);

              goesOver = 1;

            } else {
                temporaryNum += (first + second + goesOver);
                goesOver = 0;
            }

        }

        if (goesOver == 1){
            temporaryNum += 1;
        }

        String realAdd = "";
        char[] finalCharArr = temporaryNum.toCharArray();
        for (int i = temporaryNum.length() - 1; i >= 0; i--) {

            realAdd += Character.toString(finalCharArr[i]);

        }


        return realAdd;

    }

    private String longerNum (String shorterNum, String longerNum){
        String longNum = "";

        for (int i = 0; i < longerNum.length() - shorterNum. length(); i++) {

            longNum += 0;

        }
        longNum += shorterNum;


        return longNum;
    }

    public int compare(String newNum){
        int compared = 0;
        UnsignedBigInt numToAdd = new UnsignedBigInt(newNum);

        if (numToAdd.zahl.equals(zahl)){

            compared = 0;

        } else if (zahl.length() > numToAdd.zahl.length()) {

            compared = 1;

        } else if (zahl.length() < numToAdd.zahl.length()) {

            compared = -1;

        } else {

            char[] firstNum = zahl.toCharArray();
            char[] secondNum = numToAdd.zahl.toCharArray();

            for (int i = 0; i < secondNum.length; i++) {
                int first = Integer.parseInt(Character.toString(firstNum[i]));
                int second = Integer.parseInt(Character.toString(secondNum[i]));

                if (first > second){

                    compared = -1;
                    break;

                } else if (first < second){

                    compared = 1;
                    break;

                }


            }




        }


        return compared;
    }


}
