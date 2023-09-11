public class Multiples {

    public static void main(String[] args) {
        int counter = 0;
        for(int i=3; i<1000; i++){
            counter = getCounter(i, counter);
        }
        System.out.println(counter);
    }

    private static int getCounter(int i, int counter) {
        if (i %3==0){
            counter++;
        } else if (i %5==0) {
            counter++;
        }
        return counter;
    }
}
