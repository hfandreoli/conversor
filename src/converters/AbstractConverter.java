package converters;

public abstract class AbstractConverter implements Comparable<AbstractConverter>{
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

    @Override
    public int compareTo(AbstractConverter o) {
        return unitName.compareTo(o.unitName);
    }
}
