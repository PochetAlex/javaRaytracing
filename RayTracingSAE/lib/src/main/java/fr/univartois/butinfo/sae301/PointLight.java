package fr.univartois.butinfo.sae301;

/**
 * Represents a point light source in a 3D scene.
 */
public class PointLight extends Light {
    public Point position;

	/**
     * Constructs a point light with the specified position and color.
     *
     * @param position The position of the light source.
     * @param color    The color of the light source.
     */
    public PointLight(Point position, Color color) {
        super(color);
        this.position = position;
    }

    /**
     * Get the type of the light source, which is Point.
     *
     * @return The type of the light source.
     */
    @Override
    public LightType getType() {
        return LightType.POINT;
    }

	public Point getPosition() {
		return position;
	}
    
    
}