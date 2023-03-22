package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Converter converter = new Converter();
            double dollar = 0.36;
            double euro = 0.33;
            double ruble = 27.39;
            double grivna = 10.62;
            do {
                Scanner in = new Scanner(System.in);
                System.out.println("\nВведите сумму:");
                int m = in.nextInt();
                if (m <= 0) {
                    throw new Exception("Неверный ввод, валюта не может быть равна 0 или быть отрицательной");
                }
                System.out.println("Введите номер валюты в которую желаете конвертировать: \n1.Доллары($) \t2.Евро(€) \t3.Рубли(₽) \t4.Гривни(₴)");
                int n = in.nextInt();
                if (n >= 5 || n <= 0) {
                    do {
                        System.out.println("Номер валюты не найден");
                        System.out.println("Введите номер валюты в которую желаете конвертировать: \n1.Доллары($) \t2.Евро(€) \t3.Рубли(₽) \t4.Гривни(₴)");
                        n = in.nextInt();
                    }
                    while (n >= 5 || n <= 0);
                }
                switch (n) {
                    case 1:
                        System.out.println("\nДоллары($): "+converter.Convert(m, dollar));
                        break;
                    case 2:
                        System.out.println("\nЕвро(€): "+converter.Convert(m, euro));
                        break;
                    case 3:
                        System.out.println("\nРубли(₽): "+converter.Convert(m, ruble));
                        break;
                    case 4:
                        System.out.println("\nГривни(₴): "+converter.Convert(m, grivna));
                        break;
                    case 5:
                        System.out.println("\nДоллары($): "+converter.Convert(m, dollar));
                        System.out.println("\nЕвро(€): "+converter.Convert(m, euro));
                        System.out.println("\nРубли(₽): "+converter.Convert(m, ruble));
                        System.out.println("\nГривни(₴): "+converter.Convert(m, grivna));
                        break;

                }
            }while(true);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
    public static class Converter {
        public double Convert(int a, double b ) {
            return a*b;
        }
    }
}