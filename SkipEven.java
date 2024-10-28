public class SkipEven {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            if (i%2==0) {
                continue;
            } else if (i==75) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
