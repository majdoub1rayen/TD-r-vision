import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures() {
        this.voitures = new ArrayList<>();
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        if (voitures.contains(v)) {
            throw new VoitureException("La voiture existe déjà.");
        }
        voitures.add(v);
    }

    public void supprimeVoiture(Voiture v) throws VoitureException {
        if (!voitures.remove(v)) {
            throw new VoitureException("La voiture n'existe pas.");
        }
    }

    public void affiche() {
        for (Voiture voiture : voitures) {
            System.out.println(voiture);
        }
    }

    public int size() {
        return voitures.size();
    }

    public Iterator<Voiture> iterateur() {
        return voitures.iterator();
    }
}
