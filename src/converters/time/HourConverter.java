package converters.time;

import converters.AbstractConverter;

public class HourConverter extends AbstractConverter{
    public HourConverter() {
        super("hour (h)");
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
