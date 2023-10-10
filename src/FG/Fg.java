package FG;

import java.util.Scanner;

public class Fg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo c = new Circulo();
        Cuadrado cu = new Cuadrado();
        Elipse el = new Elipse(20,10);
        Rectangulo re = new Rectangulo(5,10);
        PoligonosRegulares po = new PoligonosRegulares(4,6,4f);
        Romboide ro = new Romboide(10,8,6);
        //variables
        String side;

        try {
            System.out.println("Introduzca el radio");

            side = scan.next();

            c.setSide1(Float.parseFloat(side));
            cu.setSide1(5);


            System.out.println("el perimetro es: " + c.getPerimeter() + "m");
            System.out.println("y el Area es: " + c.getArea() + "m");

            System.out.println("El perimetro del Elipse es: " + el.getPerimeter());
            System.out.println("El Area del Elipse es: " + el.getArea());

            System.out.println("el perimetro es: " + cu.getPerimeter() + "m");
            System.out.println("y el Area es: " + cu.getArea() + "m");

            System.out.println("el perimetro es: " + re.getPerimeter() + "m");
            System.out.println("y el Area es: " + re.getArea() + "m");

            System.out.println("el perimetro es: " + po.getPerimeter() + "m");
            System.out.println("y el Area es: " + po.getArea() + "m");

            System.out.println("el perimetro es: " + ro.getPerimeter() + "m");
            System.out.println("y el Area es: " + ro.getArea() + "m");

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());

        }
        finally {
            System.out.println("Esto siempre se ejecuta");
        }

    }
}
