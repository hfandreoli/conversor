package converters.force;

import converters.AbstractConverter;

public class NewtonConverter extends AbstractConverter {
    public NewtonConverter() {
        super("newton (N)");
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