package org.lesson.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void shouldMovePoint() {
        // given
        Point point = new Point(2,3 );

        //when
        Point movedPoin = point.move(1,2 );

        //then
        assertEquals(3,movedPoin.getX(),0.1 );
        assertEquals(5,movedPoin.getY(),0.1 );

    }
    @Test
    public void shouldMovePoint2() {
        // given
        Point point = new Point(2,3 );
        Vector vector = new Vector(1, 2);

        //when
        Point movedPoin = point.move(vector);

        //then
        assertEquals(3,movedPoin.getX(),0.1 );
        assertEquals(5,movedPoin.getY(),0.1 );

    }
}

