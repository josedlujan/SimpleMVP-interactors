package mvpinteractors.ejemplo.com.examplemvpinteractors.interactors;

import mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityInteractor;
import mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityPresenter;
import mvpinteractors.ejemplo.com.examplemvpinteractors.presenters.MainActivityPresenterImpl;

/**
 * Created by jose on 16/11/17.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {
    private MainActivityPresenter presenter;
    private String data;

    public MainActivityInteractorImpl(MainActivityPresenterImpl mainActivityPresenter) {
            this.presenter = mainActivityPresenter;
    }

    @Override
    public void addName(String s) {
        data = s + "Agregar josé";
        presenter.showResultP(data);
    }
}
