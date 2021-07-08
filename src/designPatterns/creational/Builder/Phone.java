package designPatterns.creational.Builder;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	
	public Phone(Builder builder) {
		this.os = builder.os;
		this.ram = builder.ram;
		this.processor = builder.processor;
		this.screenSize = builder.screenSize;
		this.battery = builder.battery;
	}

	public static final class Builder{
		private String os;
		private int ram;
		private String processor;
		private double screenSize;
		private int battery;
		
		public static Builder create() {
			return new Builder();
		}
		
		private Builder() {
			
		}
		
		public Builder setOs(String os) {
			this.os = os;
			return this;
		}
		public Builder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		public Builder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		public Builder setScreenSize(double screenSize) {
			this.screenSize = screenSize;
			return this;
		}
		public Builder setBattery(int battery) {
			this.battery = battery;
			return this;
		}
		
		public Phone build() {
			return new Phone(this);
		}
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	

}
