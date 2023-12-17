package com.example.unitconverter.converters.time;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MinuteConverter extends BaseUnitConverter {

    public MinuteConverter() {
        this.Multiplier = new BigDecimal(60);
    }

    @Override
    public String getName() {
        return "Minute";
    }
}
