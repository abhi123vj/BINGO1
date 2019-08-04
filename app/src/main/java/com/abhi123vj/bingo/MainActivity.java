package com.abhi123vj.bingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {


    int cnt=1,b=0;
    Button b00,b01,b02,b03,b04,b10,b11,b12,b13,b14,b20,b21,b22,b23,b24,b30,b31,b32,b33,b34,b40,b41,b42,b43,b44,bsrt;
    int[][] linr={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    TextView bingo;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bingo=findViewById(R.id.textView);
        b00 = findViewById(R.id.button);
        b01 = findViewById(R.id.button4);
        b02 = findViewById(R.id.button12);
        b03 = findViewById(R.id.button6);
        b04 = findViewById(R.id.button24);
        b10 = findViewById(R.id.button18);
        b11 = findViewById(R.id.button7);
        b12 = findViewById(R.id.button11);
        b13 = findViewById(R.id.button16);
        b14 = findViewById(R.id.button25);
        b20 = findViewById(R.id.button3);
        b21 = findViewById(R.id.button14);
        b22 = findViewById(R.id.button10);
        b23 = findViewById(R.id.button17);
        b24 = findViewById(R.id.button23);
        b30 = findViewById(R.id.button2);
        b31 = findViewById(R.id.button15);
        b32 = findViewById(R.id.button9);
        b33 = findViewById(R.id.button20);
        b34 = findViewById(R.id.button22);
        b40 = findViewById(R.id.button5);
        b41 = findViewById(R.id.button13);
        b42 = findViewById(R.id.button8);
        b43 = findViewById(R.id.button19);
        b44 = findViewById(R.id.button21);
        bsrt= findViewById(R.id.angry_btn);
        bsrt.setEnabled(false);
       b20.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int dn=cnt;
               b20.setEnabled(false);
               b20.setText(String.valueOf(dn));
               cnt++;
               if(cnt<26)
                   bsrt.setEnabled(false);
               else
                   bsrt.setEnabled(true);

           }
       });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b21.setEnabled(false);
                int dn=cnt;
                b21.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b22.setEnabled(false);
                int dn=cnt;
                b22.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b23.setEnabled(false);
                int dn=cnt;
                b23.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b24.setEnabled(false);
                int dn=cnt;
                b24.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dn=cnt;
                b30.setEnabled(false);
                b30.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b31.setEnabled(false);
                int dn=cnt;
                b31.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b32.setEnabled(false);
                int dn=cnt;
                b32.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b33.setEnabled(false);
                int dn=cnt;
                b33.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b34.setEnabled(false);
                int dn=cnt;
                b34.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dn=cnt;
                b10.setEnabled(false);
                b10.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setEnabled(false);
                int dn=cnt;
                b11.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setEnabled(false);
                int dn=cnt;
                b12.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setEnabled(false);
                int dn=cnt;
                b13.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b14.setEnabled(false);
                int dn=cnt;
                b14.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dn=cnt;
                b40.setEnabled(false);
                b40.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b41.setEnabled(false);
                int dn=cnt;
                b41.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b42.setEnabled(false);
                int dn=cnt;
                b42.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b43.setEnabled(false);
                int dn=cnt;
                b43.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b44.setEnabled(false);
                int dn=cnt;
                b44.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dn=cnt;
                b00.setEnabled(false);
                b00.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b01.setEnabled(false);
                int dn=cnt;
                b01.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b02.setEnabled(false);
                int dn=cnt;
                b02.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b03.setEnabled(false);
                int dn=cnt;
                b03.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });
        b04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b04.setEnabled(false);
                int dn=cnt;
                b04.setText(String.valueOf(dn));
                cnt++;
                if(cnt<26)
                    bsrt.setEnabled(false);
                else
                    bsrt.setEnabled(true);

            }
        });





        bsrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    bsrt.setEnabled(false);
                    b00.setEnabled(true);
                    b01.setEnabled(true);
                    b02.setEnabled(true);
                    b03.setEnabled(true);
                    b04.setEnabled(true);
                    b10.setEnabled(true);
                    b11.setEnabled(true);
                    b12.setEnabled(true);
                    b13.setEnabled(true);
                    b14.setEnabled(true);
                    b20.setEnabled(true);
                    b21.setEnabled(true);
                    b22.setEnabled(true);
                    b23.setEnabled(true);
                    b24.setEnabled(true);
                    b30.setEnabled(true);
                    b31.setEnabled(true);
                    b32.setEnabled(true);
                    b33.setEnabled(true);
                    b34.setEnabled(true);
                    b40.setEnabled(true);
                    b41.setEnabled(true);
                    b42.setEnabled(true);
                    b43.setEnabled(true);
                    b44.setEnabled(true);
                    MediaPlayer mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.pubgmus);
                    mediaPlayer.start();
                    b00.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b00.setText("X");
                            b00.setEnabled(false);
                            linr[0][0]=1;
                            if((linr[0][1]==1)&&(linr[0][2]==1)&&(linr[0][3]==1)&&(linr[0][4]==1))
                                b++;
                            if((linr[1][0]==1)&&(linr[2][0]==1)&&(linr[3][0]==1)&&(linr[4][0]==1))
                                b++;
                            if((linr[1][1]==1)&&(linr[2][2]==1)&&(linr[3][3]==1)&&(linr[4][4]==1))
                                b++;
                            if(b==1)
                            bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b01.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b01.setText("X");
                            b01.setEnabled(false);
                            linr[0][1]=1;
                            if((linr[0][0]==1)&&(linr[0][2]==1)&&(linr[0][3]==1)&&(linr[0][4]==1))
                                b++;
                            if((linr[1][1]==1)&&(linr[2][1]==1)&&(linr[3][1]==1)&&(linr[4][1]==1))
                            b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b02.setText("X");
                            b02.setEnabled(false);
                            linr[0][2]=1;
                            if((linr[0][0]==1)&&(linr[0][1]==1)&&(linr[0][3]==1)&&(linr[0][4]==1))
                                b++;
                            if((linr[1][2]==1)&&(linr[2][2]==1)&&(linr[3][2]==1)&&(linr[4][2]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b03.setText("X");
                            linr[0][3]=1;
                            b03.setEnabled(false);
                            if((linr[0][0]==1)&&(linr[0][1]==1)&&(linr[0][2]==1)&&(linr[0][4]==1))
                                b++;
                            if((linr[1][3]==1)&&(linr[2][3]==1)&&(linr[3][3]==1)&&(linr[4][3]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b04.setText("X");
                            linr[0][4]=1;
                            b04.setEnabled(false);
                            if((linr[0][0]==1)&&(linr[0][1]==1)&&(linr[0][3]==1)&&(linr[0][2]==1))
                                b++;
                            if((linr[1][4]==1)&&(linr[2][4]==1)&&(linr[3][4]==1)&&(linr[4][4]==1))
                                b++;
                            if((linr[1][3]==1)&&(linr[2][2]==1)&&(linr[3][1]==1)&&(linr[4][0]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b10.setText("X");
                            linr[1][0]=1;
                            b10.setEnabled(false);
                            if((linr[1][1]==1)&&(linr[1][2]==1)&&(linr[1][3]==1)&&(linr[1][4]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[2][0]==1)&&(linr[3][0]==1)&&(linr[4][0]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b11.setText("X");
                            linr[1][1]=1;
                            b11.setEnabled(false);
                            if((linr[1][0]==1)&&(linr[1][2]==1)&&(linr[1][3]==1)&&(linr[1][4]==1))
                                b++;
                            if((linr[0][1]==1)&&(linr[2][1]==1)&&(linr[3][1]==1)&&(linr[4][1]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[2][2]==1)&&(linr[3][3]==1)&&(linr[4][4]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b12.setText("X");
                            linr[1][2]=1;
                            b12.setEnabled(false);
                            if((linr[1][0]==1)&&(linr[1][1]==1)&&(linr[1][3]==1)&&(linr[1][4]==1))
                                b++;
                            if((linr[0][2]==1)&&(linr[2][2]==1)&&(linr[3][2]==1)&&(linr[4][2]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b13.setText("X");
                            linr[1][3]=1;
                            b13.setEnabled(false);
                            if((linr[1][0]==1)&&(linr[1][1]==1)&&(linr[1][2]==1)&&(linr[1][4]==1))
                                b++;
                            if((linr[0][3]==1)&&(linr[2][3]==1)&&(linr[3][3]==1)&&(linr[4][3]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[2][2]==1)&&(linr[3][1]==1)&&(linr[4][0]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b14.setText("X");
                            linr[1][4]=1;
                            b14.setEnabled(false);
                            if((linr[1][0]==1)&&(linr[1][1]==1)&&(linr[1][2]==1)&&(linr[1][3]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[2][4]==1)&&(linr[3][4]==1)&&(linr[4][4]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b20.setText("X");
                            linr[2][0]=1;
                            b20.setEnabled(false);
                            if((linr[2][1]==1)&&(linr[2][2]==1)&&(linr[2][3]==1)&&(linr[2][4]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[1][0]==1)&&(linr[3][0]==1)&&(linr[4][0]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b21.setText("X");
                            linr[2][1]=1;
                            b21.setEnabled(false);
                            if((linr[2][0]==1)&&(linr[2][2]==1)&&(linr[2][3]==1)&&(linr[2][4]==1))
                                b++;
                            if((linr[0][1]==1)&&(linr[1][1]==1)&&(linr[3][1]==1)&&(linr[4][1]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b22.setText("X");
                            linr[2][2]=1;
                            b22.setEnabled(false);
                            if((linr[2][0]==1)&&(linr[2][1]==1)&&(linr[2][3]==1)&&(linr[2][4]==1))
                                b++;
                            if((linr[0][2]==1)&&(linr[1][2]==1)&&(linr[3][2]==1)&&(linr[4][2]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[1][1]==1)&&(linr[3][3]==1)&&(linr[4][4]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[1][3]==1)&&(linr[3][1]==1)&&(linr[4][0]==1))
                                b++;

                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b23.setText("X");
                            linr[2][3]=1;
                            b23.setEnabled(false);
                            if((linr[2][0]==1)&&(linr[2][1]==1)&&(linr[2][2]==1)&&(linr[2][4]==1))
                                b++;
                            if((linr[0][3]==1)&&(linr[1][3]==1)&&(linr[3][3]==1)&&(linr[4][3]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b24.setText("X");
                            linr[2][4]=1;
                            b24.setEnabled(false);
                            if((linr[2][0]==1)&&(linr[2][1]==1)&&(linr[2][2]==1)&&(linr[2][3]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[1][4]==1)&&(linr[3][4]==1)&&(linr[4][4]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b30.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b30.setText("X");
                            linr[3][0]=1;
                            b30.setEnabled(false);
                            if((linr[3][1]==1)&&(linr[3][2]==1)&&(linr[3][3]==1)&&(linr[3][4]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[1][0]==1)&&(linr[2][0]==1)&&(linr[4][0]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b31.setText("X");
                            linr[3][1]=1;
                            b31.setEnabled(false);
                            if((linr[3][0]==1)&&(linr[3][2]==1)&&(linr[3][3]==1)&&(linr[3][4]==1))
                                b++;
                            if((linr[0][1]==1)&&(linr[1][1]==1)&&(linr[2][1]==1)&&(linr[4][1]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[1][3]==1)&&(linr[2][2]==1)&&(linr[4][0]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b32.setText("X");
                            linr[3][2]=1;
                            b32.setEnabled(false);
                            if((linr[3][0]==1)&&(linr[3][1]==1)&&(linr[3][3]==1)&&(linr[3][4]==1))
                                b++;
                            if((linr[0][2]==1)&&(linr[1][2]==1)&&(linr[2][2]==1)&&(linr[4][2]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b33.setText("X");
                            linr[3][3]=1;
                            b33.setEnabled(false);
                            if((linr[3][0]==1)&&(linr[3][1]==1)&&(linr[3][2]==1)&&(linr[3][4]==1))
                                b++;
                            if((linr[0][3]==1)&&(linr[1][3]==1)&&(linr[2][3]==1)&&(linr[4][3]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[1][1]==1)&&(linr[2][2]==1)&&(linr[4][4]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b34.setText("X");
                            linr[3][4]=1;
                            b34.setEnabled(false);
                            if((linr[3][0]==1)&&(linr[3][1]==1)&&(linr[3][2]==1)&&(linr[3][3]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[1][4]==1)&&(linr[2][4]==1)&&(linr[4][4]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b40.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b40.setText("X");
                            linr[4][0]=1;
                            b40.setEnabled(false);
                            if((linr[4][1]==1)&&(linr[4][2]==1)&&(linr[4][3]==1)&&(linr[4][4]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[1][0]==1)&&(linr[2][0]==1)&&(linr[3][0]==1))
                                b++;
                            if((linr[3][1]==1)&&(linr[2][2]==1)&&(linr[1][3]==1)&&(linr[0][4]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b41.setText("X");
                            linr[4][1]=1;
                            b41.setEnabled(false);
                            if((linr[4][0]==1)&&(linr[4][2]==1)&&(linr[4][3]==1)&&(linr[4][4]==1))
                                b++;
                            if((linr[0][1]==1)&&(linr[1][1]==1)&&(linr[2][1]==1)&&(linr[3][1]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b42.setText("X");
                            linr[4][2]=1;
                            b42.setEnabled(false);
                            if((linr[4][0]==1)&&(linr[4][1]==1)&&(linr[4][3]==1)&&(linr[4][4]==1))
                                b++;
                            if((linr[0][2]==1)&&(linr[1][2]==1)&&(linr[2][2]==1)&&(linr[3][2]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b43.setText("X");
                            linr[4][3]=1;
                            b43.setEnabled(false);
                            if((linr[4][0]==1)&&(linr[4][1]==1)&&(linr[4][2]==1)&&(linr[4][4]==1))
                                b++;
                            if((linr[0][3]==1)&&(linr[1][3]==1)&&(linr[2][3]==1)&&(linr[3][3]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });
                    b44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            b44.setText("X");
                            linr[4][4]=1;
                            b44.setEnabled(false);
                            if((linr[4][0]==1)&&(linr[4][1]==1)&&(linr[4][2]==1)&&(linr[4][3]==1))
                                b++;
                            if((linr[0][4]==1)&&(linr[1][4]==1)&&(linr[2][4]==1)&&(linr[3][4]==1))
                                b++;
                            if((linr[0][0]==1)&&(linr[1][1]==1)&&(linr[2][2]==1)&&(linr[3][3]==1))
                                b++;
                            if(b==1)
                                bingo.setText("B");
                            else if(b==2)
                                bingo.setText("BI");
                            else if(b==3)
                                bingo.setText("BIN");
                            else if(b==4)
                                bingo.setText("BING");
                            else if(b>=5)
                            {
                                bingo.setText("BINGO");
                                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                                startActivity(intent);
                            }
                            else
                                bingo.setText("Bienvenue");
                        }
                    });


                }
            });








    }
}


