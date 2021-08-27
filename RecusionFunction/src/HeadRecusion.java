public class HeadRecusion {

    public void fun(int i){

        if (i > 0){
            fun(i -1); // Head Recusion
            System.out.println(i);
        }

    }
}
