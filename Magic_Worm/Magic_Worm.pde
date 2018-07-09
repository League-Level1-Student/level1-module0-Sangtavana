int x= 366;
int y=366;

void setup(){
  size(500,500);
  background(#C4CBCE);
  
}

void draw(){
  for(int i=0;i<20;i++){
      ellipse(getWormX(frameCount),getWormY(frameCount),35,35);
   
      fill(frameCount,340,177);
  makeMagical();

}
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
