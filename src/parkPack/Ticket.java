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
		startDatum = myDateHelper.getActualTimeAsString();
		id = erstelleID();
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

	public void setStartDatum(String startDatum) {
		this.startDatum = startDatum;
	}

	public void setEndDatum(String endDatum) {
		this.endDatum = myDateHelper.getActualTimeAsString();
	}

	public String getStartDatum() {
		return startDatum;
	}

	public String getEndDatum() {
		return this.endDatum;
	}

	public DateHelper getDateHelper() {
		return this.myDateHelper;
	}

	private static long erstelleID() {
		return System.currentTimeMillis();
	}
}