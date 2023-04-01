package logic.properties.magnitudes;


import logic.properties.magnitudes.directions.BaseDirection;

public class VectorialMagnitude extends Magnitude {

    private BaseDirection direction;
    protected VectorialMagnitude(String name, MeasuringUnit unit, BaseDirection direction) {
        super(name, unit);
        this.direction = direction;
    }
}
