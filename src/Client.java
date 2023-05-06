public class Client {
    private String name;
    private boolean check;
    private int rooms;
   // private Boolean checkOut;
    public Client (String name){
        this.name = name;

    }
    public boolean check(){
        check = !check;
        return check;
    }
    public String confirmation(){
        if (check) return "true";
        else return "false";
    }
    //CHECK-IN
    public int giveRooms(int rooms){
        return (this.rooms += rooms);

    }
    // CHECK-OUT
    public int takeRooms(int rooms){
        if(this.rooms - rooms < 0){
            int i = this.rooms;
            this.rooms = 0;
            return i;
        }else{
            this.rooms -= rooms;
            return rooms;
        }
    }
    // CONFIRM
    public int howMany(){
        return rooms;
    }
}
