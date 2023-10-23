package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {

    private ClearState state = new ClearState();

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearViewModel() {super("clear");}

    public void setState(ClearState state) {this.state = state;}

    @Override
    public void firePropertyChanged() {support.firePropertyChange("clear", null, this.state);}

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {return state;}
}
