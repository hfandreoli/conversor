package converters.time;

import converters.AbstractConverter;

public class SecondConverter extends AbstractConverter{
    public SecondConverter() {
        super("second (s)");
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

