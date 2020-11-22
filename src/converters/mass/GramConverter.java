package converters.mass;

import converters.AbstractConverter;

public class GramConverter extends AbstractConverter {
    public GramConverter() {
        super("gram (g)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1000;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value / 1000;
    }
}