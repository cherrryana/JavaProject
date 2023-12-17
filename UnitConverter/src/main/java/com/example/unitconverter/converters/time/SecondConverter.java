package com.example.unitconverter.converters.time;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class SecondConverter extends BaseUnitConverter {

    public SecondConverter() {
        this.Multiplier = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Second";
    }
}
