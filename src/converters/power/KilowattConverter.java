package converters.power;

import converters.AbstractConverter;

public class KilowattConverter extends AbstractConverter{
    public KilowattConverter() {
        super("kW");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1000;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.001;
    }
}