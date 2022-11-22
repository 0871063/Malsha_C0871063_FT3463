public abstract class ArithmeticExp {
    public int type;
    public int value;
    public ArithmeticExp left;
    public ArithmeticExp right;
    public int evaluate(){
        return 0;
    }

    public ArithmeticExp(int type, int value, ArithmeticExp left, ArithmeticExp right) {
        this.type = type;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public ArithmeticExp(int type, int value) {
        this.type = type;
        this.value = value;
    }

    public ArithmeticExp(int value) {
        this.value = value;
    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArithmeticExp getLeft() {
        return left;
    }

    public void setLeft(ArithmeticExp left) {
        this.left = left;
    }

    public ArithmeticExp getRight() {
        return right;
    }

    public void setRight(ArithmeticExp right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
