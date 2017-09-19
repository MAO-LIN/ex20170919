import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button btnExit=new Button("Exit");
    private Button btnAdd=new Button("Add");
    private Label lab=new Label("0");
    private int n=0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,800,800);
        this.setLayout(null);
        this.setResizable(false);
        btnAdd.setBounds(200,200,300,100);
        btnExit.setBounds(200,300,300,100);
        lab.setBounds(200,400,300,100);
        btnAdd.setBackground(new Color(86, 93,255));
        this.add(btnExit);
        this.add(btnAdd);
        this.add(lab);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(Integer.toString(n));
            }
        });
    }

}
