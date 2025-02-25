public class Exercise4_8 {
    // Метод в котором происходят вычесления.
    private static void multiplicationTable(int[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println();
            for(int k = 0; k < list.length; k++) {
                System.out.print(list[i] + " * " + list[k] + " = " + (list[i] * list[k]) + " | ");  
            }
        }
    }
    // Метод main в котором объявлен массив с цифрами.
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Таблица умножения: ");
        Exercise4_8.multiplicationTable(list);
    }
}