package converters.area;

import converters.AbstractConverter;

public class AcreConverter extends AbstractConverter {
    public AcreConverter() {
        super("Acre");
    }

    @Override
    public double toBasicUnit(double value) {
        return 4046.86 * value;
    }

    @Override
    public double fromBasicUnit(double value) {
        return 0.000247105 * value;
    }
}
