public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherdata;

    public CurrentConditionsDisplay(Subject weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("current conditions : " + temperature + "F degree and" + humidity + "%humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
