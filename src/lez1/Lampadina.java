package lez1;

public class Lampadina {
    private boolean isOn;

    public void collega(){
        isOn = true;
    }
    public void scollega(){
        isOn = false;
    }

    @Override
    public String toString() {
        return "State: " + (isOn? "on" : "off");
    }
}
