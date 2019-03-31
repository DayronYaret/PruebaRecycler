package es.ulpgc.dayron.recycler.app;

import android.app.Application;

import es.ulpgc.dayron.recycler.Advice.AdviceState;
import es.ulpgc.dayron.recycler.AdviceDetail.AdviceDetailState;
import es.ulpgc.dayron.recycler.data.AdviceItem;

public class AdviceMediator extends Application {
private AdviceState adviceState = new AdviceState();
private AdviceDetailState adviceDetailState = new AdviceDetailState();

private AdviceItem advice;

public AdviceState getAdviceState(){
    return adviceState;
}
public AdviceDetailState getAdviceDetailState(){
    return adviceDetailState;
}
public AdviceItem getAdvice(){
    AdviceItem item = advice;
    return item;
}
public void setAdvice(AdviceItem item){
    advice=item;

}

    public void setAdviceState(AdviceItem item) {
    this.advice=item;
}
}
