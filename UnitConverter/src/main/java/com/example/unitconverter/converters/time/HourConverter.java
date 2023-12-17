package com.example.unitconverter.converters.time;

import com.example.unitconverter.converters.BaseUnitConverter;

import java.math.BigDecimal;

public class HourConverter extends BaseUnitConverter {

    public HourConverter() {
        this.Multiplier = new BigDecimal(60 * 60);
    }

    @Override
    public String getName() {
        return "Hour";
    }
}
