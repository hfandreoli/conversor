package converters.acceleration;

import converters.AbstractConverter;

public class KilometersPerHourSquaredConverter extends AbstractConverter{
    public KilometersPerHourSquaredConverter() {
        super("km/h\u00b2");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 0.0000771604938;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 12960;
    }
}
