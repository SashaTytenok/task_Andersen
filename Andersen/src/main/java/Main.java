//package ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str="";
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("You can chose 3 options: number>7, write Вячеслав, write array.");
            System.out.println("Write 'q' to exit.");
            System.out.println("Write 'asdasd");
            str=in.nextLine();
            if(str.equals("q")) break;

            //сравниваем введенное число с числом 7
            try{
                if(Integer.parseInt(str)>7) {
                    System.out.println("Привет");
                    continue;
                }
            }

            //Если ввели что-то отличное от цифр, то ловим исключение и умалчиваем об этом)
            catch (NumberFormatException e){
            }

            //Проверяем не Вячеслав ли это?
            if(str.equals("Вячеслав")) System.out.println("Привет, Вячеслав!");

                //Проверяем не массив ли мы хотим ввести
            else if (str.equals("array")) {
                ArrayList<Integer> arr_L = new ArrayList();

                //Режим ввода элементов массива
                while (true){
                    System.out.println("Enter number. Write 'q' to show the result and exit.");
                    try {
                        str=in.nextLine();
                        if(str.equals("q")) break;
                        arr_L.add(Integer.parseInt(str));
                    } catch (NumberFormatException e){
                        System.out.println("Something was going wrong! Try again");
                    };
                }

                //Вывод элементов нужных нам
                System.out.print("Numbers: ");
                for (int v : arr_L) {
                    if(v%3==0) System.out.print(v + " ");
                }
                System.out.println();
            }
            else System.out.println("Нет никакого имени");
        }


    }
}
