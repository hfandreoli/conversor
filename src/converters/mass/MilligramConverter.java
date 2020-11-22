package converters.mass;

import converters.AbstractConverter;

public class MilligramConverter extends AbstractConverter {
    public MilligramConverter() {
        super("milligram (mg)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1000000;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value / 1000000;
    }
}