package laboratorNr2;

public class Masina {
	private String tip;
	private String culoareString;
	private double viteza;

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getCuloareString() {
		return culoareString;
	}

	public void setCuloareString(String culoareString) {
		this.culoareString = culoareString;
	}

	public double getViteza() {
		return viteza;
	}

	public void setViteza(double viteza) {
		this.viteza = viteza;
	}

	@Override
	public String toString() {
		return "Masina: tip - " + this.tip + " culoare - " + this.culoareString + " viteza - " + this.viteza;
	}
}
