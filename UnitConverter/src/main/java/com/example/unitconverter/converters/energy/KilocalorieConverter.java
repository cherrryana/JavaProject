package com.example.unitconverter.converters.energy;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KilocalorieConverter extends BaseUnitConverter {

    public KilocalorieConverter() {
        this.Multiplier = new BigDecimal(4184);
    }

    @Override
    public String getName() {
        return "Kilocalorie";
    }
}
