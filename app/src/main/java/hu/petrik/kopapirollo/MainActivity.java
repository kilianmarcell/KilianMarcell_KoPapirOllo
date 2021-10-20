package hu.petrik.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTeValasztasod, textViewGepValasztasa, emberPontTextView, gepPontTextView;
    private ImageView imageViewTeValasztasod, imageViewGepValasztasa;
    private Button koGomb, papirGomb, olloGomb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        koGomb.setOnClickListener(view -> {
            imageViewTeValasztasod.setImageResource(R.drawable.rock);
        });

        papirGomb.setOnClickListener(view -> {
            imageViewTeValasztasod.setImageResource(R.drawable.paper);
        });

        olloGomb.setOnClickListener(view -> {
            imageViewTeValasztasod.setImageResource(R.drawable.scissors);
        });
    }

    public void init() {
        textViewTeValasztasod = findViewById(R.id.textViewTeValasztasod);
        textViewGepValasztasa = findViewById(R.id.textViewGepValasztasa);
        emberPontTextView = findViewById(R.id.emberPontTextView);
        gepPontTextView = findViewById(R.id.gepPontTextView);

        imageViewTeValasztasod = findViewById(R.id.imageViewTeValasztasod);
        imageViewGepValasztasa = findViewById(R.id.imageViewGepValasztasa);

        koGomb = findViewById(R.id.koGomb);
        papirGomb = findViewById(R.id.papirGomb);
        olloGomb = findViewById(R.id.olloGomb);
    }
}