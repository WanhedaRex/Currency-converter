
package CurrencyConverter;

import javax.swing.JOptionPane;

/**
 *
 * @author Wanhe
 */
public class CurrencyConverter {
    
    public static void main(String[] args) {
        float amount = 0;
        String [] Coins = {"MXN to USD", "MXN to EUR", "MXN to Pounds", "MXN to YEN","USD to MXN",
                 "EUR to MXN", "Pounds to MXN", "YEN to MXN", "Cancel"};
                JOptionPane.showMessageDialog(null,"Welcome to this currency converter");
                //Validating the amount
               try {
                    amount = Float.parseFloat(JOptionPane.showInputDialog("Put the amount that you want to convert"));
               }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric amount.");
            System.exit(0); // Sale del programa si la entrada no es válida.
        }
              
       int ChooseCoins = JOptionPane.showOptionDialog(null, "Select a conversion option","Currency Conversion", 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, Coins,Coins[0]);

     
                
        if (ChooseCoins == 0){
            //MXN TO USD
           float usd = (float) 0.059;
           float result = amount * usd;
          JOptionPane.showMessageDialog(null,result+"USD");
        } else if(ChooseCoins == 1){
            //MXN TO EUR
            float eur = (float) 0.054;
            float result = amount * eur;
            JOptionPane.showMessageDialog(null,result+"EUR");
        }else if(ChooseCoins == 2){
            //MXN TO pounds
            float pounds = (float) 0.046;
            float result = amount * pounds;
            JOptionPane.showMessageDialog(null,result+"POUNDS");
        }else if(ChooseCoins == 3){
            //MXN TO yen
            float yen = (float) 8.57;
            float result = amount * yen;
            JOptionPane.showMessageDialog(null,result+"YEN");
        }else if(ChooseCoins == 4){
            //usd to mxn
           float mxn = (float) 16.98;
           float result = amount * mxn;
          JOptionPane.showMessageDialog(null,result+"MXN");
        }else if(ChooseCoins == 5){
            //eur to mxn
           float mxn = (float) 18.42;
           float result = amount * mxn;
          JOptionPane.showMessageDialog(null,result+"MXN");
        }else if(ChooseCoins == 6){
            //pounds to mxn
           float mxn = (float) 21.51;
           float result = amount * mxn;
          JOptionPane.showMessageDialog(null,result+"MXN");
        }else if(ChooseCoins == 7){
            //yen to mxn
           float mxn = (float) 0.12;
           float result = amount * mxn;
          JOptionPane.showMessageDialog(null,result+"MXN"); 
        }else if(ChooseCoins == 8){
            //cancel
              JOptionPane.showMessageDialog(null,"Cancelled"); 
        }
            
    }
    
}
