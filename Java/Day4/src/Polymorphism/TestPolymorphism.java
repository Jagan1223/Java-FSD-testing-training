package Polymorphism;

class Shape{  
void draw(){System.out.println("drawing...");}  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
}  
class TestPolymorphism{  
public static void main(String args[]){  
Shape s;  
s=new Shape();
s.draw();
s=new Rectangle();  
s.draw();  
s=new Circle();  
s.draw();  
}
}
