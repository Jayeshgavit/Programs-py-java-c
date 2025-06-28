package PolyMorphism;

public class Compiletime {

    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo( String name, int age){
        System.out.println("Name : "+ name + " age : "+ age);
    }
    
    public static void main(String[] args) {
        
        Compiletime obj1 = new Compiletime();
        obj1.printinfo("jayesh", 23);

    }
}
