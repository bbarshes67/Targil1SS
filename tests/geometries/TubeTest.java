package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;
import primitives.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Test for Tube
 * @author Myriam and Batsheva
 */
class TubeTest {
    /**
     * Test method for {@link geometries.Tube#getNormal(primitives.Point3D)}.
     */
    @Test
    public void getNormal() {

        // ============ Equivalence Partitions Tests ==============
        Tube tube = new Tube(1, new Ray(new Point3D(0,0,1), new Vector(0,0,1)));
        Vector normal = tube.getNormal(new Point3D(1,0,0));
        assertEquals( new Vector(1,0,0), normal,"Bad normal to tube");
    }

}