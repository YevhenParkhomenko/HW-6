

class ConcretePrototype1 extends Prototype {
        public ConcretePrototype1(int id){
                super(id);
        }
        @Override public Prototype Clone(){
                return new ConcretePrototype1(getId());
         }
}