
public class Smartphone {

	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY;
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getStorageCapacity() {
		return this.storageCapacity;
	}
	
	public void setBrand(String brand) {
		int count = 0;
		for(int i = 1; i <= brand.length(); i++) {
			count++;
		}
		
		if(count > 2) {
			this.brand = brand;
		} else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	
	public void setModel(String model) {
		if(model.length() > 2) {
			this.model = model;
		} else {
			System.out.println("Error: Model must have at least 2 characters!");
		}
	}
	
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity > 1 && storageCapacity < 512) {
			this.storageCapacity = storageCapacity;
		} else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	
	public void increaseStorage(int additionalStorage) {
		if (additionalStorage > 0 && (storageCapacity + additionalStorage) < (MAX_STORAGE_CAPACITY)) {
			additionalStorage = storageCapacity;
		} else {
			System.out.println("Error: Storage capacity cannot exceed <MAX_STORAGE_CAPACITY> GB!");
		}
		if (additionalStorage <= 0) {
			System.out.println("Error: Additional storage must be positive!");
		}
	}
	
	public int  getRemainingStorage(int usedStorage) {
		if (usedStorage > 0 && usedStorage < storageCapacity) {
			return  storageCapacity - usedStorage;
		} else {
			System.out.println("Error: Used storage must be between 0 and <storageCapacity> GB!");
		}
		return -1;
	}
	
	 public void printDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Storage Capacity: " + storageCapacity + "GB");
	    }
}
