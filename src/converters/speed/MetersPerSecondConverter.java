package converters.speed;

import converters.AbstractConverter;

public class MetersPerSecondConverter extends AbstractConverter {
    public MetersPerSecondConverter() {
        super("m/s");
    }

    @Override
    public double toBasicUnit(double value) {
        return value;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value;
    }
}