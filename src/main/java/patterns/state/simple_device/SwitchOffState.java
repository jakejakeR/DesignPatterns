package patterns.state.simple_device;

public class SwitchOffState implements State {

    private final Device device;

    public SwitchOffState(Device device) {
        this.device = device;
        device.isOn = false;
    }

    @Override
    public void getNotification() {
        System.out.println("Boop!");
    }

    @Override
    public void changeState() {
        System.out.println("Switching on");
        device.state = new SwitchOnState(device);
    }
}
