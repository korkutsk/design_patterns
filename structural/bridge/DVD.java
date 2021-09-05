public class DVD implements Device {
    private boolean state = false;
    @Override
    public boolean isEnabled() {
        return state;
    }

    @Override
    public void enable() {
        this.state = true;
    }

    @Override
    public void disable() {
        this.state = false;
    }
}
