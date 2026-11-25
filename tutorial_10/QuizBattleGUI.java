import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizBattleGUI extends JFrame implements ActionListener {
    JButton btn1, btn2;
    JLabel lblQuestion, lblResult;
    Questions currentQuestion;

    public QuizBattleGUI() {
        setTitle("Programming Quiz Battle");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblQuestion = new JLabel("Which keyword is used to create a class?");
        lblQuestion.setBounds(50, 30, 300, 25);
        add(lblQuestion);

        btn1 = new JButton("class");
        btn1.setBounds(50, 80, 120, 40);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("new");
        btn2.setBounds(200, 80, 120, 40);
        btn2.addActionListener(this);
        add(btn2);

        lblResult = new JLabel("");
        lblResult.setBounds(50, 150, 300, 25);
        add(lblResult);

        currentQuestion = new Questions(
            "Which keyword is used to create a class?",
            "class",
            "new",
            "class"
        );

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedBtn = (JButton) e.getSource();
        if (currentQuestion.isCorrect(clickedBtn.getText())) {
            lblResult.setText("✅ Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("❌ Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}
