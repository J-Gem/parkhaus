package parkPack;

import java.util.Random;

public class Ticket {
	private long id;
	private boolean istBezahlt;
	private String startDatum;
	private String endDatum;
	private DateHelper myDateHelper;

	public Ticket() {
		myDateHelper = new DateHelper();
		this.istBezahlt = false;
	}

	public long getId() {
		return id;
	}

	public boolean isIstBezahlt() {
		return istBezahlt;
	}

	public void setIstBezahlt(boolean istBezahlt) {
		this.istBezahlt = istBezahlt;
	}

	public String getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(String startDatum) {
		this.startDatum = startDatum;
	}

	public String getEndDatum() {
		return endDatum;
	}

	public void setEndDatum(String endDatum) {
		this.endDatum = endDatum;
	}

	private static long getIdMacAddress() {
		long currentTimeMillis = System.currentTimeMillis();
		//Work in Progress
		return 1;
	}
}