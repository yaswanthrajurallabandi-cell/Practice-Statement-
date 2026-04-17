import java.util.*;

public class problemstatements {

    static class Transaction {
        String id;
        double fee;
        String ts;

        Transaction(String id, double fee, String ts) {
            this.id = id;
            this.fee = fee;
            this.ts = ts;
        }

        public String toString() {
            return id + ":" + fee;
        }
    }

    // Bubble Sort
    static void bubbleSort(List<Transaction> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
        System.out.println("Bubble Sort: " + list);
    }

    // Insertion Sort
    static void insertionSort(List<Transaction> list) {
        for (int i = 1; i < list.size(); i++) {
            Transaction key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).fee > key.fee) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        System.out.println("Insertion Sort: " + list);
    }

    public static void main(String[] args) {

        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("id1", 10.5, "10:00"));
        list.add(new Transaction("id2", 25.0, "09:30"));
        list.add(new Transaction("id3", 5.0, "10:15"));

        bubbleSort(new ArrayList<>(list));
        insertionSort(new ArrayList<>(list));

        // High fee
        System.out.print("High Fee >50: ");
        list.stream().filter(t -> t.fee > 50)
                .forEach(System.out::println);
    }
}
