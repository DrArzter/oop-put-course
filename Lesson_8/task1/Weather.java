public class Weather {

    private final Forecast forecast;
    private final float temperature;

    public Weather(Forecast f, float t){
        this.temperature = t;
        this.forecast = f;
    }

public String info(){
    return "today temperature is " + this.forecast.temp();
}
  
public String toString(){
    return(Float.toString(temperature));
}
}

