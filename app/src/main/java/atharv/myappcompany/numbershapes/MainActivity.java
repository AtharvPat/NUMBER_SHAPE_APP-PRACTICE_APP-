package atharv.myappcompany.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int num;

        public boolean isTriangular()
        {
            int x = 1;
            int triangular = 1;
            while (triangular < num)
            {
                x++;
                triangular = triangular + x;
            }

            if (triangular == num)
            {
                return true;
            }
            else
                return false;
        }

        public boolean isSquare()
        {
            double sqNo = Math.sqrt(num);

            if(sqNo == Math.floor(sqNo))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }

    public void check(View view)
    {
        EditText eT = (EditText) findViewById(R.id.editTextNumber);
        String enteredValue = eT.getText().toString();
        int eV = Integer.parseInt(enteredValue);

        String msg;

        if (enteredValue.isEmpty())
        {
            msg = "enter a number :( ";
        }
        else
        {
            Number myNumber = new Number();

            myNumber.num = eV;


            if (myNumber.isSquare() && myNumber.isTriangular()) {
                msg = enteredValue + " is square and triangular number";
            } else if (myNumber.isSquare()) {
                msg = enteredValue + " is square number";
            } else if (myNumber.isTriangular()) {
                msg = enteredValue + " is triangular number";
            } else {
                msg = enteredValue + " is neither of both ";
            }
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}