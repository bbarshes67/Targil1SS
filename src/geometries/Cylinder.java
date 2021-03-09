package geometries;
import primitives.*;

import java.util.Objects;

import static primitives.Util.alignZero;
import static primitives.Util.isZero;
/**
 * Cylinder extends Tube class a ray
 *class for representing cylinder in 3D environment
 * @author Batsheve Barsheshet and Myriam Aflalo
 */
public class Cylinder extends Tube {
    private final double height;


    /**
     * @param radius radius from radical geometry
     * @param r  ray from tube
     * @param height of cylinder
     */
    public Cylinder(double radius, Ray r, double height) {
        super(radius, r);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    /**
     * @param point of Point3D
     * @return Normal for cylinder
     */
    public Vector getNormal(Point3D point) {
        return null;
    }
}
