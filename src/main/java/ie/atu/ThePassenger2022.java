package ie.atu;

public class ThePassenger2022 {

    private String usr_title;
    private String usr_name;
    private String usr_id;
    private long usr_phone_num;
    private int usr_age;

    public ThePassenger2022(String usr_title, String usr_name, String usr_id, long usr_phone_num, int usr_age)
    {
        this.usr_title = usr_title;
        this.usr_name = usr_name;
        this.usr_id = usr_id;
        this.usr_phone_num = usr_phone_num;
        this.usr_age = usr_age;
    }

    public String getUsr_title() {
        return usr_title;
    }
    public String getUsr_name() {
        return usr_name;
    }
    public String getUsr_id() {
        return usr_id;
    }
    public long getUsr_phone_num() {
        return usr_phone_num;
    }
    public int getUsr_age() {
        return usr_age;
    }


    public void setUsr_title(String usr_title) {
        this.usr_title = usr_title;
    }
    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }
    public void setUsr_id(String usr_id) {
        this.usr_id = usr_id;
    }
    public void setUsr_phone_num(long usr_phone_num) {
        this.usr_phone_num = usr_phone_num;
    }
    public void setUsr_age(int usr_age) {
        this.usr_age = usr_age;
    }

    @Override
    public String toString() {
        return "ThePassenger2022{" +
                "usr_title='" + usr_title + '\'' +
                ", usr_name='" + usr_name + '\'' +
                ", usr_id='" + usr_id + '\'' +
                ", usr_phone_num=" + usr_phone_num +
                ", usr_age=" + usr_age +
                '}';
    }
}
