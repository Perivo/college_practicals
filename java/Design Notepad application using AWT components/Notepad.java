import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad {
    // Frame for the application
    private Frame frame;
    private TextArea textArea;
    private MenuBar menuBar;
    private Menu fileMenu;
    private MenuItem newItem, openItem, saveItem, exitItem;

    public Notepad() {
        // Initialize the frame
        frame = new Frame("Simple Notepad");
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create text area
        textArea = new TextArea();
        frame.add(textArea, BorderLayout.CENTER);

        // Create menu bar
        menuBar = new MenuBar();
        fileMenu = new Menu("File");

        // Create menu items
        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");

        // Add action listeners to menu items
        newItem.addActionListener(e -> textArea.setText("")); // Clear text area
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());
        exitItem.addActionListener(e -> frame.dispose()); // Close the application

        // Add menu items to the file menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // Set the menu bar to the frame
        frame.setMenuBar(menuBar);

        // Add window listener for closing the application
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose(); // Close the frame
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }

    private void openFile() {
        // Open file dialog
        FileDialog fileDialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        // Get the selected file
        String fileName = fileDialog.getDirectory() + fileDialog.getFile();
        if (fileName != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                textArea.setText(""); // Clear existing text
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException e) {
                showError("Error opening file: " + e.getMessage());
            }
        }
    }

    private void saveFile() {
        // Save file dialog
        FileDialog fileDialog = new FileDialog(frame, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);

        // Get the selected file
        String fileName = fileDialog.getDirectory() + fileDialog.getFile();
        if (fileName != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                showError("Error saving file: " + e.getMessage());
            }
        }
    }

    private void showError(String message) {
        // Show error dialog
        Dialog dialog = new Dialog(frame, "Error", true);
        dialog.setLayout(new BorderLayout());
        dialog.add(new Label(message), BorderLayout.CENTER);
        Button okButton = new Button("OK");
        okButton.addActionListener(e -> dialog.dispose());
        dialog.add(okButton, BorderLayout.SOUTH);
        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        new Notepad();
    }
}
