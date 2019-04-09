/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author joshua
 */
public class Tablero extends JFrame{
    private JButton[][] boton=new JButton[8][8];
    private int[][] n=new int[8][8];
    private int gan=0,bloq=0;
    private JMenuBar Barra;
    private JMenu Menu;
    private JMenuItem reiniciar,salir,Lista;
    public Tablero(){
        // Este es el JFrame
        super("TORRES Y ALFILES");
        setSize(800,600);
	setLocation(300,100);
	setLayout(new GridLayout(8,8));
        CrearTablero();
        Acciones();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // BARRA DE MENU
        Barra = new JMenuBar();
        Menu = new JMenu();
        Menu.setMnemonic('M');
        Menu.setText("Menu");

        Barra.add(Menu);
        //REINICIAR EN BARRA DE MENÚ
        reiniciar=new JMenuItem();
        reiniciar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0));
        reiniciar.setMnemonic('R');
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        boton[i][j].setIcon(new ImageIcon(""));
                        boton[i][j].setToolTipText("¿Colocar Reina?");
                        n[i][j]=0;
                        gan=0;
                        bloq=0;
                    }
                }
            }
        });
        //LISTADO DE JUGADORES BARRA DE MENÚ
        Menu.add(reiniciar);
        Lista=new JMenuItem();
        Lista.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
        Lista.setMnemonic('P');
        Lista.setText("Lista de Jugadores");
        Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        Menu.add(Lista);
        //SALIR EN BARRA DE MENÚ
        salir=new JMenuItem();
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
        salir.setMnemonic('S');
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        Menu.add(salir);

        setJMenuBar(Barra);
        setVisible(true);
    }
    //CREA UN TABLERO 8X8
    public void CrearTablero(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                boton[i][j]=new JButton("");
                boton[i][j].setToolTipText("PRESIONA PARA COLOCAR OBJETO");
                if(i%2==0){
                    if(j%2==0) boton[i][j].setBackground(Color.ORANGE);
                    else boton[i][j].setBackground(Color.black);
                }
                else{
                    if(j%2!=0) boton[i][j].setBackground(Color.ORANGE);
                    else boton[i][j].setBackground(Color.black);
                }
                add(boton[i][j]);
                n[i][j]=0;
            }
        }
    }
    //ACCIONES QUE SE LE APLICAN A CADA BOTON DEL ARREGLO DE BOTONES
    private void Acciones(){       

        boton[0][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(0,0);
            }
        });

        boton[0][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(0,1);
            }
        });

        boton[0][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(0,2);
            }
        });

        boton[0][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(0,3);
            }
        });

        boton[0][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(0,4);
            }
        });

        boton[0][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(0,5);
            }
        });

        boton[0][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(0,6);
            }
        });

        boton[0][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(0,7);
            }
        });

        boton[1][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(1,0);
            }
        });

        boton[1][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(1,1);
            }
        });

        boton[1][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(1,2);
            }
        });

        boton[1][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(1,3);
            }
        });

        boton[1][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(1,4);
            }
        });

        boton[1][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(1,5);
            }
        });

        boton[1][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(1,6);
            }
        });

        boton[1][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(1,7);
            }
        });

        boton[2][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,0);
            }
        });

        boton[2][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,1);
            }
        });

        boton[2][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,2);
            }
        });

        boton[2][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,3);
            }
        });

        boton[2][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,4);
            }
        });

        boton[2][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,5);
            }
        });

        boton[2][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(2,6);
            }
        });

        boton[2][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(2,7);
            }
        });

        boton[3][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,0);
            }
        });

        boton[3][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,1);
            }
        });

        boton[3][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,2);
            }
        });

        boton[3][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,3);
            }
        });

        boton[3][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(3,4);
            }
        });

        boton[3][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,5);
            }
        });

        boton[3][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,6);
            }
        });

        boton[3][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(3,7);
            }
        });

       boton[4][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,0);
            }
        });

        boton[4][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,1);
            }
        });

        boton[4][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,2);
            }
        });

        boton[4][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,3);
            }
        });

        boton[4][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(4,4);
            }
        });

        boton[4][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,5);
            }
        });

        boton[4][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,6);
            }
        });

        boton[4][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(4,7);
            }
        });

        boton[5][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,0);
            }
        });

        boton[5][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,1);
            }
        });

        boton[5][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(5,2);
            }
        });

        boton[5][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,3);
            }
        });

        boton[5][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,4);
            }
        });

        boton[5][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,5);
            }
        });

        boton[5][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,6);
            }
        });

        boton[5][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(5,7);
            }
        });

        boton[6][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(6,0);
            }
        });

        boton[6][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(6,1);
            }
        });

        boton[6][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(6,2);
            }
        });

        boton[6][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(6,3);
            }
        });

        boton[6][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(6,4);
            }
        });

        boton[6][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(6,5);
            }
        });

        boton[6][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(6,6);
            }
        });

        boton[6][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(6,7);
            }
        });

        boton[7][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(7,0);
            }
        });

        boton[7][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(7,1);
            }
        });

        boton[7][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(7,2);
            }
        });

        boton[7][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(7,3);
            }
        });

        boton[7][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(7,4);
            }
        });

        boton[7][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(7,5);
            }
        });

        boton[7][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoTorre(7,6);
            }
        });

        boton[7][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                movimientoAlfil(7,7);             
            }
        });

        
    }
    //MOVIMIENTO POR MEDIO DE HILOS DEL TABLERO DETERMINANDO PARA QUE DIRECCION SE MOVERA CON COLORES
    public void movimientoTorre(int col,int fil){
        ImageIcon torre = new ImageIcon("torre.png");
        int c=col;
        int f=fil;
        int aux=0;

        //DIAGONAL ARRIBA DERECHA
        while(true){

            fil=fil+1;
            if(col<0 || fil>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){   
                break;
            }  
        }

        //DIAGONAL ARRIBA IZQUIERDA
        col=c;
        fil=f;
        while(true){

            fil=fil-1;
            if(col<0 || fil<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //DIAGONAL ABAJO DERECHA
        col=c;
        fil=f;
        while(true){

            col=col+1;
            if(col>7 || fil>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //DIAGONAL ABAJO IZQUIERDA
        col=c;
        fil=f;
        while(true){

            col=col+1;
            if(col>7 || fil<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //DERECHA
        col=c;
        fil=f;
        while(true){
            boton[fil][col].setBackground(Color.BLUE);
            fil=fil+1;
            if(fil>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //IZQUIERDA
        col=c;
        fil=f;
        while(true){
            boton[fil][col].setBackground(Color.BLUE);
            fil=fil-1;
            if(fil<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //ARRIBA
        col=c;
        fil=f;
        while(true){
            boton[fil][col].setBackground(Color.BLUE);
            col=col-1;
            if(col<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //ABAJO
        col=c;
        fil=f;
        while(true){
            boton[fil][col].setBackground(Color.BLUE);
            col=col+1;
            if(col>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }
        if(bloq==0){
            if(n[c][f]==1){
                boton[c][f].setIcon(new ImageIcon(""));
                n[c][f]=0;
                gan=gan-1;
            }
            //DA OPCION DE QUITAR PIEZA DE LA TORRE
            else {
                if(aux==8){
                    //AJUSTAMOS LA IMAGEN DE LA TORRE AL BOTON
                    boton[c][f].setIcon(new ImageIcon(torre.getImage().getScaledInstance(boton[c][f].getWidth(), boton[c][f].getHeight(), Image.SCALE_SMOOTH)));
                    boton[c][f].setToolTipText("¿QUITAR TORRE?");
                    n[c][f]=1;
                    aux=0;
                    gan=gan+1;
                    if(gan==8){
                        //PANEL DE DIALOGO CUANDO ENCONTRAMOS LAS 8 PIEZAS SIN QUE SE TOPEN ENTRE ELLAS
                        JOptionPane.showMessageDialog(null,"¡¡¡LO LOGRASTE!!!");
                        bloq=1;
                        for(int i=0;i<8;i++){
                            for(int j=0;j<8;j++){
                                boton[i][j].setToolTipText("Para volver a jugar reinicie el juego");
                            }
                        }
                    }
                }
                else{
                    //DIALOGO DE AVISIO QUE HAS PERDIDO
                    bloq = 1;
                    JOptionPane.showMessageDialog(null,"¡¡¡HAS PERDIDO!!!");
                }
            }
        }
    }
    //DETERMINA EL MOVIMIENTO DEL ALFIL CON COLORES SEGUN SU FORMA DE MOVER
    public void movimientoAlfil(int col,int fil){
            ImageIcon alfil = new ImageIcon("alfil.png");
            int c=col;
            int f=fil;
            int aux=0;
            
            //diagonal arriba derecha
            while(true){
                boton[fil][col].setBackground(Color.GREEN);
                col=col-1;
                fil=fil+1;
                if(col<0 || fil>7){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //diagonal arriba izquierda
            col=c;
            fil=f;
            while(true){
                boton[fil][col].setBackground(Color.GREEN);
                col=col-1;
                fil=fil-1;
                if(col<0 || fil<0){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //diagonal abajo derecha
            col=c;
            fil=f;
            while(true){
                boton[fil][col].setBackground(Color.GREEN);
                col=col+1;
                fil=fil+1;
                if(col>7 || fil>7){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //diagonal abajo izquierda
            col=c;
            fil=f;
            while(true){
                boton[fil][col].setBackground(Color.GREEN);
                col=col+1;
                fil=fil-1;
                if(col>7 || fil<0){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //derecha
            col=c;
            fil=f;
            while(true){
                fil=fil+1;
                if(fil>7){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //izquierda
            col=c;
            fil=f;
            while(true){
                fil=fil-1;
                if(fil<0){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //arriba
            col=c;
            fil=f;
            while(true){
                col=col-1;
                if(col<0){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            
            //abajo
            col=c;
            fil=f;
            while(true){
                col=col+1;
                if(col>7){
                    aux=aux+1;
                    break;
                }
                if(n[col][fil]==1){
                    break;
                }
            }
            if(bloq==0){
                if(n[c][f]==1){
                    boton[c][f].setIcon(new ImageIcon(""));
                    n[c][f]=0;
                    gan=gan-1;
                }
                else {
                    if(aux==8){
                        //AJUSTAMOS LA IMAGEN AL BOTON
                        boton[c][f].setIcon(new ImageIcon(alfil.getImage().getScaledInstance(boton[c][f].getWidth(), boton[c][f].getHeight(), Image.SCALE_SMOOTH)));
                        boton[c][f].setToolTipText("¿QUITAR ARFIL?");
                        n[c][f]=1;
                        aux=0;
                        gan=gan+1;
                        if(gan==8){
                            JOptionPane.showMessageDialog(null,"¡¡¡LO LOGRASTE!!!");
                            bloq=1;
                            for(int i=0;i<8;i++){
                                for(int j=0;j<8;j++){
                                    boton[i][j].setToolTipText("Para volver a jugar reinicie el juego");
                                }
                            }
                        }
                    }
                    else{
                        //AVISO QUE HEMOS PERDIDO
                        bloq = 1;
                        JOptionPane.showMessageDialog(null,"¡¡¡HAS PERDIDO!!!");
                    
                }
            }
        }
    }
    
}
