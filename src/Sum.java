public class Sum  extends Binary  {

    public Sum(int type, int value, ArithmeticExp left, ArithmeticExp right) {
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
        return left + right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " +  right.toString();
    }
}
