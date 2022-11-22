public class Main {

    public static final int TYPE_NUMBER = 1;
    public static final int TYPE_SUM = 2;
    public static final int TYPE_PROD = 3;
    public static void main(String[] args) {
            // constructing the expression 3 + 2 * 5

        ArithmeticExp term = new Sum(TYPE_SUM, 0,
                new Number( 3),
                new Product(TYPE_PROD, 0,
                        new Number( 2),
                        new Number(5)));

        System.out.println(term.evaluate());
    }
}