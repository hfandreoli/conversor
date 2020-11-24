package converters.power;

import converters.AbstractConverter;

public class WattConverter extends AbstractConverter{
    public WattConverter() {
        super("watt (W)");
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