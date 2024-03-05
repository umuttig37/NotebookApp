package org.example.Controller;
import org.example.Model.Note;
import org.example.Model.Notebook;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NoteController {
    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    private Notebook notebook;

    public NoteController() {
        notebook = new Notebook();
    }

    @FXML
    private void addNote() {
        String title = titleField.getText();
        String content = contentArea.getText();

        if (!title.isEmpty() && !content.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);

            // Clear fields after adding note
            titleField.clear();
            contentArea.clear();

            // Display notes (you can implement this)
            displayNotes();
        }
    }

    // Implement method to display notes (you can use ListView or other UI elements)
    private void displayNotes() {
        // Implementation to display notes in UI
    }
}

