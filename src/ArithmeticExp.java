public abstract class ArithmeticExp {
    public Type type;
    public int value;
    public ArithmeticExp left;
    public ArithmeticExp right;
    public int evaluate(){
        switch (this.type) {
            case NUMBER:
                return value;
            case SUM:
                return (this.left.getValue()) + this.right.getValue();
            case PROD:
                return this.left.getValue() * this.right.getValue();
            default:
                return 0;    //error, should never happen

        }
    }

    public ArithmeticExp(Type type, int value, ArithmeticExp left, ArithmeticExp right) {
        this.type = type;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public ArithmeticExp(Type type, int value) {
        this.type = type;
        this.value = value;
    }

    public ArithmeticExp(int value) {
        this.value = value;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
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
