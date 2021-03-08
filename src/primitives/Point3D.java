package primitives;

/**
 * POINT3D class for repersentive a point in 3D
 * point3D basic point with coordinates int X axis, Y axis and Z axis
 */
/**
 *
 * @author ruthy sebban
 */
public class Point3D {
    public static final Point3D ZERO =new Point3D(0.0,0.0,0.0) ;//ruthy did this
    //public final static Point3D ZERO = new Point3D( 0.0,0.0,0.0); talya did this
    Coordinate _X;
    Coordinate _Y;
    Coordinate _Z;
/*********constractor***********/
    /**
     *
     * @param _X coordinte on the x axis
     * @param _Y coordinte on the y axis
     * @param _Z coordinte on the z axis
     */
    public Point3D(Coordinate _X, Coordinate _Y, Coordinate _Z) {
        this._X = _X;
        this._Y = _Y;
        this._Z = _Z;
    }

    public Point3D(double _x, double _y, double _z) {
        this(new Coordinate(_x),new Coordinate(_y),new Coordinate(_z));
    }


    public Point3D(Point3D p) {
        this._X = new Coordinate (p.get_X());
        this._Y = new Coordinate (p.get_Y());
        this._Z = new Coordinate (p.get_Z());
    }


    /************************getter and setter*****************/
    /**
     *
     * @return new Coordinate based on _x
     */
    public Coordinate get_X() {
        return new Coordinate(_X);
    }

    public Coordinate get_Y() {
        return new Coordinate(_Y);
    }

    public Coordinate get_Z() {
        return new Coordinate(_Z);
    }


    /***************TO String And equals***********/
    /**
     * Comparison of objects
     * @param o an object
     * @return boolean type
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return _X.equals( point3D._X) &&
                _Y.equals( point3D._Y) &&
                _Z.equals( point3D._Z);
    }


    @Override
    public String toString() {
        return "(" +
                _X +
                ", " + _Y +
                ", " + _Z +
                ')';
    }
    /***************functions***********/
    /**
     * The squeeze between two points squared
     * @param other a point3D
     * @return double type
     */
    public double distanceSquared(Point3D other)
    {
        return ( (other._X._coord - this._X._coord) * (other._X._coord - this._X._coord) +
                (other._Y._coord - this._Y._coord) * (other._Y._coord - this._Y._coord) +
                (other._Z._coord - this._Z._coord) * (other._Z._coord - this._Z._coord));
    }
    /**
     * The squeeze between two points
     * @param other a point3D
     * @return double type
     */
    public double distance (Point3D other){
        return Math.sqrt(distanceSquared(other));
    }
    /**
     * Adding Vector to a Point - Returns a new point
     * @param v a vector
     * @return Point3D type
     */
    public Point3D add(Vector v)
    {
        return new Point3D(
                this._X._coord+v._head._X._coord,
                this._Y._coord+v._head._Y._coord,
                this._Z._coord+v._head._Z._coord
        );
    }

    public Point3D subtract(Vector v) {
        return new Point3D(this._X._coord - v._head._X._coord,
                this._Y._coord - v._head._Y._coord,
                this._Z._coord - v._head._Z._coord);
    }

    /**
     * Vector Subtraction - Gets a second point in the parameter,
     * returns a vector from the second point to the point
     * at which the action is performed
     * @param p a point
     * @return a vector
     */
    public Vector subtract(Point3D p) {
        return new Vector(new Point3D(
                this._X._coord - p._X._coord,
                this._Y._coord - p._Y._coord,
                this._Z._coord - p._Z._coord));
    }
}
