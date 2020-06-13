import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {

    List<String> allUsers;

    @Test
    public void MultipleConditionTest() {
        assertFalse(SILab2.function(new User(null,null,"mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User(null,"mitko123","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("mitko","mitko123","mitkoMitkovski@yahoo.com"),allUsers));
        assertTrue(SILab2.function(new User("Mitko","MileZastita123@","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","Milezastita123","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","Milezastitabrojka","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","Milezastitabroj@","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","milezastitabroj@","mitkoMitkovski@yahoo.com"),allUsers));;
    }
    @Test
    public void EveryPathTest()
    {
        assertTrue(SILab2.function(new User("mitko","mileZastita123!","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User(null,null,"mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User(null,"mileZastita123!","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("mitko","mileZastita1","mitkoMitkovski@yahoo.com"),allUsers));
    }
}