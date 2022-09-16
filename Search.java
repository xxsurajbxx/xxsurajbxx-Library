package xxsurajbxx.algorithms;
public abstract class Search {
    public final static int linearSearch(int array[], int SV) {
        for(int i=0; i<array.length; i++) {
            if(array[i]==SV) {
                return i;
            }
        }
        return -1;
    }
    public final static int binarySearch(int array[], int SV) {
        return binarySearch(array, SV, array.length, 0);
    }
    public final static int binarySearch(int array[], int SV, int u, int l) {
        int mdpt = (u+l)/2;
        if(array[mdpt]==SV) {
            return mdpt;
        }
        else {
            if(array[mdpt]>SV) {
                return binarySearch(array, SV, mdpt, l);
            }
            else if(array[mdpt]<SV) {
                return binarySearch(array, SV, u, mdpt);
            }
        }
        return -1;
    }
}