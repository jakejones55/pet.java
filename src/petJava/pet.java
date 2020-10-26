package petJava;

public class pet {
    private String name;
    private int age;
    private String location;
    private String type;


public String getName(){return name;}
public void setName(String name){this.name = name;}

public int getAge(){return age;}
public void setAge(int age){this.age = (int) age;}

public String getType(){return type;}
public void setType(String type){this.type = type;}


public String getLocation(){return location;}
public void setLocation(String location){this.location = location;}


public pet(){

}

public void Diet(){

}

public void Weight(int weightOfPet) {
    if (weightOfPet > 50){
        System.out.println("your pet is really heavy");
    }
}

}


