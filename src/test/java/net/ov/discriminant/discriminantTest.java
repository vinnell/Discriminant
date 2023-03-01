package net.ov.discriminant;
import org.testng.Assert;
import org.testng.annotations.Test;


public class discriminantTest {

      @Test
       public void testDiscriminantIsNull() {
           discriminant test = new discriminant(16,-8,1);
            test.discSolution();
            Assert.assertEquals(test.x1, test.x2);
        }

        @Test
        public void TestDiscriminantMoreThanZero() {
            discriminant test = new discriminant(1,-4,-5);
            test.discSolution();
            Assert.assertNotEquals(test.x1, test.x2);

        }
        @Test
        public void TestDiscriminantLessThanZero() {
            discriminant test = new discriminant(3,-4,2);
            test.discSolution();
            Assert.assertNull(test.x1);



        }
}






