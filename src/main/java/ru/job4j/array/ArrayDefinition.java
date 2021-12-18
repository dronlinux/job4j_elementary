package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива short[] ages равен: " + ages.length);
        System.out.println("Размер массива String[] surnames равен: " + surnames.length);
        System.out.println("Размер массива float[] prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Andrew Poryadin";
        names[1] = "Ilya Dergachev";
        names[2] = "Artmiy Popandopola";
        names[3] = "Neo Matrixovich";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
