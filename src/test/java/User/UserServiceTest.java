package User;
import service.UserService;
import org.junit.Test;
import org.junit.Assert;

public class UserServiceTest {

    @Test
    public void IsUserExistWhenUserNoExistTest(){
        String [] array = {"Marek", "Tomek", "Ziomek"};
        UserService User = new UserService(array);
        final boolean result = User.isUserExist("Marek");
        Assert.assertTrue(result);
    }
    @Test
    public void IsUserExistWhenUserExistTest(){
        String [] array = {"Marek", "Tomek", "Worek"};
        UserService User = new UserService(array);
        final boolean result = User.isUserExist("Andrzej");
        Assert.assertFalse(result);

    }
    @Test
    public void getUserCountTestWhenSomeUsers() {
        String[] array = {"Marek", "Tomek", "Piątek"};
        UserService User = new UserService(array);
        final int result = User.getUsersCount();
        Assert.assertEquals(3, result);
    }
    @Test
    public void getUserCountWhenOneUser(){
        String [] array ={"Marek"};
        UserService User = new UserService(array);
        final int result=User.getUsersCount();
        Assert.assertEquals(1,result);
    }
    @Test
    public void getUserCountWhenNoUsers(){
        String [] array =new String[0];
        UserService User = new UserService(array);
        final int result = User.getUsersCount();
        Assert.assertEquals(0,result);
    }
    @Test
    public void getUserCountRepeatsByLoginWhenFewRepeats(){
        String[] array={"Marek", "Warek","Andrzej","Andrzej2","Andrzej","Andrzej"};
        UserService User=new UserService(array);
        final int result = User.getCountRepeatsByLogin("Andrzej");
        Assert.assertEquals(3,result);
    }
    @Test
    public void getUserCountRepeatsByLoginWhenOneRepeatsAndSimilarText(){
        String [] array={"Marek", "Darek", "Mare","arek"};
        UserService User = new UserService(array);
        final int result = User.getCountRepeatsByLogin("Marek");
        Assert.assertEquals(1,result);
    }
    @Test
    public void getUserRepeatsByLoginWhenZeroRepeats() {
        String[] array = {"Marek, Andrzej"};
        UserService user = new UserService(array);
        final int result = user.getCountRepeatsByLogin("Tarek");
        Assert.assertEquals(0, result);
    }


}


