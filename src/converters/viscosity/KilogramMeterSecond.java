package converters.viscosity;

import converters.AbstractConverter;

public class KilogramMeterSecond extends AbstractConverter{
    public KilogramMeterSecond() {
        super("kg/m.s");
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