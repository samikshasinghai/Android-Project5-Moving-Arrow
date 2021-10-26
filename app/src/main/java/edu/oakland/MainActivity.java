package edu.oakland;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button upBtn;
    Button downBtn;
    Button leftBtn;
    Button rightBtn;
    ImageView imgLeft;
    ImageView imgRight;
    ImageView imgUp;
    ImageView imgDown;
    TextView direction;
    public int posX = 450;
    public int posY = 400;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upBtn = findViewById(R.id.actionUp);
        downBtn = findViewById(R.id.actionDown);
        leftBtn = findViewById(R.id.actionLeft);
        rightBtn = findViewById(R.id.actionRight);
        imgLeft = findViewById(R.id.image_left);
        imgRight = findViewById(R.id.image_right);
        imgUp = findViewById(R.id.image_up);
        imgDown = findViewById(R.id.image_down);
        direction = findViewById(R.id.direction);

        /////////////To move an arrow in left direction//////////////////////////////
        leftBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                imgLeft.setVisibility(View.VISIBLE);
                imgRight.setVisibility(View.INVISIBLE);
                imgUp.setVisibility(View.INVISIBLE);
                imgDown.setVisibility(View.INVISIBLE);

                if(posX > 0)
                {
                    posX = posX - 50;
                }
                imgLeft.setX(posX);
                imgLeft.setY(posY);
                direction.setText(" LEFT  ");
                clrBtn("Left");

            }
        });

        ////////////////To move an arrow in right direction////////////////////////////
        rightBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                imgRight.setVisibility(View.VISIBLE);
                imgLeft.setVisibility(View.INVISIBLE);
                imgUp.setVisibility(View.INVISIBLE);
                imgDown.setVisibility(View.INVISIBLE);

                if(posX < 900)
                {
                    posX = posX + 50;
                }
                imgRight.setX(posX);
                imgRight.setY(posY);
                direction.setText("  RIGHT ");
                direction.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                clrBtn("Right");
            }
        });

        ////////To move an arrow upwards/////////////////////////
        upBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                imgUp.setVisibility(View.VISIBLE);
                imgLeft.setVisibility(View.INVISIBLE);
                imgRight.setVisibility(View.INVISIBLE);
                imgDown.setVisibility(View.INVISIBLE);

                if(posY > 0)
                {
                    posY = posY - 50;
                }

                imgUp.setX(posX);
                imgUp.setY(posY);
                direction.setText("  UP   ");
                direction.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                clrBtn("Up");

            }
        });

        ////////////To move an arrow downward//////////////////////
        downBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                imgDown.setVisibility(View.VISIBLE);
                imgUp.setVisibility(View.INVISIBLE);
                imgLeft.setVisibility(View.INVISIBLE);
                imgRight.setVisibility(View.INVISIBLE);

                if(posY < 800)
                {
                    posY = posY + 50;
                }

                imgDown.setX(posX);
                imgDown.setY(posY);
                direction.setText("  DOWN  ");
                clrBtn("Down");

            }

        });
    }

    ///////To change the button color when pressed////////////////////
    public void clrBtn(String str)
    {
        String greenClr= "#9FEF52";
        String grayClr = "#F3F3F3";

        String clrLeft = grayClr;
        String clrRight = grayClr;
        String clrUp = grayClr;
        String clrDown = grayClr;

        if(str.equals("Left"))
        {
            clrLeft = greenClr;
        }
        else if(str.equals("Right"))
        {
            clrRight = greenClr;
        }else if(str.equals("Up"))
        {
           clrUp = greenClr;

        }else if(str.equals("Down"))
        {
            clrDown = greenClr;
        }

        leftBtn.setBackgroundColor(Color.parseColor(clrLeft));
        rightBtn.setBackgroundColor(Color.parseColor(clrRight));
        upBtn.setBackgroundColor(Color.parseColor(clrUp));
        downBtn.setBackgroundColor(Color.parseColor(clrDown));

    }

}