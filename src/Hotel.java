public class Hotel {
    private String name;
    private int rooms;
    private Reception reservation;
    public Hotel(String name, int rooms){
        this.name = name;
        this.rooms = rooms;
        Reception reservation = new Reception();
        this.reservation = reservation;
    }
    public boolean check(Client x){return reservation.check(x);}
    public String getName(){
        return name;
    }
    // SETTER NUMBER OF ROOMS
    public int takeRooms(Client x,int rooms){
        if(this.rooms - rooms < 0){
            int i = this.rooms;
            this.rooms = 0;
            if (i>0) check(x);
            return reservation.giveRooms(x,i);
        }else{
            this.rooms -= rooms;
            check(x);
            return reservation.giveRooms(x,rooms);
        }
    }
    public int giveRooms(Client client, int rooms){
        if (rooms > reservation.howMany(client)) {
            check(client);
            return reservation.takeRooms(client, reservation.howMany(client));
        }
        if (rooms == reservation.howMany(client)) {
            this.rooms += rooms;
            check(client);
            return reservation.takeRooms(client, rooms);
        }
            this.rooms += rooms;
            return reservation.takeRooms(client, rooms);
    }

}
