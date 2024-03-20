package ru.intern.sberfindaxpopulation;

import java.util.List;
import ru.intern.sberutils.ProcessCity;
import ru.intern.sberutils.bean.City;

public class SberFindMaxPopulation extends ProcessCity {

    @Override
    public void doAction(String path) {
        List<City> allCities = super.doProcess(path);
        int max = 0;
        int index = 0;
        City[] arr = new City[allCities.size()];
        allCities.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            City city = arr[i];
            if (city.getPopulation() > max) {
                max = city.getPopulation();
                index = i;
            }
        }
        System.out.println("[" + index + "]" + " = " + max);
    }

}
