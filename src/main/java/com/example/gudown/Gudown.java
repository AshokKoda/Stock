package com.example.gudown;

public class Gudown {

	private int gId;
	private String gName;
	private String gLocation;
	private int gCapacity;

	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgLocation() {
		return gLocation;
	}

	public void setgLocation(String gLocation) {
		this.gLocation = gLocation;
	}

	public int getgCapacity() {
		return gCapacity;
	}

	public void setgCapacity(int gCapacity) {
		this.gCapacity = gCapacity;
	}

	@Override
	public String toString() {
		return "[gId=" + gId + ", gName=" + gName + ", gLocation=" + gLocation + ", gCapacity=" + gCapacity
				+ "]";
	}

}
