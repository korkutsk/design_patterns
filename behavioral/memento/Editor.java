public class Editor {
    private String text;
    private int page;

    public Editor(String text, int page) {
        this.text = text;
        this.page = page;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, text, page);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", page=" + page +
                '}';
    }
}
