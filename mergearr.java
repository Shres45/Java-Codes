public class mergearr {
    public static void main(String[] args) {

        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        int[] C = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}
    

