package patterns.state;

import patterns.state.simple_device.Device;

import java.util.Scanner;

public class StateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Device device = new Device();
        while (scanner.hasNext()) {
            if ("on".equals(scanner.next())) {
                device.switchOn();
            } else {
                device.switchOff();
            }
        }
    }
}
