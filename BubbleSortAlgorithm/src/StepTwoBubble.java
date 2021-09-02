public class StepTwoBubble {
    void TwoBubbleSort(int array[]){

        int size = array.length;

        for (int i = 0; i < size -1; i++){
            boolean swipped = false;
            System.out.println("Firsr swiped" + swipped);
            for (int j = 0; j < size - i -1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swipped = true;
                    System.out.println(swipped);
                }
            }

            if (!swipped){
                break;
            }
        }


    }

}
