package org.openjfx.view;

import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import org.openjfx.model.YMCategory;

import javax.xml.soap.Text;


public class CategoryCell extends ListCell<YMCategory> {

    public YMCategory category;
    @Override
    protected void updateItem(YMCategory item, boolean empty) {
        super.updateItem(item, empty);
        TextField textField = new TextField(item.getCategoryName());
        setGraphic(textField);
    }

    public void setCategory(YMCategory category) {
        this.category = category;
    }
}
