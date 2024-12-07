public class Nota {
    private int nota;

    public Nota(int nota) {
        if(nota <0) {
            throw new IllegalArgumentException("Digite apenas números positivos");
        }
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nota: " + nota;
    }
}
