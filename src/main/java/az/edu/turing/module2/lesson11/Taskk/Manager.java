package az.edu.turing.module2.lesson11.Taskk;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize=teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team size:"+ teamSize);

    }
}
