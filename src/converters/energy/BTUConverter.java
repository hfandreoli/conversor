package converters.energy;

import converters.AbstractConverter;

public class BTUConverter extends AbstractConverter{
    public BTUConverter() {
        super("BTU");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1055.06;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.000947817;
    }
}