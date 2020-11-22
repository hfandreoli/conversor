package converters.force;

import converters.AbstractConverter;

public class NewtonKilogramConverter extends AbstractConverter {
    public NewtonKilogramConverter() {
        super("kilogram (kg)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 9.80665;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.10197;
    }
}