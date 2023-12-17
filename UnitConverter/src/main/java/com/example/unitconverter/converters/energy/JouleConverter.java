package com.example.unitconverter.converters.energy;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class JouleConverter extends BaseUnitConverter {

    public JouleConverter() {
        this.Multiplier = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Joule";
    }
}
