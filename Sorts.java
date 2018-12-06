public class Sorts{
  public static void main(String[]args){
    int[] test = new int[]{-9, 5, 687, 4, -23245, -434379797, 90048349, 5 ,6 ,3, 7};
    System.out.println(toString(test));
    selectionSort(test);
    System.out.println(toString(test));
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


}
