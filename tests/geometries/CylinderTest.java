package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;
import primitives.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Cylinder
 * @author Myriam and Batsheva
 */
class CylinderTest {


    @Test
    public void getNormal() {
        Cylinder cy = new Cylinder(1.0, new Ray(new Point3D(0,0,1), new Vector(0,1,0)), 1.0);

        // ============ Equivalence Partitions Tests ==============
        assertEquals( new Vector(0,0,1), cy.getNormal(new Point3D(0,0.5,2)),"Bad normal to cylinder");

        assertEquals( new Vector(0,1,0), cy.getNormal(new Point3D(0,1,1.5)),"Bad normal to cylinder");

        assertEquals(new Vector(0,1,0), cy.getNormal(new Point3D(0,-1,1.5)),"Bad normal to cylinder");

        // =============== Boundary Values Tests ==================
        //TODO

    }
}