public class sort{
  public static void main(String[]args){
    int[] test = new int[]{-10, 11, 2, 5, 7, 4, 3, 54522, 7565334, -2, -7, -5};
    System.out.println(toString(test));
    swap(test, 1, 4);
    System.out.println(toString(test));
    //System.out.println(selectionsort(test));
  }

  public static String toString(int[] ary){
    String output = "[";
    for (int idx = 0; idx < ary.length; idx ++){
      output += ary[idx] + ", ";
    }
    return output.substring(0, output.length() - 2);
  }

  public static void swap(int[] ary, int index1,  int index2){
    int temp = ary[index1];
    ary[index1] = ary[index2];
    ary[index2] = temp;
  }

  /*public static void selectionsort(int[] ary){
    int min;
    for (int idx = 0; idx < ary.length; idx ++){
      min = ary[]
    }
  }*/

}
