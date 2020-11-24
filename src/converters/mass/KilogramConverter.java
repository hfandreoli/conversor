package converters.mass;

import converters.AbstractConverter;

public class KilogramConverter extends AbstractConverter {
    public KilogramConverter() {
        super("kilogram (kg)");
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