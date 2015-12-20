import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import java.util.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Slip_Counterpoint extends PApplet {




Minim minim;//audio context
AudioPlayer[] a;

 
Random generator;
int i = 0; 
public void setup() {
   minim = new Minim(this);
  size(1320,710);
  generator = new Random();  a = new AudioPlayer[10];
  a[0] = minim.loadFile("data/10 Piece sample1.wav");
  a[1] = minim.loadFile("data/10 Piece sample2.wav");
  a[2] = minim.loadFile("data/10 Piece sample3.wav");
  a[3] = minim.loadFile("data/10 Piece sample4.wav");
  a[4] = minim.loadFile("data/10 Piece sample5.wav");
  a[5] = minim.loadFile("data/10 Piece sample6.wav");
  a[6] = minim.loadFile("data/10 Piece sample7.wav");
  a[7] = minim.loadFile("data/10 Piece sample8.wav");
  a[8] = minim.loadFile("data/10 Piece sample9.wav");
  a[9] = minim.loadFile("data/10 Piece sample10.wav");
}

public void draw() {
//Note that nextGaussian() returns a double.
  
  float num = (float) generator.nextGaussian();
  float sd = 200;
  float mean = width/2;
 
//Multiply by the standard deviation and add the mean.
  float x = sd * num + mean;
 
  noStroke();
  fill(255,10);
  ellipse(x,380,30,30);
  ellipse(x,50*i,30,30);
}
public void mousePressed() {
if(i<10){  
 background(PApplet.parseInt(random(200)),PApplet.parseInt(random(200)),PApplet.parseInt(random(200)));

a[i].loop();
i++;

} else if(i>=10 && i<20) {
 
  
   background(PApplet.parseInt(random(200)),PApplet.parseInt(random(200)),PApplet.parseInt(random(200)));
 a[i-10].close();
i++; 
}

else{
  background(PApplet.parseInt(random(200)),PApplet.parseInt(random(200)),PApplet.parseInt(random(200))); 
}  
  
  //background((0));
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Slip_Counterpoint" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
