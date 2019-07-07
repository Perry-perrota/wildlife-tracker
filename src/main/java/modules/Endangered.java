package modules;

public class Endangered extends Animal {
    private int id;
    private String location;
    private String time;
    private String age;
    private String rangerName;
    private String healthStatus;

    public Endangered(String name, String location, String time, String age, String rangerName, String healthStatus) {
        super(name);
        this.location = location;
        this.time = time;
        this.age = age;
        this.rangerName = rangerName;
        this.healthStatus = healthStatus;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getAge() {
        return age;
    }

    public String getRangerName() {
        return rangerName;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
}