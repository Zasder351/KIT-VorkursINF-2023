package Mo8Za1;

public class Ebook {

    private String textAscii;
    private String keyAscii;
    private String encodedText;


    public Ebook(String text){

        textAscii = textToAscii(text);

    }

    public String encrypt(String password){

        keyAscii = textToAscii(password);
        encodeText();

        return encodedText;

    }

    public String decrypt(String password){
        String[] passwordArr = textToAscii(password).split(" ");
        String[] encodedArr = textToAscii(encodedText).split(" ");

        String temporaryDecoded = "";

        for (int i = 0; i < encodedArr.length; i++) {


            temporaryDecoded += (char) ((Integer.parseInt(encodedArr[i]) - Integer.parseInt(passwordArr[i % passwordArr.length])));


        }


        return temporaryDecoded;
    }


    private String textToAscii(String toEncrypt){

        String temporaryString = "";

        for (int i = 0; i < toEncrypt.length(); i++) {

            temporaryString += ((int) (toEncrypt.charAt(i))) + " ";

        }

        return temporaryString;
    }

    private void encodeText(){
        String[] textArr = textAscii.split(" ");
        String[] keyArr = keyAscii.split(" ");
        String temporaryEncoded = "";

        for (int i = 0; i < textArr.length; i++) {


            temporaryEncoded += (char) ((Integer.parseInt(textArr[i]) + Integer.parseInt(keyArr[i % keyArr.length])));


        }

        encodedText = temporaryEncoded;


    }





}
