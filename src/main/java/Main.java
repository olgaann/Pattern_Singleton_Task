import java.util.*;

public class Main {
    static Logger logger = Logger.getInstance();
    static Scanner scan = new Scanner(System.in);

    public static int input(String msg) {
        int result;
        while (true) {
            System.out.println(msg);
            String input = scan.nextLine();
            try {
                result = Integer.parseInt(input);
                break;
            } catch (NumberFormatException exception) {
                logger.log("Неверный формат ввода");
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        int n = input("Введите размер списка: ");
        int m = input("Введите верхнюю границу для значений: ");


        logger.log("Создаем и наполняем список");
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(m + 1));
        }

        System.out.println("Вот случайный список " + randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        int f = input("Введите порог для фильтра: ");

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> resultList = filter.filterOut(randomList);
        logger.log("Выводим результат на экран ");
        System.out.println("Отфильтрованный список: " + resultList);
        logger.log("Завершаем программу");

    }
}
