// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static String getFullName(){
        String name = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String determinator = " ";
        String fullName = name + determinator + middleName + determinator + lastName;
        return fullName;
    }
    private static void task1(String fullName){
        System.out.println("Задание 1");
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }
    private static void task2(String fullName) {
        System.out.println("Задание 2");
        System.out.println("Ф.И.О. сотрудника заглавными буквами - " + fullName.toUpperCase());
    }
    private static void task3(String fullName) {
        System.out.println("Задание 2");
        System.out.println("Ф.И.О. сотрудника - " + fullName.replace("ё","е"));
    }
    public static void main(String[] args) {
        task1(getFullName());
        task2(getFullName());
        task3(getFullName());
    }
}
