package com.gof.designpattern.flyweight;

import com.gof.designpattern.flyweight.basis.Figure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yl3 on 28.11.15.
 */
public class FigureFlyweight {
    private static final Map<String, Figure> peopleMap = new HashMap();

    public static Figure getFigure(String language) {
        Figure figure = (Figure) peopleMap.get(language);
        if (figure == null) {
            figure = new Figure(language);
            peopleMap.put(language, figure);
            System.out.println("Create a figure which speak " + language);
        }

        return figure;
    }




}
