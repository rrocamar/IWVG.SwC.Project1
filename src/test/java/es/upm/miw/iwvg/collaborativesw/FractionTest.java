package es.upm.miw.iwvg.collaborativesw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction middel;
    private Fraction defaultFraction;

    @BeforeEach
    void before() {
        middel = new Fraction(1, 2);
        defaultFraction = new Fraction();
    }

    @Test
    void testFractionGetNumerator() {
        assertEquals(1, middel.getNumerator());
    }

    @Test
    void testFractionGetDenominator() {
        assertEquals(2, middel.getDenominator());
    }

    @Test
    void testFractionIntInt() {
        assertEquals(1, defaultFraction.getNumerator());
        assertEquals(1, defaultFraction.getDenominator());
    }

    @Test
    void testMultiply() {
        assertEquals(1, middel.multiply(middel).getNumerator());
        assertEquals(4, middel.multiply(middel).getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, middel.decimal(), 0.01);
    }

    @Test
    void testInverse() {
        assertEquals(2, this.middel.inverse().getNumerator());
        assertEquals(1, this.middel.inverse().getDenominator());
    }

    @Test
    void testAdd() {
        Fraction newFraction = new Fraction(4, 2);
        Fraction compareFraction = this.defaultFraction.add(newFraction);

        assertEquals(6, compareFraction.getNumerator());
        assertEquals(2, compareFraction.getDenominator());
    }
}
