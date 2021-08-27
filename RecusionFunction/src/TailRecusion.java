public class TailRecusion {

    public void fun(int i ) {
        if (i > 0) {
            System.out.println(i);
            fun(i - 1); //tail recusion
        }
    }
}
