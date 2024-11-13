public class Room {
    private int roomId;
    private String roomNumber;
    private String type;
    private String status;
    private double price;

    public Room(int roomId, String roomNumber, String type, String status, double price) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.type = type;
        this.status = status;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void createRoom() {
    }

}