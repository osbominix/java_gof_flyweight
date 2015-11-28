package com.gof.designpattern.flyweight.basis;

/**
 * Created by yl3 on 28.11.15.
 */
public class Figure implements Communicate {
    private String language;
    private String vorname;


    public Figure(String national) {
        this.language = national;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void call() {
        System.out.println(getVorname()  + "  is calling in " + language + ".");
    }
}
