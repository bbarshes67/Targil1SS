package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * Triangle class is implementing a triangle that heir from the polygon
 * @author Myriam and Batsheva
 */
public class Triangle extends Polygon{
    /**
     * constructor for Triangle class, gets 3 points Point3D
     * @param p1 point of a triangle
     * @param p2 point of a triangle
     * @param p3 point of a triangle
     */
    public Triangle(Point3D p1,Point3D p2,Point3D p3) {
        super(p1,p2,p3);//constructor of father

    }

}
