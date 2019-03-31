package es.ulpgc.dayron.recycler.Advice;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import es.ulpgc.dayron.recycler.data.AdviceItem;

interface AdviceContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(AdviceViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();
        void selectAdviceListData(AdviceItem item);
    }

    interface Model {
        String fetchData();
        List<AdviceItem> getItems();
    }

    interface Router {
        void navigateToAdviceDetailScreen();

        void passDataToAdviceDetailScreen(AdviceItem item);

        AdviceState getDataFromPreviousScreen();
    }
}
