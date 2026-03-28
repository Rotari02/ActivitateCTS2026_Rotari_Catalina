import java.util.ArrayList;
import java.util.List;

// Clasa concretă Reteta
public class Reteta implements IReteta {
    private String numeMedicament;
    private List<String> ingrediente;
    private List<Double> cantitati; // cantități în ml sau g

    // Constructor implicit
    public Reteta() {
        this.numeMedicament = "Medicament Generic";
        this.ingrediente = new ArrayList<>();
        this.cantitati = new ArrayList<>();
    }

    // Constructor parametrizat
    public Reteta(String numeMedicament, List<String> ingrediente, List<Double> cantitati) {
        this.numeMedicament = numeMedicament;
        // deep copy la liste pentru siguranță
        this.ingrediente = new ArrayList<>(ingrediente);
        this.cantitati = new ArrayList<>(cantitati);
    }

    // Getter / Setter (opțional, clean code)
    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public List<String> getIngrediente() {
        return new ArrayList<>(ingrediente); // returnăm copie pentru siguranță
    }

    public List<Double> getCantitati() {
        return new ArrayList<>(cantitati);
    }

    public void adaugaIngredient(String ingredient, double cantitate) {
        this.ingrediente.add(ingredient);
        this.cantitati.add(cantitate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rețetă: ").append(numeMedicament).append("\nIngrediente:\n");
        for (int i = 0; i < ingrediente.size(); i++) {
            sb.append(" - ").append(ingrediente.get(i))
                    .append(": ").append(cantitati.get(i)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public IReteta duplica() {
        // deep copy complet
        return new Reteta(this.numeMedicament, this.ingrediente, this.cantitati);
    }
}
