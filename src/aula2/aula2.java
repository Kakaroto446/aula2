package aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aula2 extends JFrame 
{
	JLabel rotulo1, rotulo2, rotulo3, exibir, creditos;
	JTextField texto1, texto2;
	JButton somr, mut, div, sub, limpar, mostra, sair, ocultar, desabilitar, habilitar;
    
	public aula2()
	{
		super ("Calculadora");
		ImageIcon icone = new ImageIcon("pokeball.png");
		setIconImage(icone.getImage());
		Container tela=getContentPane();
		setLayout(null);
		rotulo1 = new JLabel ("1º Número: ");
		rotulo2 = new JLabel ("2º Número: ");
		rotulo3 = new JLabel ("Resultado: ");
		rotulo3.setForeground(Color.red);
		creditos = new JLabel ("Desenvolvido por Johnny - 3IIA");
		texto1 = new JTextField (5);
		texto2 = new JTextField (5);
		exibir = new JLabel ("");
		somr = new JButton (" + ");
		sub = new JButton (" -");
		mut = new JButton (" * ");
		div = new JButton (" / ");
		sair = new JButton (" Sair ");
		limpar = new JButton("Limpar");
		habilitar = new JButton("Habilitar");
		desabilitar = new JButton("Desabiltar");
		ocultar = new JButton("Ocultar");
		mostra = new JButton("Exibir");
		
            
		rotulo1.setBounds (20, 20, 100, 20); 
		rotulo2.setBounds (20,60,100,20);
		rotulo3.setBounds (20,100,100,20);
		creditos.setBounds (180,180,300,20);
		texto1.setBounds (90,20, 50, 20); 
		texto2.setBounds (90,60,50,20);
		exibir.setBounds (90,100,200,20); 
    	somr.setBounds (160,60,100,20);
    	div.setBounds (160, 20, 100,20); 
    	sub.setBounds (270, 60, 100, 20);
    	mut.setBounds (270, 20, 100, 20);
    	sair.setBounds (270, 100, 100, 20);
    	limpar.setBounds(160,100,100,20);
    	habilitar.setBounds(160,140,100,20);
    	desabilitar.setBounds(270,140,100,20);
    	ocultar.setBounds(20,140,100,20);
    	mostra.setBounds(20,180,100,20);
    	
    	somr.addActionListener 
        (
            new ActionListener() 
            {
            	public void actionPerformed(ActionEvent e) 
            	{
            		int numero1, numero2,som;
            		som = 0;
            		numero1 = Integer.parseInt(texto1.getText());
            		numero2 = Integer.parseInt(texto2.getText());
            		som = numero1 + numero2;
            		exibir.setVisible(true);
            		exibir.setText(""+som);
            	}
            }
        );
        
        
    	sub.addActionListener 
        (
            new ActionListener() 
            {
            	public void actionPerformed(ActionEvent e) 
            	{
            		int numero1, numero2,sub;
            		sub = 0;
            		numero1 = Integer.parseInt(texto1.getText());
            		numero2 = Integer.parseInt(texto2.getText());
            		sub = numero1 - numero2;
            		exibir.setVisible(true);
            		exibir.setText(""+sub);
            	}
            }
        );
                
    	div.addActionListener 
        (
            new ActionListener() 
            {
            	public void actionPerformed(ActionEvent e)
            	{
            		int numero1, numero2,div;
            		div = 0;
            		numero1 = Integer.parseInt(texto1.getText());
            		numero2 = Integer.parseInt(texto2.getText());
            		div = numero1 / numero2;
            		exibir.setVisible(true);
            		exibir.setText("" +div);
            	}
            }
        );     
                            
    	mut.addActionListener 
        (
            new ActionListener() 
           	{
           		public void actionPerformed(ActionEvent e)
           		{
           			int numero1, numero2,mut;
           			mut = 0;
            		numero1 = Integer.parseInt(texto1.getText());
           			numero2 = Integer.parseInt(texto2.getText());
           			mut = numero1 * numero2;
            		exibir.setVisible(true);
           			exibir.setText("" +mut);
            	}
            }
        );         
    	
    	sair.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				System.exit(0);
    			}
    		}
    	);
    	
    	limpar.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				texto1.setText(null);
    				texto2.setText(null);
    				texto1.requestFocus();
    			}
    		}
    	);
    	
    	ocultar.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				rotulo3.setVisible(false);
    				exibir.setVisible(false);
    			}
    		}
    	);

    	mostra.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    			rotulo3.setVisible(true);
    			exibir.setVisible(true);
    			}
    		}
    	);
    	
    	desabilitar.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				rotulo1.setEnabled(false);
    				rotulo2.setEnabled(false);
    				texto1.setEnabled(false);
    				texto2.setEnabled(false);
    			}
    		}
    	);

    	habilitar.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				rotulo1.setEnabled(true);
    				rotulo2.setEnabled(true);
    				texto2.setEnabled(true);
    				texto1.setEnabled(true);
    			}
    		}
    	);

           
        exibir.setVisible (true);
        
        tela.add (rotulo1); 
        tela.add (rotulo2);
        tela.add (rotulo3);
        tela.add (creditos);
        tela.add (texto1); 
        tela.add (texto2);
        tela.add (exibir); 
        tela.add (somr);
        tela.add (div);
        tela.add (sub);
        tela.add (mut);
        tela.add (sair);
        tela.add (limpar);
        tela.add (habilitar);
        tela.add (desabilitar);
        tela.add (ocultar);
        tela.add (mostra);
        
        setSize (500, 350);
        setVisible (true);
        setLocationRelativeTo(null);
	}
	
    public static void main(String args[]) 
    {
    	aula2 app = new aula2();
    	app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
}