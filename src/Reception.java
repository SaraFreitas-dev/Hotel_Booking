public class Reception {
    //checkrooms
    public boolean check (Client x){
        return x.check();
    }
    public int howMany(Client x){
        return x.howMany();
    }
    public int giveRooms(Client x, int rooms){
        return x.giveRooms(rooms);
    }

    public int takeRooms(Client x, int rooms){
        return x.takeRooms(rooms);
    }
}
