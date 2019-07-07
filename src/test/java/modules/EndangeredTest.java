package modules;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredTest {


    @Test
    public void getLocation() {
        Endangered endangered=setupEndangered();
        assertEquals("zone1",endangered.getLocation());
    }

    @Test
    public void getTime() {
        Endangered endangered=setupEndangered();
        assertEquals("six",endangered.getTime());
    }

    @Test
    public void getAge() {
        Endangered endangered=setupEndangered();
        assertEquals("adult",endangered.getAge());
    }

    @Test
    public void getRangerName() {
        Endangered endangered=setupEndangered();
        assertEquals("steve",endangered.getRangerName());
    }

    @Test
    public void getHealthStatus() {
        Endangered endangered=setupEndangered();
        assertEquals("okay",endangered.getHealthStatus());
    }
    public Endangered setupEndangered(){
        Endangered endangered=new Endangered("lion","zone1","six","adult","steve","okay");
        return endangered;
    }
}