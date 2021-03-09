package primitives;

import java.util.Objects;

import static primitives.Util.isZero;

/**
 * Class Ray is representing a ray in the space.
 * The class includes point3D as the start point,
 * and normalized direction vector of a ray
 * @author Myriam and Batsheva
 */
public class Ray {
    private Point3D _POO;
    private Vector _direction;

    /**
     * _POO getter
     * @return start point of a ray
     */
    public Point3D getPOO() {
        return _POO;
    }

    /**
     * dir getter
     * @return direction vector of a ray
     */
    public Vector getDirection() {
            return _direction;
    }

    /**
     * Constructor for ray, gets start point and direction vector, and creates a new ray
     * @param poo ray's start point
     * @param direction direction vector
     */
    public Ray(Point3D poo, Vector direction) {
            _POO = poo;
            _direction = direction.normalize();
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ray ray = (Ray) o;
            return _POO.equals(ray._POO) && _direction.equals(ray._direction);
        }






}

