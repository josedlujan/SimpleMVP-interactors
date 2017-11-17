package mvpinteractors.ejemplo.com.examplemvpinteractors.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import mvpinteractors.ejemplo.com.examplemvpinteractors.R;
import mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityPresenter;
import mvpinteractors.ejemplo.com.examplemvpinteractors.presenters.MainActivityPresenterImpl;

public class MainActivityView extends AppCompatActivity implements mvpinteractors.ejemplo.com.examplemvpinteractors.interfaces.MainActivityView {
    TextView textView;
    EditText editText;
    private MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        editText = (EditText) findViewById(R.id.edittext);
        presenter = new MainActivityPresenterImpl(this);

    }

    public void sendData(View view){
        presenter.addNameP(editText.getText().toString());
    }


    @Override
    public void showResult(String s) {
        textView.setText(s);
    }
}
