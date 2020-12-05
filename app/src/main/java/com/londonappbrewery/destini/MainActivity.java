package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
 TextView Story;
 Button Answer1;
 Button Answer2;
int mIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

Story = (TextView) findViewById(R.id.storyTextView);
Answer1 = (Button) findViewById(R.id.buttonTop);
Answer2 = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

Answer1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

Answer2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});
    }
}
