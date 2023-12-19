public class DataContainer {
    int number;
    double decimalNumber;
    String text;

    public void performAddition(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Result: " + sum);
    }

    public void convertToUpperCase(String text) {
        updatedText = text.toUpperCase();
        System.out.println("Updated String: " + updatedText);
    }
}

public class MainApp {
    public static void main(String[] args) {
        DataContainer data = new DataContainer();
        data.number = 10;
        data.decimalNumber = 20.5;
        data.text = "hello";
        
        data.add(data.number, 5);
        data.convertToUpperCase("world");
    }
}
