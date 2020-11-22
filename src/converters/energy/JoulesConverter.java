package converters.energy;

import converters.AbstractConverter;

public class JoulesConverter extends AbstractConverter{
    public JoulesConverter() {
        super("joules (J)");
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