public abstract class Binary extends ArithmeticExp {

    ArithmeticExp left;
    ArithmeticExp right;

    @Override
    public ArithmeticExp getLeft() {
        return left;
    }

    @Override
    public void setLeft(ArithmeticExp left) {
        this.left = left;
    }

    @Override
    public ArithmeticExp getRight() {
        return right;
    }

    @Override
    public void setRight(ArithmeticExp right) {
        this.right = right;
    }

    public Binary(int type, int value, ArithmeticExp left, ArithmeticExp right) {
        super(type, value, left, right);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
