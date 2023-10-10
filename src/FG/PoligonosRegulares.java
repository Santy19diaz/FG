package FG;
/**
 * @author 19dia
 * **/
public class PoligonosRegulares extends FigurasGeometricas{


    float nLados;
    float apotema;

    public PoligonosRegulares(){
        super.setSide1(0);
        this.apotema = 0;
        this.nLados = 0;
    }

    /**
     * @param lado,nLados,apotema constructor para PoligonosRegulares inicializado**/
    public PoligonosRegulares(float lado, float nLados, float apotema) {//sobrecarga de metodo
        super.setSide1(lado);
        this.nLados = nLados;
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public void setLado(float lado){
        super.setSide1(lado);
    }

    public float getLado(){
        return super.getSide1();
    }

    @Override
    public float getPerimeter() {
        return super.getSide1()*nLados;
    }

    @Override
    public float getArea() {
        return ((super.getSide1()*nLados)*apotema)/2;
    }
}
