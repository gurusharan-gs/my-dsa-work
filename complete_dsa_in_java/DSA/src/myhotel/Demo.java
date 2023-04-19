package myhotel;

public class Demo {

	public Hotel provideOrder(int amount) {

		Hotel hotel = null;

		if (amount > 500) {
			hotel = new TajHotel();
		} else if (amount > 200 && amount <= 500) {
			hotel = new RoadSideHotel();
		}
		return hotel;
	}

	public static void main(String[] args) {

		Demo d = new Demo();

		Hotel h = d.provideOrder(800);
		if (h != null) {
			h.chickenBriyani();
			h.masalDhosa();

			if (h instanceof TajHotel) {
				TajHotel taj = (TajHotel) h;
				taj.pannerMasalDosa();
			}

		} else {
			System.out.println("Enter the amount aboue 200");
		}

	}
}
