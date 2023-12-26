// DeviceType enum
enum DeviceType {
    SMARTPHONE,
    LAPTOP
}

// Device interface
interface Device {
    void displayDetails();
}

class Smartphone implements Device {
    @Override
    public void displayDetails() {
        System.out.println("Smartphone: Model X, RAM: 8GB, Storage: 128GB");
    }
}

class Laptop implements Device {
    @Override
    public void displayDetails() {
        System.out.println("Laptop: Model Y, RAM: 16GB, Storage: 512GB");
    }
}


// DeviceFactory interface
interface DeviceFactory {
    Device createDevice();
}

class SmartphoneFactory implements DeviceFactory {
    @Override
    public Device createDevice() {
        return new Smartphone();
    }
}

class LaptopFactory implements DeviceFactory {
    @Override
    public Device createDevice() {
        return new Laptop();
    }
}

public class ClientWithFactories {
    public static void main(String[] args) {
        DeviceFactory smartphoneFactory = new SmartphoneFactory();
        DeviceFactory laptopFactory = new LaptopFactory();
        Device smartphone = smartphoneFactory.createDevice();
        Device laptop = laptopFactory.createDevice();
        smartphone.displayDetails();
        laptop.displayDetails();
    }
}
