package geometries;
import primitives.*;

import java.util.List;

import static primitives.Util.alignZero;

/**
 * Sphere extends RadialGeometry class a radius
 */
public class Sphere implements Geometry
{
    protected Point3D _center;
    Double _radius;
/**
 *
 * @author ruthy sebban and talya dori
 */

    /**
     *
     * @param radius OF SPHERE
     * @param _center OF SPHERE
     */
    /************constractors****/
    public Sphere(double radius, Point3D _center) {
        this._center=_center;
        this._radius=radius;
    }

    /**
     *
     * @param color is color of the geometry
     * @param material of the geometry
     * @param radius number for radius in Sphere
     * @param _center point3D in Sphere's center
     */

    /**
     *
     * @param color is color of the geometry
     * @param radius number for radius in Sphere
     * @param _center point3D in Sphere's center
     */

    /**********getter**********/
    public Point3D get_center() {
        return _center;
    }
    /*****************to string  ***********/

    @Override
    public String toString() {
        return "Sphere{" +
                "_center=" + _center +
                '}';
    }
    // ***************** Operations ******************** //
    @Override
    public Vector getNormal(Point3D point) {
        return null;

    }



    /**
     * find intersections point3D with sphere
     * @param ray ray for casting
     * @return list of intersections point3D or null if there were not found
     */


}
