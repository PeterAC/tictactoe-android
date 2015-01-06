package com.example.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity
implements OnClickListener {

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private TextView txtStatus;
	private Button btnNewGame;
	private String turn;
	Game game;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		txtStatus = (TextView) findViewById(R.id.txtStatus);
		btnNewGame = (Button) findViewById(R.id.btnNewGame);
		
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
		btnNewGame.setOnClickListener(this);
		
		turn = "x";
		txtStatus.setText("Player X's Turn");
		
		game = new Game();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			if (turn == "x") {
				xGoes(button1);
			}
			else {
				oGoes(button1);
			}
			break;
		case R.id.button2:
			if (turn == "x") {
				xGoes(button2);
			}
			else {
				oGoes(button2);
			}
			break;
		case R.id.button3:
			if (turn == "x") {
				xGoes(button3);
			}
			else {
				oGoes(button3);
			}
			break;
		case R.id.button4:
			if (turn == "x") {
				xGoes(button4);
			}
			else {
				oGoes(button4);
			}
			break;
		case R.id.button5:
			if (turn == "x") {
				xGoes(button5);
			}
			else {
				oGoes(button5);
			}
			break;
		case R.id.button6:
			if (turn == "x") {
				xGoes(button6);
			}
			else {
				oGoes(button6);
			}
			break;
		case R.id.button7:
			if (turn == "x") {
				xGoes(button7);
			}
			else {
				oGoes(button7);
			}
			break;
		case R.id.button8:
			if (turn == "x") {
				xGoes(button8);
			}
			else {
				oGoes(button8);
			}
			break;
		case R.id.button9:
			if (turn == "x") {
				xGoes(button9);
			}
			else {
				oGoes(button9);
			}
			break;
		case R.id.btnNewGame:
			button1.setText("");
			button2.setText("");
			button3.setText("");
			button4.setText("");
			button5.setText("");
			button6.setText("");
			button7.setText("");
			button8.setText("");
			button9.setText("");
			button1.setClickable(true);
			button2.setClickable(true);
			button3.setClickable(true);
			button4.setClickable(true);
			button5.setClickable(true);
			button6.setClickable(true);
			button7.setClickable(true);
			button8.setClickable(true);
			button9.setClickable(true);
			game.clearGame();
			break;
		}
		
	}
	
	public void xGoes(Button b) {
		b.setText(R.string.cross);
		turn = "o";
		txtStatus.setText("Player O's Turn");
		b.setClickable(false);
	}
	
	public void oGoes(Button b) {
		b.setText(R.string.naught);
		turn = "x";
		txtStatus.setText("Player X's Turn");
		b.setClickable(false);
	}
}
