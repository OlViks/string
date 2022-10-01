public class Line {
    public static void main(java.lang.String[] args) {
        System.out.println("Строки!");
        talk1_1();
        talk1_2();
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
        System.out.println("Задание №1");
        String firstName = "Иванов" + " ";
        String middleName = "Иван" + " ";
        String lastName = "Иванович" + " ";
        String fullName = firstName + middleName + lastName;
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullNameUpper);
    }
}