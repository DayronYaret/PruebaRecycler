package es.ulpgc.dayron.recycler.Advice;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.ulpgc.dayron.recycler.app.AdviceMediator;
import es.ulpgc.dayron.recycler.data.Repositorio;

public class AdviceScreen {

    public static void configure(AdviceContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AdviceMediator mediator = (AdviceMediator) context.get().getApplication();
        AdviceState state = mediator.getAdviceState();

        Repositorio repositorio = Repositorio.getInstance(context.get());

        AdviceContract.Router router = new AdviceRouter(mediator);
        AdviceContract.Presenter presenter = new AdvicePresenter(state);
        AdviceContract.Model model = new AdviceModel(repositorio);
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
