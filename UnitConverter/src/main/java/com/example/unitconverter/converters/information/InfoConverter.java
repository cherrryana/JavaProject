package com.example.unitconverter.converters.information;

import com.example.unitconverter.converters.BaseUnitConverter;
import com.example.unitconverter.converters.UnitTypeConverter;

import java.util.HashMap;

public class InfoConverter extends UnitTypeConverter {

    private static BaseUnitConverter bitConverter = new BitConverter();
    private static BaseUnitConverter byteConverter = new ByteConverter();
    private static BaseUnitConverter kByteConverter = new KByteConverter();
    private static BaseUnitConverter mByteConverter = new MByteConverter();

    public InfoConverter() {
        super("Bit", new HashMap<String, BaseUnitConverter>() {
            {
                put(bitConverter.getName(), bitConverter);
                put(byteConverter.getName(), byteConverter);
                put(kByteConverter.getName(), kByteConverter);
                put(mByteConverter.getName(), mByteConverter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Information";
    }
}
