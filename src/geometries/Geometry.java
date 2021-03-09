package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * Geometry is interface for all the geometries shapes
 *  @author Myriam Aflalo and Batsheva Barsheshet
 */


public interface Geometry {
    /**
     * Return normal to geometry
     * @param point a point on the geometry, that the normal is a normal to the geometry from this point
     * @return normal to geometry
     */

    Vector getNormal(Point3D point);
}
