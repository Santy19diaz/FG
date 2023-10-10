package FG;
/**
 * @author 19dia
 * **/
public class Circulo extends FigurasGeometricas{
    public Circulo() {
        super.setSide1(0);
    }
/**
 * @param x constructor para circulo inicializado**/
    public Circulo(float x){
        super.setSide1(x);
    }
    @Override
    public float getPerimeter() {
        return (float) (Math.PI * (super.getSide1()*2));
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * (super.getSide1()*super.getSide1()));
    }
}
