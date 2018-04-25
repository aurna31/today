package model;

public class student {
   public int id1;
   public String name1;
   public int id2;
   public String name2;

    public student() {
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String  getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
    public String isNextPage(){
        return "next";
    }

}
