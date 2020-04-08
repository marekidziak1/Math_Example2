package service;

public class UserService {
    String[] array;

    public UserService(String[] array) {
        this.array = array;
    }

    private void setArray(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public boolean isUserExist(String login) {
        for (String user : array) {
            if (user.equals(login)) {
                return true;
            }
        }
        return false;
    }

    public int getUsersCount() {
        return array.length;
    }

    public int getCountRepeatsByLogin(String login) {
        int countRepeats=0;
        for (String user:array){
            if(user.equals(login)){
                countRepeats++;
            }
        }
        return countRepeats;
    }
}
