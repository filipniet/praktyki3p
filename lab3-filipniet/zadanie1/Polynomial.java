package zadanie1;

public class Polynomial {
    private int[] tab;
    public Polynomial(int[] tabl){
        tab = tabl;
    }
    public void setCoeficients(int[] tab) {
        this.tab = tab;
    }
    public int[] getCoeficients() {
        return tab;
    }
    public int coeficientAt(int i){
        return tab[i];
    }
    public void add(int[] tablica2){

    }
}
