import java.util.ArrayList;
import java.util.List;

// Koodin testiajo
public class Main {
    /* Tein storyboardista objektin, jonka avulla voidaan palauttaa löydetyt arvot.
     Tämä koodi tosin vasta palauttaa vain haetun sanan eikä koko muistiinpanoa. */
    public static void main(String[] args) {
        Storyboard storyboard = new Storyboard();
        storyboard.addNote(new Note("Test Traceplayer", "Implement a unit test for the class Traceplayer of the spark core framework.",new ArrayList<>()));

        List<Note> title = storyboard.searchByTitle("Test Traceplayer");
        for (Note note: title) {
            System.out.println(note.getTitle());
        }
        List<Note> text = storyboard.searchByText("Implementa a unit test for the class Traceplayer of the spark core framework.");
        for (Note note: text) {
            System.out.println(note.getText());
        }
    }
}