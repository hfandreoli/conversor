package converters.volume;

import converters.AbstractConverter;

public class MilliliterConverter extends AbstractConverter {
    public MilliliterConverter() {
        super ("ml");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 0.001;
    }

    @Override
    public double fromBasicUnit(double value){
        return value * 1000;
    }
}