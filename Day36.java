public class Day36 {
    public static  void main(String...args){
        int[] a ={5,2,9,73};
        sortOrnot(a);
    }
    static void sortOrnot(int[] a) {
        if (isAscending(a) || isDescending(a)) {
            System.out.println("This is Sorted Array.");
        } else {
            System.out.println("This is UnSorted Array.");
        }
    }
    static boolean isAscending(int[] a){
        for(int i = 0; i < a.length;i++){
            for(int j =i+1; j < a.length;j++){
                if(!(a[i] < a[j])){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isDescending(int[] a){
        for(int i = 0; i < a.length;i++){
            for(int j =i+1; j < a.length;j++){
                if(!(a[i] > a[j])){
                    return false;
                }
            }
        }
        return true;

    }

}
