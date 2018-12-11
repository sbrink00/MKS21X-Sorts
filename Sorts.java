import java.util.Random;
public class Sorts{
  public static void main(String[]args){
    int[] test = new int[]{1, 2, 3, 4, 5};
    insertionSort(test);
    //System.out.println(toString(test));
    //bubbleSort(test);
    //System.out.println(toString(test));
    /*Random r = new Random();
    int limit = 10000;
    int[] ary = new int[limit];
    for (int idx = 0; idx < limit; idx ++){
      int temp = r.nextInt() % 1000000;
      ary[idx] = temp;
    }
    bubbleSort(ary);*/
  }

  public static void insertionSort(int[] ary){
    for (int idx = 1; idx < ary.length; idx ++){
      int val = ary[idx];
      int i = idx - 1;
      for (;i > 0 && ary[i] > val; i--){
        ary[i + 1] = ary[i];
      }
      System.out.println(val);
      ary[i + 1] = val;
      System.out.println(toString(ary));
    }
  }

  public static void selectionSort(int[] ary){
    for (int idx = 0; idx < ary.length; idx ++){
      int index = idx;
      for (int idx2 = idx; idx2 < ary.length; idx2 ++){
        int temp = ary[idx2];
        if (temp < ary[index]) index = idx2;
      }
      swap(ary, idx, index);
    }
  }

  public static void bubbleSort(int[] ary){
    boolean sorted = false;
    int val = 1;
    while (!sorted){
      sorted = true;
      for (int idx = 0; idx < ary.length - val; idx ++){
        if (ary[idx] > ary[idx + 1]){
          swap(ary, idx, idx + 1);
          sorted = false;
        }
      }
      val++;
    }
  }

  public static String toString(int[] ary){
    String output = "[";
    for (int idx = 0; idx < ary.length; idx ++){
      output += ary[idx] + ", ";
    }
    return output.substring(0, output.length() - 2) + "]";
  }

  public static void swap(int[] ary, int index1,  int index2){
    int temp = ary[index1];
    ary[index1] = ary[index2];
    ary[index2] = temp;
  }
}
