import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class DataTypeLimitsGUI {
    public static void main(String[] args) {
        // Prompt the user to enter the data type
        String dataType = JOptionPane.showInputDialog(null, "<html><center>Enter the data type you need (byte, int, float, double, char, long, short):</center></html>");

        // Create a frame (window)
        JFrame frame = new JFrame("Data Type Limits");

        // Create a text area to display the data type limits
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // Make the text area read-only
        Font font = textArea.getFont();
        textArea.setFont(new Font(font.getName(), Font.BOLD, font.getSize()));
        textArea.setBorder(new EmptyBorder(10, 20, 20, 20)); // Add margins
        textArea.setBackground(Color.PINK); // Set background color

        // Append the data type limits to the text area based on user input
        switch (dataType.toLowerCase()) {
            case "byte":
                textArea.append("Maximum value of byte: " + Byte.MAX_VALUE + "\n");
                textArea.append("Minimum value of byte: " + Byte.MIN_VALUE + "\n\n");
                break;
            case "int":
                textArea.append("Maximum value of int: " + Integer.MAX_VALUE + "\n");
                textArea.append("Minimum value of int: " + Integer.MIN_VALUE + "\n\n");
                break;
            case "float":
                textArea.append("Maximum value of float: " + Float.MAX_VALUE + "\n");
                textArea.append("Minimum value of float: " + Float.MIN_VALUE + "\n\n");
                break;
            case "double":
                textArea.append("Maximum value of double: " + Double.MAX_VALUE + "\n");
                textArea.append("Minimum value of double: " + Double.MIN_VALUE + "\n\n");
                break;
            case "char":
                textArea.append("Maximum value of char: " + (int) Character.MAX_VALUE + "\n");
                textArea.append("Minimum value of char: " + (int) Character.MIN_VALUE + "\n\n");
                break;
            case "long":
                textArea.append("Maximum value of long: " + Long.MAX_VALUE + "\n");
                textArea.append("Minimum value of long: " + Long.MIN_VALUE + "\n\n");
                break;
            case "short":
                textArea.append("Maximum value of short: " + Short.MAX_VALUE + "\n");
                textArea.append("Minimum value of short: " + Short.MIN_VALUE + "\n\n");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid data type entered. Please enter a valid data type.");
                return; // Exit the program if the user enters an invalid data type
        }

        // Add the text area to the frame
        frame.add(new JScrollPane(textArea));

        // Set the size of the frame
        frame.setSize(400, 300);

        // Center the frame on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = frame.getSize().width;
        int frameHeight = frame.getSize().height;
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        frame.setLocation(x, y);

        // Set the operation to close the window when the close button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
