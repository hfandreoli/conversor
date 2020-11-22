package converters.time;

import converters.AbstractConverter;

public class MinuteConverter extends AbstractConverter{
    public MinuteConverter() {
        super("minute (ms)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 60;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.0166667;
    }
}
