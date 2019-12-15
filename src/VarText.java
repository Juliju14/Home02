import java.util.Scanner;
public class VarText {

    public String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");//запрашиваем имя
        String name = scanner.next();

        return name;

    }

    public String inputCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your city: ");//запрашиваем город
        String city = scanner.next();
        return city;
    }

    public int inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your age: ");//запрашиваем возраст
        int age = scanner.nextInt();
        return age;
    }

    public String inputHobby() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your hobby: ");//запрашиваем хобби
        String hobby = scanner.next();
        return hobby;
    }
}
