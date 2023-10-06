package Mo7Za2;

import Mo7Za1.UnsignedBigInt;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class CalculateFibonacci {

    //BigInteger nummer = new BigInteger();
    private static Map<Integer, BigInteger> fibonacci = new HashMap<>();
    BigInteger test = new BigInteger("123");

    public CalculateFibonacci(){


        if (!fibonacci.containsKey(0) && !fibonacci.containsKey(1) && !fibonacci.containsKey(3)){
            fibonacci.put(0, new BigInteger("0"));
            fibonacci.put(1, new BigInteger("1"));
            fibonacci.put(2, new BigInteger("1"));
        }




    }

    public String calculate(int positionN){
        String fn = "";

        if (fibonacci.containsKey(positionN)){
            fn += fibonacci.get(positionN);

        } else{

            //fn += (calculate((positionN - 1)) + calculate((positionN - 2)));
            fn += (new BigInteger(calculate(positionN - 1)).add(new BigInteger(calculate(positionN - 2))));
            fibonacci.put(positionN, new BigInteger(fn));

        }

        return fn;
    }

    /*public String add(String newNum){
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

    }*/


}
