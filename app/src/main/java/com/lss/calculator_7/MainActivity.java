package com.lss.calculator_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


  private TextView textView;
  private Integer first,second;
  private boolean isOperationClick;
  private String operation;
  private Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")||isOperationClick){
                    textView.setText("1");
                }else {
                    //press one
                textView.append("1");}
                break;
                case R.id.btn_two:
                    if (textView.getText().toString().equals("0")||isOperationClick){
                        textView.setText("2");
                    }else {
                    //press two
                    textView.append("2");}
                    break;
            case R.id.btn_three:
                //press three
                if (textView.getText().toString().equals("0")||isOperationClick){
                    textView.setText("3");
                }else {
                textView.append("3");}
                break;
                case R.id.btn_four:
                    //press four
                    if (textView.getText().toString().equals("0")||isOperationClick){
                        textView.setText("4");
                    }else {
                    textView.append("4");}
                    break;
                    case R.id.btn_five:
                        if (textView.getText().toString().equals("0")||isOperationClick){
                            textView.setText("5");
                        }else {
                        //press five
                        textView.append("5");}
                        break;
                        case R.id.btn_six:
                            //press six
                            if (textView.getText().toString().equals("0")||isOperationClick){
                                textView.setText("6");
                            }else {
                            textView.append("6");}
                            break;
                            case  R.id.btn_seven:
                                //press seven
                                if (textView.getText().toString().equals("0")||isOperationClick){
                                    textView.setText("7");
                                }else {
                                textView.append("7");}
                                break;

                                case  R.id.btn_eight:
                                    //press eight
                                    if (textView.getText().toString().equals("0")||isOperationClick){
                                        textView.setText("8");
                                    }else {
                                    textView.append("8");}
                                    break;
                                    case  R.id.btn_nine:
                                        //press nine
                                        if (textView.getText().toString().equals("0")||isOperationClick){
                                            textView.setText("9");
                                        }else {
                                        textView.append("9");}
                                        break;

                                            case R.id.btn_clear:
                                                first=0;
                                                second=0;
                                                //press clear

                                                textView.setText("0");
                                                break;
                    }
        isOperationClick=false;
    }


    public void onOperationClick(View view) {
  switch (view.getId()){
      case R.id.plus:
          first= Integer.valueOf(textView.getText().toString());
          operation="plus";
          break;
      case R.id.btn_minus:
          first= Integer.valueOf(textView.getText().toString());
          operation="minus";
          break;
      case R.id.btn_multiply:
          first= Integer.valueOf(textView.getText().toString());
          operation="multiply";
          break;
      case R.id.btn_divide:

          //press divide
          first= Integer.valueOf(textView.getText().toString());
          operation="divide";

          break;
      case R.id.btn_equal:

          switch (operation){
              case "plus":
                  second= Integer.valueOf(textView.getText().toString());
                  result=first+second;
                  textView.setText(result.toString());
                  //press equal
                  break;

              case "minus":
                  second= Integer.valueOf(textView.getText().toString());
                   result=first-second;
                  textView.setText(result.toString());
                  break;
              case "multiply":
                  second= Integer.valueOf(textView.getText().toString());
                  result=first*second;
                  textView.setText(result.toString());
                  break;
              case "divide":
                  second= Integer.valueOf(textView.getText().toString());
                  result=first/second;
                  textView.setText(result.toString());
                  break;
      }


          break;
  }
  isOperationClick=true;
    }

}