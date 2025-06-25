public class Raum {

    private String roomNumber;
    private int capacity;

    public Raum(String roomNumber, int capacity) {
        validateCapazity(capacity);
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    private void validateCapazity(int capacity){
        if(capacity < 1) throw new IllegalArgumentException("Capacity muss größer null sein");
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}

