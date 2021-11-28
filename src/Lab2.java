import java.util.Scanner;

//ВАРИАНТ 3
/*Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и вывода сведений о фигуре – площади,
длины окружности. Создать производный класс – круглый прямой цилиндр с высотой h, добавить в класс метод определения объема фигуры,
перегрузить методы расчета площади и вывода сведений о фигуре. Написать программу, демонстрирующую работу с классом:
дано N окружностей и M цилиндров, найти окружность максимальной площади и средний объем цилиндров. */

public class Lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество окружностей: ");
        int countCircles = in.nextInt();

        Circles circles = new Circles(countCircles);
        in.nextLine();

        double side = -1;
        for (int i = 0; i < circles.circle.length; i++) {
            circles.circle[i] = new Circle();
            do {
                System.out.print("Введите радиус " + (i + 1) + " окружности: ");
                side = Circle.CheckCorrectRadius("" + in.nextLine());
                if (side == -1) {
                    System.out.println("Ошибка!");
                } else {
                    circles.circle[i].setRadius(side);
                }
            } while (side == -1);
        }

        System.out.println("\nСодержимое массива окружностей:");
        for (int i = 0; i < circles.circle.length; i++)
            System.out.println(circles.circle[i].toString());

        System.out.println("\nОкружность с самой большой площадью: \n" + circles.circle[circles.findMaxCircleSquare()]);

        System.out.print("\nВведите количество цилиндров: ");
        int countCylinders = in.nextInt();

        Cylinders cylinders = new Cylinders(countCylinders);
        in.nextLine();

        for (int i = 0; i < cylinders.cylinder.length; i++) {
            cylinders.cylinder[i] = new Cylinder();
            do {
                System.out.print("Введите радиус " + (i + 1) + " цилиндра: ");
                side = Cylinder.CheckCorrectRadius("" + in.nextLine());

                if (side == -1) {
                    System.out.println("Ошибка!");
                } else {
                    cylinders.cylinder[i].setRadius(side);
                }
            } while (side == -1);

            do {
                System.out.print("Введите высоту " + (i + 1) + " цилиндра: ");
                side = Cylinder.CheckCorrectHeight("" + in.nextLine());

                if (side == -1) {
                    System.out.println("Ошибка!");
                } else {
                    cylinders.cylinder[i].setHeight(side);
                }
            } while (side == -1);

        }

        System.out.println("\nСодержимое массива цилиндров:");
        for (int i = 0; i < cylinders.cylinder.length; i++) {
            System.out.println(cylinders.cylinder[i].toString());
        }

        System.out.println("\nСредний объем всех цилиндров: " + cylinders.getAverageVolume());

    }
}


