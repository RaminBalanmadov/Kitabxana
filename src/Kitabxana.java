


import com.kitabxana.frame.StartPage;

public class Kitabxana {

    public static void main(String[] args) {

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    
    }
    
}
