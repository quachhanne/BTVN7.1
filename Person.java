public abstract class Person {
    protected String name;
    protected String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String getName(){
        return name;
    }

    public String setAddress (String address){
        return this.address = address;
    }

    public String getAddress (){
        return address;
    }

    public abstract void display() ;
}
