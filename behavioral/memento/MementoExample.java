public class MementoExample {
    public static void main(String[] args) {
        Editor editor = new Editor("First", 2);
        System.out.println(editor);
        Snapshot snapshot = editor.createSnapshot();
        editor.setPage(3);
        System.out.println(editor);
        snapshot.restore();
        System.out.println(editor);
    }
}
