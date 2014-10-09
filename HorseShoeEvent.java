package Main.HorseShoesEvent;


public class HorseShoesEvent extends Event {
    public int numBeanBags;
    public void setNumHorseShoes(int numHorseShoes)
    {
        this.numHorseShoes = numHorseShoes;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(numHorseShoes);
    }
}
