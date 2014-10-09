package Main.CanJamEvent;


public class CanJamEvent extends Event {
    public int frisbeeSize;
    public void setFrisbeeSize(int frisbeeSize)
    {
        this.frisbeeSize = frisbeeSize;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(frisbeeSize);
    }
}
