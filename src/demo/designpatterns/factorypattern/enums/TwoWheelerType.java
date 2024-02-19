package demo.designpatterns.factorypattern.enums;

public enum TwoWheelerType {
    BIKE("BIKE"),
    SCOOTY("SCOOTY");

    private String value;

    private TwoWheelerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
