package converters.force;

import converters.AbstractConverter;

public class JoulesMeterConverter extends AbstractConverter{
    public JoulesMeterConverter() {
        super("J/m");
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
