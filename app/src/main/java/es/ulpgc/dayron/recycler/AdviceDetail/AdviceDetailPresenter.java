package es.ulpgc.dayron.recycler.AdviceDetail;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.dayron.recycler.data.AdviceItem;

public class AdviceDetailPresenter implements AdviceDetailContract.Presenter {

    public static String TAG = AdviceDetailPresenter.class.getSimpleName();

    private WeakReference<AdviceDetailContract.View> view;
    private AdviceDetailViewModel viewModel;
    private AdviceDetailContract.Model model;
    private AdviceDetailContract.Router router;

    public AdviceDetailPresenter(AdviceDetailState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<AdviceDetailContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(AdviceDetailContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(AdviceDetailContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");
        AdviceItem item = router.getDataFromPreviousScreen();
        if(item !=null){
            viewModel.item = item;
        }
        if(viewModel.item.descripcion !=null){
            view.get().displayData(viewModel);

        }
        // update the view

    }


}
