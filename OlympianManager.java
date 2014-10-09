package Main.OlympianManager;


public class OlympianManager {

    public Olympian[] olympians = new Olympian[15];
    public int count = 0;

    olympianArray = new String[][]{
        {"Steve Milanesi", "Male", "Age 22"}, {"Andrew Milanesi", "Male", "Age 24"}, {"Vanessa Milanesi", "Female", "Age 21"},
        {"Gary Milanesi", "Male", "Age 61"}, {"Mary Milanesi", "Female", "Age 55"}, {"Jeremy Milanesi", "Male", "Age 32"},
        {"Armand Milanesi", "Male", "Age 45"}, {"Chloe Milanesi", "Female", "Age 12"}, {"Ellen Milanesi", "Female", "Age 40"},
        {"Anothony Milanesi", "Male", "Age 35"}, {"Rob Milanesi", "Male", "Age 36"}, {"Michael Milanesi", "Male", "Age 32"},
        {"Nicole Milanesi", "Female", "Age 29"}, {"Kevin Milanesi", "Male", "Age 28"}, {"Christopher Milanesi", "Male", "Age 18"},
    }

    private void addOlympian(String name, Sex sex, int age){
        Olympain temp= new Olympian();
        temp.setName(name);
        temp.setSex(sex);
        temp.setAge(age);
        olympains[count] = temp;
        count ++;
    }

    public Olympian[] getOlympians()
    {
        return olympians;
    }
}
