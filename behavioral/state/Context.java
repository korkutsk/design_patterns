public class Context {
    private State state;
    private boolean isActive;

    public void setState(State state) {
        this.state = state;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void on() {
        state.switchOn();
    }

    public void act() {
        state.act();
    }

    public void off() {
        state.switchOff();
    }
}
