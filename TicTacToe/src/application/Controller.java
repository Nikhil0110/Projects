package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

	static Boolean player1Flag = true;
	boolean player2Flag;
	int player1Score = 0;
	int player2Score = 0;

	@FXML
	public Label pTurn, pScore;

	@FXML
	public Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

	@FXML
	public void button1Action(ActionEvent event) {
		setButtonText(button1);

	}

	@FXML
	public void button2Action(ActionEvent event) {
		setButtonText(button2);
		checkWin();
	}

	@FXML
	public void button3Action(ActionEvent event) {
		setButtonText(button3);
		checkWin();
	}

	@FXML
	public void button4Action(ActionEvent event) {
		setButtonText(button4);
		checkWin();
	}

	@FXML
	public void button5Action(ActionEvent event) {
		setButtonText(button5);
		checkWin();
	}

	@FXML
	public void button6Action(ActionEvent event) {
		setButtonText(button6);
		checkWin();
	}

	@FXML
	public void button7Action(ActionEvent event) {
		setButtonText(button7);
		checkWin();
	}

	@FXML
	public void button8Action(ActionEvent event) {
		setButtonText(button8);
		checkWin();
	}

	@FXML
	public void button9Action(ActionEvent event) {
		setButtonText(button9);
		checkWin();
	}

	public void checkWin() {
		// player1
		if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button4.getText().equals("X") && button1.getText().equals("X") && button7.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")) {
			pTurn.setText("Player1 Won");
			player1Score++;
			pScore.setText(player1Score + "-" + player2Score);
		}

		// Player 2
		if (button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button4.getText().equals("O") && button1.getText().equals("O") && button7.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")) {
			pTurn.setText("Player2 Won");
			player2Score++;
			pScore.setText(player1Score + "-" + player2Score);
		} else if (button1.getText().equals("") && button2.getText().equals("") && button3.getText().equals("")
				&& button4.getText().equals("") && button5.getText().equals("") && button6.getText().equals("")
				&& button7.getText().equals("") && button8.getText().equals("") && button9.getText().equals("")) {
			pTurn.setText("Draw");
		}

	}

	public void playAgain() {

	}

	public void setButtonText(Button btm) {
		if (player1Flag == true) {
			btm.setText("X");
			pTurn.setText("Player 2 turn");
			player1Flag = false;

		} else {
			btm.setText("O");
			pTurn.setText("Player 1 turn");
			player1Flag = true;
		}

	}

}
