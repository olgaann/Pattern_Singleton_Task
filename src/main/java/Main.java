import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        String input;
        int n;
        while (true) {
            System.out.println("Введите размер списка: ");
            input = scan.nextLine();
            try {
                n = Integer.parseInt(input);
                break;
            } catch (NumberFormatException exception) {
                logger.log("Неверный формат ввода");
            }
        }

        int m;
        while (true) {
            System.out.println("Введите верхнюю границу для значений: ");
            input = scan.nextLine();
            try {
                m = Integer.parseInt(input);
                break;
            } catch (NumberFormatException exception) {
                logger.log("Неверный формат ввода");
            }
        }


        logger.log("Создаем и наполняем список");
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(m + 1));
        }

        System.out.println("Вот случайный список " + randomList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        int f;
        while (true) {
            System.out.println("Введите порог для фильтра: ");
            input = scan.nextLine();
            try {
                f = Integer.parseInt(input);
                break;
            } catch (NumberFormatException exception) {
                logger.log("Неверный формат ввода");
            }
        }

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> resultList = filter.filterOut(randomList);
        logger.log("Выводим результат на экран ");
        System.out.println("Отфильтрованный список: " + resultList);
        logger.log("Завершаем программу");

    }
}
