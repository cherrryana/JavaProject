package com.example.unitconverter.converters.information;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class ByteConverter extends BaseUnitConverter {

    public ByteConverter() {
        this.Multiplier = new BigDecimal(8);
    }

    @Override
    public String getName() {
        return "Byte";
    }
}
