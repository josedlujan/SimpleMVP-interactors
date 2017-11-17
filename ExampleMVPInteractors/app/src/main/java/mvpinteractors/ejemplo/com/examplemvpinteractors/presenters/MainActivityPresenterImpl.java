package mvpinteractors.ejemplo.com.examplemvpinteractors.presenters;

import android.view.View;

import mvpinteractors.ejemplo.com.examplemvpinteractors.interactors.MainActivityInteractorImpl;
import mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityInteractor;
import mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityPresenter;
import mvpinteractors.ejemplo.com.examplemvpinteractors.views.MainActivityView;

/**
 * Created by jose on 16/11/17.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter{
    private mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityView view;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityView view) {
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResultP(String s) {
        if(view!= null){
            view.showResult(s);
        }
    }

    @Override
    public void addNameP(String s) {
        if(view!= null){
            interactor.addName(s);
        }
    }
}
