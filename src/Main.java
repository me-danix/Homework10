public class Main {
    public static void main(String[] args) {

        // Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastname = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastname;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // Задача 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        // Задача 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}