import java.util.*;

public class MangSoNguyen {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Nhap so phan tu N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

    
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

     
        System.out.print("\nMang vua nhap: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

       
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("\nTong mang: " + sum);

        
        System.out.print("Nhap K: ");
        int k = sc.nextInt();
        int count = 0;
        for (int x : arr) {
            if (x == k) count++;
        }
        System.out.println("So lan xuat hien cua " + k + ": " + count);

        
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Phan tu lon nhat: " + max);
        System.out.println("Phan tu nho nhat: " + min);

        
        System.out.print("Cac so nguyen to: ");
        for (int x : arr) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }

        
        int[] asc = arr.clone();
        Arrays.sort(asc);
        System.out.print("\nMang tang dan: ");
        for (int x : asc) {
            System.out.print(x + " ");
        }

        
        Integer[] desc = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(desc, Collections.reverseOrder());
        System.out.print("\nMang giam dan: ");
        for (int x : desc) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}