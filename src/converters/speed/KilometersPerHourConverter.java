package converters.speed;

import converters.AbstractConverter;

public class KilometersPerHourConverter extends AbstractConverter {
    public KilometersPerHourConverter() {
        super("km/h");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 0.277778;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 3.6;
    }
}