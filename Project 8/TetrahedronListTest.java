import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/** Creates tetrahedronlist.
 *
 * @author Jacob Knight
 * @version 3/25/21
 */
public class TetrahedronListTest {


/** Fixture initialization (common initialization
 *  for all tests). **/
   @Before public void setUp() {
   }
/**
    *Test for getName.
    */
   @Test public void getNameTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("getName Test",
                           "test list", list.getName());
   }
   /**
    *Test for numberOfTetrahedrons.
    */
   @Test public void numberOfTetrahedronsTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("numberOfTetrahedrons Test",
                           3, tlist.numberOfTetrahedrons(), .0001);
   }
   /**
    *Test for totalSurfaceArea.
    */
   @Test public void totalSurfaceAreaTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("totalSurfaceArea Test",
                           5.1961, tlist.totalSurfaceArea(), .0001);
   }
   /**
    *Test for averageSurfaceArea.
    */
   @Test public void averageSurfaceAreaTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("averageSurfaceArea Test",
                           1.7320, list.averageSurfaceArea(), .0001);
                           
      TetrahedronList tlist = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("averageSurfaceArea Test2",
                           0, tlist.averageSurfaceArea(), .0001);
   }
   /**
    *Test for totalVolume.
    */
   @Test public void totalVolumeTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("totalVolume Test",
                           .3535, tlist.totalVolume(), .0001);
   }
   /**
   *Test for averageVolume.
   */
   @Test public void averageVolumeTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("averageVolume Test",
                           .1178, list.averageVolume(), .0001);
                           
      TetrahedronList tlist = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("averageVolume Test2",
                           0, tlist.averageVolume(), .0001);
   }
   
   /**
   *Test for toString.
   */
   @Test public void toStringTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
   
      Assert.assertEquals("toString test", 
                           true, 
                           list.toString().contains("----- Summary"
                           + " for test list -----"));
   }
   /**
   *Test for getList.
   */
   @Test public void getListTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      
      Assert.assertArrayEquals("getList Test",
                           t, tlist.getList());
   }
   /**
   *Test for addTetrahedron.
   */
   @Test public void addTetrahedronTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      
      Tetrahedron t2 = new Tetrahedron("test4", 1.0);
      tlist.addTetrahedron("test4", 1.0);
      Tetrahedron[] sA = tlist.getList();
      
      Assert.assertEquals("addTetrahedron Test",
                           t2, sA[3]);
   }
   
   /**
   *Test for deleteTetrahedron.
   */
   @Test public void deleteTetrahedronTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      
      Tetrahedron t2 = new Tetrahedron("test4", 1.0);
      Tetrahedron t3 = new Tetrahedron("test", 8.0);
      tlist.addTetrahedron("test4", 1.0);
      Tetrahedron[] sA = tlist.getList();
      
      Assert.assertEquals("pre deleteTetrahedron Test",
                           t2, sA[3]);         
   
      Assert.assertEquals("deleteTetrahedron true Test",
                           t3, tlist.deleteTetrahedron("test"));
   
      Assert.assertEquals("deleteTetrahedron true Test",
                           t2, sA[2]);
   
      Assert.assertEquals("deleteTetrahedron false Test",
                           null, tlist.deleteTetrahedron("false"));
   }
   
   /**
   *Test for findTetrahedron.
   */
   @Test public void findTetrahedronTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0);
      
      Assert.assertEquals("findTetrahedron true Test",
                           t2, tlist.findTetrahedron("test"));
                           
      Assert.assertEquals("findTetrahedron false Test",
                           null, tlist.findTetrahedron("false"));
   
   }
   
   /**
   *Test for editTetrahedron.
   */
   @Test public void editTetrahedron()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList tlist = new TetrahedronList("test list", t, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0);
      Tetrahedron t3 = new Tetrahedron("test", 9.0);
      Tetrahedron[] sA = tlist.getList();
      
      Assert.assertEquals("pre editTetrahedron Test",
                           t2, sA[0]);
      Assert.assertEquals("editTetrahedron true Test",
                           true, tlist.editTetrahedron("test", 9.0));
      Assert.assertEquals("editTetrahedron true Test",
                           t3, sA[0]);
      Assert.assertEquals("findTetrahedron false Test",
                           false, tlist.editTetrahedron("false", 9.0));
   }
   /**
   *Test for findTetrahedronWithLargestVolume.
   */
   @Test public void findTetrahedronWithLargestVolume()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 7.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 8.0);
      
      Tetrahedron t2 = new Tetrahedron("test", 7.0);
      Tetrahedron t3 = new Tetrahedron("test2", 1.0);
      Tetrahedron t4 = new Tetrahedron("test3", 8.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("findTetrahedronWithLargestVolumeTrueTest",
                           t4, 
                           list.findTetrahedronWithLargestVolume());
                           
      TetrahedronList tlist = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("findTetrahedronWithLargestVolumeFalseTest",
                           null, 
                           tlist.findTetrahedronWithLargestVolume());
   }
}
