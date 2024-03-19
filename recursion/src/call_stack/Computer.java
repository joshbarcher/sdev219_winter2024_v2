package call_stack;

public class Computer {
    private boolean onState;
    private String operatingSystem;

    public Computer(String os) {
        this.operatingSystem = os;
    }

    public void turnOn() {
        onState = true;
    }

    public void shutdown() {
        onState = false;
        updateOS();
    }

    private void updateOS() {
        System.out.println("Updating OS...");
        confirmUpdate();
    }

    private void confirmUpdate() {
        System.out.println("Confirming....");
    }
}
