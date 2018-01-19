package tw.com.pcschool.dd2018011904;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new FragmentA());
        ft.commit();
    }

    public void click2(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new FragmentB());
        ft.commit();
    }
}
