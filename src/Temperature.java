/**
 * 
 * HW2 Part B - Programming Projects #7 (p. 254)
 * 
 * @author Ere Santos <ere.santos@twu.ca>
 * Date: February 9, 2016
 * 
 * Input: number for beer song
 * Output: Wicked Cool beer song
 * 
 */

public class Temperature {
	/*
	 * My two instance variables which are a temperature value
	 * (a floating-point number) and a character for the scale,
	 * either C for Celsius or F for Fahrenheit.
	 */
	float value;
	char scale;
	/*
	 * My four constructor methods: one for each instance variable
	 * (assume zero degrees if no value is specified and Celsius 
	 * if no scale is specified), one with two parameters for the
	 * two instance variables, and a no-argument constructor 
	 * (set to zero degrees Celsius).
	 * 
	 */
	public Temperature(float value){
		this.value=value;
		this.scale='C';
	}
	public Temperature(char scale){
		this.value=0;
		this.scale=scale;
	}
	public Temperature(float value, char scale){
		this.value=value;
		this.scale=scale;
	}
	public Temperature(){
		this.value=0;
		this.scale='C';
	}
	/*
	 * (1) Now I create the two accessor methods.
	 */
	public float getCelsius(){
		if(scale=='C'){
			return value;
		}
		else{
			return(5*(value-32))/9;
		}
	}
	public float getFahrenheit(){
		if(scale=='C'){
			return((9*(value/5))/5)+32;
		}
		else{
			return value;
		}
	}
	/* 
	 * (2) Now I create my three mutator methods
	 * which set my value, scale, and both a value
	 * and a scale.
	 */
	public void setValue(float value){
		this.value=value;
	}
	public void setScale(char scale){
		this.scale=scale;
	}
	public void setBoth(float value, char scale){
		this.value=value;
		this.scale=scale;
	}
	public boolean equals(Temperature obj){
		if (scale == 'C'){
			if (value == obj.getCelsius()){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(value == obj.getFahrenheit()){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public boolean isGreater(Temperature obj){
		if(scale == 'C'){
			if(value>obj.getCelsius()){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(value>obj.getFahrenheit()){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public boolean isLess(Temperature obj){
		if(scale == 'C'){
			if(value < obj.getCelsius()){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(value < obj.getFahrenheit()){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public String toString(){
		if(scale=='C'){
			return "For the temperature in Celsius, it is:\t\t\t"+value+
					"\nFor the temperature in Farenheit, it is:\t\t"+getFahrenheit();
		}
		else{
			return "For the temperature in Celsius, it is:\t\t\t"+getCelsius()+
					"\nFor the temperature in Farenheit, it is:\t\t"+value;
		}
	}
}
