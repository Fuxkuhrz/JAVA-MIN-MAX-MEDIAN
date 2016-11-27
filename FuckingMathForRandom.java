import java.util.Arrays; // import มาเพื่อเรียกใช้ method ในการจัดเรียงข้อมูลใน อาร์เรย์
public class FuckingMathForRandom {

	public static void main(String[] args) {
		
		int[] numlist = new int[10]; // สร้างอาร์เรย์ขนาด 10 ตำแหน่ง
		int x=0; //กำหนดค่า x เป็นค่าเริ่มต้นเพื่อวน 10 รอบ
		while(x<10){ // เริ่มต้นลูป while 
		int max=1,min=1; // กำหนดค่าเริ่มต้นให้กับ max และ min เพื่อใช้ในการเปรียบเทียบ
		System.out.println("================");
		System.out.println("รอบที่ "+(x+1)); // บวก 1 เพื่อแสดงผล
		System.out.println("================");
		System.out.println("================");
		System.out.print("Random Result: ");
		for(int i=0;i<10;i++){ //ลูป for นี่ใช้สำหรับทำการสุ่มเลข 10 จำนวน
			double r = Math.random() * 10; // เรียกใช้ Math.random เพื่อสุ่ม ที่คูณ 10 เพราะว่าจะได้เลข 0-9
			int rand = (int) r; // กำหนดค่าใหม่ ปกติมันจะสุ่มมาเป็น float เลยแคสให้มันเป็น int 
			numlist[i] = rand; // เพิ่ม จำนวนที่สุ่มมาได้ลงอาร์เรย์
			if(max < rand){ // เปรียบเทียบหาค่ามาก
				max = rand; // ถ้าเป็นจริง (ถ้า max น้อยกว่า rand) ให้ max = rand
			}else if(min > rand){ // ปรียบเทียบหาค่าน้อย
				min = rand; // ถ้าเป็นจริง (ถ้า min มากกว่า rand) ให้ min = rand
			}
			
			System.out.print(rand + " ");
		}
		Arrays.sort(numlist); // เรียกใช้ method Sort เพื่อเรียงข้อมูลใน อาร์เรย์
		System.out.println();
		System.out.print("Sorting Result: ");
		for(int j=0;j<numlist.length;j++){ // สร้างลูปใหม่เพื่อวนลูปแสดงผลค่าที่ผ่านการจัดเรียงแล้ว
			System.out.print(numlist[j]+" "); // แสดงผลค่าที่จัดเรียงแล้ว 
		}
		System.out.println();
		System.out.println("================");
		System.out.println("MAX value is :" + max);
		System.out.println("MIN value is :" + min);

		System.out.println("MEDIAN is :" + (float)(numlist[4] + numlist[5])/2);// แสดงผลค่ามัธยฐาน 
		x++; // เพิ่มค่า x ทีละ 1
		}
		
	}
}
