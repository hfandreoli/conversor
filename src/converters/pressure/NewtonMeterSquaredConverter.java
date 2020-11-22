package converters.pressure;

import converters.AbstractConverter;

public class NewtonMeterSquaredConverter extends AbstractConverter{
    public NewtonMeterSquaredConverter() {
        super("N/m\u00b2");
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
