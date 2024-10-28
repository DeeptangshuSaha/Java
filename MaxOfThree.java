public class MaxOfThree {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        String val = (a>b) ? ((b>c) ? "a > b > c" : ((a>c) ? "a > c > b" : "c > a > b")) : ((b>c) ? ((a>c) ? "b > a > c" : "b > c > a") : "c > b > a");
        System.out.println(val);
        if (a>b) {
            if (b>c) {
                System.out.printf("%d>%d>%d a>b>c",a,b,c);
            } else {
                if (a>c){
                    System.out.printf("%d>%d>%d a>c>b",a,c,b);
                } else {
                    System.out.printf("%d>%d>%d c>a>b",c,a,b);
                }
            }
        } else {
            if (b>c) {
                if (a>c){
                    System.out.printf("%d>%d>%d b>a>c",b,a,c);
                } else {
                    System.out.printf("%d>%d>%d b>c>a",b,c,a);
                }
            } else {
                System.out.printf("%d>%d>%d c>b>a",c,b,a);
            }
        }
    }
}
