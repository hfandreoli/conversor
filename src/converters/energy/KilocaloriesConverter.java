package converters.energy;

import converters.AbstractConverter;

public class KilocaloriesConverter extends AbstractConverter{
    public KilocaloriesConverter() {
        super("kcal");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 4184;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.000239006;
    }
}