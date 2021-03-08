package geometries;
import primitives.*;
import static primitives.Util.alignZero;
import static primitives.Util.isZero;
import java.util.List;

/**
 * Plane: class for representing plane in environment
 */

public class Plane implements Geometry {
    Point3D p;
    Vector normal;

    /*************** Constructor ********************/

    public Plane(Point3D p1, Point3D p2, Point3D p3) {
        this.p  = new Point3D(p1);
        this.normal = null;
    }

    /**
     * @param p-point in the plane
     * @param normal  to plane
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

    /**
     * find intersections point3D with plane
     * @param ray ray for casting
     * @return list of intersections point3D or null if there were not found
     */

    /**
     *
     * @param ray from camera
     * @param maxd maxDistance to geometry point
     * @return list of intersections between ray and geometry
     */
}