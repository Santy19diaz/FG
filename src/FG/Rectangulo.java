package FG;
/**
 * @author 19dia
 * **/
public class Rectangulo extends Cuadrado{
    float base;


    public Rectangulo() {
        super.setLado(0);
        base = 0;
    }


    public Rectangulo(float lado, float base) {
        super.setLado(lado);
        this.base = base;

    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return super.getLado();
    }

    public void setAltura(float altura) {
        super.setLado(altura);
    }

    @Override
    public float getPerimeter() {
        return (base*2)+(super.getLado()*2);
    }

    @Override
    public float getArea() {
        return base*super.getLado();
    }
}

