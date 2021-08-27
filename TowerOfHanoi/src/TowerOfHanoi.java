public class TowerOfHanoi {

    int moves = 0;
    public void hanoiMethod(int numOfBlocks , String let1,String let2,String let3){
        if (numOfBlocks == 1){
            System.out.println("Moves to " + numOfBlocks + " to " + let1 + " from " + let2);
            moves ++;
        }else{
            hanoiMethod(numOfBlocks - 1,let1,let3,let2);
            System.out.println("Moves to " + numOfBlocks + " to " + let1 + " from " + let2);
            hanoiMethod(numOfBlocks - 1,let3,let2,let1);
        }
    }
}
