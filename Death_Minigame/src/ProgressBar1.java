

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class ProgressBar1 {
  public static void main(String[] args) {
    final Timer  timer1;
    final Timer  timer2;
    final JProgressBar progressBar = new JProgressBar();
    final JButton button = new JButton();
    final JLabel prolbl = new JLabel();
    
    JFrame f = new JFrame();
    f.setLayout(new FlowLayout());
    f.add(progressBar);
    f.add(button);
    f.add(prolbl);
    
    ActionListener updateProBar = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        int val = progressBar.getValue();
        if (val >= 100) {
        //  timer1.stop();
          prolbl.setText("¶¯!");
          return;
        }
        progressBar.setValue(++val);
      }
    };
    timer1 = new Timer(50, updateProBar);
    timer2 = new Timer(1000, event	-> {
    		if(timer1.isRunning())	{
    			timer1.start();
    			for(int i=1; i<=3; i++)	{
    				prolbl.setText("i");
    			}
    	}
    });
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    
    
    
    /*
     *     button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (timer1.isRunning()) {
          timer1.stop();
          prolbl.setText("3");
        } else if (prolbl.getText() != "¶¯!") {
          timer1.start();
          prolbl.setText("2");
        }
        else if (prolbl.getText() != "¶¯!") {
            timer1.start();
            prolbl.setText("1");
          }
      }
    });
    
     * 
    SwingUtilities.invokeLater(()->{
        JLabel label = new JLabel("One");
        JButton button1 = new JButton("Ok");
        button1.addActionListener(e -> {
            String oldText = label.getText();
            label.setText("Changed");
            Timer timer1 = new Timer(2000, event -> {
                label.setText(oldText);
            });
            timer1.setRepeats(false);
            timer1.start();
        });
        f.add(label);
        f.add(button1);
        f.pack();
        f.setVisible(true);
    });
     */
    
    
  }
}