package basics;

record Vehicle (String brand, String licensePlate, long price) {}
public class Record {
    public  static  void main(String[] args) {
        Vehicle myVehicle = new Vehicle("BMW", "AB-9999", 99999L);
        System.out.println(myVehicle.brand());
        System.out.println(myVehicle.licensePlate());
        System.out.println(myVehicle.price());
        System.out.println(myVehicle.toString());
    }
}
