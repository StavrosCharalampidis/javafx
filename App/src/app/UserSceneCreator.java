package app;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

public class UserSceneCreator extends SceneCreator implements EventHandler<MouseEvent> {
    FlowPane rootFlowPane;
    Button CancelTicketBtn, NewTicketBtn;
    User user = new User();
    ArrayList<String> TicketList = new ArrayList<String>();
    
    public UserSceneCreator(double width, double height) {
        super(width, height);
        rootFlowPane = new FlowPane();
        
        CancelTicketBtn = new Button("Cancel Ticket");
        CancelTicketBtn.setOnMouseClicked(this);
        rootFlowPane.getChildren().add(CancelTicketBtn);
        
        NewTicketBtn = new Button("New Ticket");
        NewTicketBtn.setOnMouseClicked(this);
        rootFlowPane.getChildren().add(NewTicketBtn);
    }
    
    @Override
    Scene createScene() {
        return new Scene(rootFlowPane, width, height);
    }
    
    @Override
    public void handle(MouseEvent event) {
        if (event.getSource() == NewTicketBtn) {
            user.NewTicket();
        }
        
        if (event.getSource() == CancelTicketBtn) {
            user.CancelTicket();
        }
        
    }
}
