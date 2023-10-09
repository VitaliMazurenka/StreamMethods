package ait.homework;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
    Создайте класс товар Product с полями:
название рейтинг цена категория. Создайте лист из 10 товаров с разными значениями
Задание 1
Получите лист товаров, которые стоят дороже 200 евро.
Задание 2
Получите лист товаров, отсортированных по рейтингу
Задание 3
Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
Задание 4 map
Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1. Товары в исходном листе не должны измениться.
Задание 5 forEach
Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро. Товары в исходном листе должны измениться.
Задание 6 reduce
Посчитайте общую стоимость всех товаров в листе.
     */
    public static void main(String[] args) {

        List<Product> list = List.of(
                new Product("Tapki", 9.5, 15.8, "For Home"),
                new Product("Gvozdi", 4.5, 5.8, "For Work"),
                new Product("Stol", 8.0, 160.88, "Furniture"),
                new Product("Stul", 7.0, 67.8, "Furniture"),
                new Product("Sapogi", 10.5, 77.8, "Clothes"),
                new Product("Kolgotki", 2.5, 3.3, "Clothes"),
                new Product("Noski", 5.2, 2.6, "Clothes"),
                new Product("Radio", 3.9, 23.99, "Electronics"),
                new Product("Televizor", 7.3, 640.67, "Electronics"),
                new Product("Benzopila", 4.5, 244.75, "For Electronics")
        );
        //Задание 1 . Получите лист товаров, которые стоят дороже 200 евро.
        List<Product> expensiveProduct = list
                .stream()
                .filter(product -> product.getPrice() > 200)
                .toList();
        System.out.println(" 1. " + expensiveProduct);

        //Задание 2. Получите лист товаров, отсортированных по рейтингу
        List<Product> sorted = list
                .stream()
                .sorted(Comparator.comparing(Product::getRate))
                .toList();
        System.out.println(" 2. " + sorted);

        //Задание 3. Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
        Boolean iPhone = list.stream()
                .anyMatch(i -> i.getName().equalsIgnoreCase("Iphone XR"));

        System.out.println(" 3. " + iPhone);

        //Задание 4 map
        //Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1.
        // Товары в исходном листе не должны измениться.

        //List<Product> rateUpgrade =


        //Задание 5 forEach.Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро.
        // Товары в исходном листе должны измениться.

        //List<Product> inflation = list.stream()
        //       .forEach(a->a.setPrice(a.getPrice()+20.0);

        //System.out.println(" 5. "+inflation);

        //Задание 6 reduce. Посчитайте общую стоимость всех товаров в листе.

        Double totalSum = list
                .stream()
                .map(Product::getPrice)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(" 6. " + totalSum);

    }
}
