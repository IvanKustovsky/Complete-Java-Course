package PrimitiveDataTypes;
public class BiNumber {
    public int getValue1() {
        return value1;
    }

    private int value1;

    public int getValue2() {
        return value2;
    }

    private int value2;

    public BiNumber(int value1,int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add(){
        return  value1 + value2;
    }

    public int multiply(){
        return  value1 * value2;
    }

    public void doubleValues(){
        value1 *=2;
        value2 *=2;
    }
}
