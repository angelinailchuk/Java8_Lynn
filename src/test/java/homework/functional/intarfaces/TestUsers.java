package homework.functional.intarfaces;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestUsers extends FiltrationHelper {

    @Test
    public void checkFiltrationBySex() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getSex();
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 8);
    }

    @Test
    public void checkFiltrationByAge() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getAge() > 40;
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 5);
    }

    @Test
    public void checkFiltrationByWeight() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getWeight() > 70;
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 8);
    }

    @Test
    public void checkFiltrationByName() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getName().equals("Vikki");
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 1);
    }

    @Test
    public void checkFiltrationBySpeciality() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getSpeciality().equals("Musician");
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 1);
    }

    @Test
    public void checkFiltrationByAgeAndWeight() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getAge() > 25 && user.getWeight() > 80;
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 3);
    }

    @Test
    public void checkFiltrationByAgeAndSpeciality() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getAge() > 40 && !user.getSpeciality().equals("Soldier");
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 4);
    }

    @Test
    public void checkFiltrationByWeightAndSexAndSpeciality() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getWeight() < 70 && !user.getSex() && !user.getSpeciality().equals("Model");
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 4);
    }

    @Test
    public void checkFiltrationBySexAndWeight() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return user.getSex() && user.getWeight() > 70;
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 7);
    }

    @Test
    public void checkFiltrationBySexAndSpeciality() {
        List<User> userList = TestUsersProvider.createTestUsers();
        List<User> usersThatMatchConditions = FiltrateUsersByConditions(userList, new FilterUsers() {
            @Override
            public boolean checkCondition(User user) {
                return !user.getSex() && user.getSpeciality().equals("Scientist") || user.getSpeciality().equals("Psychiatrist");
            }
        });
        Assert.assertTrue(usersThatMatchConditions.size() > 0);
        Assert.assertEquals(usersThatMatchConditions.size(), 2);
    }
}
