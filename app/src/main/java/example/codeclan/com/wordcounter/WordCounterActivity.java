package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */
public class WordCounterActivity extends AppCompatActivity {

    EditText ask_for_sentenceEditText;
    Button shakeButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ask_for_sentenceEditText = (EditText)findViewById(R.id.ask_for_sentence);
        shakeButton = (Button)findViewById(R.id.shake_button);
        answerText = (TextView)findViewById(R.id.answer_text);

        Log.d(getClass().toString(), "onCreate got called");

    }

    public void onShakeButtonPressed(View button) {
        Log.d(getClass().toString(), ask_for_sentenceEditText.getText().toString());
        setContentView(R.layout.activity_main);
        String sentence = ask_for_sentenceEditText.getText().toString();
        Words words = new Words(sentence);
        String the_answer = String.valueOf(words.countWords());

        answerText.setText(the_answer);

    }

}
