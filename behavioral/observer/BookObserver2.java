public class BookObserver2 implements Observer{
    private int id;

    public BookObserver2(int id) {
        this.id = id;
    }

    @Override
    public void update(String bookName) {
        System.out.println("Book " + bookName + " is on sale right now.");
    }

    @Override
    public int getId() {
        return id;
    }
}
