public class DesktopPCBuilder implements Builder {
    @Override
    public void addMonitor() {
        System.out.println("Added monitor to desktop pc. ");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Added keyboard to desktop pc. ");
    }

    public void addMouse() {
        System.out.println("Added mouse to desktop pc. ");
    }

    public void addSystemBlock() {
        System.out.println("Added system block to desktop pc. ");
    }
}
