//Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//
//        Bước 2: Nhập X là phần tử cần xoá
//
//        Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: index_del
//
//        Bước 4: Thực hiện xoá phần tử X khỏi mảng
//
//        Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
//
//        -       Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
//
//        Bước 5:  Kết thúc duyệt mảng. In ra mảng.
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int element, index = 0;
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert element you want delete : ");
        element = scanner.nextInt();
        boolean check = false;

        for (int i=0;i<array.length;i++) {
            if (array[i]== element) {
                index = i;
                check = true;
                break;
            }
        }
        int[] array2 = new int[array.length-1];

        if ( check ) {
            for (int j = 0; j < array2.length; j++) {
                if(index<=j){
                    array2[j]=array[j+1];
                }else {
                    array2[j]=array[j];
                }
            }
            for (int i:array2
                 ) {
                System.out.print(i);
            }
        } else {
            System.out.print("cc");
        }

    }
}
