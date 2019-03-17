package model;
//
public class ClinicHistory{
	public static final String OPEN = "abierto";
	public static final String CLOSE = "cerrado";
	//
	private String stauts;
	private String symptom;
	private String diagnosis;
	//
	private Dated histoDate1;
	private Dated histoDate2;
	private Medicine medi;
	//
	public ClinicHistory(String stauts, String symptom, String diagnosis, Dated histoDate1, Dated histoDate2, Medicine medi){
		this.status = status;
		this.symptom = symptom;
		this.diagnosis = diagnosis;
		this.histoDate1 = histoDate1;
		this.histoDate2 = histoDate2;
		this.medi = medi;
	}
	//
	public String getStatus (){
		return status;
	}
	public void setStatus (String status){
		this.stauts = status;
	}
	
	public String getSymptom (){
		return symptom;
	}
	public void setSymptom (String symptom){
		this.symptom = symptom;
	}
	
	public String getDiagnosis (){
		return diagnosis;
	}
	public void setDiagnosis (String diagnosis){
		this.diagnosis = diagnosis;
	}
	
	public Dated getHistoDate1 (){
		return histoDate1;
	}
	public void setHistoDate1 (Dated histoDate1){
		this.histoDate1 = histoDate1;
	}
	
	public Dated getHistoDate2 (){
		return histoDate2;
	}
	public void setHistoDate2 (Dated histoDate2){
		this.histoDate2 = histoDate2;
	}
	
	public Medicine getMedi (){
		return medi;
	}
	public void setMedi (Medicine medi){
		this.medi = medi;
	}
	
	
	
}