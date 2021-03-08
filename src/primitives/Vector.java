package primitives;
/**
 *
 * @author ruthy sebban
 */
public class Vector {
    Point3D _head;

    public Point3D getHead() {
        return _head;
    }

    /**
     *
     * @return  the _head of the vector
     */
    @Override
    public String toString() {
        return _head.toString();
    }

    /******************constractors*****************/
    public Vector(Point3D p) {
        if (p.equals(Point3D.ZERO)) {
            throw new IllegalArgumentException("ZERO point not valid for vector");
        }
        this._head = new Point3D(p._X._coord, p._Y._coord, p._Z._coord);
    }
    public Vector(Coordinate p1, Coordinate p2,Coordinate p3) {
       this(p1._coord,p2._coord,p3._coord);
    }
    public Vector(double x,double y, double z) {
        _head=new Point3D(x,y,z);
        if (_head.equals(Point3D.ZERO)) {
            throw new IllegalArgumentException("ZERO point not valid for vector");
        }
    }
/**********************getter********************/
    /**
     * @return a point3D
     */
    public Point3D get_head() {
        return new Point3D(_head._X._coord, _head._Y._coord, _head._Z._coord);
    }

    /*************************equals********************/
    /**
     * @param o an object
     * @return return boolean and equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return _head.equals(vector._head);
    }
/*****************function**********************/
    /**
     * @param vector a vector to add
     * @return boolean and equals
     */

    public Vector add(Vector vector) {

        return new Vector(this._head.add(vector));
    }

    /**
     * Vector subtraction
     * @param vector a vector to substrcut
     * @return a vector
     */
    public Vector subtract(Vector vector) {

        return  this._head.subtract(vector._head);
    }

    /**
     * @param scalingFacor to calculate scalar
     */
    public Vector scale(double scalingFacor) {
        return new Vector(
                new Point3D(
                        new Coordinate(scalingFacor * _head._X._coord),
                        new Coordinate(scalingFacor * _head._Y._coord),
                        new Coordinate(scalingFacor * _head._Z._coord)));
    }




    /**
     * Scalar multiplication
     * @param v an vector to calculate dotProduct
     * @return double type - Scalar multiplication
     */
    public double dotProduct(Vector v) {
        return (this._head._X._coord * v._head._X._coord +
                this._head._Y._coord * v._head._Y._coord +
                this._head._Z._coord * v._head._Z._coord);
    }

    /**
     * Vector multiplication
     * @param v a vector to calculate crossProduct
     * @return vector type- A new vector that stands
     * for two existing vectors
     */
    public Vector crossProduct(Vector v) {
        double w1 = this._head._Y._coord * v._head._Z._coord - this._head._Z._coord * v._head._Y._coord;
        double w2 = this._head._Z._coord * v._head._X._coord - this._head._X._coord * v._head._Z._coord;
        double w3 = this._head._X._coord * v._head._Y._coord - this._head._Y._coord * v._head._X._coord;

        return new Vector(new Point3D(w1, w2, w3));
    }

    /**
     * Calculate the vector length squared
     * @return double type- vector length squared
     */
    public double lengthSquared() {
        double xx = this._head._X._coord * this._head._X._coord;
        double yy = this._head._Y._coord * this._head._Y._coord;
        double zz = this._head._Z._coord * this._head._Z._coord;
        return xx + yy + zz;

    }

    /**
     * Calculate the length of the vector
     * @return double type- length of the vector
     */
    public double length() {
        return Math.sqrt(lengthSquared());
    }

    /**
     * The vector normalization action that will change
     * the vector itself
     * @return the same Vector after normalisation
     * @throws ArithmeticException if length = 0
     */
    public Vector normalize() {

        double x = this._head._X._coord;
        double y = this._head._Y._coord;
        double z = this._head._Z._coord;

        double length = this.length();

        if (length == 0)
            throw new ArithmeticException("divide by Zero");

        this._head._X = new Coordinate(x / length);
        this._head._Y = new Coordinate(y / length);
        this._head._Z = new Coordinate(z / length);

        return this;
    }

    /**
     * Normalization returns
     * @returna new vector normalized in
     *      * the same direction as the original vector
     */
    public Vector normalized() {
        Vector vector = new Vector(_head);
        vector.normalize();
        return vector;
    }
}