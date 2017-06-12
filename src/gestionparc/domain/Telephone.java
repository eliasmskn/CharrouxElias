package gestionparc.domain;

public class Telephone 
{
	private String num, marque, type;
	private int imei, id_T;
	
	public Telephone()
	{
		imei = 0;
		id_T = 0;
		num = "";
		marque = "";
		type = "";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		num = num;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		type = type;
	}

	public int getIMEI() {
		return imei;
	}

	public void setIMEI(int iMEI) {
		imei = iMEI;
	}

	public int getId_T() {
		return id_T;
	}

	public void setId_T(int id_T) {
		this.id_T = id_T;
	}
	
	
}
