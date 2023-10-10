package FG;
/**
 * @author 19dia
 * **/
public class Cuadrado extends FigurasGeometricas {
    float lado;
    public Cuadrado() {
        super.setSide1(0);
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float getPerimeter() {
        return super.getSide1()*4;
    }

    @Override
    public float getArea() {
        return super.getSide1()*super.getSide1();
    }
}
