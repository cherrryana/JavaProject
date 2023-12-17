package com.example.unitconverter.converters.length;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class FootConverter extends BaseUnitConverter {

    public FootConverter() {
        this.Multiplier = new BigDecimal(0.3048);
    }

    @Override
    public String getName() {
        return "Foot";
    }
}
