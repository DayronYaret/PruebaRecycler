package es.ulpgc.dayron.recycler.data;

import android.content.Context;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private static Repositorio INSTANCE;
    private Context context;
    private List<AdviceItem> advices;

    public static Repositorio getInstance(Context context) {
        if(INSTANCE == null){
            INSTANCE = new Repositorio(context);
        }

        return INSTANCE;
    }
    private Repositorio(Context context){
        this.context=context;
        advices = new ArrayList<>();
        advices.add(new AdviceItem(1, "Teoria de prueba", "Esto es una prueba toda loca"));
        advices.add(new AdviceItem(1, "Teoria de prueba2", "Esto es una prueba toda loca loco"));
    }
    public void insertAdvice(AdviceItem advice) {
        advices.add(advice);
    }

    public List<AdviceItem>loadAdvice() {
        return advices;
    }
}
