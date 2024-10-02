package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Kofferslot {
    public static final char DEFAULT_LETTER = 'A';
    public static final int DEFAULT_CIJFER = 0;
    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;


    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        setCombinatie(eersteLetter,tweedeLetter,cijfer);

    }
    public Kofferslot() {
        this(DEFAULT_LETTER,DEFAULT_LETTER,DEFAULT_CIJFER);
    }

    public void setCombinatie (char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
    }
    //Alles in een keer

    public char volgendeLetter(char letter) {
        if (letter == 'Z') {
            return 'A';
        }
        else {
            return (char) (letter + 1);
        }
    }

    public int volgendeCijfer(int cijfer) {
        return (cijfer + 1) % 10;
        // Op deze manier zal het resultaat 0 zijn als het tien is.
    }

    public void volgende() {
        cijfer = volgendeCijfer(cijfer);
        //AA1, AA2, AA3 .... AA9
        //AA0
        if (cijfer == 0) {
            tweedeLetter = volgendeLetter(tweedeLetter);
            //AB0, AB1....AZ9, AA
            if (tweedeLetter == 'A') {
                eersteLetter = volgendeLetter(eersteLetter);
            }
            //BA0
        }
    }

    public char getEersteLetter() {
        return eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }
}
