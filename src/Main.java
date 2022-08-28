import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String day=scan.nextLine().toUpperCase();
        Day day1=Day.valueOf(day);
        switch (day1){
            case MONDAY -> System.out.println("Дуйшомбу  техникалык жаваны  окуйм!");
            case TUESDAY -> System.out.println("Шейшемби практикалык жавага катышам!");
            case WEDNESDAY -> System.out.println("Шаршемби английский окуйм!");
            case THURSDAY -> System.out.println("Бейшемби  тез жазуу практика кылам!");
            case FRIDAY -> System.out.println("Жума  руханий жактан онуктуруучу сабактарга катышам!");
            case SATURDAY, SUNDAY -> System.out.println("Ишемби жана жекшемби кундору уй-булом менен эс алам!");
        }

    }
}