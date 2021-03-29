/*%s	String
%d	целое число: int, long, …
%f	вещественное число: float, double
%b	boolean
%c	char
%t	Date
%%	Символ %*/
public class Test {
    public static void main(String[] args) {
        String s = "hello";
        int d = 15;
        double f = 15.55;
        boolean b = true;
        char c = 'C';
        char percent = '%';

        double d = 26783.456;
        System.out.printf("%, .2f", d); //26 783,46 (%, - означает форматирование с пробелом)

        // -30 после знака процента означает, сколько пробелов добавлять после значение
        // 30 после знака процента означает, сколько пробелов добавлять перед значением
        System.out.printf("This is %30s String\n", s);
        System.out.printf("This is %30d int, long\n", d);
        System.out.printf("This is %30f double, float\n", f);
        System.out.printf("This is %-30b boolean\n", b);
        System.out.printf("This is %-30c char\n", c);
        System.out.printf("This is %-30% percent format\n", percent);

        /**OUTPUT

         This is                          hello String
         This is                             15 int, long
         This is                      15,550000 double, float
         This is true                           boolean
         This is C                              char
         This is %                              percent format

         */
    }
}
