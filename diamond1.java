public class Diamond { //ສ້າງຄາສ Diamond
	private final int size; // ກຳນົດຄູນລັກສະນະ
	private final int halfSize;
	//private ເປັນການປະກາດລະດັບການເຂົ້າເຖີງຍາກທີ່ສູດ ຈະມີແຕ່ຄາສຂອງຕົວມັນເອັງເທົ່ານັ້ນທີ່ສາມາດມີສິດໃຊ້ງານໄດ້
	//final  ຄາສອື່ນບໍ່ສາມາດມາສືບທອດໄດ້
	
	public Diamond(int size) { // ສ້າງ constructor ກຳນົດ ຄ່າ int size;
		//int size ເປັນຕົວແປ argument ທີ່ໃຊ້ຮັບຂໍ້ມູນເຂົ້າສູ່ method
		this.size =size; // this ຄືເມຶື່ອຕ້ອງການເອີ້ນໃຊ້ງານ constructor ໂຕອຶ້ນໆ ທີ່ຢູ່ໃນຄາສດຽວກັນ
		this.halfSize=size/2;
		
	}
	public void print() { // ສ້າງ method ພາຍໃນຄາສ
		int star =(int)halfSize;  
		for(int i=0; i <size; i++) {
			for (int j =0; j <size; j++) {
				if(star- Math.abs(star-i) >= Math.abs(star-j)) {  
					System.out.print("*");  
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	
}
