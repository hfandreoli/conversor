package converters.viscosity;

import converters.AbstractConverter;

public class PoiseConverter extends AbstractConverter{
    public PoiseConverter() {
        super("cP");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 10;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.1;
    }
}