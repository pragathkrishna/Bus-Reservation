package BusResv;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;

    Bus(int busno,boolean ac,int capacity){
        this.busno=busno;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public boolean isAc(){
        return ac;
    }
    public void setAc(boolean Ac){
        ac=Ac;
    }
    public int getBusno(){
        return busno;
    }
    public void displayBusInfo(){
        System.out.println("Bus no : "+ busno+" Is Ac : "+ac+" Total capacity : "+capacity);
    }
}
