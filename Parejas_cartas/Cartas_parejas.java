package Parejas_cartas;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

public class Cartas_parejas {

	private JFrame frame;
	private int id_carta;
	private int Contador = 0;
	private JToggleButton Boton_aux= new JToggleButton();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartas_parejas window = new Cartas_parejas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cartas_parejas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 756, 813);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantalla p = new pantalla ();
		frame.getContentPane().add(p);
		frame.setTitle("Juego de parejas de pokemon ");
	}
		private class pantalla extends JPanel {
			public pantalla () {
				setLayout (new BorderLayout(3,4));
				setVisible(true);
				botones b = new botones();
				add(b, BorderLayout.CENTER);
			}
		
			private class botones extends JPanel {
		        public botones() {
		            setLayout(new GridLayout(3, 4));
		            
		            JToggleButton Imagen1 = new JToggleButton();
		            Imagen1.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado1 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Snorlax.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen1.setSelectedIcon(new ImageIcon(reescalado1));
		            add(Imagen1);
		            Imagen1.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
	
							if (Contador == 0) {
								Contador++;
								id_carta = 1;
								Boton_aux = Imagen1;
								
							} else {
								Contador = 0;
								
								if (id_carta != 1) { // Si fallas pasa esto //
									Imagen1.setSelected(false);
									Boton_aux.setSelected(false);
								
								} else { // Si aciertas pasa esto //
									Imagen1.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
							}
						}
					});
			            
		            JToggleButton Imagen2 = new JToggleButton();
		            Imagen2.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado2 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Gengar.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen2.setSelectedIcon(new ImageIcon(reescalado2));
		            add(Imagen2);
		            Imagen2.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 2;
		    					Boton_aux = Imagen2;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 2) { // Si fallas pasa esto //		    						
		    						Imagen2.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen2.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
						}
					}
				});

		            JToggleButton Imagen3 = new JToggleButton();
		            Imagen3.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado3 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Machamp.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen3.setSelectedIcon(new ImageIcon(reescalado3));
		            add(Imagen3);
		            Imagen3.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 3;
		    					Boton_aux = Imagen3;
		    				} else {
		    					Contador = 0;
		    					if (id_carta != 3) { // Si fallas pasa esto //
		    						Imagen3.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen3.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
						}
					}
				});

		            
		            JToggleButton Imagen4 = new JToggleButton();
		            Imagen4.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado4 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Dragonite.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen4.setSelectedIcon(new ImageIcon(reescalado4));
		            add(Imagen4);
		            Imagen4.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 4;
		    					Boton_aux = Imagen4;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 4) { // Si fallas pasa esto //
		    						Imagen4.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen4.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
						}
					}
				});
		            
		            JToggleButton Imagen5 = new JToggleButton();
		            Imagen5.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado5 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Gyarados.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen5.setSelectedIcon(new ImageIcon(reescalado5));
		            add(Imagen5);
		            Imagen5.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 5;
		    					Boton_aux = Imagen5;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 5) { // Si fallas pasa esto //
		    						Imagen5.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen5.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
						}
					}
				});		 
		            
		            JToggleButton Imagen6 = new JToggleButton();
		            Imagen6.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado6 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Dragonite.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen6.setSelectedIcon(new ImageIcon(reescalado6));
		            add(Imagen6);
		            Imagen6.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 4;
		    					Boton_aux = Imagen6;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 4) { // Si fallas pasa esto //
		    						Imagen6.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen6.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
						}
					}
				});	
		            
		            JToggleButton Imagen7 = new JToggleButton();
		            Imagen7.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado7 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Snorlax.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen7.setSelectedIcon(new ImageIcon(reescalado7));
		            add(Imagen7);
		            Imagen7.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 1;
		    					Boton_aux = Imagen7;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 1) { // Si fallas pasa esto //
		    						Imagen7.setSelected(false);
		    						Boton_aux.setSelected(false);
		    						
							} else { // Si aciertas pasa esto //
								Imagen7.setEnabled(false);
	    						Boton_aux.setEnabled(false);
							}
						}
					}
				});	
		            
		            JToggleButton Imagen8 = new JToggleButton();
		            Imagen8.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado8 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Alakazam.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen8.setSelectedIcon(new ImageIcon(reescalado8));
		            add(Imagen8);
		            Imagen8.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 6;
		    					Boton_aux = Imagen8;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 6) { // Si fallas pasa esto //
		    						Imagen8.setSelected(false);
		    						Boton_aux.setSelected(false);
		    						
							}  else { // Si aciertas pasa esto //
								Imagen8.setEnabled(false);
	    						Boton_aux.setEnabled(false);
							}
						}
					}
				});	
		            
		            JToggleButton Imagen9 = new JToggleButton();
		            Imagen9.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado9 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Alakazam.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen9.setSelectedIcon(new ImageIcon(reescalado9));
		            add(Imagen9);
		            Imagen9.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 6;
		    					Boton_aux = Imagen9;
		    				
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 6) { // Si fallas pasa esto //
		    						Imagen9.setSelected(false);
		    						Boton_aux.setSelected(false);
		    						
							} else { // Si aciertas pasa esto //
								Imagen9.setEnabled(false);
	    						Boton_aux.setEnabled(false);
							}
						}
					}
				});	
		            
		            JToggleButton Imagen10 = new JToggleButton();
		            Imagen10.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado10 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Machamp.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen10.setSelectedIcon(new ImageIcon(reescalado10));
		            add(Imagen10);
		            Imagen10.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 3;
		    					Boton_aux = Imagen10;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 3) {  // Si fallas pasa esto //
		    						Imagen10.setSelected(false);
		    						Boton_aux.setSelected(false);
		    						
							} else { // Si aciertas pasa esto //
								Imagen10.setEnabled(false);
	    						Boton_aux.setEnabled(false);
							}
						}
					}
				});	
		            
		            JToggleButton Imagen11 = new JToggleButton();
		            Imagen11.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado11 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Gyarados.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen11.setSelectedIcon(new ImageIcon(reescalado11));
		            add(Imagen11);
		            Imagen11.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 5;
		    					Boton_aux = Imagen11;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 5) { // Si fallas pasa esto //
		    						Imagen11.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen11.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								} 
						}
					}
				});	
		            
		            JToggleButton Imagen12 = new JToggleButton();
		            Imagen12.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Carta.jpg"));
		            Image reescalado12 = new ImageIcon("C:\\Users\\DAM\\Desktop\\DAM\\Programación\\Carpeta pokemones\\Gengar.png").getImage().getScaledInstance(189, 266,  java.awt.Image.SCALE_SMOOTH);
		            Imagen12.setSelectedIcon(new ImageIcon(reescalado12));
		            add(Imagen12);
		            Imagen12.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
						
		    				if (Contador == 0) {
		    					Contador++;
		    					id_carta = 2;
		    					Boton_aux = Imagen12;
		    				} else {
		    					Contador = 0;
		    					
		    					if (id_carta != 2) { // Si fallas pasa esto //
		    						Imagen12.setSelected(false);
		    						Boton_aux.setSelected(false);
							
		    					} else { // Si aciertas pasa esto //
									Imagen12.setEnabled(false);
		    						Boton_aux.setEnabled(false);
								}
						}
					}
				});		           
		            
		            
			}
		}
		
		}
}
