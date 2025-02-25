import java.util.Arrays;


public class App {
  // Метод который удваивает только первый элемент
  private static void doubleFirstElement(int[] array) {
    array[0] = array[0] * 2;
  }

  // Метод который удваивает каждый элемент из массива
  private static void doublingArrayElements(int[] array) {
    for(int i = 0; i < array.length; i++) {
      array[i] = array[i] * 2;
      
  }
}
  // Метод который перебирает каждый элемент
  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " " );
    }
  }
  // Метод в которм объявляется массив и выводятся все значения.
  public static void main(String[] args) {
  // Исходный массив. Упражнение 4.5
  int[] array = {15, 13, 9, 5, 7}; 
  System.out.print("Исходный массив: "); 
  App.printArray(array); 
  System.out.println();

  // Удвоение массива. Упражнение 4.6
  System.out.print("Удвоенный массив: ");
  App.doublingArrayElements(array); 
  App.printArray(array);

  // Удвоение первого элемента. Упражнение 4.7
  System.out.println();
  System.out.println("Умноженный первый элемент: "+ array[0]); 
  doubleFirstElement(array); 
  }
}