import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(String[] args) {
        Books book1 = new Books("Герберт Уэллс", "Уэллс", 5500.0, 1895, 290);
        Books book2 = new Books("Аэлита", "Толстой", 5995.0, 1923, 180);
        Books book3 = new Books("Порог", "Лукьяненко", 2500.0, 2019, 370);
        Books book4 = new Books("Сервер и дракон", "Райаниеми", 4250.0, 2016, 280);
        List<Books> listbooks = new ArrayList<>();
        listbooks.add(book1);
        listbooks.add(book2);
        listbooks.add(book3);
        listbooks.add(book4);

        for (int i = 0; i < listbooks.size(); i++) {
            Books book = listbooks.get(i);
            int k = 3;
            int page = book.getPages();
            String bookName = "None";
            
            if ((book.getPages() <= 2) && (book.getYear() > 2010) && (book.getAuthor().contains("а"))) {
                bookName = book.getTitle();
            }

            if ((book.getPages() > 2) && (book.getYear() > 2010) && (book.getAuthor().contains("а"))) {
                while (k < page) {
                    if (page % k != 0) {
                        bookName = book.getTitle();
                    } else {
                        break;
                    }
                    k += 2;
                }
            }

            System.out.println(bookName);
        }
    }

    public static void task2(String[] args) {
        Tovar1 tovar1 = new Tovar1("Высший сорт муки", 500.0, 1);
        Tovar1 tovar2 = new Tovar1("Творог средний",200.0, 2);
        Tovar1 tovar3 = new Tovar1("Высший сорт макарон", 250.0, 3);
        Tovar1 tovar4 = new Tovar1("Высший сорт картофеля", 150.0, 4);
        
        List<Tovar1> listtovar = new ArrayList<>();
        listtovar.add(tovar1);
        listtovar.add(tovar2);
        listtovar.add(tovar3);
        listtovar.add(tovar4);
        
        double max = 0.0;

        for (int i = 0; i < listtovar.size(); i++) {
            Tovar1 tovar = listtovar.get(i);
            if ((tovar.getKind() <= 2) && (tovar.getName().contains("Высший"))) {
                if (tovar.getPrice() > max) {
                    max = tovar.getPrice();
                }
            }
        }
        System.out.println("Price = " + max);
    }

    public static void task3(String[] args) {
        Tovar2 tovar1 = new Tovar2("Мука", "Россия", 500, 500.0, 1);
        Tovar2 tovar2 = new Tovar2("Творог", "Казахстан", 200, 200.0, 2);
        Tovar2 tovar3 = new Tovar2("Макароны", "Узбекистан", 250, 250.0, 3);
        Tovar2 tovar4 = new Tovar2("Картофель", "Китай", 150, 150.0, 4);
        List<Tovar2> listtovar = new ArrayList<>();
        listtovar.add(tovar1);
        listtovar.add(tovar2);
        listtovar.add(tovar3);
        listtovar.add(tovar4);

        System.out.println("Input the number of kind: ");
        Scanner scanner = new Scanner(System.in);
        Integer userKind = scanner.nextInt();
        double min = tovar1.getPrice();
        scanner.close();

        for (int i = 0; i < listtovar.size(); i++) {
            Tovar2 tovar = listtovar.get(i);
            if (tovar.getKind() == userKind) {
                if (tovar.getPrice() < min) {
                    min = tovar.getPrice();                  
                }
            } else {
                min = -1;
            }
        }

        for (int i = 0; i < listtovar.size(); i++) {
            Tovar2 tovar = listtovar.get(i);
            if (tovar.getPrice() == min) {
                System.out.print(tovar.getName() + " ");
            }
        }
    }
}