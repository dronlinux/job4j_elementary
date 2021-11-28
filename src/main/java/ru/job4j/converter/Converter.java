package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        System.out.println(out);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        float inRubles = 180;
        float expectedDollars = 3;
        float outDollar = Converter.rubleToDollar(inRubles);
        boolean passedRublesToDollar = expectedDollars == outDollar;
        System.out.println("180 rubles are 3 dollar. Test result : " + passedRublesToDollar);

    }
}
