package gestionparc.domain;

import java.util.ArrayList;

public class Ordinateur 
{
	enum OS{
		windows, linux, mac
	}
	private int id_O;
	private String marque, type, proc, os, ram, ddur;

	
	
	public Ordinateur()
	{
		this.id_O = 0;
		this.marque = "";
		this.type = "";
		this.proc = "";
		this.os = "";
		this.ram = "";
		this.ddur = "";
	}
		
	public Ordinateur(int id_O, String Marque, String type, String Proc, String Os, String Ram, String Ddur)
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
		this.marque = marque;
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
		this.proc = proc;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDdur() {
		return ddur;
	}

	public void setDdur(String ddur) {
		this.ddur = ddur;
	}
	
	
}
