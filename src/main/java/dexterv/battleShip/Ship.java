package main.java.dexterv.battleShip;

public class Ship {
    private int shipLength; // this will be ship length. determine on how many cell to occupy
    private int origin; // this will be the 0 x,y origin of the 1st cell of the ship
    private int axis; // this will determine if ship is positioned in horizontal or vertical. X-Y
    private int axisDirection; // this will determine if axis is in +- X or +-Y direction

    public Ship(int shipLength, int origin, int axis, int axisDirection) {
        this.shipLength = shipLength;
        this.origin = origin;
        this.axis = axis;
        this.axisDirection = axisDirection;
    }

    public int getShipLength() {
        return shipLength;
    }

    public int getOrigin() {
        return origin;
    }

    public int getAxis() {
        return axis;
    }

    public int getAxisDirection() {
        return axisDirection;
    }

    public void setShipLength(int shipLength) {
        this.shipLength = shipLength;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    public void setAxisDirection(int axisDirection) {
        this.axisDirection = axisDirection;
    }
}
