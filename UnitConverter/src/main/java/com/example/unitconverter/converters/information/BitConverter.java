package com.example.unitconverter.converters.information;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class BitConverter extends BaseUnitConverter {

    public BitConverter() {
        this.Multiplier = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Bit";
    }
}
