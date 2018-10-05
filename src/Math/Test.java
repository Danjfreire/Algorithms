package Math;

public class Test {
    public static void main(String[]args){

        Circle c1 = new Circle(5.0);
        System.out.println("c1 C :" + c1.circumference());
        System.out.println("c1 A : " + c1.area());

        Square s1 = new Square(4.0);
        System.out.println("s1 P : " + s1.perimeter());
        System.out.println("s1 A : " + s1.area());
        System.out.println("s1 D : " + s1.diagonal());
    }
}
