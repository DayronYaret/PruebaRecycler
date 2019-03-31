package es.ulpgc.dayron.recycler.AdviceDetail;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.dayron.recycler.app.AdviceMediator;
import es.ulpgc.dayron.recycler.data.AdviceItem;

public class AdviceDetailRouter implements AdviceDetailContract.Router {

    public static String TAG = AdviceDetailRouter.class.getSimpleName();

    private AdviceMediator mediator;

    public AdviceDetailRouter(AdviceMediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public AdviceItem getDataFromPreviousScreen() {
        AdviceItem item = mediator.getAdvice();
        return item;
    }
}
