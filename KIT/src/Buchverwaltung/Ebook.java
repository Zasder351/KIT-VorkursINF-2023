package Buchverwaltung;

public class Ebook extends Buch {

    private String url;
    private int format;
    private long doi;

    public Ebook(String newTitel, String newAutor, int newFormat, long newDoi) {

        super(newTitel, newAutor);
        setFormat(newFormat);
        setDoi(newDoi);


    }


    public void setUrl(String newUrl) {
        url = newUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setFormat(int newFormat) {
        format = newFormat;
    }

    public int getFormat() {
        return format;
    }

    public void setDoi(long newDoi) {
        doi = newDoi;
    }

    public long getDoi() {
        return doi;
    }


}
