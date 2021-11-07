

class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(int id){
        super(id);
    }
    @Override public Prototype Clone() {
            return new ConcretePrototype2(getId());
            }
    }