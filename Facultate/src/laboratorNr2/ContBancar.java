package laboratorNr2;

public class ContBancar {
	private double sold = 0.0;

	ContBancar(double sold) {
		this.sold = sold;
	}

	public void depozitareCont(double suma) {
		sold += suma;
	}

	public boolean extragereCont(double suma) {
		if (suma > sold) {
			return false;
		}
		this.sold -= suma;
		return true;
	}

	public double getSold() {
		return sold;
	}

}
