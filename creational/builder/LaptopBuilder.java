public class LaptopBuilder implements Builder {
    @Override
    public void addMonitor() {
        System.out.println("Added monitor for laptop. ");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Added keyboard for laptop. ");
    }
}
