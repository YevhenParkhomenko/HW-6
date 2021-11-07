abstract class Prototype
{
    public int Id;

    Prototype (int id){
        this.Id = id;
    }

    public int getId(){
        return Id;
    }

    public abstract Prototype Clone();
}
