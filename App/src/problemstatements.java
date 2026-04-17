import java.util.*;

public class problemstatements {

    static class Client {
        String name;
        int risk;

        Client(String name, int risk) {
            this.name = name;
            this.risk = risk;
        }

        public String toString() {
            return name + ":" + risk;
        }
    }

    static void bubble(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].risk > arr[j + 1].risk) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertion(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].risk < key.risk) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Client[] arr = {
                new Client("A", 20),
                new Client("B", 50),
                new Client("C", 80)
        };

        bubble(arr);
        System.out.println("Bubble: " + Arrays.toString(arr));

        insertion(arr);
        System.out.println("Insertion DESC: " + Arrays.toString(arr));
    }
}