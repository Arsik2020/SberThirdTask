package ru.intern.sberfindaxpopulation;

import ru.intern.sberutils.ProcessCity;
import ru.intern.sberutils.Utils;

public class Starter {

    public static void main(String[] args) {
        if (Utils.validate(args)) {
            ProcessCity find = new SberFindMaxPopulation();
            find.doAction(args[0]);
        }
    }
}
