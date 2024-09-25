import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите личный код: ");
        String personalCode = scanner.nextLine();


        String day = personalCode.substring(5, 7);
        String month = personalCode.substring(3, 5);
        String yearPrefix = personalCode.substring(0, 1);
        String year = personalCode.substring(1, 3);


        String fullYear;
        if (yearPrefix.equals("5") || yearPrefix.equals("6")) {
            fullYear = "20" + year;
        } else {
            fullYear = "19" + year;
        }

        String[] months = {
                "января", "февраля", "марта",
                "апреля", "мая", "июня",
                "июля", "августа", "сентября",
                "октября", "ноября", "декабря"
        };
        String monthName = months[Integer.parseInt(month) - 1];


        System.out.println(name + surname +" родился " + day + " " + monthName + " " + fullYear + " года");
    }
}
