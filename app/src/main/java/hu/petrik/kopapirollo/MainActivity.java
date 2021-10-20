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

    int teTipped;
    int randomGepTippel;
    int tePont = 0;
    int gepPont = 0;

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

    //rock = 0
    //paper = 1
    //scissors = 2
    public void kiNyer(int ember, int gep) {
        if (ember == gep) {
            Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
        } else if (ember == 0 && gep == 1) {
            Toast.makeText(MainActivity.this, "Ezt a kört a gép nyerte", Toast.LENGTH_SHORT).show();
            gepPont++;
            gepPontTextView.setText("Computer: " + gepPont);
        } else if (ember == 0 && gep == 2) {
            Toast.makeText(MainActivity.this, "Ezt a kört te nyerted", Toast.LENGTH_SHORT).show();
            tePont++;
            emberPontTextView.setText("Ember: " + tePont + " ");
        } else if (ember == 1 && gep == 0) {
            Toast.makeText(MainActivity.this, "Ezt a kört te nyerted", Toast.LENGTH_SHORT).show();
            tePont++;
            emberPontTextView.setText("Ember: " + tePont + " ");
        } else if (ember == 1 && gep == 2) {
            Toast.makeText(MainActivity.this, "Ezt a kört a gép nyerte", Toast.LENGTH_SHORT).show();
            gepPont++;
            gepPontTextView.setText("Computer: " + gepPont);
        } else if (ember == 2 && gep == 0) {
            Toast.makeText(MainActivity.this, "Ezt a kört a gép nyerte", Toast.LENGTH_SHORT).show();
            gepPont++;
            gepPontTextView.setText("Computer: " + gepPont);
        } else if (ember == 2 && gep == 1) {
            Toast.makeText(MainActivity.this, "Ezt a kört te nyerted", Toast.LENGTH_SHORT).show();
            tePont++;
            emberPontTextView.setText("Ember: " + tePont + " ");
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