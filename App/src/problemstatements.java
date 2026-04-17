public class problemstatements {

    static int floor(int[] arr, int x) {
        int res = -1;
        for (int v : arr)
            if (v <= x) res = v;
        return res;
    }

    static int ceiling(int[] arr, int x) {
        for (int v : arr)
            if (v >= x) return v;
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 50, 100};

        System.out.println("Floor(30): " + floor(arr, 30));
        System.out.println("Ceiling(30): " + ceiling(arr, 30));
    }
}