package es.ulpgc.dayron.recycler.AdviceDetail;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.ulpgc.dayron.recycler.app.AdviceMediator;

public class AdviceDetailScreen {

    public static void configure(AdviceDetailContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AdviceMediator mediator = (AdviceMediator) context.get().getApplication();
        AdviceDetailState state = mediator.getAdviceDetailState();

        AdviceDetailContract.Router router = new AdviceDetailRouter(mediator);
        AdviceDetailContract.Presenter presenter = new AdviceDetailPresenter(state);
        AdviceDetailContract.Model model = new AdviceDetailModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
