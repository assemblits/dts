package org.assemblits.dts.sources.signal;

import org.jblas.DoubleMatrix;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marlontrujillo1080 on 11/7/17.
 */
public class GeneratorTest {

    @Test
    public void testJblas() throws Exception {
        DoubleMatrix A = new DoubleMatrix(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        });
    }
}