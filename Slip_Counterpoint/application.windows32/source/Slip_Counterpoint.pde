import ddf.minim.*;


Minim minim;//audio context
AudioPlayer[] a;

import java.util.*; 
Random generator;
int i = 0; 
void setup() {
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

void draw() {
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
void mousePressed() {
if(i<10){  
 background(int(random(200)),int(random(200)),int(random(200)));

a[i].loop();
i++;

} else if(i>=10 && i<20) {
 
  
   background(int(random(200)),int(random(200)),int(random(200)));
 a[i-10].close();
i++; 
}

else{
  background(int(random(200)),int(random(200)),int(random(200))); 
}  
  
  //background((0));
}


