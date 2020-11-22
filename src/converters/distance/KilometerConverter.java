package converters.distance;

import converters.AbstractConverter;

public class KilometerConverter extends AbstractConverter {
    public KilometerConverter() {
        super("kilometers (km)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1000;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value / 1000;
    }
}
