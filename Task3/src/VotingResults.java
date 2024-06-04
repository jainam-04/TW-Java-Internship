import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotingResults extends JFrame implements ActionListener {
    String vote;
    VotingResults(String vote){
        this.vote = vote;

        setLayout(null);
        setSize(700, 700);
//        setUndecorated(true);
        setLocation(400, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new VotingResults(null);
    }
}
