package converters.power;

import converters.AbstractConverter;

public class KilocaloriesHourConverter extends AbstractConverter{
    public KilocaloriesHourConverter() {
        super("kcal/h");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 859.85;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.00116;
    }
}
