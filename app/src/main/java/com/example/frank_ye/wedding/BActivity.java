package com.example.frank_ye.wedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BActivity extends AppCompatActivity {
    private  static final int ReQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

//        Intent intent = getIntent();
//        String book_name = intent.getStringExtra("book_name");
//        Log.d("Handsome","book_name: "+book_name);


        Button btn_B = findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
//                Book book_data = (Book)
//                        getIntent().getSerializableExtra("book_data");
//                Log.d("HKT","book_name" + book_data.getBook_name());
//                Log.d("HKT","book_isbn" + book_data.getBook_isbn());

                intent.putExtra("book_isbn","123456789");
                setResult(ReQUEST_CODE, intent);
                finish();

//                Intent intent = getIntent();
//                intent.putExtra("book_isbn","123456789");
//                setResult(ReQUEST_CODE, intent);
//                finish();

            }
        });

    }
}
