package converters;

public abstract class AbstractConverter {
    private final String unitName;

    public AbstractConverter(String unitName){
        this.unitName = unitName;
    }

    public abstract double toBasicUnit(double value);
    public abstract double fromBasicUnit(double value);

    @Override
    public String toString() {
        return unitName;
    }
}
