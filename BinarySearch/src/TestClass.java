public class TestClass {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[] = new int[]{2,5,10,18,19,20,25};
        int l = 0;
        int r = arr.length-1;
        int x = 19;
        int result = bs.search(arr,l,r,x);
        if ( result == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found " + result);
        }
    }
}
