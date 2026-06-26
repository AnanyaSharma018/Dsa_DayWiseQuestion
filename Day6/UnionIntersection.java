public class UnionIntersection {

    public static void union(int[] a, int[] b) {
        int i = 0, j = 0;

        System.out.print("Union: ");

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if (a[i] > b[j])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        while (i < a.length)
            System.out.print(a[i++] + " ");

        while (j < b.length)
            System.out.print(b[j++] + " ");
    }

    public static void intersection(int[] a, int[] b) {
        int i = 0, j = 0;

        System.out.print("\nIntersection: ");

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,5,6};
        int[] b = {2,3,5,7};

        union(a,b);
        intersection(a,b);
    }
}