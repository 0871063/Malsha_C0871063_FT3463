public class Number extends ArithmeticExp {

    private  int value;

    public Number(int value) {
        super(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return getValue();
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
