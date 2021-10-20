package hu.petrik.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
            gepSorsol();
            teTipped = 0;
            kiNyer(teTipped, randomGepTippel);
        });

        papirGomb.setOnClickListener(view -> {
            imageViewTeValasztasod.setImageResource(R.drawable.paper);
            gepSorsol();
            teTipped = 1;
            kiNyer(teTipped, randomGepTippel);
        });

        olloGomb.setOnClickListener(view -> {
            imageViewTeValasztasod.setImageResource(R.drawable.scissors);
            gepSorsol();
            teTipped = 2;
            kiNyer(teTipped, randomGepTippel);
        });
    }

    int randomGepTippel;
    public void gepSorsol() {
        randomGepTippel = (int)(Math.random() * 3);

        if (randomGepTippel == 0) {
            imageViewGepValasztasa.setImageResource(R.drawable.rock);
        } else if (randomGepTippel == 1) {
            imageViewGepValasztasa.setImageResource(R.drawable.paper);
        } else {
            imageViewGepValasztasa.setImageResource(R.drawable.scissors);
        }
    }

    int teTipped;
    public void kiNyer(int ember, int gep) {
        if (ember == gep) {

        } else if (ember == 0 && gep == 1) {

        } else if (ember == 0 && gep == 2) {

        } else if (ember == 1 && gep == 0) {

        } else if (ember == 1 && gep == 2) {

        } else if (ember == 2 && gep == 0) {

        } else if (ember == 2 && gep == 1) {

        }
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