package com.example.unitconverter.converters.energy;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KilojouleConverter extends BaseUnitConverter {

    public KilojouleConverter() {
        this.Multiplier = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "Kilojoule";
    }
}
