package geometries;

import primitives.*;

import java.util.List;

import static primitives.Util.alignZero;

/**
 * Sphere class is implementing a sphere, with a radius and center point
 * @author Myriam and Batsheva
 */
public class Sphere implements Geometry {
    protected Point3D _center;
    Double _radius;

    /**
     * Constructor for Sphere class, gets a radius and a center point3D, and creates a new sphere
     * @param radius radius of a sphere
     * @param center a point3D, the center point of a sphere
     */
    public Sphere(double radius, Point3D center) {
        _center = center;
        _radius = radius;
    }


    /**
     * Center getter
     * @return center of a sphere
     */
    public Point3D get_center() {

        return _center;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "_center=" + _center +
                '}';
    }

    /**
     * Return a normal to a point on the sphere
     * @param point a point on the sphere
     * @return a normal to a point on the sphere
     */
    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }
}
