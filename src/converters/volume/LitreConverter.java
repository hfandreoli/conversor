package converters.volume;

import converters.AbstractConverter;

public class LitreConverter extends AbstractConverter {
    public LitreConverter() {
        super ("litre (L)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value;
    }

    @Override
    public double fromBasicUnit(double value){
        return value;
    }
}
