package FG;
/**
 * @author 19dia
 * **/
public class Elipse extends Circulo {
    //de radio menor
    private float radioMin;

    public float getRadiomin() {
        return this.radioMin;
    }
    //Sobrecarga de metodos
    public void setRadiomin(float radiomin) {
        this.radioMin = radiomin;
    }

    public void setRadiomin(String radiomin) {
        this.radioMin = Float.parseFloat(radiomin);
    }

    public Elipse() {
       super.setSide1(0);//radio Mayor
       this.radioMin = 0;
    }

    public Elipse(float radioMax, float  radioMin) {
        super.setSide1(radioMax);
        this.radioMin =  radioMin;


    }

    @Override
    public float getPerimeter() {
        return (float) (Math.PI * (super.getSide1()+radioMin));
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * (super.getSide1()*radioMin));
    }
}
