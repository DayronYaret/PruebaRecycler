package es.ulpgc.dayron.recycler.Advice;

import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import es.ulpgc.dayron.recycler.data.AdviceItem;
import es.ulpgc.dayron.recycler.data.Repositorio;

public class AdviceModel implements AdviceContract.Model {

    public static String TAG = AdviceModel.class.getSimpleName();

    private Repositorio repositorio;
    public AdviceModel(Repositorio repositorio) {
    this.repositorio = repositorio;
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");


        return null;
    }

    @Override
    public List<AdviceItem> getItems() {
        return repositorio.loadAdvice();
    }
}
