package use_case.clear_users;

// TODO Complete me
import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, final ClearOutputBoundary clearOutputBoundary){
        userDataAccessObject = userDataAccessInterface;
        clearPresenter = clearOutputBoundary;
    };

    @Override
    public void execute() {
        List<String> users = userDataAccessObject.get_users();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        clearPresenter.prepareSuccessView(clearOutputData);
    }

}
