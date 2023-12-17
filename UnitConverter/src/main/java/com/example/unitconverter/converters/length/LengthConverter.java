package com.example.unitconverter.converters.length;

import com.example.unitconverter.converters.BaseUnitConverter;
import com.example.unitconverter.converters.UnitTypeConverter;

import java.util.HashMap;

public class LengthConverter extends UnitTypeConverter {

    private static BaseUnitConverter meterConverter = new MeterConverter();
    private static BaseUnitConverter footConverter = new FootConverter();

    public LengthConverter() {
        super("Meter", new HashMap<String, BaseUnitConverter>() {
            {
                put(meterConverter.getName(), meterConverter);
                put(footConverter.getName(), footConverter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Length";
    }
}
