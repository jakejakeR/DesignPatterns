package patterns.state.simple_device;

public class Device {
    State state;
    boolean isOn = false;

    public Device() {
        this.state = new SwitchOffState(this);
    }

    public void switchOn() {
        if (isOn) {
            state.getNotification();
        } else {
            state.changeState();
        }
    }

    public void switchOff() {
        if (!isOn) {
            state.getNotification();
        } else {
            state.changeState();
        }
    }
}
