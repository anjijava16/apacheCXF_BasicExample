package contactus;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ContactUsService {
    
    List<Message> getMessages();
    
    void postMessage(@WebParam(name = "message") Message message);
}