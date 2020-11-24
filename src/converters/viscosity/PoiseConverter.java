package converters.viscosity;

import converters.AbstractConverter;

public class PoiseConverter extends AbstractConverter{
    public PoiseConverter() {
        super("P");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 0.1;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 10;
    }
}