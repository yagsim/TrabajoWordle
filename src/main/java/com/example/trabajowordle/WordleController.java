package com.example.trabajowordle;


import com.example.funciones.Funciones;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;



public class WordleController {
    public TextField text_1_1;
    public TextField text_1_2;
    public TextField text_1_3;
    public TextField text_1_4;
    public TextField text_1_5;
    public TextField text_2_1;
    public TextField text_2_2;
    public TextField text_2_3;
    public TextField text_2_4;
    public TextField text_2_5;
    public TextField text_3_1;
    public TextField text_3_2;
    public TextField text_3_3;
    public TextField text_3_4;
    public TextField text_3_5;
    public TextField text_4_1;
    public TextField text_4_2;
    public TextField text_4_3;
    public TextField text_4_4;
    public TextField text_4_5;
    public TextField text_5_1;
    public TextField text_5_2;
    public TextField text_5_3;
    public TextField text_5_4;
    public TextField text_5_5;
    public TextField text_6_1;
    public TextField text_6_2;
    public TextField text_6_3;
    public TextField text_6_4;
    public TextField text_6_5;
    public GridPane grid_textF;
    public GridPane grid_btn;
    public ToolBar msg_db;
    public ToolBar msg_long;
    public Button btn_msg_db;
    public Button btn_msg_long;
    public Button q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m;
    public Pane pane;
    public Pane victoria;
    public Pane derrota;
    public Label def;
    public Label msg_derr;
//dar funcion  cada elemento del GUI.

    public void typeTextF1_1(KeyEvent evt) {
        Funciones.ctrlTxtField(text_1_1, text_1_1, text_1_2, evt);
    }
    public void typeTextF1_2(KeyEvent evt) {
        Funciones.ctrlTxtField(text_1_1, text_1_2, text_1_3, evt);
    }
    public void typeTextF1_3(KeyEvent evt) {
        Funciones.ctrlTxtField(text_1_2, text_1_3, text_1_4, evt);
    }
    public void typeTextF1_4(KeyEvent evt) {
        Funciones.ctrlTxtField(text_1_3, text_1_4, text_1_5, evt);
    }
    public void typeTextF1_5(KeyEvent evt) {
        Funciones.inputTxtField(text_1_4, text_1_5, text_2_1, evt, text_1_1, text_1_2, text_1_3, text_1_4, text_1_5,
                msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, derrota, msg_derr, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        Funciones.victoria(text_1_1, text_1_2, text_1_3, text_1_4, text_1_5, victoria, def, grid_textF, grid_btn);
    }
    public void typeTextF2_1(KeyEvent evt) {
        Funciones.ctrlTxtField(text_2_1, text_2_1, text_2_2, evt);
    }
    public void typeTextF2_2(KeyEvent evt) {
        Funciones.ctrlTxtField(text_2_1, text_2_2, text_2_3, evt);
    }
    public void typeTextF2_3(KeyEvent evt) {
        Funciones.ctrlTxtField(text_2_2, text_2_3, text_2_4, evt);
    }
    public void typeTextF2_4(KeyEvent evt) {
        Funciones.ctrlTxtField(text_2_3, text_2_4, text_2_5, evt);
    }
    public void typeTextF2_5(KeyEvent evt) {
        Funciones.inputTxtField(text_2_4, text_2_5, text_3_1, evt, text_2_1, text_2_2, text_2_3, text_2_4, text_2_5,
                msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, derrota, msg_derr,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        Funciones.victoria(text_2_1, text_2_2, text_2_3, text_2_4, text_2_5, victoria, def, grid_textF, grid_btn);
    }
    public void typeTextF3_1(KeyEvent evt) {
        Funciones.ctrlTxtField(text_3_1, text_3_1, text_3_2, evt);
    }
    public void typeTextF3_2(KeyEvent evt) {
        Funciones.ctrlTxtField(text_3_1, text_3_2, text_3_3, evt);
    }
    public void typeTextF3_3(KeyEvent evt) {
        Funciones.ctrlTxtField(text_3_2, text_3_3, text_3_4, evt);
    }
    public void typeTextF3_4(KeyEvent evt) {
        Funciones.ctrlTxtField(text_3_3, text_3_4, text_3_5, evt);
    }
    public void typeTextF3_5( KeyEvent evt) {
        Funciones.inputTxtField(text_3_4, text_3_5, text_4_1, evt, text_3_1, text_3_2, text_3_3, text_3_4, text_3_5,
                msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, derrota, msg_derr, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        Funciones.victoria(text_3_1, text_3_2, text_3_3, text_3_4, text_3_5, victoria, def, grid_textF, grid_btn);
    }
    public void typeTextF4_1(KeyEvent evt) {
        Funciones.ctrlTxtField(text_4_1, text_4_1, text_4_2, evt);
    }
    public void typeTextF4_2(KeyEvent evt) {
        Funciones.ctrlTxtField(text_4_1, text_4_2, text_4_3, evt);
    }
    public void typeTextF4_3(KeyEvent evt) {
        Funciones.ctrlTxtField(text_4_2, text_4_3, text_4_4, evt);
    }
    public void typeTextF4_4(KeyEvent evt) {
        Funciones.ctrlTxtField(text_4_3, text_4_4, text_4_5, evt);
    }
    public void typeTextF4_5(KeyEvent evt) {
        Funciones.inputTxtField(text_4_4, text_4_5, text_5_1, evt, text_4_1, text_4_2, text_4_3, text_4_4, text_4_5,
                msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, derrota, msg_derr, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        Funciones.victoria(text_4_1, text_4_2, text_4_3, text_4_4, text_4_5, victoria, def, grid_textF, grid_btn);
    }
    public void typeTextF5_1(KeyEvent evt) {
        Funciones.ctrlTxtField(text_5_1, text_5_1, text_5_2, evt);
    }
    public void typeTextF5_2(KeyEvent evt) {
        Funciones.ctrlTxtField(text_5_1, text_5_2, text_5_3, evt);
    }
    public void typeTextF5_3(KeyEvent evt) {
        Funciones.ctrlTxtField(text_5_2, text_5_3, text_5_4, evt);
    }
    public void typeTextF5_4(KeyEvent evt) {
        Funciones.ctrlTxtField(text_5_3, text_5_4, text_5_5, evt);
    }
    public void typeTextF5_5(KeyEvent evt) {
        Funciones.inputTxtField(text_5_4, text_5_5, text_6_1, evt, text_5_1, text_5_2, text_5_3, text_5_4, text_5_5,
                msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, derrota, msg_derr, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        Funciones.victoria(text_5_1, text_5_2, text_5_3, text_5_4, text_5_5, victoria, def, grid_textF, grid_btn);
    }
    public void typeTextF6_1(KeyEvent evt) {
        Funciones.ctrlTxtField(text_6_1, text_6_1, text_6_2, evt);
    }
    public void typeTextF6_2(KeyEvent evt) {
        Funciones.ctrlTxtField(text_6_1, text_6_2, text_6_3, evt);
    }
    public void typeTextF6_3(KeyEvent evt) {
        Funciones.ctrlTxtField(text_6_2, text_6_3, text_6_4, evt);
    }
    public void typeTextF6_4(KeyEvent evt) {
        Funciones.ctrlTxtField(text_6_3, text_6_4, text_6_5, evt);
    }
    public void typeTextF6_5(KeyEvent evt) {
        Funciones.inputTxtField(text_6_4, text_6_5, text_6_5, evt, text_6_1, text_6_2, text_6_3, text_6_4, text_6_5,
                msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, derrota, msg_derr, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        Funciones.victoria(text_6_1, text_6_2, text_6_3, text_6_4, text_6_5, victoria, def, grid_textF, grid_btn);
    }

    public void btnQ(){
        Funciones.botonTeclado("Q",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);

    }
    public void btnW(){
        Funciones.botonTeclado("W",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnE() {
        Funciones.botonTeclado("E", text_1_1, text_1_2, text_1_3, text_1_4, text_1_5,
                text_2_1, text_2_2, text_2_3, text_2_4, text_2_5,
                text_3_1, text_3_2, text_3_3, text_3_4, text_3_5,
                text_4_1, text_4_2, text_4_3, text_4_4, text_4_5,
                text_5_1, text_5_2, text_5_3, text_5_4, text_5_5,
                text_6_1, text_6_2, text_6_3, text_6_4, text_6_5);
    }
    public void btnR(){
        Funciones.botonTeclado("R",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnT(){
        Funciones.botonTeclado("T",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnY(){
        Funciones.botonTeclado("Y",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnU(){
        Funciones.botonTeclado("U",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnI(){
        Funciones.botonTeclado("I",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnO(){
        Funciones.botonTeclado("O",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnP(){
        Funciones.botonTeclado("P",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnA(){
        Funciones.botonTeclado("A",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnS(){
        Funciones.botonTeclado("S",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnD(){
        Funciones.botonTeclado("D",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnF(){
        Funciones.botonTeclado("F",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnG(){
        Funciones.botonTeclado("G",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnH(){
        Funciones.botonTeclado("H",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnJ(){
        Funciones.botonTeclado("J",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnK(){
        Funciones.botonTeclado("K",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnL(){
        Funciones.botonTeclado("L",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnÑ(){
        Funciones.botonTeclado("Ñ",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnZ(){
        Funciones.botonTeclado("Z",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnX(){
        Funciones.botonTeclado("X",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnC(){
        Funciones.botonTeclado("C",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnV(){
        Funciones.botonTeclado("V",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnB(){
        Funciones.botonTeclado("B",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnN(){
        Funciones.botonTeclado("N",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnM(){
        Funciones.botonTeclado("M",text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }
    public void btnDel(){
        Funciones.eliminar(text_1_1,text_1_2,text_1_3,text_1_4,text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1,text_3_2,text_3_3,text_3_4,text_3_5,
                text_4_1,text_4_2,text_4_3,text_4_4,text_4_5,
                text_5_1,text_5_2,text_5_3,text_5_4,text_5_5,
                text_6_1,text_6_2,text_6_3,text_6_4,text_6_5);
    }

    public void btnMsgDB() {
        msg_db.setVisible(false);
        msg_long.setVisible(false);
        grid_btn.setDisable(false);
        grid_textF.setDisable(false);
        if (text_2_1.isEditable()) {
            text_2_1.setEditable(false);
            text_2_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_1_5.requestFocus();
            text_1_5.setEditable(true);
            text_1_5.deselect();
            text_1_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else if (text_3_1.isEditable()) {
            text_3_1.setEditable(false);
            text_3_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_2_5.requestFocus();
            text_2_5.setEditable(true);
            text_2_5.deselect();
            text_2_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else if (text_4_1.isEditable()) {
            text_4_1.setEditable(false);
            text_4_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_3_5.requestFocus();
            text_3_5.setEditable(true);
            text_3_5.deselect();
            text_3_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else if (text_5_1.isEditable()) {
            text_5_1.setEditable(false);
            text_5_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_4_5.requestFocus();
            text_4_5.setEditable(true);
            text_4_5.deselect();
            text_4_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else if (text_6_1.isEditable()) {
            text_6_1.setEditable(false);
            text_6_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_5_5.requestFocus();
            text_5_5.setEditable(true);
            text_5_5.deselect();
            text_5_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else if (text_6_5.isEditable()) {
            text_6_5.requestFocus();
            text_6_5.deselect();
            text_6_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        }
    }
    public void btnIntro(){
        Funciones.añadir(text_1_1,text_1_2,text_1_3,text_1_4, text_1_5,
                text_2_1,text_2_2,text_2_3,text_2_4,text_2_5,
                text_3_1, text_3_2,text_3_3,text_3_4 , text_3_5,
                text_4_1,  text_4_2, text_4_3,text_4_4 ,text_4_5,
                text_5_1,text_5_2, text_5_3,text_5_4 ,text_5_5,
                text_6_1, text_6_2,text_6_3,text_6_4 , text_6_5,
                 msg_db, msg_long,  btn_msg_long,btn_msg_db,grid_textF,grid_btn,
                victoria, def, derrota, msg_derr,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
        }
}