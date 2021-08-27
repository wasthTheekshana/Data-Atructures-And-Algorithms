public class BinarySearch {

    public int search(int arrs[],int l ,int r, int x){

        if (r >= 1){
            int midle = l + (r-1)/2;

            if (arrs[midle] == x)
                return midle;

            if (arrs[midle] > x)
                return search(arrs,l,r-1,x);
            //searching right side
            int searchs = search(arrs, l, r + 1, x);
            return searchs;
        }

        return -1;
    }
}
