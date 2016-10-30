package fh_kufstein.puzzle;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Filter;

import static android.R.id.input;

public class MainActivity extends AppCompatActivity{


    ArrayList<Integer> pictures = new ArrayList<>();
    List randomArray = new ArrayList();
    List<ImageButton> buttons = new ArrayList<>();
    Random r = new Random();
    int invisibleButton = 6;
    private GestureDetectorCompat mDetector;

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private GestureDetector gestureDetector;
    View.OnTouchListener gestureListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPictures();
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());
        checkResult();
    }

    private static final String DEBUG_TAG = "Gestures";

    void onSwipeLeft() {

        ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imgButton8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton imgButton9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton imgButton10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton imgButton11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton imgButton12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton imgButton13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton imgButton14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton imgButton15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton imgButton16 = (ImageButton) findViewById(R.id.imageButton16);

        Log.d(DEBUG_TAG,"Left: ");

        switch (invisibleButton){
            case 1:
                imgButton1.setVisibility(View.VISIBLE);
                imgButton2.setVisibility(View.INVISIBLE);
                invisibleButton = 2;
                imgButton1.setImageDrawable(imgButton2.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 2:
                imgButton2.setVisibility(View.VISIBLE);
                imgButton3.setVisibility(View.INVISIBLE);
                invisibleButton = 3;
                imgButton2.setImageDrawable(imgButton3.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 3:
                imgButton3.setVisibility(View.VISIBLE);
                imgButton4.setVisibility(View.INVISIBLE);
                invisibleButton = 4;
                imgButton3.setImageDrawable(imgButton4.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 5:
                imgButton5.setVisibility(View.VISIBLE);
                imgButton6.setVisibility(View.INVISIBLE);
                invisibleButton = 6;
                imgButton5.setImageDrawable(imgButton6.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 6:
                imgButton6.setVisibility(View.VISIBLE);
                imgButton7.setVisibility(View.INVISIBLE);
                invisibleButton = 7;
                imgButton6.setImageDrawable(imgButton7.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 7:
                imgButton7.setVisibility(View.VISIBLE);
                imgButton8.setVisibility(View.INVISIBLE);
                invisibleButton = 8;
                imgButton7.setImageDrawable(imgButton8.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 9:
                imgButton9.setVisibility(View.VISIBLE);
                imgButton10.setVisibility(View.INVISIBLE);
                invisibleButton = 10;
                imgButton9.setImageDrawable(imgButton10.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 10:
                imgButton10.setVisibility(View.VISIBLE);
                imgButton11.setVisibility(View.INVISIBLE);
                invisibleButton = 11;
                imgButton10.setImageDrawable(imgButton11.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 11:
                imgButton11.setVisibility(View.VISIBLE);
                imgButton12.setVisibility(View.INVISIBLE);
                invisibleButton = 12;
                imgButton11.setImageDrawable(imgButton12.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 13:
                imgButton13.setVisibility(View.VISIBLE);
                imgButton14.setVisibility(View.INVISIBLE);
                invisibleButton = 14;
                imgButton13.setImageDrawable(imgButton14.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 14:
                imgButton14.setVisibility(View.VISIBLE);
                imgButton15.setVisibility(View.INVISIBLE);
                invisibleButton = 15;
                imgButton14.setImageDrawable(imgButton15.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 15:
                imgButton15.setVisibility(View.VISIBLE);
                imgButton16.setVisibility(View.INVISIBLE);
                invisibleButton = 16;
                imgButton15.setImageDrawable(imgButton16.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            default:
                break;


        }
    }

    void onSwipeRight() {
        ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imgButton8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton imgButton9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton imgButton10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton imgButton11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton imgButton12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton imgButton13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton imgButton14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton imgButton15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton imgButton16 = (ImageButton) findViewById(R.id.imageButton16);

        Log.d(DEBUG_TAG,"Right: ");

        switch (invisibleButton){
            case 2:
                imgButton2.setVisibility(View.VISIBLE);
                imgButton1.setVisibility(View.INVISIBLE);
                invisibleButton = 1;
                imgButton2.setImageDrawable(imgButton1.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 3:
                imgButton3.setVisibility(View.VISIBLE);
                imgButton2.setVisibility(View.INVISIBLE);
                invisibleButton = 2;
                imgButton3.setImageDrawable(imgButton2.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 4:
                imgButton4.setVisibility(View.VISIBLE);
                imgButton3.setVisibility(View.INVISIBLE);
                invisibleButton = 3;
                imgButton4.setImageDrawable(imgButton3.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 6:
                imgButton6.setVisibility(View.VISIBLE);
                imgButton5.setVisibility(View.INVISIBLE);
                invisibleButton = 5;
                imgButton6.setImageDrawable(imgButton5.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 7:
                imgButton7.setVisibility(View.VISIBLE);
                imgButton6.setVisibility(View.INVISIBLE);
                invisibleButton = 6;
                imgButton7.setImageDrawable(imgButton6.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 8:
                imgButton8.setVisibility(View.VISIBLE);
                imgButton7.setVisibility(View.INVISIBLE);
                invisibleButton = 7;
                imgButton8.setImageDrawable(imgButton7.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 10:
                imgButton10.setVisibility(View.VISIBLE);
                imgButton9.setVisibility(View.INVISIBLE);
                invisibleButton = 9;
                imgButton10.setImageDrawable(imgButton9.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 11:
                imgButton11.setVisibility(View.VISIBLE);
                imgButton10.setVisibility(View.INVISIBLE);
                invisibleButton = 10;
                imgButton11.setImageDrawable(imgButton10.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 12:
                imgButton12.setVisibility(View.VISIBLE);
                imgButton11.setVisibility(View.INVISIBLE);
                invisibleButton = 11;
                imgButton12.setImageDrawable(imgButton11.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 14:
                imgButton14.setVisibility(View.VISIBLE);
                imgButton13.setVisibility(View.INVISIBLE);
                invisibleButton = 13;
                imgButton14.setImageDrawable(imgButton13.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 15:
                imgButton15.setVisibility(View.VISIBLE);
                imgButton14.setVisibility(View.INVISIBLE);
                invisibleButton = 14;
                imgButton15.setImageDrawable(imgButton14.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 16:
                imgButton16.setVisibility(View.VISIBLE);
                imgButton15.setVisibility(View.INVISIBLE);
                invisibleButton = 15;
                imgButton16.setImageDrawable(imgButton15.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            default:
                break;


        }
    }

    void onSwipeUp() {
        Log.d(DEBUG_TAG,"Up: ");

        ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imgButton8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton imgButton9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton imgButton10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton imgButton11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton imgButton12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton imgButton13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton imgButton14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton imgButton15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton imgButton16 = (ImageButton) findViewById(R.id.imageButton16);

        Log.d(DEBUG_TAG,"Up: ");

        switch (invisibleButton) {
            case 1:
                imgButton1.setVisibility(View.VISIBLE);
                imgButton5.setVisibility(View.INVISIBLE);
                invisibleButton = 5;
                imgButton1.setImageDrawable(imgButton5.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 2:
                imgButton2.setVisibility(View.VISIBLE);
                imgButton6.setVisibility(View.INVISIBLE);
                invisibleButton = 6;
                imgButton2.setImageDrawable(imgButton6.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 3:
                imgButton3.setVisibility(View.VISIBLE);
                imgButton7.setVisibility(View.INVISIBLE);
                invisibleButton = 7;
                imgButton3.setImageDrawable(imgButton7.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 4:
                imgButton4.setVisibility(View.VISIBLE);
                imgButton8.setVisibility(View.INVISIBLE);
                invisibleButton = 8;
                imgButton4.setImageDrawable(imgButton8.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 5:
                imgButton5.setVisibility(View.VISIBLE);
                imgButton9.setVisibility(View.INVISIBLE);
                invisibleButton = 9;
                imgButton5.setImageDrawable(imgButton9.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 6:
                imgButton6.setVisibility(View.VISIBLE);
                imgButton10.setVisibility(View.INVISIBLE);
                invisibleButton = 10;
                imgButton6.setImageDrawable(imgButton10.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 7:
                imgButton7.setVisibility(View.VISIBLE);
                imgButton11.setVisibility(View.INVISIBLE);
                invisibleButton = 11;
                imgButton7.setImageDrawable(imgButton11.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 8:
                imgButton8.setVisibility(View.VISIBLE);
                imgButton12.setVisibility(View.INVISIBLE);
                invisibleButton = 12;
                imgButton8.setImageDrawable(imgButton12.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 9:
                imgButton9.setVisibility(View.VISIBLE);
                imgButton13.setVisibility(View.INVISIBLE);
                invisibleButton = 13;
                imgButton9.setImageDrawable(imgButton13.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 10:
                imgButton10.setVisibility(View.VISIBLE);
                imgButton14.setVisibility(View.INVISIBLE);
                invisibleButton = 14;
                imgButton10.setImageDrawable(imgButton14.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 11:
                imgButton11.setVisibility(View.VISIBLE);
                imgButton15.setVisibility(View.INVISIBLE);
                invisibleButton = 15;
                imgButton11.setImageDrawable(imgButton15.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            case 12:
                imgButton12.setVisibility(View.VISIBLE);
                imgButton16.setVisibility(View.INVISIBLE);
                invisibleButton = 16;
                imgButton12.setImageDrawable(imgButton16.getDrawable());
                Log.d(DEBUG_TAG, "got changed");
                break;
            default:
                break;

        }
    }

    void onSwipeDown() {
        Log.d(DEBUG_TAG,"Down: ");

        ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imgButton8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton imgButton9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton imgButton10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton imgButton11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton imgButton12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton imgButton13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton imgButton14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton imgButton15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton imgButton16 = (ImageButton) findViewById(R.id.imageButton16);

        Log.d(DEBUG_TAG,"Down: ");

        switch (invisibleButton){

            case 5:
                imgButton5.setVisibility(View.VISIBLE);
                imgButton1.setVisibility(View.INVISIBLE);
                invisibleButton = 1;
                imgButton5.setImageDrawable(imgButton1.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 6:
                imgButton6.setVisibility(View.VISIBLE);
                imgButton2.setVisibility(View.INVISIBLE);
                invisibleButton = 2;
                imgButton6.setImageDrawable(imgButton2.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 7:
                imgButton7.setVisibility(View.VISIBLE);
                imgButton3.setVisibility(View.INVISIBLE);
                invisibleButton = 3;
                imgButton7.setImageDrawable(imgButton3.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 8:
                imgButton8.setVisibility(View.VISIBLE);
                imgButton4.setVisibility(View.INVISIBLE);
                invisibleButton = 4;
                imgButton8.setImageDrawable(imgButton4.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 9:
                imgButton9.setVisibility(View.VISIBLE);
                imgButton5.setVisibility(View.INVISIBLE);
                invisibleButton = 5;
                imgButton9.setImageDrawable(imgButton5.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 10:
                imgButton10.setVisibility(View.VISIBLE);
                imgButton6.setVisibility(View.INVISIBLE);
                invisibleButton = 6;
                imgButton10.setImageDrawable(imgButton6.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 11:
                imgButton11.setVisibility(View.VISIBLE);
                imgButton7.setVisibility(View.INVISIBLE);
                invisibleButton = 7;
                imgButton11.setImageDrawable(imgButton7.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 12:
                imgButton12.setVisibility(View.VISIBLE);
                imgButton8.setVisibility(View.INVISIBLE);
                invisibleButton = 8;
                imgButton12.setImageDrawable(imgButton8.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 13:
                imgButton13.setVisibility(View.VISIBLE);
                imgButton9.setVisibility(View.INVISIBLE);
                invisibleButton = 9;
                imgButton13.setImageDrawable(imgButton9.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 14:
                imgButton14.setVisibility(View.VISIBLE);
                imgButton10.setVisibility(View.INVISIBLE);
                invisibleButton = 10;
                imgButton14.setImageDrawable(imgButton10.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 15:
                imgButton15.setVisibility(View.VISIBLE);
                imgButton11.setVisibility(View.INVISIBLE);
                invisibleButton = 11;
                imgButton15.setImageDrawable(imgButton11.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            case 16:
                imgButton16.setVisibility(View.VISIBLE);
                imgButton12.setVisibility(View.INVISIBLE);
                invisibleButton = 12;
                imgButton16.setImageDrawable(imgButton12.getDrawable());
                Log.d(DEBUG_TAG,"got changed");
                break;
            default:
                break;


        }
    }

    void checkResult(){
        ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imgButton8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton imgButton9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton imgButton10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton imgButton11 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton imgButton12 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton imgButton13 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton imgButton14 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton imgButton15 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton imgButton16 = (ImageButton) findViewById(R.id.imageButton16);


        Drawable drawable1 = imgButton1.getDrawable();
        Drawable drawable2 = imgButton2.getDrawable();
        Drawable drawable3 = imgButton3.getDrawable();
        Drawable drawable4 = imgButton4.getDrawable();
        Drawable drawable5 = imgButton5.getDrawable();
        Drawable drawable6 = imgButton6.getDrawable();
        Drawable drawable7 = imgButton7.getDrawable();
        Drawable drawable8 = imgButton8.getDrawable();
        Drawable drawable9 = imgButton9.getDrawable();
        Drawable drawable10 = imgButton10.getDrawable();
        Drawable drawable11 = imgButton11.getDrawable();
        Drawable drawable12 = imgButton12.getDrawable();
        Drawable drawable13 = imgButton13.getDrawable();
        Drawable drawable14 = imgButton14.getDrawable();
        Drawable drawable15 = imgButton15.getDrawable();
        Drawable drawable16 = imgButton16.getDrawable();

        if (drawable1.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_0_0).getConstantState()) &&
            drawable2.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_0_1).getConstantState()) &&
            drawable3.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_0_2).getConstantState()) &&
            drawable4.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_0_3).getConstantState()) &&
            drawable5.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_1_0).getConstantState()) &&
            drawable6.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_1_1).getConstantState()) &&
            drawable7.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_1_2).getConstantState()) &&
            drawable8.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_1_3).getConstantState()) &&
            drawable9.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_2_0).getConstantState()) &&
            drawable10.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_2_1).getConstantState()) &&
            drawable11.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_2_2).getConstantState()) &&
            drawable12.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_2_3).getConstantState()) &&
            drawable13.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_3_0).getConstantState()) &&
            drawable14.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_3_1).getConstantState()) &&
            drawable15.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_3_2).getConstantState()) &&
            drawable16.getConstantState().equals(getResources().getDrawable(R.drawable.bayern_3_3).getConstantState())
           ){
            Log.d("success", "nicee");
        }
        else{
            Log.d("success", "nope");
        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final String DEBUG_TAG = "Gestures";
        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;


        @Override
        public boolean onDown(MotionEvent event) {
            Log.d(DEBUG_TAG,"onDown: " + event.toString());
            return true;
        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY) {
            Log.d(DEBUG_TAG, "onFling: " + event1.toString()+event2.toString());

            float diffY = event2.getY() - event1.getY();
            float diffX = event2.getX() - event1.getX();

            if (Math.abs(diffX)>Math.abs(diffY) && Math.abs(diffX)>SWIPE_THRESHOLD){
                if (event1.getX()>event2.getX()){
                    onSwipeLeft();
                }
                else{
                    onSwipeRight();
                }
            }
            else{
                if (event1.getY()>event2.getY()){
                    onSwipeUp();
                }
                else{
                    onSwipeDown();
                }
            }
            return true;
        }
    }


     void setPictures(){
         ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
         ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
         ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
         ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
         ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
         ImageButton imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
         ImageButton imgButton7 = (ImageButton) findViewById(R.id.imageButton7);
         ImageButton imgButton8 = (ImageButton) findViewById(R.id.imageButton8);
         ImageButton imgButton9 = (ImageButton) findViewById(R.id.imageButton9);
         ImageButton imgButton10 = (ImageButton) findViewById(R.id.imageButton10);
         ImageButton imgButton11 = (ImageButton) findViewById(R.id.imageButton11);
         ImageButton imgButton12 = (ImageButton) findViewById(R.id.imageButton12);
         ImageButton imgButton13 = (ImageButton) findViewById(R.id.imageButton13);
         ImageButton imgButton14 = (ImageButton) findViewById(R.id.imageButton14);
         ImageButton imgButton15 = (ImageButton) findViewById(R.id.imageButton15);
         ImageButton imgButton16 = (ImageButton) findViewById(R.id.imageButton16);

         imgButton1.setImageResource(R.drawable.bayern_1_0);
         imgButton2.setImageResource(R.drawable.bayern_2_0);
         imgButton3.setImageResource(R.drawable.bayern_3_0);
         imgButton4.setImageResource(R.drawable.bayern_1_1);
         imgButton5.setImageResource(R.drawable.bayern_2_1);
         imgButton6.setImageResource(R.drawable.bayern_3_1);
         imgButton7.setImageResource(R.drawable.bayern_1_2);
         imgButton8.setImageResource(R.drawable.bayern_0_2);
         imgButton9.setImageResource(R.drawable.bayern_3_2);
         imgButton10.setImageResource(R.drawable.bayern_1_3);
         imgButton11.setImageResource(R.drawable.bayern_0_0);
         imgButton12.setImageResource(R.drawable.bayern_3_3);
         imgButton13.setImageResource(R.drawable.bayern_0_1);
         imgButton14.setImageResource(R.drawable.bayern_0_3);
         imgButton15.setImageResource(R.drawable.bayern_2_3);
         imgButton16.setImageResource(R.drawable.bayern_2_2);

         imgButton6.setVisibility(View.INVISIBLE);


     }



}