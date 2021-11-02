import java.util.Scanner;

public class DiamonMain {

	public static void main(String[] args) {
		System.out.print("Enter the line number: ");
		Scanner sc = new Scanner (System.in);
		
		int size = sc.nextInt();
		sc.nextLine();
		
		Diamond diamond1 = new Diamond(size); // ປະກາດຕາສແລະສ້າງ ອອຢເຈັກຊື່ diamond1
	//     |       |        |       |     \
	//ຊື່ຕາສທີ່ສ້າງຊື້ນ   ຊື່່ object  ຄຳສັ່ງ ຊື່ຕາສທີ່ນີຍາມໄວ້   argument
		
		diamond1.print(); // ເອີ້້ນໃຊ້ method print
	}

}