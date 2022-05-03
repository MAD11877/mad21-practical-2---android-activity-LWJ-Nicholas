package sg.edu.np.mad.s10222425_practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a new user object
        //Is it recommended that we extract string resource for the name and description?
        User student1 = new User("Nicholas Lee",
                "Second year IT student at Ngee Ann Polytechnic, loves to play chess and talk to plants during his free time.",
                10222425,
                false);

        //Retrieve name from user
        //Display name
        TextView nameTxt = findViewById(R.id.nameTxt);
        nameTxt.setText(student1.name);

        //Retrieve description from user
        //Display description
        TextView descTxt = findViewById(R.id.descTxt);
        descTxt.setText(student1.description);

        //Check if user is being followed
        //Display unfollow/follow
        Button followBtn = findViewById(R.id.followBtn);
        if (student1.followed){
            followBtn.setText(R.string.unfollow);
        } else {
            followBtn.setText(R.string.follow);
        }

        //Change the status of "followed" whenever the follow button is clicked
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Check if user is being followed
                //Update the text displayed on the follow button
                Button followBtn = findViewById(R.id.followBtn);
                if (student1.followed){
                    followBtn.setText(R.string.follow);
                } else {
                    followBtn.setText(R.string.unfollow);
                }

                //Update followed status accordingly
                student1.followed = !student1.followed;
            }
        });
    }

}