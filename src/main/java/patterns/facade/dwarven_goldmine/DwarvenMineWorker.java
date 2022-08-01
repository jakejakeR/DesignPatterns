package patterns.facade.dwarven_goldmine;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * DwarvenMineWorker is one of the goldmine subsystems.
 */
@Slf4j
public abstract class DwarvenMineWorker {

    public abstract void work();
    public abstract String name();


    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    private void action(Action action) {
        switch(action) {
            case GO_TO_SLEEP -> goToSleep();
            case WAKE_UP -> wakeUp();
            case GO_HOME -> goHome();
            case GO_TO_MINE -> goToMine();
            case WORK -> work();
            default -> LOGGER.info("Undefined action");
        }
    }

    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }

    //region LOGS
    public void goToSleep() {
        LOGGER.info("{} goes to sleep.", name());
    }

    public void wakeUp() {
        LOGGER.info("{} wakes up.", name());
    }

    public void goHome() {
        LOGGER.info("{} goes home.", name());
    }

    public void goToMine() {
        LOGGER.info("{} goes to the mine.", name());
    }
    //endregion
}

