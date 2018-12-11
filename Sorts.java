import java.util.Random;
public class Sorts{
  public static void main(String[]args){
    //
    int size = Integer.parseInt(args[0]);
    Random r = new Random();
    int[] test = new int[size];
    for (int idx = 0; idx < size; idx ++){
      int temp = r.nextInt() % 100000;
      test[idx] = temp;
    }
    if (args[1].equals("selection")) selectionSort(test);
    else if (args[1].equals("bubble")) bubbleSort(test);
    else if (args[1].equals("insertion")) insertionSort(test);
    else if (args[1].equals("check")) System.out.println(checkAgainstSelection());
    else if (args[1].equals("million")) sortMillion();
    else System.out.println("choose a sort dumbass");
  }

  public static boolean checkAgainstSelection(){
    Random r = new Random();
    int[] test = new int[100000];
    for (int idx = 0; idx < 100000; idx ++){
      int temp = r.nextInt() % 100000;
      test[idx] = temp;
    }
    int[] copyTest = test;
    selectionSort(test);
    insertionSort(copyTest);
    for (int idx = 0; idx < test.length; idx ++){
      if (test[idx] != copyTest[idx]) return false;
    }
    return true;
  }

  public static void sortMillion(){
    int[] ary = new int[1000000];
    bubbleSort(ary);
  }

  public static void insertionSort(int[] ary){
    for (int idx = 1; idx < ary.length; idx ++){
      int val = ary[idx];
      int i = idx - 1;
      for (;i > 0 && ary[i] > val; i--){
        ary[i + 1] = ary[i];
      }
      ary[i + 1] = val;
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
