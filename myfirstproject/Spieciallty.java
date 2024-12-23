package myfirstproject;

class Spieciallty {

    private String name;

    public Spieciallty() {
    }

    public Spieciallty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name of Spieciallty =" + name + '}';
    }

}
