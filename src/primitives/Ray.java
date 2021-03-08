package primitives;

import java.util.Objects;

import static primitives.Util.isZero;

/**
 *  class for representing Ray in environment
 * @author ruthy sebban and talya
 */
public class Ray {

    // Point of origin
    private Point3D _POO;

    // Ray direction
    private Vector _direction;
    /**********constractors*************/
    /**
     *
     * @param ray vector for copy constructor
     */

    /**
     *
     * @param poo point3D
     * @param direction normalize vector
     */
    public Ray(Point3D poo, Vector direction) {
        this._POO = new Point3D(poo);
        this._direction = new Vector(direction._head);
        this._direction.normalize();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return _POO.equals(ray._POO) && _direction.equals(ray._direction);
    }


    public Point3D getTargetPoint(double length) {
        return isZero(length) ? _POO : new Point3D(_POO).add(_direction.scale(length));
    }
    // ****** Getters ********* //

    /**
     *
     * @return the vector normalized
     */
    public Vector getDirection() {
        return new Vector(_direction._head);
    }
    /**
     *
     * @return parameters of Tube
     */
    public Point3D getPOO() {
        return new Point3D(_POO);
    }

}
