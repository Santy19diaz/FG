package FG;

public abstract class FigurasGeometricas {
    //atributo general
    private float side1;

    /**
     * @param side1 Metodo para establecer cualquier lado de la
     * figura geometrica**/
    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide1() {
        return side1;
    }

    //crear metodos polimórficos
    public abstract float getPerimeter();
    /**
     * @return retorna el valor del perímetro de acuerdo
     * con la figura y los valores proporcionados**/

    public abstract float getArea();
    /*
     * @return retorna el valor del Área de acuerdo
     * con la figura y los valores proporcionados**/

}
