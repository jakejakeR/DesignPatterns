package patterns.state.simple_device;

public class SwitchOnState implements State {

    private final Device device;

    public SwitchOnState(Device device) {
        this.device = device;
        device.isOn = true;
    }

    @Override
    public void getNotification() {
        System.out.println("Beep!");
    }

    @Override
    public void changeState() {
        System.out.println("Switching off");
        device.state = new SwitchOffState(device);
    }
}
