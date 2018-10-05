package Math;

public class Square {
    private double sideLen;

    public Square(double sideLen){
        this.sideLen = sideLen;
    }

    public Double perimeter (){
        return 4 * this.sideLen;
    }

    public Double area(){
        return Math.pow(sideLen, 2);
    }

    public Double diagonal(){
        return sideLen * Math.sqrt(sideLen);
    }
}
