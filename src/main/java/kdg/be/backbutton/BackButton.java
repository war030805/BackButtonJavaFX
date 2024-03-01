package kdg.be.backbutton;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.Stack;

//made by Warre Wilms everyone can use it if they like.
public class BackButton extends Button {
    private static Stack<ViewWithModel> paneStack;
    private static Pane currentView;

    public BackButton(String s) {
        super(s);
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ViewWithModel viewWithModel=paneStack.pop();
                Pane view=viewWithModel.getPane();
                currentView.getScene().setRoot(view);
            }
        });
    }

    static class ViewWithModel {
        private final Pane pane;
        private final Object presenter;

        public ViewWithModel(Pane pane, Object presenter) {
            this.pane = pane;
            this.presenter = presenter;
        }

        public Pane getPane() {
            return pane;
        }
    }
    public static void addToToBack(Pane lastView, Object presenter, Pane nextView) {
        if (paneStack==null) {
            paneStack=new Stack<>();
        }
        paneStack.add(new ViewWithModel(lastView,presenter));
        currentView=nextView;
    }

}

