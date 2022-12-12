public class Application{

    public static void main(String[] args){
        Forecast forecast = new Forecast.Fake();
        Weather celsiusWeather = new Weather(forecast, 15);
        assert "Today weather is 15".equals(celsiusWeather.toString());
    }
}
