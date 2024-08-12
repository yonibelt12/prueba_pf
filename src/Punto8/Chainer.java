package Punto8;

public class Chainer {
    private Double  value;

    public Chainer(Double value) {
        this.value = value;

        System.out.println("Initial value: " + value);
    }

    public Chainer add(Double newValue){
        this.value += newValue;
        System.out.println("Plus " + newValue + " = " + this.value);

        return this;
    }
    public Chainer subtract(Double newValue){
        this.value -= newValue;
        System.out.println("Minus " + newValue + " = " + this.value);

        return this;
    }
    public Chainer multiply(Double newValue){
        Double lastValue = this.value;
        this.value *= newValue;
        System.out.println(newValue + " times " + lastValue + " = " + this.value);

        return this;
    }
}
