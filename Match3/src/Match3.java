
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Match3 extends JFrame {

    String title;
   public int numPieces = 7;  // количество типов фишек  
   public int gameScore=0;  //хранит очки игрока
    
public Match3()
        {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 100, 1024, 712);
        title="Match 3";
        setTitle(title);
        setVisible(true);
        
       JPanel panel = new JPanel(new GridLayout(8,8));
        setContentPane(panel);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel grid = new JPanel();
                grid.setPreferredSize(new Dimension(100, 100)); //размерность сетки
                grid.setBackground(Color.WHITE);
                GridBagConstraints constraints = new GridBagConstraints();  //ограничения
                constraints.gridx = i;
                constraints.gridy = j;
                constraints.fill = GridBagConstraints.NONE;
                panel.add(grid, constraints);
                LineBorder border = new LineBorder(Color.BLACK, 1);
                grid.setBorder(border);
            }
        }
        pack();

        // public int getHgap(); //зазоры между элементами
        //public int getVgap();
        

        }

   
    public static void main(String[] args) {
         new Match3();
    }
    
}
