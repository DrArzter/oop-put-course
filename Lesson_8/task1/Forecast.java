public interface Forecast{
    float temp();
    final class Fake implements Forecast{
        @Override
        public float temp(){    
            return 273.15f;
        }
    }
}
