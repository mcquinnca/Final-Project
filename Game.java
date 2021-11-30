
/**
@author Ayaan Ajmal, CalLind Gilson, Colin McQuinn
@version 11-30-21
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;



public class Game implements ActionListener {
   ArrayList<Question> questions = new ArrayList<Question>();
    JLabel jlabQuestion;
    JLabel jlabScore;
    JLabel jlabCategory;
    int scoreCount;
    JButton optionA;
    JButton optionB;
    JButton optionC;
    JButton optionD;
    JButton optionCont;
    int qNum = 0;
  /**
  This default constructor creates the game from scratch, using 4 questions
  */
  Game() {

    int questionNumbers[] = new int[4];
   
    Random r = new Random();
    
    

    // Generates 4 UNIQUE random numbers which will be the 4 questions used
    for (int i = 0; i < 4; i++) {
      boolean repeat = false;
      int randomNumber = r.nextInt(10) + 1; //Generates a random number
      //Loop to check the value is unique
      for (int b = 0; b < 4; b++) {
        if (randomNumber == questionNumbers[b]) {
          repeat = true;
          b = 4;
        }
      }
      //if the value was not unique it runs again
      if (repeat == true) {
        i--;
      }
      //if the value was unique it stores it in the array 
      else {
        questionNumbers[i] = randomNumber;
      }
    }

    //Pull the 4 questions based on the questionNumbers array
      for (int i = 0; i <4; i++){
      questions.add(new Question(questionNumbers[i]));
    }
    

    JFrame frame = new JFrame("Cincinnati Trivia"); 
    // Specify FlowLayout for the layout manager.
    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); 
   
    // Give the frame an initial size. 
    frame.setSize(600, 200);
    // Setting up buttons
    optionA = new JButton(questions.get(qNum).getAnswer1());
    optionA.setBackground(Color.RED);
    optionA.setForeground(Color.BLACK);
    optionB = new JButton(questions.get(qNum).getAnswer2());
    optionB.setBackground(Color.BLACK);
    optionB.setForeground(Color.RED);
    optionC = new JButton(questions.get(qNum).getAnswer3());
    optionC.setBackground(Color.RED);
    optionC.setForeground(Color.BLACK);
    optionD = new JButton(questions.get(qNum).getAnswer4());
    optionD.setBackground(Color.BLACK);
    optionD.setForeground(Color.RED);
    optionCont = new JButton("Continue");
    optionCont.setBackground(Color.BLACK);
    optionCont.setForeground(Color.WHITE);

    optionA.addActionListener(this);
    optionB.addActionListener(this);
    optionC.addActionListener(this);
    optionD.addActionListener(this);
    optionCont.addActionListener(this);

    // setting up labels
    scoreCount = 0;
    jlabCategory = new JLabel(questions.get(qNum).getQuestionType());
    jlabQuestion = new JLabel(questions.get(qNum).getQuestion()); 
    jlabQuestion.setFont(new Font("Helvetica Neue", Font.BOLD, 16));
    jlabScore = new JLabel("Score: "+ scoreCount);
    
    

    //adding all the functions to the frame

    frame.add(jlabCategory);
    frame.add(jlabQuestion);
    frame.add(optionA);
    frame.add(optionB);
    frame.add(optionC);
    frame.add(optionD);
    frame.add(jlabScore);
    frame.add(optionCont);
    

    // setting all the functions visible except the continue button

    frame.setVisible(true);
    optionCont.setVisible(false);
  }
 
  public void actionPerformed(ActionEvent ae) {
    //while(qNum<4){
      for(int qNum=0; qNum < 4; qNum++){
      if(ae.getActionCommand().equals(questions.get(qNum).getAnswer1())){
        if (questions.get(qNum).getAnswer1() == questions.get(qNum).getCorrectAnswer()){
          jlabCategory.setVisible(false);
          optionA.setVisible(false);
          optionB.setVisible(false);
          optionC.setVisible(false);
          optionD.setVisible(false);
          scoreCount += questions.get(qNum).getPoints();
          optionCont.setVisible(true);

          jlabQuestion.setText("That was the right answer! Points Earned: "+questions.get(qNum).getPoints());
          if(ae.getActionCommand().equals("Continue")){
            qNum +=1;
            jlabQuestion.setText(questions.get(qNum).getQuestion());
            jlabCategory.setText(questions.get(qNum).getQuestionType());
            optionA.setText(questions.get(qNum).getAnswer1());
            optionB.setText(questions.get(qNum).getAnswer2());
            optionC.setText(questions.get(qNum).getAnswer3());
            optionD.setText(questions.get(qNum).getAnswer4());
            jlabCategory.setVisible(true);
            optionA.setVisible(true);
            optionB.setVisible(true);
            optionC.setVisible(true);
            optionD.setVisible(true);
            optionCont.setVisible(false);


          }


        }  
      
      }
      else if(ae.getActionCommand().equals(questions.get(qNum).getAnswer2())){
        if (questions.get(qNum).getAnswer2() == questions.get(qNum).getCorrectAnswer()){
          jlabCategory.setVisible(false);
          optionA.setVisible(false);
          optionB.setVisible(false);
          optionC.setVisible(false);
          optionD.setVisible(false);
          scoreCount += questions.get(qNum).getPoints();
          optionCont.setVisible(true);

          jlabQuestion.setText("That was the right answer! Points Earned: "+questions.get(qNum).getPoints());
          if(ae.getActionCommand().equals("Continue")){
            qNum +=1;
            jlabQuestion.setText(questions.get(qNum).getQuestion());
            jlabCategory.setText(questions.get(qNum).getQuestionType());
            optionA.setText(questions.get(qNum).getAnswer1());
            optionB.setText(questions.get(qNum).getAnswer2());
            optionC.setText(questions.get(qNum).getAnswer3());
            optionD.setText(questions.get(qNum).getAnswer4());
            jlabCategory.setVisible(true);
            optionA.setVisible(true);
            optionB.setVisible(true);
            optionC.setVisible(true);
            optionD.setVisible(true);
            optionCont.setVisible(false);


          }


        }  
      
      }


      else if(ae.getActionCommand().equals(questions.get(qNum).getAnswer3())){
        if (questions.get(qNum).getAnswer3() == questions.get(qNum).getCorrectAnswer()){
          jlabCategory.setVisible(false);
          optionA.setVisible(false);
          optionB.setVisible(false);
          optionC.setVisible(false);
          optionD.setVisible(false);
          scoreCount += questions.get(qNum).getPoints();
          optionCont.setVisible(true);

          jlabQuestion.setText("That was the right answer! Points Earned: "+questions.get(qNum).getPoints());
          if(ae.getActionCommand().equals("Continue")){
            qNum +=1;
            jlabQuestion.setText(questions.get(qNum).getQuestion());
            jlabCategory.setText(questions.get(qNum).getQuestionType());
            optionA.setText(questions.get(qNum).getAnswer1());
            optionB.setText(questions.get(qNum).getAnswer2());
            optionC.setText(questions.get(qNum).getAnswer3());
            optionD.setText(questions.get(qNum).getAnswer4());
            jlabCategory.setVisible(true);
            optionA.setVisible(true);
            optionB.setVisible(true);
            optionC.setVisible(true);
            optionD.setVisible(true);
            optionCont.setVisible(false);


          }


        }  
      
      }

      else if(ae.getActionCommand().equals(questions.get(qNum).getAnswer4())){
        if (questions.get(qNum).getAnswer4() == questions.get(qNum).getCorrectAnswer()){
          jlabCategory.setVisible(false);
          optionA.setVisible(false);
          optionB.setVisible(false);
          optionC.setVisible(false);
          optionD.setVisible(false);
          scoreCount += questions.get(qNum).getPoints();
          optionCont.setVisible(true);

          jlabQuestion.setText("That was the right answer! Points Earned: "+questions.get(qNum).getPoints());
          if(ae.getActionCommand().equals("Continue")){
            qNum +=1;
            jlabQuestion.setText(questions.get(qNum).getQuestion());
            jlabCategory.setText(questions.get(qNum).getQuestionType());
            optionA.setText(questions.get(qNum).getAnswer1());
            optionB.setText(questions.get(qNum).getAnswer2());
            optionC.setText(questions.get(qNum).getAnswer3());
            optionD.setText(questions.get(qNum).getAnswer4());
            jlabCategory.setVisible(true);
            optionA.setVisible(true);
            optionB.setVisible(true);
            optionC.setVisible(true);
            optionD.setVisible(true);
            optionCont.setVisible(false);


          }


        }  
      
      }
      else {
        
        jlabCategory.setVisible(false);
        optionA.setVisible(false);
        optionB.setVisible(false);
        optionC.setVisible(false);
        optionD.setVisible(false);
        optionCont.setVisible(true);

        jlabQuestion.setText("That was the incorrect answer! Points Earned: 0 ");
        if(ae.getActionCommand().equals("Continue")){
          qNum +=1;
          jlabQuestion.setText(questions.get(qNum).getQuestion());
          jlabCategory.setText(questions.get(qNum).getQuestionType());
          optionA.setText(questions.get(qNum).getAnswer1());
          optionB.setText(questions.get(qNum).getAnswer2());
          optionC.setText(questions.get(qNum).getAnswer3());
          optionD.setText(questions.get(qNum).getAnswer4());
          jlabCategory.setVisible(true);
          optionA.setVisible(true);
          optionB.setVisible(true);
          optionC.setVisible(true);
          optionD.setVisible(true);


        }


      }  
    
    


    
    
    
    
    }

  }
  
}
