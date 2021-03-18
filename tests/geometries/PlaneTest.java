package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;
import primitives.*;
import static org.junit.jupiter.api.Assertions.*;
import static primitives.Util.isZero;
/**
 * Test for Plane
 * @author Myriam and Batsheva
 */
class PlaneTest {
    /**
     * Test for geometries.Plane.getNormal()
     */
    @Test
    public void getNormal() {

        // ============ Equivalence Partitions Tests ==============
        Vector point = new Vector(1,2,3);
        Plane pl = new Plane(new Point3D(1,2,3), new Point3D(4,5,6), new Point3D(-3,5,4));
        Vector normal = pl.getNormal(new Point3D(1,2,3));
        assertTrue( isZero(normal.dotProduct(new Vector(1,2,3).subtract(new Vector(-3,5,4)))),"the normal is not orthogonal to direct vector on the plane");
    }

}