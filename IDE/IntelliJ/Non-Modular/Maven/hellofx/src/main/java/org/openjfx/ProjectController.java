package org.openjfx;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import org.openjfx.model.YMCategory;
import org.openjfx.model.YMProject;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ProjectController implements Initializable {

    public List<YMProject> data;


    @FXML
    public ListView<YMProject> ProjectListView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ProjectListView.setItems(FXCollections.observableList(data));
        ProjectListView.setCellFactory(param -> new ListCell<YMProject>(){
            @Override
            protected void updateItem(YMProject item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getProjectName());
                }
                
                setOnMouseClicked(event -> {
                    if (event.getClickCount() == 1) {
                        assert item != null;
                        System.out.println("点击了: " + item.getProjectName());
                    }
                });
            }
        });
    }
}
