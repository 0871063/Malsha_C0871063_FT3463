public abstract class Binary extends ArithmeticExp {

    ArithmeticExp letf;
    ArithmeticExp right;

    public Binary(int type, int value, ArithmeticExp left, ArithmeticExp right) {
        super(type, value, left, right);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
