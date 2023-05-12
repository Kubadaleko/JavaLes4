import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*  Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
Если введено exit, завершаем программу
Пример:
java
python
c#
print > [c#, python, java]
revert
print > [python, java]
kotlin
print > [kotlin, python, java]
revert
revert
revert
print > []
revert > Ошибка!
exit -> (Программа завершилась)*/

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> stringsList = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                System.out.println("Программа завершена");
                break;
            } else if (input.equals("print")) {
                for (int i = stringsList.size() - 1; i >= 0; i--) {
                    System.out.print(stringsList.get(i));
                }
                System.out.println();
            } else if (input.equals("revert")) {
                if (stringsList.size() > 0) {
                    stringsList.remove(stringsList.size() - 1);
                } else {
                    System.out.println("Ошибка!");
                }
            } else {
                stringsList.add(Arrays.asList(input));
            }
        }
    }
}
