package Iterator;

public class Main {
    public static void main(String[] args) {
        //Використовуємо wrapper class Integer, бо звичайний int примітивний тип даних і не наслідується від класу Object
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayIterator<Integer> iter = new ArrayIterator(arr);

        System.out.println("\n\nВиведемо числа з допомогою ітератора");
        while (iter.hasNext()){
            System.out.print(iter.next() + ", ");
        }

        iter = new ArrayIterator<Integer>(arr);
        System.out.println("\n\nВиведемо тільки парні числа");
        while (iter.hasNext()){
            int temp = iter.next();
            System.out.print(temp % 2 == 0 ? temp + ", " : "");
        }

        String name = "Hi, my name is Rostyk";
        StringIterator strIter = new StringIterator(name);


        //виводимо на екран Строку за допомогою свого ітератора
        System.out.println("\n\nВиводимо на екран строку тексту за допомогою ітератора: ");
        while (strIter.hasNext()){
            System.out.print(strIter.next());
        }

        strIter = new StringIterator(name);
        //виведимо на екран кожне слово з нового рядка
        System.out.println("\n\nВиводимо на екран кожне слово з нового рядка: ");
        while (strIter.hasNext()){
            Character temp = strIter.next();
            System.out.print(Character.isSpaceChar(temp) ? "\n" : temp);
        }
    }
}
