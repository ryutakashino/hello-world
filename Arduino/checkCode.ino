int n = 0;
void setup(){
  pinMode(2,OUTPUT);
  pinMode(12,OUTPUT);
  digitalWrite(12,LOW);
  delay(50);
  digitalWrite(12,HIGH);
  for (int i= 4; i<=10; i+=2){
    pinMode(i, INPUT);
  }
  Serial.begin(9600);
}
void loop(){
  Serial.print("clock: ");
  Serial.println(n);
  
  String a= String(digitalRead(4));
  String b= String(digitalRead(6));
  String c= String(digitalRead(8));
  String d= String(digitalRead(10));
  
  String s= d+c+b+a;
  
  Serial.println(s);
  delay(700);
  digitalWrite(2,LOW);
  digitalWrite(2,HIGH);
  
  if (n++ == 15) n=0;
}
