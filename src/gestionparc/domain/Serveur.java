package gestionparc.domain;

public class Serveur 
{
	private String marque, proc, ram, ddur, os;
	private int id_S;
	
	public Serveur()
	{
		id_S = 0;
		marque = "";
		proc = "";
		ram = "";
		ddur = "";
		os = "";
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		marque = marque;
	}

	public String getProc() {
		return proc;
	}

	public void setProc(String proc) {
		proc = proc;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		ram = ram;
	}

	public String getDdur() {
		return ddur;
	}

	public void setDdur(String ddur) {
		ddur = ddur;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		os = os;
	}

	public int getId_S() {
		return id_S;
	}

	public void setId_S(int id_S) {
		this.id_S = id_S;
	}
	
	
	
	
}
