# A0121442X reused
###### ui\AutoCompleteTextField.java
``` java
package ui;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import application.Constants;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Side;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AutoCompleteTextField extends TextField {

    public final SortedSet<String> entries;
    private ContextMenu entriesPopup;

    public AutoCompleteTextField() {
	super();
	entries = new TreeSet<>();
	Collections.addAll(entries, Constants.AUTOCOMPLETE_ENTRIES);

	entriesPopup = new ContextMenu();
	entriesPopup.setAutoHide(true);

	textProperty().addListener(new ChangeListener<String>() {
	    @Override
	    public void changed(ObservableValue<? extends String> observableValue, String s, String s2) {
		if (getText().length() == 0) {
		    entriesPopup.hide();
		} else {
		    LinkedList<String> searchResult = new LinkedList<>();
		    if (!entries.contains(getText())) {
			searchResult.addAll(entries.subSet(getText(), getText() + Character.MAX_VALUE));
		    }

		    if (entries.size() > 0) {
			populatePopup(searchResult);
			if (!entriesPopup.isShowing()) {
			    entriesPopup.show(AutoCompleteTextField.this, Side.BOTTOM, 0, 0);
			}
		    } else {
			entriesPopup.hide();
		    }
		    if (searchResult.size() == 0) {
			entriesPopup.hide();
		    }
		}
	    }
	});
	/*
	 * focusedProperty().addListener(new ChangeListener<Boolean>() {
	 * 
	 * @Override public void changed(ObservableValue<? extends Boolean>
	 * observableValue, Boolean aBoolean, Boolean aBoolean2) {
	 * entriesPopup.hide(); } });
	 */
    }

    /**
     * Get the existing set of autocomplete entries.
     * 
     * @return The existing autocomplete entries.
     */
    public SortedSet<String> getEntries() {
	return entries;
    }

    /**
     * Populate the entry set with the given search results. Display is limited
     * to 10 entries, for performance.
     * 
     * @param searchResult
     *            The set of matching strings.
     */
    private void populatePopup(List<String> searchResult) {
	List<CustomMenuItem> menuItems = new LinkedList<>();
	int maxEntries = 10;
	int count = Math.min(searchResult.size(), maxEntries);
	for (int i = 0; i < count; i++) {
	    final String result = searchResult.get(i);
	    Label entryLabel = new Label(result);
	    CustomMenuItem item = new CustomMenuItem(entryLabel, true);
	    /*
	     * item.setOnAction(new EventHandler<ActionEvent>() {
	     * 
	     * @Override public void handle(ActionEvent actionEvent) {
	     * setText(result); entriesPopup.hide(); } });
	     */
	    menuItems.add(item);
	}
	entriesPopup.getItems().clear();
	entriesPopup.getItems().addAll(menuItems);

    }
}
```
