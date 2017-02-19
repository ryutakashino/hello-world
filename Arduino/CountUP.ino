#include <TimerOne.h>
const int anode_pins[] = {12, 8, 5, 3, 2, 11, 6};    // アノードに接続するArduinoのピン
const int cathode_pins[] = {7, 9, 10, 13};  // カソードに接続するArduinoのピン
const int number_of_anode_pins = sizeof(anode_pins) / sizeof(anode_pins[0]);
const int number_of_cathode_pins = sizeof(cathode_pins) / sizeof(cathode_pins[0]);
int numbers_to_display = 0; // LEDに表示する数字を保持する変数
 
const int digits[] = {
  0b00111111, // 0
  0b00000110, // 1
  0b01011011, // 2
  0b01001111, // 3
  0b01100110, // 4
  0b01101101, // 5
  0b01111101, // 6
  0b00100111, // 7
  0b01111111, // 8
  0b01101111, // 9
};
 
 
// setup()　は、最初に一度だけ実行される
void setup() {
  for (int i = 0; i < number_of_anode_pins; i++) {
    pinMode(anode_pins[i], OUTPUT);  // anode_pinsを出力モードに設定する
  }
  for (int i = 0; i < number_of_cathode_pins; i++) {
    pinMode(cathode_pins[i], OUTPUT);  // cathode_pinを出力モードに設定する
    digitalWrite(cathode_pins[i], HIGH);
  }
  pinMode(4,OUTPUT);
  Timer1.initialize(); Timer1.attachInterrupt(display_numbers , 1000);
  Serial.begin(9600);
}





// 1桁の数字(n)を表示する
void display_number (int n) {
  for (int i = 0; i < number_of_anode_pins; i++) {
    digitalWrite(anode_pins[i], digits[n] & (1 << i) ? HIGH : LOW);
  }
}
 
// アノードをすべてLOWにする
void clear_segments() {
  for (int j = 0; j < number_of_anode_pins; j++) {
    digitalWrite(anode_pins[j], LOW);
  }
}
 
void display_numbers () {
  int n = numbers_to_display;  // number_to_displayの値を書き換えないために変数にコピー
  for (int i = 0; i < number_of_cathode_pins; i++) {
    if (i==1){
      digitalWrite(4,HIGH);
    }else{
      digitalWrite(4,LOW);
    }
    digitalWrite(cathode_pins[i], LOW);
    display_number(n % 10); // 最後の一桁を表示する
    delayMicroseconds(100);
    clear_segments();
    digitalWrite(cathode_pins[i], HIGH);
    n = n / 10; // 10で割る
  }
}
 
void set_numbers(int n) {
  numbers_to_display = millis()/100;
}
 

 
void loop () {  

}
 
// http://garretlab.web.fc2.com/arduino/introduction/beginning_with_7segment_led/


