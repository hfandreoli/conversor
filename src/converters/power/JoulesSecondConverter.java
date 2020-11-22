package converters.power;

import converters.AbstractConverter;

public class JoulesSecondConverter extends AbstractConverter{
    public JoulesSecondConverter() {
        super("J/s");
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