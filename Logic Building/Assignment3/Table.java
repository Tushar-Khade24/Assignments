public class Table {

    static void printMultiplicationTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        int num = 5;

        printMultiplicationTable(num);
    }
}