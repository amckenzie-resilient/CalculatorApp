package Interfaces;

public interface Menu {

    public String help = "help";

    public void CreateMenu();
    public void Help();
    public void Exit();
    public Boolean IsActive();
    public Boolean IsInactive();
    public Boolean Activate();
    public Boolean DeActivate();

}
