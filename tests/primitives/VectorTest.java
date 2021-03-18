package primitives;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;
import static primitives.Util.isZero;

/**
 * Test for Vector
 * @author Myriam amd Batsheva
 */
class VectorTest {

    Vector v1 = new Vector(1, 2, 3);
    Vector v2 = new Vector(-2, -4, -6);

    @Test
    void subtract() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(-1, -2, -3);
        Vector v3 = new Vector(2, 4, 6);
        Vector v4 = new Vector(-2, -4, -6);

        // ============ Equivalence Partitions Tests ==============
        Vector vr = v1.subtract(v3);
        assertEquals(new Vector(-1, -2, -3), vr);

        vr = v1.subtract(v2);
        assertEquals(new Vector(2, 4, 6), vr);

        vr = v2.subtract(v4);
        assertEquals(new Vector(1, 2, 3), vr);

        vr = v3.subtract(v1);
        assertEquals(new Vector(1, 2, 3), vr);
        // =============== Boundary Values Tests ==================
        try {
            vr = v1.subtract(v1);
            fail("cannot create zero vector");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    void add() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(-1, -2, -3);
        Vector v3 = new Vector(2, 4, 6);
        Vector v4 = new Vector(-2, -4, -6);

        // ============ Equivalence Partitions Tests ==============
        Vector vr = v1.add(v3);
        assertEquals(new Vector(3, 6, 9), vr);

        vr = v2.add(v4);
        assertEquals(new Vector(-3, -6, -9), vr);

        vr = v1.add(v4);
        assertEquals(new Vector(-1, -2, -3), vr);

        // =============== Boundary Values Tests ==================
        try {
            vr = v1.add(v2);
            fail("cannot create zero vector");
        } catch (Exception e) {
            assertTrue(true);
        }
    }


    @Test
    void scale() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(-2, -4, -6);

        // ============ Equivalence Partitions Tests ==============
        Vector vr = v1.scale(2);
        assertEquals(new Vector(2, 4, 6), vr);

        vr = v1.scale(3.5);
        assertEquals(new Vector(3.5, 7, 10.5), vr);

        vr = v1.scale(-2);
        assertEquals(new Vector(-2, -4, -6), vr);

        vr = v2.scale(4);
        assertEquals(new Vector(-8, -16, -24), vr);

        vr = v2.scale(-4);
        assertEquals(new Vector(8, 16, 24), vr);

        // =============== Boundary Values Tests ==================
        vr = v1.scale(1);
        assertEquals(new Vector(1, 2, 3), vr);
        try {
            vr = v1.scale(0);
            fail("cannot create zero vector");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    void dotProduct() {

        assertEquals(-28, v1.dotProduct(v2));
    }

    /**
     * Test method for {@link primitives.Vector#crossProduct(primitives.Vector)}.
     */

    @Test
    void crossProduct() {


        // ============ Equivalence Partitions Tests ==============
        Vector v3 = new Vector(0, 3, -2);
        Vector vr = v1.crossProduct(v3);

        // Test that length of cross-product is proper (orthogonal vectors taken for simplicity)
        assertEquals(v1.length() * v3.length(), vr.length(), 0.00001, "crossProduct() wrong result length");

        // Test cross-product result orthogonality to its operands
        assertTrue(isZero(vr.dotProduct(v1)), "crossProduct() result is not orthogonal to 1st operand");
        assertTrue(isZero(vr.dotProduct(v3)), "crossProduct() result is not orthogonal to 2nd operand");

        // =============== Boundary Values Tests ==================
        // test zero vector from cross-productof co-lined vectors
        try {
            v1.crossProduct(v2);
            fail("crossProduct() for parallel vectors does not throw an exception");
        } catch (IllegalArgumentException e) {
        }
    }


    @Test
    void lengthSquared() {
        if (!isZero(v1.lengthSquared() - 14))
            fail("ERROR: lengthSquared() wrong value");
    }

    @Test
    void length() {
        // test length..
        if (!isZero(new Vector(0, 3, 4).length() - 5))
            fail("ERROR: length() wrong value");

    }

    @Test
    void normalize() {

        // test vector normalization vs vector length and cross-product
        Vector v = new Vector(1, 2, 3);
        Vector vCopy = new Vector(v.getHead());
        Vector vCopyNormalize = vCopy.normalize();
        if (vCopy != vCopyNormalize)
            fail("ERROR: normalize() function creates a new vector");
        if (!isZero(vCopyNormalize.length() - 1))
            fail("ERROR: normalize() result is not a unit vector");
        Vector u = v.normalized();
        if (u == v)
            fail("ERROR: normalized() function does not create a new vector");
    }

    @Test
    void normalized() {
    }
}