package myfirstproject;

class Doctor {

    private String name;
    private String ID;
    private String officeNum;
    private Spieciallty doc;
    private int workinghours;
    
    public Doctor() {
      
    }
     public Doctor(String name, String ID, String officeNum, Spieciallty spiecialties, int workinghours) {
        this.name = name;
        this.ID = ID;
        this.officeNum = officeNum;
        this.doc = spiecialties;
        this.workinghours= workinghours;               
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getOfficeNum() {
        return officeNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + " ID=" + ID + " officeNum=" + officeNum + doc + '}';
    }
    
}