package Inheritance;

class Shape {
    String color;

    public void area(){
        System.out.println("displays area");
    }
    
}

class Tringle extends Shape{
    public void area(int l,int h){
        System.out.println(1/5*l*h);
    }

}
class Equilateraltringle extends Tringle{
    public void area(int l,int h){
        System.out.println(1/5*l*h);
    }

}

class Circle extends Shape{ 
    public void area(int r){
        System.out.println(3.14*r*r);
    
}

}


public class Runtimepoly{
    
    public static void main(String[] args) {
        
       Circle t1 = new Circle();
        t1.color = "red";
        t1.area(5);
    }
}

