package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Set<Glass> glassSet = new HashSet<>();

        Glass wineGlass = new Glass("glass", 350);
        Glass wineGlass2 = new Glass("glass", 350);
        Glass bearGlass = new Glass("metal", 550);

        System.out.println(glassSet.add(wineGlass));
        System.out.println(glassSet.add(bearGlass));
        System.out.println(glassSet.add(wineGlass));
        System.out.println(glassSet.add(wineGlass2));

        for (Glass itemGlass : glassSet) {
            System.out.println(itemGlass);

        }
        System.out.println("glassSet.size() = " + glassSet.size());

    }
}
