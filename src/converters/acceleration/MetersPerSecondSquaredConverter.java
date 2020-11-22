package converters.acceleration;

import converters.AbstractConverter;

public class MetersPerSecondSquaredConverter extends AbstractConverter {
    public MetersPerSecondSquaredConverter() {
        super("m/s\u00b2");
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