package d_TrafficLights;

public class TrafficLights implements Traffic {
    private EnumLights lights;

    public TrafficLights(EnumLights lights) {
        this.lights = lights;
    }

    @Override
    public void update() {
        switch (this.lights) {
            case RED:
                this.lights = EnumLights.GREEN;
                break;
            case GREEN:
                this.lights = EnumLights.YELLOW;
                break;
            case YELLOW:
                this.lights = EnumLights.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.lights.toString();
    }
}
