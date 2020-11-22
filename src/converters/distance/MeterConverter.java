package converters.distance;

import converters.AbstractConverter;

public class MeterConverter extends AbstractConverter {
    public MeterConverter() {
        super("meters (m)");
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
