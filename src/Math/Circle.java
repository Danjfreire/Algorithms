package Math;

public class Circle {

    private double ratio;

    public Circle(Double ratio){
        this.ratio = ratio;
    }

    public Double circumference(){
        return 2 * Math.PI * this.ratio;
    }

    public Double area (){
        return Math.pow(ratio,2) * Math.PI;
    }
}
