package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Entrar\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        List<Mail> mailList = (new MailListReader()).read(fileName);
        Histogram<String> histogram = (new MailHistogramBuilder()).build(mailList);
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAMA", histogram);
        histo.execute();
    }
    
}
