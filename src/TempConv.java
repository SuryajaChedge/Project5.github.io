import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConv {
    private JTextField txtTemp;
    private JButton celsiusToFahrenheitButton;
    private JButton fahrenheitToCelsiusButton;
    private JButton celsiusToKelvinButton;
    private JButton kelvinToCelsiusButton;
    private JButton fahrenheitToKelvinButton;
    private JButton kelvinToFahrenheitButton;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JTextField txt6;
    private JPanel Main;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("TempConv");
        frame.setContentPane(new TempConv().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TempConv() {

        celsiusToFahrenheitButton.addActionListener(e -> {
            double temp, cel_to_fah;
            temp= Integer.parseInt(txtTemp.getText());
            cel_to_fah = (temp*(9/5f)) + 32;
            txt1.setText(String.valueOf(cel_to_fah));
        });
        fahrenheitToCelsiusButton.addActionListener(e -> {
            double temp, fah_to_cel;
            temp= Integer.parseInt(txtTemp.getText());
            fah_to_cel = (temp-32)*(5/9f);
            txt2.setText(String.valueOf(fah_to_cel));
        });
        celsiusToKelvinButton.addActionListener(e -> {
            double temp, cel_to_kel;
            temp= Integer.parseInt(txtTemp.getText());
            cel_to_kel = temp + 273.15;
            txt3.setText(String.valueOf(cel_to_kel));
        });
        kelvinToCelsiusButton.addActionListener(e -> {
            double temp, kel_to_cel;
            temp= Integer.parseInt(txtTemp.getText());
            kel_to_cel = (temp-273.15)*(9/5f)+32;
            txt4.setText(String.valueOf(kel_to_cel));
        });
        fahrenheitToKelvinButton.addActionListener(e -> {
            double temp, fah_to_kel;
            temp= Integer.parseInt(txtTemp.getText());
            fah_to_kel = (5/9f)*temp + 459.67;
            txt5.setText(String.valueOf(fah_to_kel));
        });
        kelvinToFahrenheitButton.addActionListener(e -> {
            double temp, kel_to_fah;
            temp= Integer.parseInt(txtTemp.getText());
            kel_to_fah = temp - 273.15;
            txt6.setText(String.valueOf(kel_to_fah));
        });
    }
}
