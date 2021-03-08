package geometries;

import primitives.Point3D;
import primitives.*;

import java.util.List;

import static primitives.Util.alignZero;
import static primitives.Util.isZero;
/**
 *
 * @author ruthy sebban
 */
/**
 * this class for tube extends from RadialGeometry class
 * class for representing Tube in environment
 */
public class Tube {
    protected
    Ray _r;
    double _radius;
    /************constrators**********/
    /**
     *
     * @param radius radius from radicalGeometry class
     * @param r the ray
     */
    public Tube(double radius, Ray r) {
        this._r=r;
         this._radius = radius;
    }
   /* public Tube(){
        this.r=new Ray();
    }*/

  /*  @Override
    public Ray getR() {
        return r;
    }
*/
    /********to string************/
    @Override
    public String toString() {
        return "Tube{" +
                "r=" + _r +
                '}';
    }
    /**getNormal**/
    /**
     *
     * @param point of Point3D
     * @return Normal for tube
     */
    public Vector getNormal(Point3D point) {

        return null;

    }
    /**
     * find intersections point3D with tube
     * @param ray ray for casting
     * @return list of intersections point3D or null if there were not found
     */



}
