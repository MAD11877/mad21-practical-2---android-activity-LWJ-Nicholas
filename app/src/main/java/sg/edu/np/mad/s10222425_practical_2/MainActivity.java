package sg.edu.np.mad.s10222425_practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creating a new user object
    User student1 = new User("Nicholas Lee",
            "Second year IT student at Ngee Ann Polytechnic, loves to play chess and talk to plants during his free time.",
            10222425);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }

    public void follow (View v){

        //Check if user is being followed
        //Display follow/unfollow
        Button followBtn = findViewById(R.id.followBtn);
        if (student1.followed){
            followBtn.setText(R.string.follow);
        } else {
            followBtn.setText(R.string.unfollow);
        }

        //Update follow status accordingly
        student1.followed = !student1.followed;
    }
}