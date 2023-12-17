package com.example.unitconverter.converters.volume;

import com.example.unitconverter.converters.BaseUnitConverter;
import com.example.unitconverter.converters.UnitTypeConverter;

import java.util.HashMap;

public class VolumeConverter extends UnitTypeConverter {

    private static BaseUnitConverter liiterConverter = new LiterConverter();
    private static BaseUnitConverter gallonConverter = new GallonConverter();

    public VolumeConverter() {
        super("Liter", new HashMap<String, BaseUnitConverter>() {
            {
                put(liiterConverter .getName(), liiterConverter );
                put(gallonConverter.getName(), gallonConverter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Volume";
    }
}
