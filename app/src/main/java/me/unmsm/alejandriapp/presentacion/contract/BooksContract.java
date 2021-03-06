package me.unmsm.alejandriapp.presentacion.contract;

import java.util.List;

import me.unmsm.alejandriapp.core.BasePresenter;
import me.unmsm.alejandriapp.core.BaseView;
import me.unmsm.alejandriapp.data.entity.BooksEntity;


public interface BooksContract {
    interface View extends BaseView<Presenter> {
        void loadBookData(List<BooksEntity> list);
    }
    interface Presenter extends BasePresenter {

    }
}
