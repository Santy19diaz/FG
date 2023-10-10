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

    @Override
    public float getPerimeter() {
        return super.getLado()*4;
    }

    @Override
    public float getArea() {
        return (diagonalMayor*diagonalMenor)/2;
    }
}
