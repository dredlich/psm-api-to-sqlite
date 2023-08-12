package de.dredlich.psm.api.datenschubser.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.modelmapper.AbstractConverter;

@Converter
public class BooleanToStringConverter extends AbstractConverter<String,Boolean> implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean value) {
        if (value == null) return null;
        else return value ? "J" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String value) {
        if (value == null) return null;
        else if (value.equals("J")) return true;
        else if (value.equals("N")) return false;
        else throw new IllegalStateException("Invalid boolean character: " + value);
    }

    @Override
    protected Boolean convert(String value) {
        if (value == null) return null;
        else if (value.equals("J")) return true;
        else if (value.equals("N")) return false;
        else throw new IllegalStateException("Invalid boolean character: " + value);
    }
}
