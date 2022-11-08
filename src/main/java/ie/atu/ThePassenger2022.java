package ie.atu;

public class ThePassenger2022 {

    String usr_title;
    String usr_name;
    String usr_id;
    int usr_phone_num;
    int usr_age;

    public ThePassenger2022()
    {
        //  default value for passenger class
        usr_title = "Mr";
        usr_name = "John Doe";
        usr_id = "abc123def456ghi";
        usr_phone_num = 1234567890;
        usr_age = 30;
    }

    void GetName(String name){
        this.usr_name = name;
    }
    void GetTitle(String title){
        this.usr_title = title;
    }
    void GetID(String id){
        this.usr_id = id;
    }
    void GetPhoneNum(int num){
        this.usr_phone_num = num;
    }
    void GetAge(int age){
        this.usr_age = age;
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
