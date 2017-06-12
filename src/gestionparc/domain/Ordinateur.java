package gestionparc.domain;

import java.util.ArrayList;

public class Ordinateur 
{
	enum OS{
		windows, linux, mac
	}
	private int id_O;
	private String marque, type, proc, ram, ddur;
	private OS os;
		
	public Ordinateur(int id_O, String Marque, String type, String Proc, OS Os, String Ram, String Ddur)
	{
		this.id_O = id_O;
		this.marque = Marque;
		this.type = type;
		this.proc = Proc;
		this.os = Os;
		this.ram = Ram;
		this.ddur = Ddur;
	}

	public int getId_O() {
		return id_O;
	}

	public void setId_O(int id_O) {
		this.id_O = id_O;
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
		this.type = type;
	}

	public String getProc() {
		return proc;
	}

	public void setProc(String proc) {
		proc = proc;
	}

	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		os = os;
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
	
	
}
