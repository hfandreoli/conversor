package converters.energy;

import converters.AbstractConverter;

public class WattsHourConverter extends AbstractConverter{
    public WattsHourConverter() {
        super("W/h");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 3600;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.000277778;
    }
}