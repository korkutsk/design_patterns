public class Snapshot {
    private Editor editor;
    private String text;
    private int page;

    public Snapshot(Editor editor, String text, int page) {
        this.editor = editor;
        this.text = text;
        this.page = page;
    }

    public void restore() {
        editor.setText(text);
        editor.setPage(page);
    }
}
