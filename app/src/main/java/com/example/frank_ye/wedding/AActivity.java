package com.example.frank_ye.wedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AActivity extends AppCompatActivity {

    private  static final int ReQUEST_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btn_A = findViewById(R.id.btn_A);
        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AActivity.this,BActivity.class);
                Book mBook = new Book();
                mBook.setBook_name("frank_ye 筆記");
                mBook.setBook_isbn("1234");

                intent.putExtra("book_data", mBook);
                startActivityForResult(intent, ReQUEST_CODE);
//                intent.putExtra("book_name","Frank Ye 好帥");
//                startActivityForResult(intent, ReQUEST_CODE);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case ReQUEST_CODE:
                String result = data.getStringExtra("book_isbn");
                Log.d("HKT","result:"+result);
                break;
        }
    }
}
