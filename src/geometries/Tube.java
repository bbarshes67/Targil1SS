package geometries;

import primitives.*;

/**
 * Tube class implementing a tube, with a radius and axis ray
 *
 * @author Myriam and Batsheva
 */
public class Tube {
    protected Ray _r;
    double _radius;

    /**
     * Constructor for Tube class, gets a radius and a ray and creates a new match tube
     *
     * @param radius a radius
     * @param r a ray
     */
    public Tube(double radius, Ray r) {
        _r = r;
        _radius = radius;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "r=" + _r +
                '}';
    }

    /**
     * Return a normal from a point3D on a tube
     * @param point of Point3D
     * @return a normal from a point3D on a tube
     */
    public Vector getNormal(Point3D point) {

        return null;

    }

}
