package es.ulpgc.dayron.recycler.Advice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import es.ulpgc.dayron.recycler.R;
import es.ulpgc.dayron.recycler.data.AdviceItem;

public class AdviceActivity
        extends AppCompatActivity implements AdviceContract.View {

    public static String TAG = AdviceActivity.class.getSimpleName();

    private AdviceContract.Presenter presenter;

    private AdviceAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        listAdapter = new AdviceAdapter(new View.OnClickListener() { // TODO: Hacer el clicklistener

            @Override
            public void onClick(View view) {

            }
        });
        RecyclerView recyclerView = findViewById(R.id.adviceList);
        recyclerView.setAdapter(listAdapter);
        // do the setup
        AdviceScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(AdviceContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(AdviceViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        listAdapter.setItems(viewModel.items); //Pone los items en las celdas del Recycler

    }
}
