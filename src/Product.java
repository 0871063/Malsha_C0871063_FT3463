public class Product extends Binary {
    public Product(int type, int value, ArithmeticExp left, ArithmeticExp right) {
        super(type, value, left, right);
    }

    @Override
    public int evaluate() {
        int right = 0;
        int left = 0;
        if (this.right != null){
            right = this.right.getValue();
        }
        if (this.right != null){
            left = this.right.getValue();
        }
        return right * left;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
