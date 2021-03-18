package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;
import  primitives.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Sphere
 * @author Myriam and Batsheva
 */
class SphereTest {
    /***
     * Test for geometries.Sphere.getNormal()
     */
    @Test
        void getNormal() {
            Sphere sp = new Sphere(5, new Point3D(0,0,0));
            assertEquals(new Vector(1,0,0),sp.getNormal(new Point3D(5,0,0)));
        }
}