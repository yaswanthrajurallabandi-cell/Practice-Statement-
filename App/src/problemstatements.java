public class problemstatements {

    static int linear(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) return i;
        }
        return -1;
    }

    static int binary(String[] arr, String key) {
        int l = 0, h = arr.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (arr[m].equals(key)) return m;
            else if (arr[m].compareTo(key) < 0) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        String[] arr = {"accA", "accB", "accB", "accC"};

        System.out.println("Linear: " + linear(arr, "accB"));
        System.out.println("Binary: " + binary(arr, "accB"));
    }
}