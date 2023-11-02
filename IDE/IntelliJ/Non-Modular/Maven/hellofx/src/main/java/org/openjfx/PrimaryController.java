package org.openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import org.openjfx.model.YMCategory;
import org.openjfx.model.YMProject;
import org.openjfx.model.YMProjectTestBase;
import org.openjfx.model.YMProjectTestBiz1;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {


    @FXML
    public ListView<YMCategory> CategoryListView;

    @FXML
    public ListView<YMProject> ProjectListView;
    @FXML
    public ListView<YMProjectTestBase> TestListView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        java.util.List<YMCategory> List = getYmCategories();
        CategoryListView.setItems(FXCollections.observableList(List));
        CategoryListView.setCellFactory(param -> new ListCell<YMCategory>(){
            @Override
            protected void updateItem(YMCategory item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getCategoryName());
                }

                setOnMouseClicked(event -> {
                    if (event.getClickCount() == 1) {
                        assert item != null;
                        System.out.println("点击了: " + item.getCategoryName());
                        List<YMProject> Projects = item.getProjects();
                        ObservableList<YMProject> newItems = FXCollections.observableArrayList(Projects);
                        ProjectListView.setItems(newItems);
                        TestListView.setItems(null);
                    }
                });
            }
        });
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
                        List<YMProjectTestBase> ProjectTests = item.getTests();
                        ObservableList<YMProjectTestBase> newItems = FXCollections.observableArrayList(ProjectTests);
                        TestListView.setItems(newItems);
                    }
                });
            }
        });

        TestListView.setCellFactory(param -> new ListCell<YMProjectTestBase>(){
            @Override
            protected void updateItem(YMProjectTestBase item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getTestName());
                }

                setOnMouseClicked(event -> {
                    if (event.getClickCount() == 1) {
                        assert item != null;
                        System.out.println("点击了: " + item.getTestName());
                    }
                });
            }
        });


    }

    private static List<YMCategory> getYmCategories() {
        YMCategory category = new YMCategory("YMCategory11111");
        YMProjectTestBiz1 testBiz = new YMProjectTestBiz1("test11111111111");
        YMProjectTestBiz1 testBiz1 = new YMProjectTestBiz1("test11111112222");
        YMProject project = new YMProject("project11111");
        project.addTest(testBiz);
        project.addTest(testBiz1);
        YMProject project2 = new YMProject("project11111");
        YMProjectTestBiz1 testBiz3 = new YMProjectTestBiz1("test33333");
        YMProjectTestBiz1 testBiz4 = new YMProjectTestBiz1("test44444");
        project2.addTest(testBiz3);
        project2.addTest(testBiz4);
        category.addProject(project);
        category.addProject(project2);

        YMCategory category1 = new YMCategory("YMCategory22222");
        YMCategory category2 = new YMCategory("YMCategory33333");
        YMCategory category3 = new YMCategory("YMCategory44444");
        YMCategory category4 = new YMCategory("YMCategory55555");
        YMCategory category5 = new YMCategory("YMCategory66666");
        List<YMCategory> List = new ArrayList<>();
        List.add(category);
        List.add(category1);
        List.add(category2);
        List.add(category3);
        List.add(category4);
        List.add(category5);
        return List;
    }
}
