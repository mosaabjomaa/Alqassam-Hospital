package myfirstproject;

class Sick {

    private String name;
    private  Integer ID;
    private String level;
    
   
     public Sick() {
    }
public Sick(String name, int ID, String level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getID() {
        return ID;
    }

    public String getLevel() {
        return level;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", ID=" + ID + ", level=" + level + '}';
    }

}
