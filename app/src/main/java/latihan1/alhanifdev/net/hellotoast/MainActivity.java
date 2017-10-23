package latihan1.alhanifdev.net.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Variabel TextView
    //TextView mShow_count;
    //private int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        mShow_count = (TextView) findViewById(R.id.show_count);
        if (mShow_count != null) {
            mShow_count.setText(Integer.toString(mCount));
        }
        */
    }
    /*
    //Methode Untuk Menangkap aksi tombol klik countUp
    public void countUp(View view){
        // Apa yang akan diakukan saat tombol button_count di klik
        mCount++;
        if (mShow_count != null){
            mShow_count.setText(Integer.toString(mCount));
        }
    }

    //Methode Untuk Menangkap aksi tombol klik showToast
    public void showToast(View view){
        // Apa yang akan diakukan saat tombol button_count di klik
        Toast toast = Toast.makeText(this, R.string.toas_pesan, Toast.LENGTH_LONG);
        toast.show();
    }
    */
}
