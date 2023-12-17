package com.example.unitconverter.converters.information;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MByteConverter extends BaseUnitConverter {

    public MByteConverter() {
        this.Multiplier = new BigDecimal(8 * 1024 * 1024);
    }

    @Override
    public String getName() {
        return "MByte";
    }
}
