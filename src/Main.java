public class Main {
    public static void main(String[] args) {
            // constructing the expression 3 + 2 * 5

        ArithmeticExp term = new Sum(Type.SUM, 0,
                new Number( 3),
                new Product(Type.PROD, 0,
                        new Number( 2),
                        new Number(5)));

        System.out.println(term.evaluate());
    }
}