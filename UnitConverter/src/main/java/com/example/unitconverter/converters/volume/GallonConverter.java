package com.example.unitconverter.converters.volume;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class GallonConverter extends BaseUnitConverter {

    public GallonConverter() {
        this.Multiplier = new BigDecimal(3.785);
    }

    @Override
    public String getName() {
        return "Gallon";
    }
}