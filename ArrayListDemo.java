import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them phan tu");
            System.out.println("2. Sua phan tu");
            System.out.println("3. Xoa phan tu");
            System.out.println("4. Tim kiem");
            System.out.println("5. Sap xep");
            System.out.println("6. Xuat danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so can them: ");
                    int x = sc.nextInt();
                    list.add(x);
                    break;

                case 2:
                    System.out.print("Nhap vi tri can sua: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < list.size()) {
                        System.out.print("Nhap gia tri moi: ");
                        int newVal = sc.nextInt();
                        list.set(index, newVal);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 3:
                    System.out.print("Nhap vi tri can xoa: ");
                    int delIndex = sc.nextInt();
                    if (delIndex >= 0 && delIndex < list.size()) {
                        list.remove(delIndex);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap gia tri can tim: ");
                    int key = sc.nextInt();
                    if (list.contains(key)) {
                        System.out.println("Tim thay tai vi tri: " + list.indexOf(key));
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;

                case 5:
                    System.out.println("1. Tang dan");
                    System.out.println("2. Giam dan");
                    int type = sc.nextInt();
                    if (type == 1) {
                        Collections.sort(list);
                    } else {
                        Collections.sort(list, Collections.reverseOrder());
                    }
                    break;

                case 6:
                    System.out.println("Danh sach: " + list);
                    break;

                case 0:
                    System.out.println("Thoat!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }
}