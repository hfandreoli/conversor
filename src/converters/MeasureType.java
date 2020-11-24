package converters;

public enum MeasureType {
    DISTANCE("distance", "meter (m)", "Distance"),
    AREA("area", "square meter (m\u00b2)", "Area"),
    VOLUME("volume", "litre (L)", "Volume"),
    MASS("mass", "kilogram (kg)", "Mass"),
    TIME("time", "second (s)", "Time"),
    SPEED("speed", "m/s", "Speed"),
    ACCELERATION("acceleration", "m/s\u00b2", "Accelaration"),
    FORCE("force", "newton (N)", "Force"),
    PRESSURE("pressure", "pascal (Pa)", "Pressure"),
    ENERGY("energy", "joule (J)", "Energy"),
    POWER("power", "watt (W)", "Power"),
    VISCOSITY("viscosity", "Pa·s", "Viscosity");

    private final String type;
    private final String basicUnit;
    private final String name;

    MeasureType(String type, String basicUnit, String name) {
        this.type = type;
        this.basicUnit = basicUnit;
        this.name = name;
    }

    public final String getBasicUnit() {
        return basicUnit;
    }

    public final String getTypeString() {
        return type;
    }

    @Override
    public String toString() {
        return name + " [" + basicUnit + "]";
    }

    public static MeasureType[] getAllTypes() {
        return new MeasureType[]{DISTANCE, AREA, VOLUME, MASS, TIME, SPEED, ACCELERATION, FORCE, PRESSURE, ENERGY, POWER, VISCOSITY};
    }
}
