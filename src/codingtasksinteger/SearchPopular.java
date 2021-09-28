package codingtasksinteger;

public class SearchPopular {

    public static void Search() {
        int arr[] = {1, 2, 5, 43, 2, 1, 5, 5, 5, 2, 32, 23, 53, 43, 8, 49, 49, 49, 49, 49, 49, 49};
        int k[] = new int[65];
        for (int i = 1; i < arr.length; i++) {
            k[arr[i]]++;
        }

        int m = 0;
        for (int i = 1; i <= 64; i++) {
            if (m < k[i]) {
                m = i;
            }
        }
        System.out.println(m);

    }

}
