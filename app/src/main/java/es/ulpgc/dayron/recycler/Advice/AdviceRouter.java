package es.ulpgc.dayron.recycler.Advice;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.dayron.recycler.AdviceDetail.AdviceDetailActivity;
import es.ulpgc.dayron.recycler.app.AdviceMediator;
import es.ulpgc.dayron.recycler.data.AdviceItem;

public class AdviceRouter implements AdviceContract.Router {

    public static String TAG = AdviceRouter.class.getSimpleName();

    private AdviceMediator mediator;

    public AdviceRouter(AdviceMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToAdviceDetailScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, AdviceDetailActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToAdviceDetailScreen(AdviceItem item) {
        mediator.setAdviceState(item);
    }

    @Override
    public AdviceState getDataFromPreviousScreen() {
        AdviceState state = mediator.getAdviceState();
        return state;
    }
}
