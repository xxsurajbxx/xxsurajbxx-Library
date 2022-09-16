package xxsurajbxx.algorithms;
public abstract class Sort {
    public final static void bubbleSort(int arr[]) {
        for(int x=arr.length-1; x>0; x--) {
            for(int i=0; i<x; i++) {
                if(arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public final static void quickSort(int array[]) {
        quickSort(array, 0, array.length);
    }
    private final static void quickSort(int array[], int left, int right) {
        if(left+1==right) {
            return;
        }
        int mdpt = (right+left)/2;
        int midval = array[mdpt];
        int leftarr[] = new int[array.length];
        int rightarr[] = new int[array.length];
        for(int i=left, lcntr=0, rcntr=0; i<right; i++) {
            if(array[i]<mdpt) {
                leftarr[lcntr++] = array[i];
            }
            else if(array[i]>mdpt) {
                rightarr[rcntr++] = array[i];
            }
        }
        for(int i=left, lcntr=0, rcntr=0; i<right; i++) {
            if(i<leftarr.length) {
                array[i] = leftarr[lcntr++];
            }
            else if(i==leftarr.length) {
                array[i] = midval;
            }
            else {
                array[i] = rightarr[rcntr++];
            }
        }
        quickSort(array, left, mdpt);
        quickSort(array, mdpt, right);
    }
    public final static void mergeSort(int arr[]) {
        if(arr.length==1) {return;}
        int leftarr[]=new int[arr.length/2];
        int rightarr[]=new int[(arr.length/2)+(arr.length%2)];
        for(int i=0, leftcntr=0, rightcntr=0; i<arr.length; i++) {
            if(i<arr.length/2) {leftarr[leftcntr++] = arr[i];}
            else {rightarr[rightcntr++] = arr[i];}
        }
        mergeSort(leftarr);
        mergeSort(rightarr);
        for(int i=0, rcntr=0, lcntr=0; i<arr.length; i++) {
            if(rcntr==rightarr.length) {
                arr[i] = leftarr[lcntr++];
            }
            else if(lcntr==leftarr.length) {
                arr[i] = rightarr[rcntr++];
            }
            else {arr[i] = leftarr[lcntr]<rightarr[rcntr] ? leftarr[lcntr++] : rightarr[rcntr++];}
        }
    }
}