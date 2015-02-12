package com.project.supercalculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SuperCalculadora extends Activity {

	TextView textOperacao;
	TextView textResultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_super_calculadora);
		
		textOperacao = (TextView) findViewById(R.id.text_operacao);
		textOperacao.setText("");
		
		textResultado = (TextView) findViewById(R.id.text_resultado);
		textResultado.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.super_calculadora, menu);
		return true;
	}
	
	public void clickOne(View view){
		
		textOperacao.append("1");
	}
	
	public void clickTwo(View view){
		
		textOperacao.append("2");
	}
	
	public void clickThree(View view){
		
		textOperacao.append("3");
	}
	
	public void clickFour(View view){
		
		textOperacao.append("4");
	}
	
	public void clickFive(View view){
		
		textOperacao.append("5");
	}
	
	public void clickSix(View view){
		
		textOperacao.append("6");
	}
	
	public void clickSeven(View view){
		
		textOperacao.append("7");
	}
	
	public void clickEight(View view){
		
		textOperacao.append("8");
	}
	
	public void clickNine(View view){
		
		textOperacao.append("9");
	}
	
	public void clickZero(View view){
		
		textOperacao.append("0");
	}
	
	public void clickSum(View view){
		
		textOperacao.append(" + " );
	}
	
	public void clickSubtract(View view){
		
		textOperacao.append(" - ");
	}
	
	public void clickMultiply(View view){
		
		textOperacao.append(" x ");
	}
	
	public void clickDivide(View view){
		
		textOperacao.append(" / ");
	}
	
	public void clickC(View view){
		
		textOperacao.setText("");
		textResultado.setText("");
	}
	
	public void clickResult(View view){
		
		String operation = textOperacao.getText().toString();
		String[] components = operation.split(" ");
		
		if(components.length == 3) {
		
			double numero1 = (double) Integer.parseInt(components[0]);
			String sinal = components[1];
			double numero2 = (double) Integer.parseInt(components[2]);
			
			if(sinal.equals("+"))
				textResultado.setText( String.format("%.0f", (numero1 + numero2)) );
			
			if(sinal.equals("-"))
				textResultado.setText( String.format("%.0f", (numero1 - numero2)) );
			
			if(sinal.equals("x"))
				textResultado.setText( String.format("%.0f", (numero1 * numero2)) );
			
			if(sinal.equals("/")) {
				
				if( numero1 % numero2 != 0 )
					textResultado.setText( String.format("%.2f", (numero1 / numero2)) );
				else textResultado.setText( String.format("%.0f", (numero1 / numero2)) );
			}
		}
		else textResultado.setText( "Operação não reconhecida :(" );
	}

}