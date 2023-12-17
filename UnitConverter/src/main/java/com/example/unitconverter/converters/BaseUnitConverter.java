package com.example.unitconverter.converters;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class BaseUnitConverter {
    protected BigDecimal Multiplier;

    public abstract String getName();

    public BigDecimal convertToBase(BigDecimal value) {
        return value.multiply(Multiplier).setScale(6, RoundingMode.HALF_UP);
    }

    public BigDecimal convertFromBase(BigDecimal value) {
        return value.divide(Multiplier, 6, RoundingMode.HALF_UP);
    }
}