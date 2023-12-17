package com.example.unitconverter.converters.energy;

import com.example.unitconverter.converters.BaseUnitConverter;
import com.example.unitconverter.converters.UnitTypeConverter;
import com.example.unitconverter.converters.length.FootConverter;
import com.example.unitconverter.converters.length.MeterConverter;

import java.util.HashMap;

public class EnergyConverter extends UnitTypeConverter {

    private static BaseUnitConverter kiloJoule = new KilojouleConverter();
    private static BaseUnitConverter kiloCalorie = new KilocalorieConverter();
    private static BaseUnitConverter joule = new JouleConverter();

    public EnergyConverter() {
        super("Joule", new HashMap<String, BaseUnitConverter>() {
            {
                put(kiloJoule.getName(), kiloJoule);
                put(kiloCalorie.getName(), kiloCalorie);
                put(joule.getName(), joule);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Energy";
    }
}
