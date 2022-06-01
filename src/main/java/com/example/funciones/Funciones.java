package com.example.funciones;

import com.example.conexion.Conector;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Random;

public class Funciones {

    private static final Conector CN = Conector.getInstancia();
    public static String pAleatoria = Funciones.aleatorio(CN.select());

    public static String aleatorio(ArrayList<String> palabras){
        Random ran = new Random();
        int randomitem = ran.nextInt(palabras.size());
        return palabras.get(randomitem);
    }

    public static void victoria(TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5,
                                Pane pane_vic, Label def, GridPane grid_tf, GridPane grid_btn) {
        if (tf1.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") &&
         tf2.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") &&
         tf3.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") &&
         tf4.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") &&
         tf5.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;")) {
            grid_btn.setDisable(true);
            grid_tf.setDisable(true);
            def.setText(Funciones.pAleatoria);
            pane_vic.setVisible(true);
        }
    }
    public static void derrota(TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5,
                                Pane pane_derr, Label msg, GridPane grid_tf, GridPane grid_btn) {
        if (!tf1.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") ||
                !tf2.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") ||
                !tf3.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") ||
                !tf4.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;") ||
                !tf5.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;")) {
            grid_btn.setDisable(true);
            grid_tf.setDisable(true);
            msg.setText("La palabra era:\n" + Funciones.pAleatoria);
            pane_derr.setVisible(true);
        }
    }

    public static void ctrlTxtField(TextField anterior, TextField actual, TextField siguiente, KeyEvent evt) {
        if (evt.getCode() == KeyCode.BACK_SPACE) {
            if (actual.getText().equals("")) {
                actual.setEditable(false);
                actual.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                anterior.setEditable(true);
                anterior.setText("");
                anterior.requestFocus();
                anterior.deselect();
                anterior.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                actual.setText("");
            }
        } else if (evt.getCode()==KeyCode.A || evt.getCode()==KeyCode.B || evt.getCode()==KeyCode.C || evt.getCode()==KeyCode.D || evt.getCode()==KeyCode.E || evt.getCode()==KeyCode.F || evt.getCode()==KeyCode.G || evt.getCode()==KeyCode.H
                || evt.getCode()==KeyCode.I || evt.getCode()==KeyCode.J || evt.getCode()==KeyCode.K || evt.getCode()==KeyCode.L || evt.getCode()==KeyCode.M || evt.getCode()==KeyCode.N || evt.getCode()==KeyCode.O
                || evt.getCode()==KeyCode.P|| evt.getCode()==KeyCode.Q|| evt.getCode()==KeyCode.R|| evt.getCode()==KeyCode.S|| evt.getCode()==KeyCode.T|| evt.getCode()==KeyCode.U|| evt.getCode()==KeyCode.V|| evt.getCode()==KeyCode.W
                || evt.getCode()==KeyCode.X|| evt.getCode()==KeyCode.Y|| evt.getCode()==KeyCode.Z || actual.getText().equalsIgnoreCase("ñ")) {
            actual.setText(""+actual.getText().charAt(0));
            actual.setText(actual.getText().toUpperCase());
            actual.setEditable(false);
            actual.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            siguiente.requestFocus();
            siguiente.setEditable(true);
            siguiente.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else {
            actual.setText("");
        }
    }
    public static void inputTxtField(TextField anterior, TextField actual, TextField siguiente, KeyEvent evt,
                                     TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5,
                                     ToolBar msg_db, ToolBar msg_long, Button btn_msg_long, Button btn_msg_db, GridPane grid_textF, GridPane grid_btn,
                                     Pane derrota, Label msg_derr, Button q, Button w, Button e, Button r, Button t, Button y, Button u, Button i,
                                     Button o, Button p, Button a, Button s, Button d, Button f, Button g, Button h, Button j, Button k,
                                     Button l, Button ñ, Button z, Button x, Button c, Button v, Button b, Button n, Button m) {
        if (evt.getCode() == KeyCode.ENTER) {
            actual.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            siguiente.requestFocus();
            siguiente.setEditable(true);
            siguiente.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, tf1, tf2, tf3, tf4, tf5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            if (actual.getId().equals("text_6_5")) {
                Funciones.derrota(tf1, tf2, tf3, tf4, tf5, derrota, msg_derr, grid_textF, grid_btn);
            }
        } else {
            if (evt.getCode() == KeyCode.BACK_SPACE) {
                if (actual.getText().equals("")) {
                    actual.setEditable(false);
                    actual.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                    anterior.setEditable(true);
                    anterior.setText("");
                    anterior.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
                    anterior.requestFocus();
                    anterior.deselect();
                } else {
                    actual.setText("");
                }
            } else if (evt.getCode()==KeyCode.A || evt.getCode()==KeyCode.B || evt.getCode()==KeyCode.C || evt.getCode()==KeyCode.D || evt.getCode()==KeyCode.E || evt.getCode()==KeyCode.F || evt.getCode()==KeyCode.G || evt.getCode()==KeyCode.H
                    || evt.getCode()==KeyCode.I || evt.getCode()==KeyCode.J || evt.getCode()==KeyCode.K || evt.getCode()==KeyCode.L || evt.getCode()==KeyCode.M || evt.getCode()==KeyCode.N || evt.getCode()==KeyCode.O
                    || evt.getCode()==KeyCode.P|| evt.getCode()==KeyCode.Q|| evt.getCode()==KeyCode.R|| evt.getCode()==KeyCode.S|| evt.getCode()==KeyCode.T|| evt.getCode()==KeyCode.U|| evt.getCode()==KeyCode.V|| evt.getCode()==KeyCode.W
                    || evt.getCode()==KeyCode.X|| evt.getCode()==KeyCode.Y|| evt.getCode()==KeyCode.Z || actual.getText().equalsIgnoreCase("ñ")){
                actual.setText(""+actual.getText().charAt(0));
                actual.setText(actual.getText().toUpperCase());
                actual.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                actual.setText("");
            }
        }
    }

    public static void validar(String aleatoria, ToolBar msg_db, ToolBar msg_long, Button btn_msg_long, Button btn_msg_db, GridPane grdTF, GridPane grdBtn, TextField tf1, TextField tf2, TextField tf3, TextField tf4, TextField tf5,
                               Button q, Button w, Button e, Button r, Button t, Button y, Button u, Button i,
                               Button o, Button p, Button a, Button s, Button d, Button f, Button g, Button h, Button j, Button k,
                               Button l, Button ñ, Button z, Button x, Button c, Button v, Button b, Button n, Button m) {
        CN.connect();
        if (tf5.getText().isEmpty()) {
            msg_long.setVisible(true);
            grdBtn.setDisable(true);
            grdTF.setDisable(true);
            btn_msg_long.requestFocus();
        } else {
            String test = tf1.getText() + tf2.getText() + tf3.getText() + tf4.getText() + tf5.getText();
            char letra1 = tf1.getText().charAt(0);
            char letra2 = tf2.getText().charAt(0);
            char letra3 = tf3.getText().charAt(0);
            char letra4 = tf4.getText().charAt(0);
            char letra5 = tf5.getText().charAt(0);
            int cont1 = 0;
            for (int is = 0; is < aleatoria.length(); is++) {
                if (aleatoria.charAt(is) == letra1)
                    cont1++;
            }
            int cont2 = 0;
            for (int is = 0; is < aleatoria.length(); is++) {
                if (aleatoria.charAt(is) == letra2)
                    cont2++;
            }
            int cont3 = 0;
            for (int is = 0; is < aleatoria.length(); is++) {
                if (aleatoria.charAt(is) == letra3)
                    cont3++;
            }
            int cont4 = 0;
            for (int is = 0; is < aleatoria.length(); is++) {
                if (aleatoria.charAt(is) == letra4)
                    cont4++;
            }
            int cont5 = 0;
            for (int is = 0; is < aleatoria.length(); is++) {
                if (aleatoria.charAt(is) == letra5)
                    cont5++;
            }

            if (!CN.comprobar(test)) {
                msg_db.setVisible(true);
                grdBtn.setDisable(true);
                grdTF.setDisable(true);
                btn_msg_db.requestFocus();
            } else {
                tf1.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
                tf2.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
                tf3.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
                tf4.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
                tf5.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
                Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                Funciones.botonPista(tf2, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                Funciones.botonPista(tf3, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                Funciones.botonPista(tf4, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                Funciones.botonPista(tf5, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                if (aleatoria.equals(test)) {
                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                    tf3.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                    tf4.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                    tf5.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                } else {
                    if (aleatoria.charAt(0) == letra1) {
                        tf1.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                    } else if (aleatoria.contains(("" + letra1))) {
                        if ((letra1==letra2 || letra1==letra3 || letra1==letra4 || letra1==letra5)) {
                            if (letra1 == letra2) {
                                if (aleatoria.charAt(1) == letra2) {
                                    if (cont2 > 1)
                                        tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;"); {
                                        Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                    }
                                } else {
                                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            } else if (letra1 == letra3) {
                                if (aleatoria.charAt(2) == letra3) {
                                    if (cont3 > 1) {
                                        tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf1, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            } else if (letra1 == letra4) {
                                if (aleatoria.charAt(3) == letra4) {
                                    if (cont4 > 1) {
                                        tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf1, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            } else if (letra1==letra5) {
                                if (aleatoria.charAt(4) == letra5) {
                                    if (cont5 > 1) {
                                        tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                    }
                                } else {
                                    tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            }
                        } else {
                            tf1.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            Funciones.botonPista(tf1, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                        }
                    }

                    if (aleatoria.charAt(1) == letra2) {
                        tf2.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        Funciones.botonPista(tf2, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                    } else if (aleatoria.contains(("" + letra2))) {
                        if (letra2==letra3 || letra2==letra4 || letra2==letra5) {
                            if (letra2==letra3) {
                                if (aleatoria.charAt(2) == letra3) {
                                    if (cont3 > 1) {
                                        tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf2, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf2, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            } else if (letra2==letra4) {
                                if (aleatoria.charAt(3) == letra4) {
                                    if (cont4 > 1) {
                                        tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf2, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf2, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            } else if (letra2==letra5) {
                                if (aleatoria.charAt(4) == letra5) {
                                    if (cont5 > 1) {
                                        tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf2, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf2, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            }
                        }else if ((letra2==letra1)) {
                            if (cont1 > 1) {
                                tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf2, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            }
                        } else {
                            tf2.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            Funciones.botonPista(tf2, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                        }
                    }

                    if (aleatoria.charAt(2) == tf3.getText().charAt(0)) {
                        tf3.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        Funciones.botonPista(tf3, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                    } else if (aleatoria.contains(("" + tf3.getText().charAt(0)))) {
                        if (letra3==letra4 || letra3==letra5) {
                            if (letra3==letra4) {
                                if (aleatoria.charAt(3) == letra4) {
                                    if (cont4 > 1) {
                                        tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf3, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf3, q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
                                }
                            } else if (letra3==letra5) {
                                if (aleatoria.charAt(4) == letra5) {
                                    if (cont5 > 1) {
                                        tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                        Funciones.botonPista(tf3, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                    }
                                } else {
                                    tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf3, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                }
                            }
                        }else if (letra3==letra1 || letra3==letra2 ) {
                            if (cont1 > 1 && letra3==letra1) {
                                tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf3, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            } else if (cont2>1 && letra3==letra2) {
                                tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf3, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            }
                        } else {
                            tf3.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            Funciones.botonPista(tf3, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                        }
                    }

                    if (aleatoria.charAt(3) == tf4.getText().charAt(0)) {
                        tf4.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                    } else if (aleatoria.contains(("" + tf4.getText().charAt(0)))) {
                        //si la letra4 es la misma que la letra siguiente (5)
                        if (letra4==letra5) {
                            //si la letra en la pos.5 está en verde
                            if (aleatoria.charAt(4) == letra5) {
                                //si la palabra contiene esa letra más de 1 vez
                                if (cont5 > 1) {
                                    tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                    Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                                }
                            //si no, (si la letra5, no está en verde)
                            } else {
                                tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            }
                        //si no, si la letra4 es igual a alguna de las letras anteriores
                        } else if (letra4==letra1  || letra4==letra2  || letra4==letra3) {
                            //si la letra4 es igual a la letra1, y la letra1 aparece más veces en la palabra
                            if (cont1 > 1 && letra4==letra1) {
                                tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            //si la letra4 es igual a la letra2, y la letra2 aparece más veces en la palabra
                            } else if (cont2 >1 && letra4 == letra2) {
                                tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            //si la letra4 es igual a la letra3, y la letra3 aparece más veces en la palabra
                            } else if (cont3>1 && letra4==letra3) {
                                tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            }
                        } else {
                            tf4.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            Funciones.botonPista(tf4, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                        }
                    }

                    if (aleatoria.charAt(4) == tf5.getText().charAt(0)) {
                        tf5.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
                        Funciones.botonPista(tf5, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                    } else if (aleatoria.contains(("" + tf5.getText().charAt(0)))) {
                        if (letra5==letra1 || letra5==letra2 || letra5==letra3 || letra5==letra4) {
                            if (cont1 > 1 && letra5==letra1) {
                                tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf5, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            }else if (cont2 > 1 && letra5==letra2) {
                                tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf5, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            } else if (cont3 > 1 && letra5==letra3) {
                                tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf5, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            } else if (cont4 > 1 && letra5==letra4) {
                                tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                                Funciones.botonPista(tf5, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                            }
                        } else {
                            tf5.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
                            Funciones.botonPista(tf5, q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, ñ, z, x, c, v, b, n, m);
                        }
                    }
                    tf1.setEditable(false);
                    tf2.setEditable(false);
                    tf3.setEditable(false);
                    tf4.setEditable(false);
                    tf5.setEditable(false);
                }
            }
        }
        CN.close();
    }

    public static void eliminar(TextField text_1_1,TextField text_1_2,TextField text_1_3,TextField text_1_4,TextField text_1_5,
                                TextField text_2_1,TextField text_2_2,TextField text_2_3,TextField text_2_4,TextField text_2_5,
                                TextField text_3_1,TextField text_3_2,TextField text_3_3,TextField text_3_4 ,TextField text_3_5,
                                TextField text_4_1, TextField text_4_2,TextField text_4_3,TextField text_4_4 ,TextField text_4_5,
                                TextField text_5_1,TextField text_5_2,TextField text_5_3,TextField text_5_4 ,TextField text_5_5,
                                TextField text_6_1,TextField text_6_2,TextField text_6_3,TextField text_6_4 ,TextField text_6_5
                               ) {
        if (text_1_1.isFocused()) {
            if (text_1_1.getText().equals("")) {
                text_1_1.setEditable(false);
                text_1_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_1_1.setEditable(true);
                text_1_1.setText("");
                text_1_1.requestFocus();
                text_1_1.deselect();
                text_1_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_1_1.setText("");
            }
        } else if (text_1_2.isFocused()) {
            if (text_1_2.getText().equals("")) {
                text_1_2.setEditable(false);
                text_1_2.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_1_1.setEditable(true);
                text_1_1.setText("");
                text_1_1.requestFocus();
                text_1_1.deselect();
                text_1_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_1_2.setText("");
            }
        } else if (text_1_3.isFocused()) {
            if (text_1_3.getText().equals("")){
            text_1_3.setEditable(false);
            text_1_3.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_1_2.setEditable(true);
            text_1_2.setText("");
            text_1_2.requestFocus();
            text_1_2.deselect();
            text_1_2.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
        } else {
            text_1_3.setText("");
        }
    }else if (text_1_4.isFocused()) {
            if (text_1_4.getText().equals("")) {
                text_1_4.setEditable(false);
                text_1_4.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_1_3.setEditable(true);
                text_1_3.setText("");
                text_1_3.requestFocus();
                text_1_3.deselect();
                text_1_3.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_1_4.setText("");
            }
        }else if (text_1_5.isFocused()) {
            if (text_1_5.getText().equals("")) {
                text_1_5.setEditable(false);
                text_1_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_1_4.setEditable(true);
                text_1_4.setText("");
                text_1_4.requestFocus();
                text_1_4.deselect();
                text_1_4.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_1_5.setText("");
            }
        }
        if (text_2_1.isFocused()) {
            if (text_2_1.getText().equals("")) {
                text_2_1.setEditable(false);
                text_2_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_2_1.setEditable(true);
                text_2_1.setText("");
                text_2_1.requestFocus();
                text_2_1.deselect();
                text_2_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_2_1.setText("");
            }
        } else if (text_2_2.isFocused()) {
            if (text_2_2.getText().equals("")) {
                text_2_2.setEditable(false);
                text_2_2.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_2_1.setEditable(true);
                text_2_1.setText("");
                text_2_1.requestFocus();
                text_2_1.deselect();
                text_2_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_2_2.setText("");
            }
        } else if (text_2_3.isFocused()) {
            if (text_2_3.getText().equals("")){
                text_2_3.setEditable(false);
                text_2_3.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_2_2.setEditable(true);
                text_2_2.setText("");
                text_2_2.requestFocus();
                text_2_2.deselect();
                text_2_2.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_2_3.setText("");
            }
        }else if (text_2_4.isFocused()) {
            if (text_2_4.getText().equals("")) {
                text_2_4.setEditable(false);
                text_2_4.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_2_3.setEditable(true);
                text_2_3.setText("");
                text_2_3.requestFocus();
                text_2_3.deselect();
                text_2_3.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_2_4.setText("");
            }
        }else if (text_2_5.isFocused()) {
            if (text_2_5.getText().equals("")) {
                text_2_5.setEditable(false);
                text_2_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_2_4.setEditable(true);
                text_2_4.setText("");
                text_2_4.requestFocus();
                text_2_4.deselect();
                text_2_4.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_2_5.setText("");
            }
        }
        if (text_3_1.isFocused()) {
            if (text_3_1.getText().equals("")) {
                text_3_1.setEditable(false);
                text_3_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_3_1.setEditable(true);
                text_3_1.setText("");
                text_3_1.requestFocus();
                text_3_1.deselect();
                text_3_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_3_1.setText("");
            }
        } else if (text_3_2.isFocused()) {
            if (text_3_2.getText().equals("")) {
                text_3_2.setEditable(false);
                text_3_2.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_3_1.setEditable(true);
                text_3_1.setText("");
                text_3_1.requestFocus();
                text_3_1.deselect();
                text_3_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_3_2.setText("");
            }
        } else if (text_3_3.isFocused()) {
            if (text_3_3.getText().equals("")){
                text_3_3.setEditable(false);
                text_3_3.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_3_2.setEditable(true);
                text_3_2.setText("");
                text_3_2.requestFocus();
                text_3_2.deselect();
                text_3_2.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_3_3.setText("");
            }
        }else if (text_3_4.isFocused()) {
            if (text_3_4.getText().equals("")) {
                text_3_4.setEditable(false);
                text_3_4.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_3_3.setEditable(true);
                text_3_3.setText("");
                text_3_3.requestFocus();
                text_3_3.deselect();
                text_3_3.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_3_4.setText("");
            }
        }else if (text_3_5.isFocused()) {
            if (text_3_5.getText().equals("")) {
                text_3_5.setEditable(false);
                text_3_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_3_4.setEditable(true);
                text_3_4.setText("");
                text_3_4.requestFocus();
                text_3_4.deselect();
                text_3_4.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_3_5.setText("");
            }
        }
        if (text_4_1.isFocused()) {
            if (text_4_1.getText().equals("")) {
                text_4_1.setEditable(false);
                text_4_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_4_1.setEditable(true);
                text_4_1.setText("");
                text_4_1.requestFocus();
                text_4_1.deselect();
                text_4_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_4_1.setText("");
            }
        } else if (text_4_2.isFocused()) {
            if (text_4_2.getText().equals("")) {
                text_4_2.setEditable(false);
                text_4_2.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_4_1.setEditable(true);
                text_4_1.setText("");
                text_4_1.requestFocus();
                text_4_1.deselect();
                text_4_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_4_2.setText("");
            }
        } else if (text_4_3.isFocused()) {
            if (text_4_3.getText().equals("")){
                text_4_3.setEditable(false);
                text_4_3.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_4_2.setEditable(true);
                text_4_2.setText("");
                text_4_2.requestFocus();
                text_4_2.deselect();
                text_4_2.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_4_3.setText("");
            }
        }else if (text_4_4.isFocused()) {
            if (text_4_4.getText().equals("")) {
                text_4_4.setEditable(false);
                text_4_4.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_4_3.setEditable(true);
                text_4_3.setText("");
                text_4_3.requestFocus();
                text_4_3.deselect();
                text_4_3.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_4_4.setText("");
            }
        }else if (text_4_5.isFocused()) {
            if (text_4_5.getText().equals("")) {
                text_4_5.setEditable(false);
                text_4_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_4_4.setEditable(true);
                text_4_4.setText("");
                text_4_4.requestFocus();
                text_4_4.deselect();
                text_4_4.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_4_5.setText("");
            }
        }
        if (text_5_1.isFocused()) {
            if (text_5_1.getText().equals("")) {
                text_5_1.setEditable(false);
                text_5_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_5_1.setEditable(true);
                text_5_1.setText("");
                text_5_1.requestFocus();
                text_5_1.deselect();
                text_5_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_5_1.setText("");
            }
        } else if (text_5_2.isFocused()) {
            if (text_5_2.getText().equals("")) {
                text_5_2.setEditable(false);
                text_5_2.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_5_1.setEditable(true);
                text_5_1.setText("");
                text_5_1.requestFocus();
                text_5_1.deselect();
                text_5_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_5_2.setText("");
            }
        } else if (text_5_3.isFocused()) {
            if (text_5_3.getText().equals("")){
                text_5_3.setEditable(false);
                text_5_3.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_5_2.setEditable(true);
                text_5_2.setText("");
                text_5_2.requestFocus();
                text_5_2.deselect();
                text_5_2.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_5_3.setText("");
            }
        }else if (text_5_4.isFocused()) {
            if (text_5_4.getText().equals("")) {
                text_5_4.setEditable(false);
                text_5_4.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_5_3.setEditable(true);
                text_5_3.setText("");
                text_5_3.requestFocus();
                text_5_3.deselect();
                text_5_3.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_5_4.setText("");
            }
        }else if (text_5_5.isFocused()) {
            if (text_5_5.getText().equals("")) {
                text_5_5.setEditable(false);
                text_5_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_5_4.setEditable(true);
                text_5_4.setText("");
                text_5_4.requestFocus();
                text_5_4.deselect();
                text_5_4.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_5_5.setText("");
            }
        }
        if (text_6_1.isFocused()) {
            if (text_6_1.getText().equals("")) {
                text_6_1.setEditable(false);
                text_6_1.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_6_1.setEditable(true);
                text_6_1.setText("");
                text_6_1.requestFocus();
                text_6_1.deselect();
                text_6_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_6_1.setText("");
            }
        } else if (text_6_2.isFocused()) {
            if (text_6_2.getText().equals("")) {
                text_6_2.setEditable(false);
                text_6_2.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_6_1.setEditable(true);
                text_6_1.setText("");
                text_6_1.requestFocus();
                text_6_1.deselect();
                text_6_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_6_2.setText("");
            }
        } else if (text_6_3.isFocused()) {
            if (text_6_3.getText().equals("")){
                text_6_3.setEditable(false);
                text_6_3.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_6_2.setEditable(true);
                text_6_2.setText("");
                text_6_2.requestFocus();
                text_6_2.deselect();
                text_6_2.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_6_3.setText("");
            }
        }else if (text_6_4.isFocused()) {
            if (text_6_4.getText().equals("")) {
                text_6_4.setEditable(false);
                text_6_4.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_6_3.setEditable(true);
                text_6_3.setText("");
                text_6_3.requestFocus();
                text_6_3.deselect();
                text_6_3.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_6_4.setText("");
            }
        }else if (text_6_5.isFocused()) {
            if (text_6_5.getText().equals("")) {
                text_6_5.setEditable(false);
                text_6_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
                text_6_4.setEditable(true);
                text_6_4.setText("");
                text_6_4.requestFocus();
                text_6_4.deselect();
                text_6_4.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            } else {
                text_6_5.setText("");
            }
        }
    }
    public static void añadir(TextField text_1_1,TextField text_1_2,TextField text_1_3,TextField text_1_4,TextField text_1_5,
                                TextField text_2_1,TextField text_2_2,TextField text_2_3,TextField text_2_4,TextField text_2_5,
                                TextField text_3_1,TextField text_3_2,TextField text_3_3,TextField text_3_4 ,TextField text_3_5,
                                TextField text_4_1, TextField text_4_2,TextField text_4_3,TextField text_4_4 ,TextField text_4_5,
                                TextField text_5_1,TextField text_5_2,TextField text_5_3,TextField text_5_4 ,TextField text_5_5,
                                TextField text_6_1,TextField text_6_2,TextField text_6_3,TextField text_6_4 ,TextField text_6_5,
                              ToolBar msg_db, ToolBar msg_long, Button btn_msg_long, Button btn_msg_db, GridPane grid_textF, GridPane grid_btn,
                              Pane victoria, Label def, Pane derrota, Label msg_der, Button q, Button w, Button e, Button r, Button t, Button y, Button u, Button i,
                              Button o, Button p, Button a, Button s, Button d, Button f, Button g, Button h, Button j, Button k,
                              Button l, Button ñ, Button z, Button x, Button c, Button v, Button b, Button n, Button m) {
        if (text_1_5.isFocused()) {
            text_1_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_2_1.requestFocus();
            text_2_1.setEditable(true);
            text_2_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, text_1_1, text_1_2, text_1_3, text_1_4, text_1_5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            Funciones.victoria(text_1_1, text_1_2, text_1_3, text_1_4, text_1_5, victoria, def, grid_textF, grid_btn);
        }
        if (text_2_5.isFocused()) {
            text_2_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_3_1.requestFocus();
            text_3_1.setEditable(true);
            text_3_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, text_2_1, text_2_2, text_2_3, text_2_4, text_2_5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            Funciones.victoria(text_2_1, text_2_2, text_2_3, text_2_4, text_2_5, victoria, def, grid_textF, grid_btn);
        }
        if (text_3_5.isFocused()) {
            text_3_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_4_1.requestFocus();
            text_4_1.setEditable(true);
            text_4_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, text_3_1, text_3_2, text_3_3, text_3_4, text_3_5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            Funciones.victoria(text_3_1, text_3_2, text_3_3, text_3_4, text_3_5, victoria, def, grid_textF, grid_btn);
        }
        if (text_4_5.isFocused()) {
            text_4_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_5_1.requestFocus();
            text_5_1.setEditable(true);
            text_5_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, text_4_1, text_4_2, text_4_3, text_4_4, text_4_5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            Funciones.victoria(text_4_1, text_4_2, text_4_3, text_4_4, text_4_5, victoria, def, grid_textF, grid_btn);
        }
        if (text_5_5.isFocused()) {
            text_5_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_6_1.requestFocus();
            text_6_1.setEditable(true);
            text_6_1.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, text_5_1, text_5_2, text_5_3, text_5_4, text_5_5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            Funciones.victoria(text_5_1, text_5_2, text_5_3, text_5_4, text_5_5, victoria, def, grid_textF, grid_btn);
        }
        if (text_6_5.isFocused()) {
            text_6_5.setStyle("-fx-border-color: transparent; -fx-background-color: #A8A8A8FF;");
            text_6_5.requestFocus();
            text_6_5.setEditable(true);
            text_6_5.setStyle("-fx-border-color: white; -fx-background-color: #A8A8A8FF;");
            Funciones.validar(Funciones.pAleatoria, msg_db, msg_long, btn_msg_long, btn_msg_db, grid_textF, grid_btn, text_6_1, text_6_2, text_6_3, text_6_4, text_6_5,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,ñ,z,x,c,v,b,n,m);
            Funciones.victoria(text_6_1, text_6_2, text_6_3, text_6_4, text_6_5, victoria, def, grid_textF, grid_btn);
            Funciones.derrota(text_6_1, text_6_2, text_6_3, text_6_4, text_6_5, derrota, msg_der, grid_textF, grid_btn);
        }
    }

    public static void botonTeclado(String letra,TextField text_1_1,TextField text_1_2,TextField text_1_3,TextField text_1_4,TextField text_1_5,
                             TextField text_2_1,TextField text_2_2,TextField text_2_3,TextField text_2_4,TextField text_2_5,
                             TextField text_3_1,TextField text_3_2,TextField text_3_3,TextField text_3_4 ,TextField text_3_5,
                             TextField text_4_1, TextField text_4_2,TextField text_4_3,TextField text_4_4 ,TextField text_4_5,
                             TextField text_5_1,TextField text_5_2,TextField text_5_3,TextField text_5_4 ,TextField text_5_5,
                             TextField text_6_1,TextField text_6_2,TextField text_6_3,TextField text_6_4 ,TextField text_6_5) {
        if (text_1_1.isFocused()) {
            text_1_1.setText(letra);
            text_1_2.requestFocus();
        } else if (text_1_2.isFocused()) {
            text_1_2.setText(letra);
            text_1_3.requestFocus();
        } else if (text_1_3.isFocused()) {
            text_1_3.setText(letra);
            text_1_4.requestFocus();
        } else if (text_1_4.isFocused()) {
            text_1_4.setText(letra);
            text_1_5.requestFocus();
        } else if (text_1_5.isFocused()) {
            text_1_5.setText(letra);
        } else if (text_2_1.isFocused()) {
            text_2_1.setText(letra);
            text_2_2.requestFocus();
        } else if (text_2_2.isFocused()) {
            text_2_2.setText(letra);
            text_2_3.requestFocus();
        } else if (text_2_3.isFocused()) {
            text_2_3.setText(letra);
            text_2_4.requestFocus();
        } else if (text_2_4.isFocused()) {
            text_2_4.setText(letra);
            text_2_5.requestFocus();
        } else if (text_2_5.isFocused()) {
            text_2_5.setText(letra);
        } else if (text_3_1.isFocused()) {
            text_3_1.setText(letra);
            text_3_2.requestFocus();
        } else if (text_3_2.isFocused()) {
            text_3_2.setText(letra);
            text_3_3.requestFocus();
        } else if (text_3_3.isFocused()) {
            text_3_3.setText(letra);
            text_3_4.requestFocus();
        } else if (text_3_4.isFocused()) {
            text_3_4.setText(letra);
            text_3_5.requestFocus();
        } else if (text_3_5.isFocused()) {
            text_3_5.setText(letra);
        } else if (text_4_1.isFocused()) {
            text_4_1.setText(letra);
            text_4_2.requestFocus();
        } else if (text_4_2.isFocused()) {
            text_4_2.setText(letra);
            text_4_3.requestFocus();
        } else if (text_4_3.isFocused()) {
            text_4_3.setText(letra);
            text_4_4.requestFocus();
        } else if (text_4_4.isFocused()) {
            text_4_4.setText(letra);
            text_4_5.requestFocus();
        } else if (text_4_5.isFocused()) {
            text_4_5.setText(letra);
        } else if (text_5_1.isFocused()) {
            text_5_1.setText(letra);
            text_5_2.requestFocus();
        } else if (text_5_2.isFocused()) {
            text_5_2.setText(letra);
            text_5_3.requestFocus();
        } else if (text_5_3.isFocused()) {
            text_5_3.setText(letra);
            text_5_4.requestFocus();
        } else if (text_5_4.isFocused()) {
            text_5_4.setText(letra);
            text_5_5.requestFocus();
        } else if (text_5_5.isFocused()) {
            text_5_5.setText(letra);
        } else if (text_6_1.isFocused()) {
            text_6_1.setText(letra);
            text_6_2.requestFocus();
        } else if (text_6_2.isFocused()) {
            text_6_2.setText(letra);
            text_6_3.requestFocus();
        } else if (text_6_3.isFocused()) {
            text_6_3.setText(letra);
            text_6_4.requestFocus();
        } else if (text_6_4.isFocused()) {
            text_6_4.setText(letra);
            text_6_5.requestFocus();
        } else if (text_6_5.isFocused()) {
            text_6_5.setText(letra);
        }
    }
    public static void botonPista(TextField txt, Button q, Button w, Button e, Button r, Button t, Button y, Button u, Button i,
                                  Button o, Button p, Button a, Button s, Button d, Button f, Button g, Button h, Button j, Button k,
                                  Button l, Button ñ, Button z, Button x, Button c, Button v, Button b, Button n, Button m){
        if(q.getText().equals(txt.getText())){
            funcionBotonColor(txt, q);
        } else if(w.getText().equals(txt.getText())) {
            funcionBotonColor(txt, w);
        }else if(e.getText().equals(txt.getText())) {
            funcionBotonColor(txt, e);
        }else if(r.getText().equals(txt.getText())) {
            funcionBotonColor(txt, r);
        }else if(t.getText().equals(txt.getText())) {
            funcionBotonColor(txt, t);
        }else if(u.getText().equals(txt.getText())) {
            funcionBotonColor(txt, u);
        }else if(y.getText().equals(txt.getText())) {
            funcionBotonColor(txt,y );
        }else if(i.getText().equals(txt.getText())) {
            funcionBotonColor(txt, i);
        }else if(o.getText().equals(txt.getText())) {
            funcionBotonColor(txt, o);
        }else if(p.getText().equals(txt.getText())) {
            funcionBotonColor(txt, p);
        }else if(a.getText().equals(txt.getText())) {
            funcionBotonColor(txt, a);
        }else if(s.getText().equals(txt.getText())) {
            funcionBotonColor(txt, s);
        }else if(d.getText().equals(txt.getText())) {
            funcionBotonColor(txt, d);
        }else if(f.getText().equals(txt.getText())) {
            funcionBotonColor(txt, f);
        }else if(g.getText().equals(txt.getText())) {
            funcionBotonColor(txt, g);
        }else if(h.getText().equals(txt.getText())) {
            funcionBotonColor(txt, h);
        }else if(j.getText().equals(txt.getText())) {
            funcionBotonColor(txt, j);
        }else if(k.getText().equals(txt.getText())) {
            funcionBotonColor(txt, k);
        }else if(l.getText().equals(txt.getText())) {
            funcionBotonColor(txt, l);
        }else if(ñ.getText().equals(txt.getText())) {
            funcionBotonColor(txt, ñ);
        }else if(z.getText().equals(txt.getText())) {
            funcionBotonColor(txt, z);
        }else if(x.getText().equals(txt.getText())) {
            funcionBotonColor(txt, x);
        }else if(c.getText().equals(txt.getText())) {
            funcionBotonColor(txt, c);
        }else if(v.getText().equals(txt.getText())) {
            funcionBotonColor(txt, v);
        }else if(b.getText().equals(txt.getText())) {
            funcionBotonColor(txt, b);
        }else if(n.getText().equals(txt.getText())) {
            funcionBotonColor(txt, n);
        }else if(m.getText().equals(txt.getText())) {
            funcionBotonColor(txt, m);
        }
    }
    private static void funcionBotonColor(TextField txt, Button btn) {
        if(txt.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;")){
            btn.setStyle("-fx-text-fill: white;-fx-background-color: #6aaa64;");
        }else if(txt.getStyle().equals("-fx-text-fill: white;-fx-background-color: #c9b458;")){
            if(!btn.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;")) {
                btn.setStyle("-fx-text-fill: white;-fx-background-color: #c9b458;");
            }
        }else if(txt.getStyle().equals("-fx-text-fill: white;-fx-background-color: #606060;")){
            if(!btn.getStyle().equals("-fx-text-fill: white;-fx-background-color: #c9b458;")){
                if(!btn.getStyle().equals("-fx-text-fill: white;-fx-background-color: #6aaa64;")){
                    btn.setStyle("-fx-text-fill: white;-fx-background-color: #606060;");
                }
            }
        }
    }
}
