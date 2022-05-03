package sg.edu.np.mad.s10222425_practical_2;

public class User {
    String name;
    String description;
    int id;
    boolean followed;

    public User(){}
    public User(String n, String desc, int num){
        name = n;
        description = desc;
        id = num;
        followed = false;
    }
}