import java.util.Scanner;

enum TrafficSignals{
    RED,
    YELLOW,
    GREEN
}

public class EnumerationDataType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a traffic signal: ");
        String signal = sc.next();
        TrafficSignals ts = TrafficSignals.valueOf(signal);
        switch (ts) {
            case RED -> System.out.println("STOP");
            case YELLOW -> System.out.println("GET READY");
            case GREEN -> System.out.println("GO");
        }

    }
}
