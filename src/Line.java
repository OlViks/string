public class Line {
    public static void main(java.lang.String[] args) {
        System.out.println("Строки!");
        talk1_1();
        talk1_2();
        talk1_3();
    }

    public static void talk1_1() {
        System.out.println("Задание №1");
        String firstName = "Иванов" + " ";
        String middleName  = "Иван" + " ";
        String lastName   = "Иванович" + " ";
        String fullName = firstName  + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
    public static void talk1_2() {
        System.out.println("Задание №2");
        String firstName = "Иванов" + " ";
        String middleName = "Иван" + " ";
        String lastName = "Иванович" + " ";
        String fullName = firstName + middleName + lastName;
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullNameUpper);
    }
    public static void talk1_3() {
        System.out.println("Задание №3");
        String firstName = "Иванов" + " ";
        String middleName = "Семён" + " ";
        String lastName = "Семёнович" + " ";
        String fullName = firstName + middleName + lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника — " + fullName);
    }
}