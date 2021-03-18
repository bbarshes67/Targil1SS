package geometries;

import primitives.*;

import static primitives.Util.alignZero;
import static primitives.Util.isZero;

import java.util.List;

/**
 * Plane: class for representing plane in environment
 *
 * @author Myriam and Batsheva
 */

public class Plane implements Geometry {
    Point3D p;
    Vector normal;

    /**
     * /**
     * Constructor for Plane class, gets three points on the required plane and creates it
     *
     * @param p1 point 1
     * @param p2 point 2
     * @param p3 point 3
     */
    public Plane(Point3D p1, Point3D p2, Point3D p3) {
        p = p1;
        Vector U = p2.subtract(p1);
        Vector V = p3.subtract(p1);
        Vector N = U.crossProduct(V);

        N.normalize();
        normal = N;

    }

    /**
     * Constructor for Plane class, gets a point and a normal and creates match plane
     * @param p a point on the plane
     * @param normal a normal vector to the plane
     */
    public Plane(Point3D p, Vector normal) {
        this.p = p;
        this.normal = normal;
    }

    /**
     * @param point of Point3D in plane
     * @return Normal for plane
     */
    @Override
    public Vector getNormal(Point3D point) {
        return normal;
    }
    //because polygon

    /**
     * @return vector normal in a plane
     */
    public Vector getNormal() {

        return getNormal(new Point3D(0, 0, 0));
    }

    /********getter********/
    public Point3D getP() {

        return p;
    }




}