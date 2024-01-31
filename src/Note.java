import java.util.List;

public class Note {
    private String title;
    private String text;
    private List<String> tag;

    public Note(String title, String text, List<String> tag) {
        this.title = title;
        this.text = text;
        this.tag = tag;

    }

    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
    public List<String> getTag() {
        return tag;
    }
}


