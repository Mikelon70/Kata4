package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    public Histogram<String> build(List<Mail> mails) {
        Histogram<String> histo = new Histogram();
        for (int i = 0; i < mails.size(); i++) {
            histo.increment(mails.get(i).getDomain());
        }
        return histo;
    }
}
