public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.addMonitor();
        builder.addKeyboard();
    }

    public Builder getBuilder() {
        return builder;
    }
}
