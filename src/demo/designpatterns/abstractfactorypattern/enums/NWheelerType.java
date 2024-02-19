package demo.designpatterns.abstractfactorypattern.enums;

public enum NWheelerType {
    BIKE("BIKE"),
    SCOOTY("SCOOTY"),
    SEDAN("SEDAN"),
    SUV("SUV"),
    MICRO("MICRO");

    private String value;

    private NWheelerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
