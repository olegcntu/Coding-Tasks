package app;

public abstract class  Vehicle {
    String name;

    public String move(){
        return " Vehicle "+name+" is moving" ;
    }

    public abstract String getYearOfInvention();


}
