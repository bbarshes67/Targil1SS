package primitives;

import static primitives.Point3D.ZERO;

/**
 *  Class Vector is representing a Vector in the space.
 *  The class includes point3D as the head of the vector
 *  Operation: addition, subtract, dot product, scale product,
 *  normalizing, and finding length.
 * @author Myriam and Batsheva
 */
public class Vector {
    Point3D _head;

    /**
     * head getter
     * @return head of vector
     */
    public Point3D getHead() {
        return _head;
    }

    /**
     * Vector constructor that gets a point3D and create a new vector from its coordinates
     * @param head a point
     */
    public Vector(Point3D head) {
        if (head.equals(ZERO)) {
            throw new IllegalArgumentException("vector head cannot be Point(0,0,0)");
        }
        _head = head;
    }

    /**
     * Vector constructor that gets 3 double numbers and create a new vector from them
     *
     * @param _x x coordinate value
     * @param _y y coordinate value
     * @param _z z coordinate value
     */
    public Vector(double _x, double _y, double _z) {

        if (new Point3D(new Coordinate(_x), new Coordinate(_y), new Coordinate(_z)).equals(Point3D.ZERO)) {
            throw new IllegalArgumentException("vector cannot be the zero vector");
        }
        this._head = new Point3D(new Coordinate(_x), new Coordinate(_y), new Coordinate(_z));
    }


    /**
     * Vector constructor
     *
     * @param x coordinate
     * @param y coordinate
     * @param z coordinate
     */
    public Vector(Coordinate x, Coordinate y, Coordinate z) {
        if (new Point3D(x, y, z).equals(Point3D.ZERO)) {
            throw new IllegalArgumentException("vector cannot be the zero vector");
        }
        this._head = new Point3D(x, y, z);
    }


    /**
     * Calculates subtract vector between this vector to other vector
     * @param v vector
     * @return subtract vector between two vectors
     */
    public Vector subtract(Vector v) {
        return _head.subtract(v._head);
    }

    /**
     *  Calculates addition vector between this vector to other vector
     * @param v vector
     * @return addition vector between two vectors
     */
    public Vector add(Vector v) {
        return new Vector(this._head.add(v));
    }

    /**
     * Return the vector multiplied by the scale
     * @param d scale number for the product
     * @return the vector multiplied by the scale
     */
    public Vector scale(double d) {
        return new Vector(_head._x.coord * d, _head._y.coord * d, _head._z.coord * d);
    }

    /**
     * Calculates dot product between two vectors
     * @param v vector
     * @return dot product between this vector to other vector
     */
    public double dotProduct(Vector v) {
        double u1 = _head._x.coord;
        double u2 = _head._y.coord;
        double u3 = _head._z.coord;
        double v1 = v._head._x.coord;
        double v2 = v._head._y.coord;
        double v3 = v._head._z.coord;

        return (u1 * v1 + u2 * v2 + u3 * v3);
    }

    /**
     * Calculates cross product between two vectors
     * @param v vector
     * @return cross product between this vector to other vector
     */
    public Vector crossProduct(Vector v) {
        double u1 = _head._x.coord;
        double u2 = _head._y.coord;
        double u3 = _head._z.coord;
        double v1 = v._head._x.coord;
        double v2 = v._head._y.coord;
        double v3 = v._head._z.coord;

        return new Vector(new Point3D(
                u2 * v3 - u3 * v2,
                u3 * v1 - u1 * v3,
                u1 * v2 - u2 * v1
        ));
    }

    /**
     * Return the squared vector's length
     * @return the squared vector's length
     */
    public double lengthSquared() {
        return (_head._x.coord * _head._x.coord +
                _head._y.coord * _head._y.coord +
                _head._z.coord * _head._z.coord);
    }

    /**
     * Return the vector's length
     * @return the vector's length
     */
    public double length() {
        return Math.sqrt(this.lengthSquared());
    }

    /**
     * Normalizes this vector and return it
     * @return this vector, normalized
     */
    public Vector normalize() {
        double length = this.length();

        //cannot divide by 0
        if (length == 0)
            throw new ArithmeticException("divide by Zero");

        double x = this._head._x.coord;
        double y = this._head._y.coord;
        double z = this._head._z.coord;

        this._head = new Point3D(x / length,y/length,z/length);

        return this;

    }

    /**
     * Return the normalized vector
     * @return normalized vector
     */
    public Vector normalized() {
        Vector myVector = new Vector(_head);
        return myVector.normalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return _head.equals(vector._head);
    }


}