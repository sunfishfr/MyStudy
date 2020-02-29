import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "luhan";
        System.out.println("Hello World~");
        int a = 0b101;
        System.out.println((byte)128);

        int money = 10_0000_0000;
        System.out.println(money);
        int year = 20;
        int total1 = money * year;
        System.out.println(total1);//输出：-1474836480
        //尝试改变
        long total2 = money * year;
        System.out.println(total2);//输出：-1474836480
        //再次调整
        long total3 = money * (long)year;
        System.out.println(total3);//输出：20000000000

    }
}
