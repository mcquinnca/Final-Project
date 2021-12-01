
/**
@author Ayaan Ajmal, CalLind Gilson, Colin McQuinn
@version 11-30-21
*/
//import java.util.ArrayList;
import java.io.*;

class Question {
  // ArrayList<String> Answers = new ArrayList<String>();
  String question;
  String answer1;
  String answer2;
  String answer3;
  String answer4;
  int correctAnswer;
  int points;
  String questionType;

  /**
   * This constructor method will construct a Qustion by reading the lines of the
   * text file which relate to the number given
   * 
   * @param aQuestionNumber the question number which you wish to create from the
   *                        text file
   */
    Question(int aQuestionNumber) {
    int qNumber = aQuestionNumber;

    try {
      FileReader file = new FileReader("Trivia.txt");
      BufferedReader reader = new BufferedReader(file);

      for (int i = 0; i < qNumber * 8 - 1; i++) {
        reader.readLine();
      }
      question = reader.readLine();
      answer1 = reader.readLine();
      answer2 = reader.readLine();
      answer3 = reader.readLine();
      answer4 = reader.readLine();
      correctAnswer = Integer.parseInt(reader.readLine());
      points = Integer.parseInt(reader.readLine());
      questionType = reader.readLine();
      reader.close();
    } catch (IOException e) {
      System.out.println("An error occurred: " + e);
    }
  }

  /**
   * This accessor method gives you the question
   * 
   * @return the text which is the question (string)
   */
  public String getQuestion() {
    return question;
  }

  /**
   * This accessor method will give the first possible answer
   * 
   * @return the text which is the first possible answer (string)
   */
  public String getAnswer1() {
    return answer1;
  }

  /**
   * This accessor method will give the second possible answer
   * 
   * @return the text which is the second possible answer (string)
   */
  public String getAnswer2() {
    return answer2;
  }

  /**
   * This accessor method will give the third possible answer
   * 
   * @return the text which is the third possible answer (string)
   */
  public String getAnswer3() {
    return answer3;
  }

  /**
   * This accessor method will give the fourth possible answer
   * 
   * @return the text which is the fourth possible answer (string)
   */
  public String getAnswer4() {
    return answer4;
  }

  /**
   * This accessor method will tell you which answer is correct
   * 
   * @return the int which is the correct answer
   */
  public int getCorrectAnswer() {
    return correctAnswer;
  }

  /**
   * This accessor method will tell you how many points the question is worth
   * 
   * @return the int which how many points the question is worth
   */
  public int getPoints() {
    return points;
  }

  /**
   * This accessor method will tell you what type of question the question is
   * 
   * @return the type of question
   */
  public String getQuestionType() {
    return questionType;
  }

  /**
  This accessor method is to test print a question to console to see that it's written and being read correct
  */
  void testPrint() {
    System.out.println(question);
    System.out.println(answer1);
    System.out.println(answer2);
    System.out.println(answer3);
    System.out.println(answer4);
    System.out.println(correctAnswer);
    System.out.println(points);
    System.out.println(questionType);
  }
}
