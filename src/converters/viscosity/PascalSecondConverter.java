package converters.viscosity;

import converters.AbstractConverter;

public class PascalSecondConverter extends AbstractConverter{
    public PascalSecondConverter() {
        super("Pa.s");
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