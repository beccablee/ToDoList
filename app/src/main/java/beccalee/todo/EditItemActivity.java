package beccalee.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText editToDo = (EditText) findViewById(R.id.editToDo);
        String name = getIntent().getStringExtra("name");
        editToDo.setText(name);
    }

    public void onSave(View view){
        EditText editToDo = (EditText) findViewById(R.id.editToDo);
        Intent data = new Intent();
        data.putExtra("name", editToDo.getText().toString());
        data.putExtra("position", getIntent().getIntExtra("position", 0));
        setResult(RESULT_OK, data);
        finish();
    }

}
