package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.Bidi;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void calculateWindchillFactorCelsius() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusWindchillResults = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(5));

        assertEquals(BigDecimal.valueOf(-4.09), celsiusWindchillResults);
    }

    @Test
    void calculateWindchillFactorFahrenheit() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitWindchillResults = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(5));

        assertEquals(BigDecimal.valueOf(24.638), fahrenheitWindchillResults);
    }

    @Test
    void temperatureConversionCelsiusToFahrenheit() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals(BigDecimal.valueOf(32), celsiusToFahrenheitResult);
    }

    @Test
    void temperatureConversionFahrenheitToCelsius() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));

        assertEquals(BigDecimal.valueOf(0), fahrenheitToCelsiusResult);

    }
}