import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    // Frame for the application
    private Frame frame;

    // Components for the registration form
    private Label nameLabel;
    private TextField nameField;

    private Label emailLabel;
    private TextField emailField;

    private Label phoneLabel;
    private TextField phoneField;

    private Label addressLabel;
    private TextArea addressArea;

    private Label educationLabel;
    private TextArea educationArea;

    private Label experienceLabel;
    private TextArea experienceArea;

    private Button submitButton;

    public RegistrationForm() {
        // Initialize the frame
        frame = new Frame("Student Registration Form");
        frame.setSize(400, 500);
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        // Create components
        nameLabel = new Label("Name:");
        nameField = new TextField();

        emailLabel = new Label("Email:");
        emailField = new TextField();

        phoneLabel = new Label("Phone:");
        phoneField = new TextField();

        addressLabel = new Label("Address:");
        addressArea = new TextArea(3, 20);

        educationLabel = new Label("Education:");
        educationArea = new TextArea(3, 20);

        experienceLabel = new Label("Experience:");
        experienceArea = new TextArea(3, 20);

        submitButton = new Button("Submit");

        // Add action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle submission
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String address = addressArea.getText();
                String education = educationArea.getText();
                String experience = experienceArea.getText();

                // Display the registration details
                String registrationDetails = String.format(
                    "Name: %s\nEmail: %s\nPhone: %s\nAddress: %s\nEducation: %s\nExperience: %s",
                    name, email, phone, address, education, experience
                );

                // Show the details in a dialog box
                Dialog dialog = new Dialog(frame, "Registration Submitted", true);
                dialog.setLayout(new BorderLayout());
                dialog.add(new Label(registrationDetails), BorderLayout.CENTER);
                Button okButton = new Button("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose(); // Close dialog
                    }
                });
                dialog.add(okButton, BorderLayout.SOUTH);
                dialog.setSize(300, 200);
                dialog.setVisible(true);
            }
        });

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(addressLabel);
        frame.add(addressArea);
        frame.add(educationLabel);
        frame.add(educationArea);
        frame.add(experienceLabel);
        frame.add(experienceArea);
        frame.add(new Label()); // Empty cell
        frame.add(submitButton); // Submit button

        // Add window listener for closing the application
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose(); // Close the frame
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        new RegistrationForm();
    }
}
