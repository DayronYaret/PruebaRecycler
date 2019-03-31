package es.ulpgc.dayron.recycler.AdviceDetail;

import java.lang.ref.WeakReference;

interface AdviceDetailContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(AdviceDetailViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();
    }

    interface Model {
        String fetchData();
    }

    interface Router {

        AdviceDetailState getDataFromPreviousScreen();
    }
}
