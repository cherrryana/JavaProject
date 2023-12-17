package com.example.unitconverter.converters.time;

import com.example.unitconverter.converters.BaseUnitConverter;
import com.example.unitconverter.converters.UnitTypeConverter;
import com.example.unitconverter.converters.length.FootConverter;
import com.example.unitconverter.converters.length.MeterConverter;

import java.util.HashMap;

public class TimeConverter extends UnitTypeConverter {

    private static BaseUnitConverter secondConverter = new SecondConverter();
    private static BaseUnitConverter minuteConverter = new MinuteConverter();
    private static BaseUnitConverter hourConverter = new HourConverter();

    public TimeConverter() {
        super("Second", new HashMap<String, BaseUnitConverter>() {
            {
                put(secondConverter.getName(), secondConverter);
                put(minuteConverter.getName(), minuteConverter);
                put(hourConverter.getName(), hourConverter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Time";
    }
}
