import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //task 2
        System.out.println("Task 2");
        StringBuilder fullNameSb = new StringBuilder();
        String fullName1 = fullNameSb.append(firstName)
                .append(" ")
                .append(middleName)
                .append(" ")
                .append(lastName)
                .toString();
        String upperCaseFullName = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCaseFullName);

        //task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        String replacedFullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника - " + replacedFullName);
    }
}


