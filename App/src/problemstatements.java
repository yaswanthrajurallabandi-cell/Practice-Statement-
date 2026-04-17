import java.util.*;

class Asset {
    String name;
    double returnRate;

    Asset(String name, double returnRate) {
        this.name = name;
        this.returnRate = returnRate;
    }

    public String toString() {
        return name + ":" + returnRate;
    }
}

public class problemstatements {

    // Merge Sort (ASC)
    static void mergeSort(List<Asset> list) {
        list.sort(Comparator.comparingDouble(a -> a.returnRate));
        System.out.println("Merge Sort ASC: " + list);
    }

    // Quick Sort (DESC)
    static void quickSort(List<Asset> list) {
        list.sort((a, b) -> Double.compare(b.returnRate, a.returnRate));
        System.out.println("Quick Sort DESC: " + list);
    }

    public static void main(String[] args) {

        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12));
        list.add(new Asset("TSLA", 8));
        list.add(new Asset("GOOG", 15));

        mergeSort(new ArrayList<>(list));
        quickSort(new ArrayList<>(list));
    }
}