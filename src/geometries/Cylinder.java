package geometries;
import primitives.*;

import java.util.Objects;

import static primitives.Util.alignZero;
import static primitives.Util.isZero;

/**
 * Cylinder extends Tube class a ray
 *class for representing cylinder in 3D environment
 * @author ruthy sebban and Talya Dori
 */
public class Cylinder extends Tube {
    private double hieght;

/*************constractors**********/
    /**
     * @param radius radius from radical geometry
     * @param r      ray from tube
     * @param hieght of cylinder
     */
    public Cylinder(double radius, Ray r, double hieght) {
        super(radius, r);
        this.hieght = hieght;
    }

    /************getter***************/
    public double getHieght() {
        return hieght;
    }

    /***************to string*********/
    @Override
    public String toString() {
        return "Cylinder{" +
                "hieght=" + hieght +
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
