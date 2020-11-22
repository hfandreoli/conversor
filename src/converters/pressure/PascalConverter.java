package converters.pressure;

import converters.AbstractConverter;

public class PascalConverter extends AbstractConverter{
    public PascalConverter() {
        super("pascal (Pa)");
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
