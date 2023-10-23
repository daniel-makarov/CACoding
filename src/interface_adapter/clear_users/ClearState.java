package interface_adapter.clear_users;

// TODO Complete me

import java.util.List;

public class ClearState {

    private List<String> users = null;

    public ClearState(ClearState copy){this.users = copy.users;}

    public ClearState(){}

    public List<String> get_users(){return users;}

    public void setUsers(List<String> users) {this.users = users;}

    public List<String> getUsers() {return users;}
}
