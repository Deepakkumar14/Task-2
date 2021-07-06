package task2;
enum Rainbow{
	VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
	int colorCode;
	 Rainbow(int colorCode) {
		this.colorCode=colorCode;
	}
}
public class EnumForRainbow{
	public static void enumRainbow() {
	for(Rainbow color:Rainbow.values()) {
		System.out.println("Color code of "+color+" is "+color.colorCode);
	}
	}
}