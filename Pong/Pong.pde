int x= 250;
int y=250;
int xspeed=10;
int yspeed=10;
void setup(){
  size(500,500);
}

void draw(){
  background(#4D85F0);
  fill(23,45,37);
  stroke(30,35.40);
  ellipse(x,y,50,50);
x=x+xspeed;
y=y+yspeed;
if(x>width){
  x=x-xspeed;
}
if(y>height){
  y=y-yspeed;
}







}
