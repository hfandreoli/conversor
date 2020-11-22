package converters.area;

import converters.AbstractConverter;

public class SquareMeterConverter extends AbstractConverter {
    public SquareMeterConverter() {
        super("Square Meter (m\u00b2)");
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
