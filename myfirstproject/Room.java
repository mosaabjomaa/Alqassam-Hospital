package myfirstproject;

class Room {

    private int number;
    private int floor;

    public Room() {

    }

    public Room(int number, int floor) {
        this.number = number;
        this.floor = floor;
    }

    public Integer getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "{" + "number=" + number + ", floor=" + floor + '}';
    }

}
