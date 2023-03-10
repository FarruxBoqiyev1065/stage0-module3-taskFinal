package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float a = temperatureCelsius;
        float f = (a * 9)/5 + 32;
        System.out.println(f);
    }
}
