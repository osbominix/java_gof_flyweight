package com.gof.designpattern;

import com.gof.designpattern.flyweight.FigureFlyweight;
import com.gof.designpattern.flyweight.basis.Figure;

/**
 * Created by yl3 on 28.11.15.
 */
public class CommandCenter {
    private static final String languages[] = {"Chinese", "German", "English"};
    public static void main( String[] args ) {
        for (int i=0; i < 10; i++) {
            Figure figure = (Figure) FigureFlyweight.getFigure(getRandomLanguage());
            figure.setVorname("Figure" + i);

            figure.call();
        }

    }

    private static String getRandomLanguage() {
        return languages[(int)(Math.random()*languages.length)];
    }
}
