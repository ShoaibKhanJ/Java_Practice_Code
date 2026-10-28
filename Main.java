class Device {

    boolean status = false;

    void currentCondition() {

        if (status == true) {
            System.out.println("Device is ON");
        } 
        
        else {
            System.out.println("Device is OFF");
        }
    }  

    void on() {
        status = true;
    }

    void off() {
        status = false;
    }

}


class Button {

    Device remote;
    
    // Constructor ( here i am giving refrenerce of device which constructor get and give that reference to button object variable)
    Button(Device remote) {
        this.remote = remote;
    }

    void onBtn() {
        remote.on();
    }

    void offBtn() {
        remote.off();
    }
}


public class Main {

    public static void main(String[] args) {

        Device fan = new Device();
        Button button = new Button(fan);

        button.onBtn();
    
        fan.currentCondition();

        button.offBtn();
        
        fan.currentCondition();
       
    }
}