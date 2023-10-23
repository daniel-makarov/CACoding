package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData users) {
        List<String> users_list = users.getUsers();
        ClearState clearState = clearViewModel.getState();
        clearState.setUsers(users_list);
        clearViewModel.firePropertyChanged();
    }
}
