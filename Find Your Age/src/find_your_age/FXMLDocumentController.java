package find_your_age;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button show;
    
    @FXML
    private TextField day;
    
    @FXML
    private TextField month;
    
    @FXML
    private TextField year;
    
    @FXML
    private TextField result;
    
    public void clickShow(ActionEvent event){
        int d, m, y, years, months, days;
        
        d=Integer.parseInt(day.getText());
        m=Integer.parseInt(month.getText());
        y=Integer.parseInt(year.getText());
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(y, m, d);
        
        Period p = Period.between(birthday, today);
        
        years = p.getYears();
        months = p.getMonths();
        days = p.getDays();
        
        //LocalDate birthday = LocalDate.of(y, m, d);
        //long years = birthday.until(LocalDate.now(), ChronoUnit.YEARS);
        //long months = birthday.until(LocalDate.now(), ChronoUnit.MONTHS);
        //long days = birthday.until(LocalDate.now(), ChronoUnit.DAYS);
        
        
        result.setText("You are " + years + " years " + months + " months and " + days + " days old.");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
