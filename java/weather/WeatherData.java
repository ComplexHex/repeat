package weather;

public class WeatherData {
    public  void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

    }



    private float getPressure() {
        return 0;
    }

    private float getHumidity() {
        return 0;
    }

    private float getTemperature() {
        return 0;
    }
}
