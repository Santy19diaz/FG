package FG;

public class Romboide extends Cuadrado{
    float diagonalMayor;
    float diagonalMenor;

    public Romboide() {
        diagonalMayor = 0;
        diagonalMenor = 0;
        super.setLado(0);
    }

    public Romboide(float lado, float diagonalMayor, float diagonalMenor) {
        super.setLado(lado);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public Romboide(float lado) {
        super(lado);
    }

    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public float getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public void setLado(float lado){
        super.setLado(lado);
    }

    public float getLado(){
        return super.getLado();
    }

    @Override
    public float getPerimeter() {
        return super.getLado()*4;
    }

    @Override
    public float getArea() {
        return (diagonalMayor*diagonalMenor)/2;
    }
}
