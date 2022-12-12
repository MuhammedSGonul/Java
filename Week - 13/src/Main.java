import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        double sonuc;

        JTextField sayi1Input = new JTextField();
        JLabel sayi1Label = new JLabel();
        JTextField sayi2Input = new JTextField();
        JLabel sayi2Label = new JLabel();
        JTextArea sonucText = new JTextArea();
        JLabel sonucLabel = new JLabel();

        JButton toplamaButon =new JButton("Toplam");
        JButton cikartmaButon =new JButton("Cikartma");
        JButton carpmaButon =new JButton("Carpma");
        JButton bolmeButon =new JButton("Bolme");

        toplamaButon.setBounds(20,150,80, 30);
        cikartmaButon.setBounds(100,150,100, 30);
        carpmaButon.setBounds(200,150,80, 30);
        bolmeButon.setBounds(280,150,80, 30);

        sayi1Input.setBounds(130,50,200,30);
        sayi1Label.setText("1. Sayiyi giriniz: ");
        sayi1Label.setBounds(20,50,200,30);

        sayi2Input.setBounds(130,90,200,30);
        sayi2Label.setText("2. Sayiyi giriniz: ");
        sayi2Label.setBounds(20,90,200,30);

        sonucText.setBounds(130,200,200,30);
        sonucLabel.setText("Sonuc: ");
        sonucLabel.setBounds(20,200,200,30);

        f.add(toplamaButon);
        f.add(cikartmaButon);
        f.add(carpmaButon);
        f.add(bolmeButon);

        f.add(sayi1Input);
        f.add(sayi1Label);

        f.add(sayi2Input);
        f.add(sayi2Label);

        f.add(sonucText);
        f.add(sonucLabel);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);

        toplamaButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi1 = Double.parseDouble(sayi1Input.getText());
                double sayi2 = Double.parseDouble(sayi2Input.getText());

                double sonuc = sayi1 + sayi2;

                sonucText.setText(String.valueOf(sonuc));
            }
        });

        cikartmaButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi1 = Double.parseDouble(sayi1Input.getText());
                double sayi2 = Double.parseDouble(sayi2Input.getText());

                double sonuc = sayi1 - sayi2;

                sonucText.setText(String.valueOf(sonuc));
            }
        });

        carpmaButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi1 = Double.parseDouble(sayi1Input.getText());
                double sayi2 = Double.parseDouble(sayi2Input.getText());

                double sonuc = sayi1 * sayi2;

                sonucText.setText(String.valueOf(sonuc));
            }
        });

        bolmeButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi1 = Double.parseDouble(sayi1Input.getText());
                double sayi2 = Double.parseDouble(sayi2Input.getText());

                double sonuc = sayi1 / sayi2;

                sonucText.setText(String.valueOf(sonuc));
            }
        });


    }



}
