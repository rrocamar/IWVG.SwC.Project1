package es.upm.miw.iwvg.collaborativesw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;
    private Point quadran0;
    private Point quadran1;
    private Point quadran2;
    private Point quadran3;
    private Point quadran4;

    @BeforeEach
    void before() {
        point = new Point(2, 3);
        quadran0 = new Point(0, 0);
        quadran1 = new Point(1, 1);
        quadran2 = new Point(-1, 3);
        quadran3 = new Point(-2, -3);
        quadran4 = new Point(2, -3);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testModule() {
        assertEquals(3.6055, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testQuadran0(){
        assertEquals(0, quadran0.getQuadrant());
    }

    @Test
    void testQuadran1(){
        assertEquals(1, quadran1.getQuadrant());
    }

    @Test
    void testQuadran2(){
        assertEquals(2, quadran2.getQuadrant());
    }

    @Test
    void testQuadran3(){
        assertEquals(3, quadran3.getQuadrant());
    }

    @Test
    void testQuadran4(){
        assertEquals(4, quadran4.getQuadrant());
    }

}