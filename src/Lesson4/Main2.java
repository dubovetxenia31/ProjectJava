package Lesson4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("какую фигуру посчитаем?");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Треугольник");
        System.out.println("3 - Круг");
        System.out.println("4 - Овал");
        System.out.println("5 - Параллелограм");

        String figura = scanner.nextLine();

        System.out.println("Что посчитать?");
        System.out.println("1 - Площадь");
        System.out.println("2 - Периметр");

        String action = scanner.nextLine();

        if (figura.equalsIgnoreCase("Квадрат") || figura.equals("1")) {
            System.out.println("Введите сторону квадрата: ");
            //"234" + "34"="23434"     234 + 34 = 258
            String storona = scanner.nextLine();
            int a = Integer.parseInt(storona);

            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("площадь квадрата: " + (a * a));
            } else {
                System.out.println("Периметр квадрата: " + (a * 4));
            }

        }
        if (figura.equalsIgnoreCase("Треугольник") || figura.equals("2")) {
            System.out.println("Введите стороны треугольника: ");
            String storona1 = scanner.nextLine();
            String storona2 = scanner.nextLine();
            String storona3 = scanner.nextLine();

            int sideA = Integer.parseInt(storona1);
            int sideB = Integer.parseInt(storona2);
            int sideC = Integer.parseInt(storona3);
            int p = (sideA + sideB + sideC) / 2;
            int area = (p - sideA) * (p - sideB);

            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("Площадь треугольника: " + area);
            } else {
                System.out.println("Периметр треугольника: " + (sideA + sideB + sideC));
            }
        }


        if (figura.equalsIgnoreCase("Круг") || figura.equals("3")) {
            System.out.println("Введите диаметр круга: ");
            String diametr = scanner.nextLine();

            int a = Integer.parseInt(diametr);
            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("площадь круга: " + (3.14 * (a * a) / 4));
            } else {
                System.out.println("Периметр круга: " + (2 * 3.14 * a));
            }

        }


        if (figura.equalsIgnoreCase("Овал") || figura.equals("4")) {
            System.out.println("Введите длину большой полуоси овала : ");
            System.out.println("Введите длину малой полуоси овалв : ");

            String axleLength1 = scanner.nextLine();
            String axleLength2 = scanner.nextLine();

            int side1 = Integer.parseInt(axleLength1);
            int side2 = Integer.parseInt(axleLength2);
            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("площадь овала : " + (3.14 * side1 * side2));
            } else {
                System.out.println("Периметр овала : " + (4 * ((3.14 * side1 * side2) + (side1 - side2)) / (side1 + side2)));
            }

        }
        if (figura.equalsIgnoreCase("Параллелограм") || figura.equals("5")) {
            System.out.println("Введите высоту параллелограма : ");
            System.out.println("Введите длину 1-ой стороны параллелограма : ");
            System.out.println("Введите длину основания параллелограма : ");

            String height = scanner.nextLine();
            String side = scanner.nextLine();
            String grounds = scanner.nextLine();

            int side1 = Integer.parseInt(height);
            int side2 = Integer.parseInt(side);
            int side3 = Integer.parseInt(grounds);
            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("площадь параллелограма : " + (side1 * side3));
            } else {
                System.out.println("Периметр параллелограма : " + (2 * (side2 + side3)));
            }


        }


    }
}

