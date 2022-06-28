import java.util.Arrays;

public class HeapSort {

  public static void main(String[] args) {
    HeapSort hs = new HeapSort();
    int[] numArr = {3,10,1,14,6,8};
    //int[] numArr = {47, 85, 620, 3456, -7, 10, 4500, 106, -345, 1000, 67, 80, 5500, 34, 78, 782, 4, 0, 99, 190};
    //int[] numArr = {0, 21, 5, 1, 0, 2, 10, 15, 7, 5};
    hs.sort(numArr);
    System.out.println("Sorted array- " + Arrays.toString(numArr));
  }
    
  private void sort(int[] numArr){
    int arrLength = numArr.length;
    // create heap
    for(int i = (arrLength-1)/2; i >=0; i--){
      heapify(numArr, arrLength, i);
    }
    System.out.println("heapified array- " + Arrays.toString(numArr));
    // Sorting process
    // in the loop keep reducing the array that is used for creating heap
    for(int i = arrLength-1; i >= 0; i--){
      // Swap root and last nodes
      swap(numArr, i, 0);
      // build heap again
      heapify(numArr, i, 0);
    }
  }
    
  private void heapify(int[] numArr, int index, int i){
    // Getting parent and children indexes
    int rootIndex = i;
    int lc = 2*i + 1;
    int rc = 2*i + 2;
    //comparing left child value
    if(lc < index && numArr[lc] > numArr[rootIndex])
        rootIndex = lc;
    //comparing right child value
    if(rc < index && numArr[rc] > numArr[rootIndex])
        rootIndex = rc;
    // if change required then swap values and call method recursively
    if(rootIndex != i){
      swap(numArr, rootIndex, i);
      heapify(numArr, index, rootIndex);
    }
  }
    
  private void swap(int[] numArr, int index, int li){
    int temp = numArr[li];
    numArr[li] = numArr[index];
    numArr[index] = temp;
  }
}