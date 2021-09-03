public class BookObserver1 implements Observer {
    private int id;

    public BookObserver1(int id) {
        this.id = id;
    }

    @Override
    public void update(String bookName) {
        System.out.println("Book " + bookName + " is on sale right now.");
    }

    public int getId() {
        return id;
    }
}
