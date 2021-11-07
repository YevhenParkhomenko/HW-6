abstract class Prototype
{
    public int Id;

    private void Prototype (int id){
        this.Id = id;
    }

    public int getId(){
        return Id;
    }
    public Prototype(int id)
    {
        this.Id = id;
    }
    public abstract Prototype Clone();
}