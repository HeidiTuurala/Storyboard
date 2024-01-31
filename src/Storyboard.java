import java.util.HashSet;
import java.util.List;

public class Storyboard {
    /* Tein muistiinpanoista hashset-tietorakenteen notes, koska hashset mahdollistaa minkä tahansa
    osan hakemisen tietorakenteesta nopeasti ja tehokkaasti */
    private HashSet<Note> notes = new HashSet<>();

    public Storyboard() {

    }
    // addNote lisää muistiinpanon. Muistiinpanoja voidaan lisätä niin paljon kuin koneessa riittää muistia tällä tyylillä.
    public void addNote(Note note){
        notes.add(note);
    }
    /* deleteNote poistaa annetun muistiinpanon. Päädyin tähän ratkaisuun,
     koska näin ohjelma pysyy yksinkertaisena ja löydetään tietty annettu muistiinpano. Jos käyttäisin esimerkiksi objektin ylikirjoitusta,
     pitäisi olla identtisten muistiinpanojen varalta jotain, millä yksilöidään tietty muistiinpano, esim. ID-numero. Tätä ei kuitenkaan ollut
     tehtävänannossa. */
    public void deleteNote(Note note) {
        notes.remove(note);

    }
    /* Haku otsikon perusteella
     Käytin streamia, koska se mahdollistaa otsikon hakemisen nopeasti */
     public List<Note> searchByTitle(String title) {
        return notes.stream().filter(note -> note.getTitle().equalsIgnoreCase(title)).toList();
     }
     /* Haku tekstin perusteella
      Käytin tähänkin streamia samasta syystä kuin otsikon hakemisessa */
     public List<Note> searchByText(String text) {
         return notes.stream().filter(note -> note.getText().equalsIgnoreCase(text)).toList();
     }
     // Haku tagien perusteella
    // Tähänkin olisin tehnyt streamin ja iteroinut listan läpi, jotta tietty tagi löytyy.
     public String searchByTag(List<String> tag) {
        return null;
     }
}
